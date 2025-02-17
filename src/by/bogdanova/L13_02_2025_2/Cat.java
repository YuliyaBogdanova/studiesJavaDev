package by.bogdanova.L13_02_2025_2;

public class Cat extends Pet {


    public Cat(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " грациозно крадется.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " ест рыбу.");
    }
}
