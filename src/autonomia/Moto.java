package autonomia;

public class Moto extends Veiculo{

    public Moto(String marca, String modelo, double capacidadeTanque) {
        super(marca, modelo, capacidadeTanque);
    }

    @Override
    public double calcularAutonomia(double litros) {
        double kilometragem = litros * getKmLitro();
        System.out.print("O veículo " + getModelo() +
                " tem autonomia de " + kilometragem +
                " km com " + litros + " litros.\n");
        System.out.println("-".repeat(7));
        return kilometragem;
    }

    @Override
    public double getKmLitro(){ return 15.0; }
    public double calcularTaxaManutencao(){
        double taxa = 200.0;
        System.out.println("Taxa de serviço: R$" + taxa);
        return 200.0;
    }
}