package org.example.structural.tp.decorator;

public class BasicNotificationService implements NotificationService {
    @Override
    public void send(String destinataire, String message) {
        System.out.println("Notification envoyée à " + destinataire + " : " + message);
    }
}

