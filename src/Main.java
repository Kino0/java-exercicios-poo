import autonomia.Carro;
import autonomia.Moto;
import autonomia.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Honda", "NSX", 40);
        carro1.exibirDados();
        carro1.calcularAutonomia(40);

        List<Veiculo> frota = new ArrayList<>();
        frota.add(new Carro("Honda", "Civic Type R", 25));
        frota.add(new Carro("Mitsubishi", "Lancer EVO", 30));
        frota.add(new Moto("Suzuki", "GSX", 17));
        frota.add(new Moto("Yamaha", "R15", 19));

        for (Veiculo veiculo : frota) {
            veiculo.exibirDados();
            veiculo.calcularAutonomia(30);
        }

        System.out.println("Exercício 3:");

        Veiculo esportivo1 = new Carro("Nissan", "Skyline R32", 50);
        Veiculo esportivo2 = new Moto("Honda", "CBR", 15);

        esportivo1.getKmLitro();
        esportivo1.calcularTaxaManutencao();

        esportivo2.getKmLitro();
        esportivo2.calcularTaxaManutencao();
    }
}