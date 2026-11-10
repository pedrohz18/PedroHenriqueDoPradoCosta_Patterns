package Builder;

public class ComputadorBuilder {
    //Atributos
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    //Builder Método
    public Computador build(){
        return new Computador(processador, memoriaRAM, armazenamento, placaDeVideo, sistemaOperacional);
    }
    //Setters
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
