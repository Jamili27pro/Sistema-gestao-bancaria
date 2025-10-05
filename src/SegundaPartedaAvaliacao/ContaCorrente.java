package SegundaPartedaAvaliacao;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite do cheque especial: " + this.limiteChequeEspecial);
    }


    public void mostrarDados(boolean detalharLimite) {
        super.mostrarDados();
        if (detalharLimite) {
            System.out.println("Limite do cheque especial: " + this.limiteChequeEspecial);
            System.out.println("Saldo disponível: " + (getSaldo() + this.limiteChequeEspecial));
        }
    }
}

