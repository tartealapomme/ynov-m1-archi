package org.example.structural.tp.decorator;

public class TimingNotificationDecorator extends NotificationDecorator {
    public TimingNotificationDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String destinataire, String message) {
        long startTime = System.currentTimeMillis();
        super.send(destinataire, message);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("[TIMING] Temps d'exécution : " + duration + " ms");
    }
}

