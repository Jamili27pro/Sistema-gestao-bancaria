package Aulaheranca;

public class Vestuario extends Produto {
    private String tamanho;
    private String cor;

    public Vestuario(String codigo, String nome, Double preco, String tamanho, String cor) {
        super(codigo, nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void mostrarDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Cor: " + this.cor);

    }
}
