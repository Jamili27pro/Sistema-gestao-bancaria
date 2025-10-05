package SegundaPartedaAvaliacao;

public class ContaPoupanca extends Conta {
    private double taxaRendimentoMensal;


    public ContaPoupanca(String numeroConta, String titular, double saldo, double taxaRendimentoMensal) {
        super(numeroConta, titular, saldo);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public double getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }

    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de rendimento mensal: " + this.taxaRendimentoMensal);

    }
    public void mostrarDados(boolean emTaxaAnual) {
        super.mostrarDados();
        if (emTaxaAnual) {
            System.out.println("Taxa anual aproximadamente: " + (this.taxaRendimentoMensal * 12) + "%");

        } else {
            System.out.println("Taxa de rendimento mensal: " + this.taxaRendimentoMensal + "%");
        }
    }
}

