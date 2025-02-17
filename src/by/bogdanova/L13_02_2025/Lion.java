package by.bogdanova.L13_02_2025;

public class Lion extends WildAnimal {


    public Lion(String name, String species, int age, String livingArea) {
        super(name, species, age, livingArea);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " рычит: Ррррр!");
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " быстро бежит по " + super.getSpecies());
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " ест мясо.");
    }
}
