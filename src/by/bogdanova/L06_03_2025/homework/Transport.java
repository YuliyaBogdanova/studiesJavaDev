package by.bogdanova.L06_03_2025.homework;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport>{

    private String model;  // – модель транспорта
    private int speed; // – максимальная скорост

    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Transport t) {
        int nameCompare = this.model.compareTo(t.model);
        if(nameCompare !=0) {
            return nameCompare;
        }
        return Integer.compare(this.speed, t.speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }

    @Override
    public String toString() {
        return " model = '" + model + '\'' +
                ", speed = " + speed;
    }
}
