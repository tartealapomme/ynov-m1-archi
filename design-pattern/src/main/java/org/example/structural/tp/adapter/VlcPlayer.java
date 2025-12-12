package org.example.structural.tp.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Lecture du fichier VLC: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}

