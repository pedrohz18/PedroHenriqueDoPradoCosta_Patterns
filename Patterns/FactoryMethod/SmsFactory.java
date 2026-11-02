package FactoryMethod;

public class SmsFactory extends NotificacaoFactory{
    @Override
    public IntNotificacao criarNotificacao() {return new SmsNotificacao();}
}
