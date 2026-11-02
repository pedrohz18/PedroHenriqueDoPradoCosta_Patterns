package FactoryMethod;

public abstract class NotificacaoFactory {
    public abstract IntNotificacao criarNotificacao();

    public void processarNotificacao() {
        IntNotificacao notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
