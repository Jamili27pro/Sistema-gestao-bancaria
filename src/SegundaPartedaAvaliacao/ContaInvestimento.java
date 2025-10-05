package SegundaPartedaAvaliacao;

public class ContaInvestimento extends Conta {
    private double taxaAdministracao;



    public ContaInvestimento(String numeroConta, String titular, double saldo, double taxaAdministracao) {
        super(numeroConta, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Taxa de administração: " + taxaAdministracao);
    }

    public void mostrarDados(boolean considerarTaxa) {
        if (considerarTaxa) {
            double saldoLiquido = getSaldo() - (getSaldo() * taxaAdministracao / 100);
            System.out.println("\nNúmero da conta: " + getNumeroConta());
            System.out.println("Titular: " + getTitular());
            System.out.println("Saldo líquido após a taxa: " + saldoLiquido);

        } else {
            super.mostrarDados();
        }
    }
}
