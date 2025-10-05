package Avaliacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;


        while (continuar) {
            System.out.println("\n+--- Cadastramento de veículos ---");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            sc.nextLine();

            System.out.println("Informe a placa do veículo:");
            String placa = sc.nextLine();

            System.out.println("Informe a marca do veículo:");
            String marca = sc.nextLine();

            System.out.println("Informe o preço do veículo:");
            double preco = sc.nextDouble();

            sc.nextLine();

            Veiculo veiculo = null;

            if (opcao == 1) {
                System.out.println("Número de portas: ");
                String numPortas = sc.nextLine();
                veiculo = new Carro(placa, marca, preco, numPortas);
            } else if (opcao == 2) {
                System.out.println("Cilindradas: ");
                int cilindradas = sc.nextInt();
                sc.nextLine();
                veiculo = new Moto(placa, marca, preco, cilindradas);
            }else if (opcao == 3) {
                System.out.println("Capacidade de carga: ");
                int capacidade = sc.nextInt();
                sc.nextLine();
                veiculo = new Caminhao(placa, marca, preco, capacidade);
            }else {
                System.out.println("Opção inválida, tente novamente!");
                continue;
            }

            System.out.println("\n--- Dados do Veículo ---");
            veiculo.mostrarDados();


            System.out.println("\nDeseja cadastrar outro veículo? (sim/não)");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("não")) {
                continuar = false;
            }

        }
        System.out.println("\nPrograma encerrado.");
        sc.close();
    }



}























