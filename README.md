# 🚗 Gestão de Autonomia — Orientação a Objetos em Java

Este projeto consiste em um sistema de simulação e gestão de frota de veículos desenvolvido em Java para exercitar os pilares da Orientação a Objetos (OO), como **Abstração**, **Encapsulamento**, **Polimorfismo de Referência** e a aplicação do padrão de projeto **Template Method**.

---

## 📌 Sobre o Projeto

O objetivo principal do projeto foi construir uma hierarquia de veículos (`Veiculo`, `Carro` e `Moto`) capaz de validar limites de abastecimento de combustível, calcular autonomias de rodagem específicas por tipo de veículo e gerenciar taxas de manutenção de forma genérica e polimórfica [2, 4].

O desenvolvimento foi conduzido de forma evolutiva através de três níveis de complexidade:
1. **Nível 1 (Fácil):** Construção da classe abstrata base e herança direta [2].
2. **Nível 2 (Médio):** Manipulação de coleções polimórficas com `List<Veiculo>` [4, 5].
3. **Nível 3 (Desafiador):** Arquitetura com *Template Method* e validação de regras de negócio [3, 6].

---

## 🚀 Conceitos e Elementos de Aprendizado Aplicados

* **Classes e Métodos Abstratos (`abstract`)**: A classe base `Veiculo` foi declarada como abstrata para impedir a sua instanciação direta (`new Veiculo()`), servindo como modelo estrutural do sistema [2]. Métodos abstratos como `getKmLitro()` e `calcularTaxaManutencao()` forçam as subclasses a fornecerem suas implementações concretas [6].
* **Encapsulamento e Imutabilidade**: Uso de modificadores de acesso `private final` para proteger os atributos da classe (`marca`, `modelo`, `capacidadeTanque`), garantindo a integridade dos dados [1, 7].
* **Polimorfismo e Programação Voltada a Interfaces**: Utilização de `List<Veiculo>` parametrizada com `ArrayList` [4, 5]. A aplicação gerencia a frota tratando os objetos unicamente pelo tipo abstrato `Veiculo`, delegando a execução dos métodos específicos para a classe real do objeto em tempo de execução [4, 8].
* **Padrão de Projeto *Template Method***: Centralização do fluxo algorítmico e das validações de negócio em um método concreto na classe mãe (`calcularAutonomia`), enquanto as etapas específicas são delegadas para métodos abstratos implementados pelas subclasses [3, 6].

---

## 💡 Desafios Encontrados e Soluções

### 1. Desvio no Fluxo do *Template Method* (Sobrescrita de Métodos)
* **Desafio:** Inicialmente, o método `calcularAutonomia` continha a validação da capacidade do tanque na classe mãe `Veiculo`, mas também estava sendo reescrito (`@Override`) nas subclasses `Carro` e `Moto`. Com isso, o Java executava o método da subclasse em tempo de execução, anulando a validação centralizada de limite de combustível.
* **Solução:** O método `calcularAutonomia` foi mantido **exclusivamente como um método concreto na classe mãe `Veiculo`**, removendo sua sobrescrita nas subclasses. Foi criado o método abstrato `getKmLitro()`, fazendo com que a subclasse apenas forneça a taxa de consumo, enquanto a classe mãe garante a execução correta das regras e validações [3, 6].

### 2. Programação Voltada à Abstração
* **Desafio:** Evitar o acoplamento direto com implementações concretas e garantir flexibilidade na manipulação da frota [5, 9].
* **Solução:** Aplicação da boa prática arquitetural de utilizar interfaces e tipos abstratos como referência (`Veiculo v = new Carro(...)` e `List<Veiculo> frota = new ArrayList<>()`), permitindo adicionar novos tipos de veículos no futuro sem impactar o código do cliente [4, 5, 9].

---

## 🛠️ Hierarquia de Classes

```text
       [Veiculo] (Classe Abstrata)
       /       \
      /         \
  [Carro]     [Moto] (Subclasses Concretas)
Resumo das Regras de Negócio:
Classe
Capacidade do Tanque
Consumo (getKmLitro)
Taxa de Manutenção
Veiculo
Definida no construtor
Abstrato
Abstrato
Carro
Ex: 25L, 40L, 50L
12.0 km/L
R$ 500,00
Moto
Ex: 15L, 17L, 19L
15.0 km/L
R$ 200,00
💻 Como Executar
Pré-requisitos
Java JDK 11 ou superior (compatível com Java 17/21).
IDE Java (Eclipse, IntelliJ, VS Code) ou terminal.
Passos:
Clone o repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
Acesse o diretório do projeto e compile os arquivos:
javac autonomia/*.java Main.java
Execute a classe principal:
java Main
Projeto desenvolvido para fins de estudo das melhores práticas de POO em Java. 🚀
