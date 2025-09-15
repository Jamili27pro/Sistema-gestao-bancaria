package Aulas.java;

public class ContaBancaria2 {
    private String Titular;
    private int numeroConta;
    private double saldo = 0;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return Titular;
    }
}
