package SegundaPartedaAvaliacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;


        while(opcao != 0){
            System.out.println("\n--- Sistema de Gestão Bancária ---");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Conta Investimento");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha o tipo de conta: ");
            opcao = sc.nextInt();

            sc.nextLine();

            if (opcao == 0) {
                System.out.println("\nO Sistema foi encerrado.");
                break;
            }

            System.out.print("Número da conta: ");
            String numero = sc.nextLine();

            System.out.print("Titular: ");
            String titular = sc.nextLine();

            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();


            if (opcao == 1) {
                System.out.print("Limite do cheque especial: ");
                double limite = sc.nextDouble();
                ContaCorrente cc = new ContaCorrente(numero, titular, saldo, limite);

                System.out.print("Você deseja ver o saldo com limite incluso? (true/false): ");
                boolean detalhar = sc.nextBoolean();

                cc.mostrarDados(detalhar);

        }
            else if (opcao == 2) {System.out.print("Taxa de rendimento mensal (%): ");
                double taxa = sc.nextDouble();
                ContaPoupanca cp = new ContaPoupanca(numero, titular, saldo, taxa);

                System.out.print("Exibir taxa anual aproximada? (true/false): ");
                boolean anual = sc.nextBoolean();

                cp.mostrarDados(anual);
            }
            else {
                System.out.println("Opção inválida, tente novamente.");

            }
        }
        sc.close();
    }
}























