package by.bogdanova.L13_03_2025.homework.factory;

import by.bogdanova.L27_02_2025.User;

import java.util.List;
import java.util.Random;

public class UserFactory {
    private static final Random num = new Random();
    private static final List<String> names = List.of("Дима", "Саша", "Маша", "Женя");

    public static User next() {
        String randomName = names.get(num.nextInt(names.size()));
        int randomAge = num.nextInt(17, 50);
        return new User(randomName, randomAge);
    }
}
