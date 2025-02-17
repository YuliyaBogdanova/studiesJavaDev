package by.bogdanova.L06_02_2025;

public class Laptop extends ElectronicDevice{

    private int timeToWorkFromBattery;

    public Laptop(String brand, String model, int power, int timeToWorkFromBattery) {
        super(brand, model, power);
        this.timeToWorkFromBattery = timeToWorkFromBattery;
    }

    @Override
    public String toString() {
        return "Устройство: " + getBrand() + ", мощность: "
                + getPower() + " Вт" + ". Времени работы от батареи: " +  timeToWorkFromBattery;

    }
}
