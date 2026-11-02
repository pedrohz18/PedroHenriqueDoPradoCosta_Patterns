package FactoryMethod;

public class EmailFactory extends NotificacaoFactory{
    @Override
    public IntNotificacao criarNotificacao() {return new EmailNotificacao();}
}
