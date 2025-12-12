package org.example.structural.tp.adapter.exercice2;

public class EmailService {
    public void sendEmail(String email, String subject, String body) {
        System.out.println("Sending email to " + email
                + ((subject == null) ? "" : "\nSubject: " + subject)
                + "\nBody: " + body);
    }
}
