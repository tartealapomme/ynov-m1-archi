package org.example.structural.tp.decorator;

public class EncryptionNotificationDecorator extends NotificationDecorator {
    public EncryptionNotificationDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String destinataire, String message) {
        String encryptedMessage = encrypt(message);
        super.send(destinataire, encryptedMessage);
    }

    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encrypted.append((char) ((c - base + 3) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return "[CHIFFRÉ] " + encrypted.toString();
    }
}

