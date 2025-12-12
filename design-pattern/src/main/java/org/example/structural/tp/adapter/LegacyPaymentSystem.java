package org.example.structural.tp.adapter;

public class LegacyPaymentSystem {
    public void makePayment(float amount) {
        System.out.println("Paiement effectué avec l'ancien système: " + amount + " €");
    }

    public void verifyPayment(float amount) {
        System.out.println("Vérification du paiement: " + amount + " €");
    }
}

