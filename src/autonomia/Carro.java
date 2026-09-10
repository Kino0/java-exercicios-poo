package autonomia;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double calcularAutonomia(double litros){
        double kilometragem = litros * 12.0;
        System.out.print("O veículo " + getModelo() +
                " tem autonomia de " + kilometragem +
                " km com " + litros + " litros.\n");
        System.out.println("-".repeat(7));
        return kilometragem;
    }
}
