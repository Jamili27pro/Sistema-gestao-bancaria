package Avaliacao;

public class Carro extends Veiculo {
    protected String numPortas;


    public Carro(String placa, String marca, Double preco, String numPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); // mostra os dados já inseridos
        System.out.println("Número de Portas: " + this.numPortas);
    }


    public void mostrarDados(boolean mostrarNumPortas) {
        super.mostrarDados();
        if (mostrarNumPortas) {
            System.out.println("Número de Portas: "  + this.numPortas);
        }
    }
}