package exerciciosjava;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US); //para colocar valores com ponto e não com vírgula.
        Scanner sc = new Scanner(System.in); //colocar valores de entrada.

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        int soma = valor1 + valor2;


        System.out.println("SOMA = " + soma);

        sc.close();
    }
}

