package org.example.structural.tp.decorator;

public abstract class NotificationDecorator implements NotificationService {
    protected NotificationService notificationService;

    public NotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void send(String destinataire, String message) {
        notificationService.send(destinataire, message);
    }
}

