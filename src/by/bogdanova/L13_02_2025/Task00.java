package by.bogdanova.L13_02_2025_2;

import java.util.ArrayList;
import java.util.List;

public class Task00 {

    private static int COUNT_OWNER = 100;
    private static int COUNT_PETS = 200;

    public static void main(String[] args) {

        // Factory
        List<Owner> owners = new ArrayList<>();

        for (int i = 0; i < COUNT_OWNER; i++) {
            Owner owner = OwnerFactory.next();
            for (int j = 0; j < COUNT_PETS; j++) {
                Pet pet = PetFactory.next();
                owner.addPet(pet);
            }
            owners.add(owner);
        }

        for (Owner owner1 : owners) {
            System.out.println(owner1.toString());
        }
    }
}
