package FactoryMethod;

public class AndroidFactory implements GUIFactory{
    @Override
    public Botao criarBotao() {return new AndroidBotao(); }
    @Override
    public Input criarInput() {return new AndroidInput(); }
}
