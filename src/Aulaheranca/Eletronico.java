package Aulaheranca;

public class Eletronico extends Produto {
    protected int garantia;

    public Eletronico(String codigo, String nome, Double preco, int garantia) {
        super(codigo, nome, preco);
        this.garantia = garantia;
    }


    public void mostrarDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Garantia: " + this.garantia);
    }}