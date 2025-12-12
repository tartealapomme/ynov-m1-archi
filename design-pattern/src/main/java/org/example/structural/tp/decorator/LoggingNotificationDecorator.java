package org.example.structural.tp.decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingNotificationDecorator extends NotificationDecorator {
    public LoggingNotificationDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String destinataire, String message) {
        logNotification(destinataire, message);
        super.send(destinataire, message);
    }

    private void logNotification(String destinataire, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[LOG] " + timestamp + " - Envoi notification à " + destinataire);
    }
}

