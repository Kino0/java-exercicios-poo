package autonomia;

public abstract class Veiculo {
    private final String marca;
    private final String modelo;
    private final double capacidadeTanque;

    public Veiculo(String marca, String modelo, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirDados() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.capacidadeTanque);
    }

    public double calcularAutonomia(double litros) {
        double litrosValidos = litros;

        if (litros > capacidadeTanque) {
            System.out.println("Capacidade do tanque excedida.");
            litrosValidos = capacidadeTanque;
        }

        double kilometragem = litrosValidos * getKmLitro();
        System.out.println("O veículo "
                + getModelo() +
                " tem autonomia de "
                + kilometragem + " km com "
                + litrosValidos
                + " litros.");
        return kilometragem;
    }

    public abstract double getKmLitro();

    public abstract double calcularTaxaManutencao();
}