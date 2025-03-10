package by.bogdanova.L06_03_2025;

import java.util.List;
import java.util.Random;

public class StudentFactory {
    private static final Random num = new Random();
    private static final List<String> names = List.of("Дима", "Саша", "Маша", "Женя");

    public static Student next() {
        String randomName = names.get(num.nextInt(names.size()));
        int randomAge = num.nextInt(17, 50);
        double grade = num.nextDouble(100);
        return new Student(randomName, randomAge, grade);
    }
}
