package autonomia;

public abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirDados(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
    }

    public abstract double calcularAutonomia(double litros);
}