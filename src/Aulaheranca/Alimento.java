package Aulaheranca;

public class Alimento extends Produto {
    private String dataValidade;


    public Alimento(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public void mostrarDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Data de validade: " + this.dataValidade);



    }
}
