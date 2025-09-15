package Aulas.java;

import java.util.Scanner;

public class Bilheteria {
    private int quantIngressos;
    private int quantInteira;
    private int quantMeia;
    private int quantGratuitos;
    private double total;

    // Getters e Setters
    public int getQuantIngressos() { return quantIngressos; }
    public void setQuantIngressos(int quantIngressos) { this.quantIngressos = quantIngressos; }

    public int getQuantInteira() { return quantInteira; }
    public void setQuantInteira(int quantInteira) { this.quantInteira = quantInteira; }

    public int getQuantMeia() { return quantMeia; }
    public void setQuantMeia(int quantMeia) { this.quantMeia = quantMeia; }

    public int getQuantGratuitos() { return quantGratuitos; }
    public void setQuantGratuitos(int quantGratuitos) { this.quantGratuitos = quantGratuitos; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }


    public void atendimento() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Venda venda = new Venda();
            venda.processoVenda();
            venda.resumoPorCliente();


            setQuantIngressos(getQuantIngressos() + venda.getQuantidade());


            if (venda.getTipoVenda().equalsIgnoreCase("Inteira")) {
                setQuantInteira(getQuantInteira() + venda.getQuantidade());
            }
            else if (venda.getTipoVenda().equalsIgnoreCase("Meia")) {
                setQuantMeia(getQuantMeia() + venda.getQuantidade());
            }
            else if (venda.getTipoVenda().equalsIgnoreCase("Promocional")) {
                setQuantGratuitos(getQuantGratuitos() + venda.getQuantidade());
            }
            else {
                setQuantGratuitos(getQuantGratuitos() + venda.getQuantidade());
            }


            setTotal(getTotal() + venda.getValorFinal());


            System.out.print("\nAtender próximo cliente? (Sim/Não): ");
            String resposta = sc.nextLine().trim();
            if (resposta.equalsIgnoreCase("Não")) {
                break; // Aqui vai sair do loop
            }

            System.out.println("--------------------------------");
        }


        System.out.println("------------------------------");
        System.out.println("Total de ingressos vendidos: " + getQuantIngressos());
        System.out.println("Inteira: " + getQuantInteira());
        System.out.println("Meia: " + getQuantMeia());
        System.out.println("Promocional/Gratuitos: " + getQuantGratuitos());
        System.out.printf("Valor total arrecadado: R$ %.2f%n", getTotal());
    }
}

























        }
    }
















}
