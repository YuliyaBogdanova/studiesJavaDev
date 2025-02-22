package by.bogdanova.L13_02_2025_2;

public abstract class Animal {

    private int id; // уникальный идентификатор
    private String name; // (имя животного)
    private String species; // (вид)
    private int age; // (возраст)
    private static int totalAnimals = 0;

    public Animal(String name, String species, int age) {
        this.id = ++totalAnimals;  //
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract void makeSound(); //  издает звук

    public abstract void move(); // описывает движение

    public abstract void eat(); // описывает, что животное ест

    public void sleep() {
        System.out.println(name + " спит");
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    // возвращает описание животного
    @Override
    public String toString() {
        return species + " по имени " + name + ", возраст: " + age
                + " (ID: " + id + ")";
    }
}
