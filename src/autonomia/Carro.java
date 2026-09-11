package autonomia;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, double capacidadeTanque) {
        super(marca, modelo, capacidadeTanque);
    }

    @Override
    public double getKmLitro() {
        return 12.0;
    }

    @Override
    public double calcularTaxaManutencao() {
        double taxa = 500.0;
        System.out.println("Taxa de manutenção do Carro (" + getModelo() + "): R$" + taxa);
        return taxa;
    }
}
