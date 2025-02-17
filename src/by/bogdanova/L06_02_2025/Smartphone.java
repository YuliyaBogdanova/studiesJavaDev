package by.bogdanova.L06_02_2025;

public class Smartphone extends ElectronicDevice{

    double cameraResolution;

    public Smartphone(String brand, String model, int power, double cameraResolution) {
        super(brand, model, power);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Устройство: " + getBrand() + ", мощность: "
                + getPower() + " Вт" + ". Разрешение камеры: " +  cameraResolution;
    }
}
