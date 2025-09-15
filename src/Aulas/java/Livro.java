package Aulas.java;

public class Livro {
    String titulo, autor;
    int quantPag;
    boolean emprestado;

    public void emprestar(){
        if (emprestado) {
            System.out.println("livro emprestado");
        }
        else {
            System.out.println("Livro disponível");
        }
    }
}





