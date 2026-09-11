package autonomia;

public class Moto extends Veiculo{

    public Moto(String marca, String modelo, double capacidadeTanque) {
        super(marca, modelo, capacidadeTanque);
    }

    @Override
    public double calcularAutonomia(double litros) {
        double kilometragem = litros * 25.0;
        System.out.print("O veículo " + getModelo() +
                " tem autonomia de " + kilometragem +
                " km com " + litros + " litros.\n");
        System.out.println("-".repeat(7));
        return kilometragem;
    }
}