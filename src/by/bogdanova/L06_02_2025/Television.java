package by.bogdanova.L06_02_2025;

public class Television extends ElectronicDevice {

    int screenSize;

    public Television(String brand, String model, int power, int screenSize) {
        super(brand, model, power);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Устройство: " + getBrand() + ", мощность: "
                + getPower() + " Вт" + ". Размер экрана: " +  screenSize;
    }
}
