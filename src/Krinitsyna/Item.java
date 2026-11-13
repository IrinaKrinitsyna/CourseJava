package Krinitsyna;

public class Item {
    private double mass;   // масса
    private double volume; // объём

    public Item(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
    }


    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    // Плотность = масса / объём
    public double getDensity() {
        return mass / volume;
    }
}
