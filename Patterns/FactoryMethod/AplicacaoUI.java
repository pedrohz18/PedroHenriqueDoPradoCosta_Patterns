package FactoryMethod;
public class AplicacaoUI {
    private Botao botao;
    private Input input;

    public AplicacaoUI(GUIFactory factory) {
        this.botao = factory.criarBotao();
        this.input = factory.criarInput();
    }

    public void renderizarUI() {
        botao.renderizar();
        input.renderizar();
    }
}

