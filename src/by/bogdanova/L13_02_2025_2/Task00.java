package by.bogdanova.L13_02_2025_2;

import java.util.ArrayList;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {

//        Owner oner1 = new Owner();
//        Owner owner2 = new Owner();
//
//        Pet cat = new Cat("Timmi", "cat", 5);
//        Pet dog = new Dog("Oliver", "dog", 3);

        List<Pet> pets = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            pets.add(PetFactory.next());
        }


//        OwnewFactory.next().addPet(pet);
//        OwnewFactory.next().addPet(pet2);
//
//        System.out.println(pet.toString());
//        System.out.println(pet2.toString());


        System.out.println("Общее количество домашних животных: " + Owner.getTotalOwners());
    }
}
