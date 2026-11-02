package FactoryMethod;

public class IosFactory implements GUIFactory{
    @Override
    public Botao criarBotao(){return new IosBotão();}
    @Override
    public Input criarInput(){return new IosInput();}
}
