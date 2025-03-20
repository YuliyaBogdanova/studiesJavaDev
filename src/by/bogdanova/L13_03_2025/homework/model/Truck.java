package by.bogdanova.L13_03_2025.homework.model;

public class Truck extends Transport {

    private int loadCapacity;   // грузоподъемность в тоннах

    public Truck(String model, int speed, String licensePlate, int year, int loadCapacity) {
        super(model, speed, licensePlate, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + ": " + super.toString() + "; грузоподъемность: " + this.loadCapacity;
    }
}
