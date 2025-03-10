package by.bogdanova.L06_03_2025.homework;

public class Car extends Transport{

    private String fuelType;

    public Car(String model, int speed, String fuelType ) {
        super(model, speed);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + ": " + super.toString() + "; тип топлива: " + this.fuelType;
    }
}
