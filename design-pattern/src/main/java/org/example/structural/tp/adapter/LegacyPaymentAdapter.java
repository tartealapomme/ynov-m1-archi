package org.example.structural.tp.adapter;

public class LegacyPaymentAdapter implements PaymentGateway {
    private LegacyPaymentSystem legacyPaymentSystem;

    public LegacyPaymentAdapter(LegacyPaymentSystem legacyPaymentSystem) {
        this.legacyPaymentSystem = legacyPaymentSystem;
    }

    @Override
    public void processPayment(double amount) {
        legacyPaymentSystem.verifyPayment((float) amount);
        legacyPaymentSystem.makePayment((float) amount);
    }
}

