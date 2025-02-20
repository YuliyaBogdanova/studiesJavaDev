package by.bogdanova.L13_02_2025_2;

import java.util.ArrayList;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            pets.add(PetFactory.next());
        }

        for (Pet pet: pets){
            OwnewFactory.next().addPet(pet);
            System.out.println(pet.toString());
        }

        System.out.println("Общее количество домашних животных: " + Owner.getTotalOwners());
    }
}