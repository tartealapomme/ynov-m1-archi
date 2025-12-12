package org.example.structural.tp.adapter.exercice1;

public class NewPaymentGateway {
    public void authenticate(String apiKey) {
        System.out.println("Authentication with key api "+apiKey);
    }

    public void sendPayment(double amount) {
        System.out.println("Payment new system "+ amount + " €");
    }
}
