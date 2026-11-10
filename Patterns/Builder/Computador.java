package Builder;

public class Computador {
    //Atributos
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    //Construtor
    Computador(String processador, String memoriaRAM, String armazenamento, String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    //Getters
    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    //Método de Exibir informações do PC
    public String exibirInformacoes(String titulo){
        return "========"+titulo+"========"+
                "\nProcessador: "+getProcessador()+
                "\nMémoria RAM: "+getMemoriaRAM()+
                "\nArmazenamento: "+getArmazenamento()+
                "\nPlaca de Video: "+getPlacaDeVideo()+
                "\nSistema Operacional: "+getSistemaOperacional();
    }
}
