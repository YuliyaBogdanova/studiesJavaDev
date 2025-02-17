package by.bogdanova.L13_02_2025;

public class Dog extends Pet {

    public Dog(String name, String species, int age, String nameOwner) {
        super(name, species, age, nameOwner);
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
