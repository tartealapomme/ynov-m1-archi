package org.example.structural.tp.adapter.exercice1;

public class Client {
    public static void main(String[] args) {
        OldPaymentGateway paymentGateway = new NewPaymentAdapter();
        paymentGateway.makePayment("132243", 100);
    }

}
