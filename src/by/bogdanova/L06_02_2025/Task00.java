package by.bogdanova.L06_02_2025;

public class Task00 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Apple", "MakBook", 380, 180);
        Smartphone smartphone = new Smartphone("Samsung", "R234", 220, 1.4);
        Television television = new Television("Honor", "red34", 380, 48);


        System.out.println(laptop.toString());
        System.out.println("Состояние: " + laptop.getStatus());
        laptop.turnOn();
        System.out.println("Состояние: " + laptop.getStatus());
        laptop.turnOff();
        System.out.println("Состояние: " + laptop.getStatus());

        System.out.println(smartphone.toString());
        System.out.println("Состояние: " + smartphone.getStatus());
        smartphone.turnOn();
        System.out.println("Состояние: " + smartphone.getStatus());
        smartphone.turnOff();
        System.out.println("Состояние: " + smartphone.getStatus());

        System.out.println(television.toString());
        System.out.println("Состояние: " + television.getStatus());
        television.turnOn();
        System.out.println("Состояние: " + television.getStatus());
        television.turnOff();
        System.out.println("Состояние: " + television.getStatus());
    }
}
