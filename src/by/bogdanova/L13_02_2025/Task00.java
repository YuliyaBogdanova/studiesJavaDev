package by.bogdanova.L13_02_2025_2;

import java.util.ArrayList;
import java.util.List;

public class Task00 {

    public static void main(String[] args) {

        Owner oner1 = new Owner();
        Owner owner2 = new Owner();

        Pet cat = new Cat("Timmi", "cat", 5);
        Pet dog = new Dog("Oliver", "dog", 3);
        owner2.addPet(cat);
        oner1.addPet(dog);

        System.out.println(cat.toString());
        System.out.println(dog.toString());

        System.out.println("Общее количество домашних животных: " + Owner.getTotalOwners());
    }
}
