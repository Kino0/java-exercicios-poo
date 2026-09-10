import autonomia.Carro;
import autonomia.Moto;
import autonomia.Veiculo;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Honda","NSX");
        carro1.exibirDados();
        carro1.calcularAutonomia(40);

        List<Veiculo> frota = new ArrayList<>();
        frota.add(new Carro("Honda", "Civic Type R"));
        frota.add(new Carro("Mitsubishi", "Lancer EVO"));
        frota.add(new Moto("Suzuki", "GSX"));
        frota.add(new Moto("Yamaha", "R15"));

        for (int i=0; i < frota.size(); i++){
            frota.get(i).exibirDados();
            frota.get(i).calcularAutonomia(30);
        }
    }
}