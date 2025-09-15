/*package Aulas.java;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro();


        System.out.println("Título do livro: ");
        livro1.titulo = sc.next();

        System.out.println("Autor do livro: ");
        livro1.autor = sc.next();

        System.out.println("Quantidade de paginas: ");
        livro1.quantPag = sc.nextInt();

        System.out.println("O livro está emprestado ou não?(true/false): ");
        livro1.emprestado = sc.nextBoolean();

        System.out.println("Status do livro:");
        if  (livro1.emprestado){
            System.out.println("O livro está emprestado");
        } else {
            System.out.println("O livro está disponível");
        }
        sc.close();*/


//Conta Bancaria


        /*ContaBancaria contaBancaria1 = new ContaBancaria();


        System.out.println("Titular da conta: ");
        contaBancaria1.nomeTitular = sc.nextLine();

        System.out.println("Numero da conta:");
        contaBancaria1.numeroConta = sc.nextInt();

        sc.nextLine();  //Sempre depois de nextInt ou nextDouble coloque um nextLine.

        System.out.println("Deseja depositar? (sim/não)");
        String resposta = sc.nextLine();



        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Valor a depositar: ");
            double valorDepositar = sc.nextDouble();
            contaBancaria1.saldo += valorDepositar;
            System.out.println("Depósito realizado com sucesso!");


        }

        System.out.println("\nInformações da conta: ");
        System.out.println("Titular da conta: " + contaBancaria1.nomeTitular);
        System.out.println("Número da conta: " + contaBancaria1.numeroConta);
        System.out.println("Saldo da conta: " + contaBancaria1.saldo);

        sc.close();*/


//Carro

        /*Carro carro1 = new Carro();

        System.out.println("Marca do carro: ");
        carro1.marca = sc.nextLine();

        System.out.println("Modelo do carro: ");
        carro1.modelo = sc.nextLine();

        System.out.println("Ano do carro: ");
        carro1.ano = sc.nextInt();

        sc.nextLine();

        carro1.exibirStatus();

        System.out.println("Digite em quanto deseja acelerar o carro: ");
        int velocidade1 = sc.nextInt();
        sc.nextLine();
        carro1.exibirStatus();

        System.out.println("Digite quanto deseja acelerar novamente: ");
        int velocidade2 = sc.nextInt();
        sc.nextLine();
        carro1.exibirStatus();


        System.out.println("Digite quanto deseja frear : ");
        int velocidade3 = sc.nextInt();
        sc.nextLine();
        carro1.exibirStatus();



        sc.close();*/

        //Conta Bancária 2

        /*ContaBancaria2 contaBancaria3 = new ContaBancaria2();

        System.out.println("Titular da conta: ");
        String Titular = sc.nextLine();

        System.out.println("Número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Saldo da conta: " + contaBancaria3.getSaldo());

        System.out.println("Deseja depositar? (sim/não) ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Valor a depositar: ");
            double valorDepositar = sc.nextDouble();
            contaBancaria3.setSaldo(contaBancaria3.getSaldo() + valorDepositar);

            System.out.println("Saldo da conta: " + contaBancaria3.getSaldo());
            sc.nextLine(); // <<< limpa o ENTER deixado pelo nextDouble
        }

        System.out.println("Deseja sacar? (sim/não) ");
        String resposta2 = sc.nextLine();

        if (resposta2.equalsIgnoreCase("sim")) {
            System.out.println("Valor a sacar: ");
            double valorSacar = sc.nextDouble();
            sc.nextLine(); // limpa o buffer

            if (valorSacar <= contaBancaria3.getSaldo()) {
                contaBancaria3.setSaldo(contaBancaria3.getSaldo() - valorSacar);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }

            System.out.println("Saldo final da conta: " + contaBancaria3.getSaldo());
            return; */


        //Livro2

        /*Livro2 Livro3 = new Livro2();


        System.out.println("Título do livro: ");
        Livro3.setTitulo(sc.next());

        System.out.println("Autor: ");
        Livro3.setAutor(sc.next());

        System.out.println("O livro está emprestado ou não? (true/false): ");
        boolean opcao = sc.nextBoolean();

        sc.nextLine();


        if (opcao == true) {
            System.out.println("Livro emprestado!");

        }
        else {
            System.out.println("Livro disponível!");*/


        //Desafio: Sistema de gestão de loja


        //Entrada de dados

        /*System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        sc.nextLine();

        System.out.println("Digite o quantidade do produto: ");
        int quantidadeProduto = sc.nextInt();

        sc.nextLine();

        //Criando objeto produto


        Produto produto1 = new Produto(nomeProduto, valorProduto, quantidadeProduto);


        //usando getters para acessar dados

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$ " +  produto1.getPreco());
        System.out.println("Quantidade: " + quantidadeProduto);*/





package Aulas.java;

public class Main {
    public static void main(String[] args) {
        Bilheteria bilheteria = new Bilheteria();
        bilheteria.atendimento();
    }
}





























