package FactoryMethod;

public class EmailNotificacao implements IntNotificacao{
    @Override
    public void enviar(){
        System.out.println("Enviando Mensagem Por Email!");
    }
}
