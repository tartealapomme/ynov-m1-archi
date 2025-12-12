package org.example.creation.tp.prototype;

public class HouseModel extends Model3D {
    private int rooms;

    public HouseModel(double size, String color, String texture, int rooms) {
        super(size, color, texture);
        this.rooms = validateRooms(rooms);
    }

    private HouseModel(HouseModel source) {
        super(source);
        this.rooms = source.rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = validateRooms(rooms);
    }

    @Override
    public Model3D duplicate() {
        return new HouseModel(this);
    }

    @Override
    public String description() {
        return "Maison " + getColor() + " taille " + getSize() + " texture " + getTexture() + " avec " + rooms + " pièces";
    }

    private int validateRooms(int rooms) {
        if (rooms <= 0) {
            throw new IllegalArgumentException("Le nombre de pièces doit être positif");
        }
        return rooms;
    }
}

