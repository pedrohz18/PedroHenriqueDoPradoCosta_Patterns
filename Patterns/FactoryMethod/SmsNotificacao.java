package FactoryMethod;

public class SmsNotificacao implements IntNotificacao{
    @Override
    public void enviar(){
        System.out.println("Enviando Mensagem Por Sms!");
    }
}
