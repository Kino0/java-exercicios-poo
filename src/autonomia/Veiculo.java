package autonomia;

public abstract class Veiculo {
    private final String marca;
    private final String modelo;
    private final double capacidadeTanque;

    public Veiculo(String marca, String modelo, double capacidadeTanque){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirDados(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.capacidadeTanque);
    }

    public abstract double calcularAutonomia(double litros);
}