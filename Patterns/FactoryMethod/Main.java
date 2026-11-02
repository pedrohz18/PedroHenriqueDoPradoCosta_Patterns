package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando UI ---");
        GUIFactory fabricaAndroid = new AndroidFactory();
        AplicacaoUI appAndroid = new AplicacaoUI(fabricaAndroid);
        appAndroid.renderizarUI();

        GUIFactory fabricaIos = new IosFactory();
        AplicacaoUI appIos = new AplicacaoUI(fabricaIos);
        appIos.renderizarUI();


        System.out.println("\n--- Testando Notificações ---");
        NotificacaoFactory emailService = new EmailFactory();
        emailService.processarNotificacao();

        NotificacaoFactory smsService = new SmsFactory();
        smsService.processarNotificacao();
    }
}