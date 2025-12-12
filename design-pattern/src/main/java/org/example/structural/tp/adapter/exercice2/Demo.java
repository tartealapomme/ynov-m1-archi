package org.example.structural.tp.adapter.exercice2;

public class Demo {
    public static void main(String[] args) {
        SmsService notificationAdapter = new NotificationAdapter();
        notificationAdapter.sendSms("0101010101", "Hello world!");
    }
}
