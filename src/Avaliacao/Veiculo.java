package Avaliacao;

public class Veiculo {
    protected String placa;
    protected String marca;
    protected Double preco;

    public Veiculo(String placa, String marca, Double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }


    public void mostrarDados() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
    }


    public void mostrarDados(double desconto) {
        double valorComDesconto = preco - (preco * desconto / 100);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Preço com desconto de " + desconto + "%: R$" + valorComDesconto);

    }
}
