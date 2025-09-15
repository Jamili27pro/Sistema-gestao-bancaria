package exerciciosjava;

import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digit o nome do aluno:");
        String nomeAluno = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = sc.nextDouble();

        double media;

        media = (nota1 + nota2) / 2;

        System.out.printf("A media do aluno foi: %.1f%n", media);

        if (media >= 7) {
            System.out.println("O aluno foi aprovado");
        }
        else {
            System.out.println("O aluno foi reprovado");
        }
    }
}
