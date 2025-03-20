package by.bogdanova.L13_03_2025.homework.model;

public class Car extends Transport {

    private String fuelType;

    public Car(String model, int speed, String licensePlate, int year, String fuelType) {
        super(model, speed, licensePlate, year);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + ": " + super.toString() + "; тип топлива: " + this.fuelType;
    }
}
