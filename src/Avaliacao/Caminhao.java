package Avaliacao;

public class Caminhao extends Veiculo {
    protected int capacidadeCarga;


    public Caminhao(String placa, String marca, Double preco, int capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;

    }


    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade: " + capacidadeCarga + "kg");
    }

    public void mostrarDados(boolean mostrarCapacidade) {
        super.mostrarDados();
        if (mostrarCapacidade) {
            System.out.println("Capacidade: " + capacidadeCarga + "kg");

        }

    }
}