package org.example.creation.tp.prototype;

import java.util.Objects;

public class CarModel extends Model3D {
    private String engineType;

    public CarModel(double size, String color, String texture, String engineType) {
        super(size, color, texture);
        this.engineType = Objects.requireNonNull(engineType);
    }

    private CarModel(CarModel source) {
        super(source);
        this.engineType = source.engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = Objects.requireNonNull(engineType);
    }

    @Override
    public Model3D duplicate() {
        return new CarModel(this);
    }

    @Override
    public String description() {
        return "Voiture " + getColor() + " moteur " + engineType + " taille " + getSize() + " texture " + getTexture();
    }
}

