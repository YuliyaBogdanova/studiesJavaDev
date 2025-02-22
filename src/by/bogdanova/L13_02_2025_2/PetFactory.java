package by.bogdanova.L13_02_2025_2;

import java.util.Random;

public class PetFactory {

    private static String[] names = {"Кира", "Арчи", "Аиса", "Мира", "Дина"};
    private static Random random = new Random();

    public static Pet next() {
        boolean isCat = random.nextBoolean();
        if (isCat) {
            return new Cat(names[random.nextInt(names.length)], "cat", random.nextInt(10));
        } else
            return new Dog(names[random.nextInt(names.length)], "dog", random.nextInt(10));
    }
}
