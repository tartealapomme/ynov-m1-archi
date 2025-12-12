package org.example.structural.tp.decorator;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Service de notification de base ===\n");
        NotificationService basicService = new BasicNotificationService();
        basicService.send("user@example.com", "Message simple");

        System.out.println("\n=== Service avec journalisation ===\n");
        NotificationService loggingService = new LoggingNotificationDecorator(
            new BasicNotificationService()
        );
        loggingService.send("user@example.com", "Message avec log");

        System.out.println("\n=== Service avec chiffrement ===\n");
        NotificationService encryptedService = new EncryptionNotificationDecorator(
            new BasicNotificationService()
        );
        encryptedService.send("user@example.com", "Message secret");

        System.out.println("\n=== Service avec mesure de temps ===\n");
        NotificationService timedService = new TimingNotificationDecorator(
            new BasicNotificationService()
        );
        timedService.send("user@example.com", "Message chronométré");

        System.out.println("\n=== Service avec journalisation et chiffrement ===\n");
        NotificationService loggingAndEncrypted = new LoggingNotificationDecorator(
            new EncryptionNotificationDecorator(
                new BasicNotificationService()
            )
        );
        loggingAndEncrypted.send("user@example.com", "Message sécurisé");

        System.out.println("\n=== Service avec tous les décorateurs ===\n");
        NotificationService fullService = new LoggingNotificationDecorator(
            new EncryptionNotificationDecorator(
                new TimingNotificationDecorator(
                    new BasicNotificationService()
                )
            )
        );
        fullService.send("user@example.com", "Message complet");

        System.out.println("\n=== Test avec ordre différent des décorateurs ===\n");
        NotificationService alternativeOrder = new TimingNotificationDecorator(
            new LoggingNotificationDecorator(
                new EncryptionNotificationDecorator(
                    new BasicNotificationService()
                )
            )
        );
        alternativeOrder.send("user@example.com", "Message avec ordre différent");
    }
}

