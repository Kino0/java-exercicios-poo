package autonomia;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, double capacidadeTanque) {
        super(marca, modelo, capacidadeTanque);
    }

    @Override
    public double calcularAutonomia(double litros){
        double kilometragem = litros * getKmLitro();
        System.out.print("O veículo " + getModelo() +
                " tem autonomia de " + kilometragem +
                " km com " + litros + " litros.\n");
        System.out.println("-".repeat(7));
        return kilometragem;
    }

    @Override
    public double getKmLitro(){ return 12.0; }
    public double calcularTaxaManutencao(){
        double taxa = 500.0;
        System.out.println("Taxa de serviço: R$" + taxa);
        return 500.0;
    }
}
