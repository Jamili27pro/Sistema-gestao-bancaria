package Aulas
        .java;

import java.util.Scanner;

public class Bilheteria {
    private int quantIngressos;
    private int quantInteira;
    private int quantMeia;
    private int quantPromocional;
    private int quantGratuitos;
    private double total;

    public int getQuantIngressos() { return quantIngressos; }
    public void setQuantIngressos(int quantIngressos) { this.quantIngressos = quantIngressos; }

    public int getQuantInteira() { return quantInteira; }
    public void setQuantInteira(int quantInteira) { this.quantInteira = quantInteira; }

    public int getQuantMeia() { return quantMeia; }
    public void setQuantMeia(int quantMeia) { this.quantMeia = quantMeia; }

    public int getQuantPromocional() { return quantPromocional; }
    public void setQuantPromocional(int quantPromocional) { this.quantPromocional = quantPromocional; }

    public int getQuantGratuitos() { return quantGratuitos; }
    public void setQuantGratuitos(int quantGratuitos) { this.quantGratuitos = quantGratuitos; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public void atendimento() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Venda venda = new Venda();
            venda.processoVenda(sc);
            venda.resumoPorCliente();

            // soma total de ingressos vendidos
            setQuantIngressos(getQuantIngressos() + venda.getQuantidade());

            String tipoVenda = venda.getTipo_venda();
            if (tipoVenda.equalsIgnoreCase("Inteira")) {
                setQuantInteira(getQuantInteira() + venda.getQuantidade());
            } else if (tipoVenda.equalsIgnoreCase("Meia")) {
                setQuantMeia(getQuantMeia() + venda.getQuantidade());
            } else if (tipoVenda.equalsIgnoreCase("Promocional")) {
                setQuantPromocional(getQuantPromocional() + venda.getQuantidade());
            } else if (tipoVenda.equalsIgnoreCase("Gratuito")) {
                setQuantGratuitos(getQuantGratuitos() + venda.getQuantidade());
            }

            setTotal(getTotal() + venda.getValor_final());

            System.out.print("\nAtender próximo cliente? (Sim/Não): ");
            String resposta = sc.nextLine().trim();
            if (resposta.equalsIgnoreCase("Não")) {
                break;
            }

            System.out.println("--------------------------------");
        }

        // resumo final
        System.out.println("\n============= RESUMO FINAL =============");
        System.out.println("Total de ingressos vendidos: " + getQuantIngressos());
        System.out.println("Inteira: " + getQuantInteira());
        System.out.println("Meia: " + getQuantMeia());
        System.out.println("Promocional: " + getQuantPromocional());
        System.out.println("Gratuitos: " + getQuantGratuitos());
        System.out.printf("Valor total arrecadado: R$ %.2f%n", getTotal());
    }
}
