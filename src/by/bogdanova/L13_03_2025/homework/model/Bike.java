package by.bogdanova.L13_03_2025.homework.model;

public class Bike extends Transport {

    boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, int year, boolean hasSidecar) {
        super(model, speed, licensePlate, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        if (hasSidecar) {
            return getClass().getSimpleName() + ": " + super.toString() + ". Есть коляска";
        }
        else return getClass().getSimpleName() + ": " + super.toString() + ". Нет коляски";
    }
}
