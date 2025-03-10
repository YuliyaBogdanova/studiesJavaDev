package by.bogdanova.L06_03_2025.homework;

public class Truck extends Transport{

    private int loadCapacity;   // грузоподъемность в тоннах

    public Truck(String model, int speed, int loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + ": " + super.toString() + "; грузоподъемность: " + this.loadCapacity;
    }
}
