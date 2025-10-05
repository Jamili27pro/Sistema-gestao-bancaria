package Avaliacao;

public class Moto extends Veiculo {
    protected int cilindradas;


    public Moto(String placa, String marca, Double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + this.cilindradas);

    }


    public void mostrarDados(boolean mostrarCilindradas) {
        super.mostrarDados();
        if (mostrarCilindradas) {
            System.out.println("Cilindradas: " + this.cilindradas);
        }
    }
}


