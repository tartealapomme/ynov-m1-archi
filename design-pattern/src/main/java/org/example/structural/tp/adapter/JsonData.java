package org.example.structural.tp.adapter;

public class JsonData implements DataFormat {
    @Override
    public void displayData(String data) {
        System.out.println("Affichage des données JSON: " + data);
    }
}

