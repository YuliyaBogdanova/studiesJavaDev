package by.bogdanova.L06_02_2025;

public class ElectronicDevice {

    private String brand;
    private String model;
    private int power; // (мощность в ваттах)
    private boolean isOn; // (состояние устройства: включено или выключено)

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    void turnOn() {
        System.out.println(model + " от " + brand + " включен.");
        isOn = true;
    }

    void turnOff() {
        System.out.println(model + " от " + brand + " выключен.");
        isOn = false;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String toString(){
        return "Устройство: " + brand + " " + model + ", мощность: " + power + " Вт";
    }

    String getStatus() {
        if (isOn) {
            return model + " включено";
        } else return model + " выключено";
    }
}
