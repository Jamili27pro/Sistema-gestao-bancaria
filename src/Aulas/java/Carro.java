package Aulas.java;

public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade = 0;
    
    
    public void exibirStatus() {
        System.out.println("A velocidade atual é: " + velocidade + " km/h");
    }
    
    void acelerar(int valor) {
        velocidade += valor; //soma o valor à velocidade atual.


        }
    void freiar(int valor) {
        velocidade -= valor;

        if (velocidade < 0) { //não deixa ficar negativa


            velocidade = 0;
        }

    }
    
}
