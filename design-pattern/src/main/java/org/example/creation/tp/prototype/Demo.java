package org.example.creation.tp.prototype;

public class Demo {
    public static void main(String[] args) {
        HouseModel house = new HouseModel(120.5, "Blanc", "Pierre", 6);
        HouseModel copiedHouse = (HouseModel) house.duplicate();
        copiedHouse.setColor("Gris");

        CarModel car = new CarModel(4.2, "Rouge", "Métal", "Hybride");
        CarModel copiedCar = (CarModel) car.duplicate();
        copiedCar.setEngineType("Électrique");

        PlaneModel plane = new PlaneModel(55.0, "Bleu", "Composite", 180);
        PlaneModel copiedPlane = (PlaneModel) plane.duplicate();
        copiedPlane.setCapacity(200);

        System.out.println(house.description());
        System.out.println(copiedHouse.description());

        System.out.println(car.description());
        System.out.println(copiedCar.description());

        System.out.println(plane.description());
        System.out.println(copiedPlane.description());
    }
}

