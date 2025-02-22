package by.bogdanova.L13_02_2025_2;

public class Bird extends WildAnimal {

    public Bird(String name, String species, int age, String livingArea) {
        super(name, species, age, livingArea);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " чирикает: Чик-Чирик!");
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " летает в небе.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " клюет зерна.");
    }
}
