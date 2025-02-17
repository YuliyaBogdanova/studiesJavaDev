package by.bogdanova.L13_02_2025_2;

public class Dog extends Pet {

    public Dog(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " говорит: Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " бегает на четырех лапах.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " ест собачий корм.");
    }
}
