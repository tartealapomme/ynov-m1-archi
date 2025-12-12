package org.example.creation.tp.prototype;

import java.util.Objects;

public abstract class Model3D {
    private double size;
    private String color;
    private String texture;

    protected Model3D(double size, String color, String texture) {
        this.size = validateSize(size);
        this.color = Objects.requireNonNull(color);
        this.texture = Objects.requireNonNull(texture);
    }

    protected Model3D(Model3D source) {
        this(source.size, source.color, source.texture);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = validateSize(size);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Objects.requireNonNull(color);
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = Objects.requireNonNull(texture);
    }

    public abstract Model3D duplicate();

    public abstract String description();

    private double validateSize(double size) {
        if (size <= 0) {
            throw new IllegalArgumentException("La taille doit être positive");
        }
        return size;
    }
}

