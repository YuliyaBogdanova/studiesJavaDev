package by.bogdanova.L13_02_2025;

public class Task00 {
    public static void main(String[] args) {

        Animal cat = new Cat("Timmi", "cat", 5, "Anna");
        Animal lion = new Lion("Richi", "lion", 13, "Африканская саванна");
        Animal dog = new Dog("Oliver", "dog", 3, "Terry");
        Animal bird = new Bird("Lusi", "bird", 1, "Тропический лес");


        Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = bird;
        animals[3] = lion;

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.move();
            animal.eat();
            animal.sleep();
            if (animal instanceof WildAnimal wildAnimal){
                wildAnimal.hunt();
            } else if (animal instanceof Pet pet) {
                pet.play();
            }
            System.out.println();
        }
        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
    }
}
