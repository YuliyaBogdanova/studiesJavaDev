package by.bogdanova.L06_03_2025.homework;

public class Bike extends Transport {

    boolean hasSidecar;

    public Bike(String model, int speed, boolean hasSidecar) {
        super(model, speed);
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
