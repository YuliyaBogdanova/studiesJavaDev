package by.bogdanova.L13_03_2025.homework.model;

import by.bogdanova.L27_02_2025.User;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport>{

    private String model;  // – модель транспорта
    private int speed; // – максимальная скорост
    private String licensePlate; //номерной знак
    private int year; // – год выпуска
    private User user;
    private int carMileage;

    public Transport(String model, int speed, String licensePlate, int year) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.year = year;
    }

    public Transport(int year, String model, int speed, String licensePlate, int carMileage) {
        this.year = year;
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.carMileage = carMileage;
    }

    public int getCarMileage() {return carMileage;}

    public int getYear() {return year;}

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLicensePlate() { return licensePlate; }

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
//        if (this == o) return true;      //  для TreeSet по моделям уникальные марки
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
//        return Objects.hashCode(model);
        return Objects.hash(getClass() , licensePlate);     // для TreeSet по моделям уникальные марки
    }

    @Override
    public String toString() {
        return " model = '" + model + '\'' +
                ", speed = " + speed +
                ", licensePlate = " + licensePlate;
    }

    public void setUser(User user) {this.user = user;}

    public User getUser() {return user;}
}
