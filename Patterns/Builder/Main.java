package Builder;

public class Main {
    public static void main(String[] args) {

        //Criação de um Computador Básico
        ComputadorBuilder builderBasico = new ComputadorBuilder();
        builderBasico.setProcessador("Intel Core i5");
        builderBasico.setMemoriaRAM("8GB");
        builderBasico.setArmazenamento("256GB SSD");
        builderBasico.setPlacaDeVideo("Integrada");
        builderBasico.setSistemaOperacional("Linux");

        Computador computadorBasico = builderBasico.build();

        //Criação de um Computador Gamer
        ComputadorBuilder builderGamer = new ComputadorBuilder();
        builderGamer.setProcessador("Intel Core i9");
        builderGamer.setMemoriaRAM("32GB");
        builderGamer.setArmazenamento("1TB SSD");
        builderGamer.setPlacaDeVideo("NVIDIA RTX 4070");
        builderGamer.setSistemaOperacional("Windows 11 Pro");

        Computador computadorGamer = builderGamer.build();

        //Exibição dos dados
        System.out.println(computadorBasico.exibirInformacoes(" Computador Básico "));
        System.out.println("\n"); // Quebra de linha entre os computadores
        System.out.println(computadorGamer.exibirInformacoes(" Computador Gamer "));
    }
}
