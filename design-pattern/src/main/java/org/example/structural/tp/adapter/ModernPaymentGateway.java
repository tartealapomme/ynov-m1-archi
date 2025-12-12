package org.example.structural.tp.adapter;

public class ModernPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paiement traité avec le système moderne: " + amount + " €");
    }
}

