package exerciciosjava;

import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Digite a primeiro nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segundo nota do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceiro nota do aluno: ");
        double nota3 = sc.nextDouble();
        double media;


        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno é: %.2f%n ", media);


        if (media >= 7) {
            System.out.println("O aluno foi aprovado!");
        }
        if ( media >= 5 && media < 7) {
            System.out.println("O aluno está de recuperação!");
        }
        if (media < 5) {
            System.out.println("O aluno está reprovado!");
        }
    }
}