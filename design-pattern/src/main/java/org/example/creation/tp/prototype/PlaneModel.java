package org.example.creation.tp.prototype;

public class PlaneModel extends Model3D {
    private int capacity;

    public PlaneModel(double size, String color, String texture, int capacity) {
        super(size, color, texture);
        this.capacity = validateCapacity(capacity);
    }

    private PlaneModel(PlaneModel source) {
        super(source);
        this.capacity = source.capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = validateCapacity(capacity);
    }

    @Override
    public Model3D duplicate() {
        return new PlaneModel(this);
    }

    @Override
    public String description() {
        return "Avion " + getColor() + " capacité " + capacity + " taille " + getSize() + " texture " + getTexture();
    }

    private int validateCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("La capacité doit être positive");
        }
        return capacity;
    }
}

