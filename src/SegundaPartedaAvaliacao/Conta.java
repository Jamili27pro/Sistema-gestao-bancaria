package SegundaPartedaAvaliacao;

public class Conta {
    private String numeroConta;
    private String titular;
    private Double saldo;

    public Conta(String numeroConta, String titular, Double saldo ) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println("\nNúmero da conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }

    public void mostrarDados(double projecaoMensal) {
        double saldoProjetado = saldo + (saldo * projecaoMensal / 100);
        System.out.println("\nNúmero da conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Saldo com projeção (+ " + projecaoMensal + "%): " + saldoProjetado);
    }
}
