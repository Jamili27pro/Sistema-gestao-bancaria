package Aulas.java;

public class Aluno {
    String nome, curso;
    int matricula, idade;

    public float media(float nota1, float nota2) {
        return (nota1 + nota2) / 2;

    }

    public String situacaoAluno(float media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
            }
        }
    }


