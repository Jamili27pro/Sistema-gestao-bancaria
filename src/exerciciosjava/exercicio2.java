package exerciciosjava;


import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Digite um valor: ");
        valor1 = sc.nextInt();


        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O número " + valor1 + " é maior que o número " + valor2);
        }
        else {
            System.out.println("O número " + valor2 + " é maior que o número " + valor1);

        }
    }
}
