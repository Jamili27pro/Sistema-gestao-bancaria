package Aulas.java;

import java.util.Scanner;

public class Venda {
    private int tipo;
    private int quantidade;
    private String tipo_venda;
    private int idade;
    private double valor_final;
    private String filme;

    private final double PRECO_BASE = 20.0;
    private final double PRECO_MEIA = 10.0;
    private final double PRECO_PROMOCIONAL = 14.00;

    public int getQuantidade() { return quantidade; }
    public String getTipo_venda() { return tipo_venda; }
    public double getValor_final() { return valor_final; }
    public String getFilme() { return filme; }


    public void processoVenda(Scanner sc) {
        escolherFilme(sc);

        do {
            System.out.print("Informe a quantidade de ingressos: ");
            quantidade = sc.nextInt();
            sc.nextLine();
        } while (quantidade <= 0);

        do {
            System.out.println("Tipo de ingresso:");
            System.out.println("1 - Inteira");
            System.out.println("2 - Meia");
            System.out.println("3 - Promocional");
            System.out.print("Escolha: ");
            tipo = sc.nextInt();
            sc.nextLine();
        } while (tipo < 1 || tipo > 3);

        do {
            System.out.print("Informe sua idade: ");
            idade = sc.nextInt();
            sc.nextLine();
        } while (idade < 0 || idade > 120);

        calcularPreco();
        processarPagamento(sc);
    }

    private void escolherFilme(Scanner sc) {
        String[] filmes = {"1 - Invocação do mal 4", "2 - Deadpool & Wolverine", "3 - O Senhor dos Anéis"};
        System.out.println("----- Seja bem-vindo ao Cine! -----");
        System.out.println("\nFilmes disponíveis:");
        for (String f : filmes) {
            System.out.println(f);
        }

        int escolha;
        do {
            System.out.print("Escolha o filme (1-3): ");
            escolha = sc.nextInt();
            sc.nextLine();
        } while (escolha < 1 || escolha > 3);

        switch (escolha) {
            case 1 -> filme = "Invocação do mal 4";
            case 2 -> filme = "Deadpool & Wolverine";
            case 3 -> filme = "O Senhor dos Anéis";
        }
    }

    public void calcularPreco() {
        if (idade < 5) {
            tipo_venda = "Gratuito";
            valor_final = 0.0;
        } else {
            switch (tipo) {
                case 1 -> {
                    tipo_venda = "Inteira";
                    valor_final = quantidade * PRECO_BASE;
                }
                case 2 -> {
                    tipo_venda = "Meia";
                    valor_final = quantidade * PRECO_MEIA;
                }
                case 3 -> {
                    tipo_venda = "Promocional";
                    valor_final = quantidade * PRECO_PROMOCIONAL;
                }
            }
        }
    }

    private void processarPagamento(Scanner sc) {
        if (valor_final == 0.0) {
            System.out.println("Ingresso gratuito. Nenhum pagamento necessário.");
            return;
        }

        int metodo;
        do {
            System.out.println("Método de pagamento:");
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Cartão");
            System.out.print("Escolha: ");
            metodo = sc.nextInt();
            sc.nextLine();
        } while (metodo != 1 && metodo != 2);

        if (metodo == 1) {
            double pago;
            do {
                System.out.printf("Total a pagar: R$ %.2f%n", valor_final);
                System.out.print("Informe o valor pago: R$ ");
                pago = sc.nextDouble();
                sc.nextLine();

                if (pago < valor_final) {
                    System.out.printf("Valor insuficiente. Faltam R$ %.2f%n", valor_final - pago);
                }
            } while (pago < valor_final);

            double troco = pago - valor_final;
            System.out.printf("Pagamento realizado. Troco: R$ %.2f%n", troco);
        } else {
            System.out.println("Pagamento com cartão confirmado.");
        }
    }

    public void resumoPorCliente() {
        System.out.println("\n------------- RESUMO DA VENDA -------------");
        System.out.println("Filme escolhido: " + filme);
        System.out.println("Quantidade de ingressos: " + quantidade);
        System.out.println("Tipo de ingresso aplicado: " + tipo_venda);
        System.out.printf("Valor total da compra: R$ %.2f%n", valor_final);
    }
}
