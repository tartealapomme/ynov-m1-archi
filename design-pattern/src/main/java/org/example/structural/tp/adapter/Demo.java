package org.example.structural.tp.adapter;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Exercice 1: Adapter de lecteur multimédia ===\n");
        exercice1();

        System.out.println("\n=== Exercice 2: Adapter de système de paiement ===\n");
        exercice2();

        System.out.println("\n=== Exercice 3: Adapter de format de données ===\n");
        exercice3();
    }

    private static void exercice1() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "film.avi");
    }

    private static void exercice2() {
        PaymentGateway modernGateway = new ModernPaymentGateway();
        modernGateway.processPayment(100.50);

        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem();
        PaymentGateway legacyAdapter = new LegacyPaymentAdapter(legacySystem);
        legacyAdapter.processPayment(250.75);
    }

    private static void exercice3() {
        DataFormat jsonData = new JsonData();
        jsonData.displayData("{\"name\": \"John\", \"age\": 30}");

        XmlData xmlData = new XmlData();
        DataFormat xmlAdapter = new XmlDataAdapter(xmlData);
        xmlAdapter.displayData("<person><name>John</name><age>30</age></person>");
    }
}

