package by.bogdanova.L13_03_2025.homework.factory;

import by.bogdanova.L13_03_2025.homework.model.Bike;
import by.bogdanova.L13_03_2025.homework.model.Car;
import by.bogdanova.L13_03_2025.homework.model.Transport;
import by.bogdanova.L13_03_2025.homework.model.Truck;

import java.util.Random;

public class TransportFactory {

    private TransportFactory() {}

    private static final String[] models = {"BMW", "Honda", "Tesla", "Mustang"};
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final Random random = new Random();

    public static Transport nextTransport() {
        String model = models[random.nextInt(models.length)];
        int type = random.nextInt(3);

        switch (type) {
            case 0:
                return new Car(model, random.nextInt(100) + 50, randomNumber()
                        , random.nextInt(1970, 2024)
                        , random.nextBoolean() ? "Бензин" : "Дизель");
            case 1:
                return new Bike(model, random.nextInt(100) + 50, randomNumber()
                        , random.nextInt(1970, 2024)
                        , random.nextBoolean());
            case 2:
                return new Truck(model, random.nextInt(100) + 50, randomNumber()
                        , random.nextInt(1970, 2024)
                        ,random.nextInt(16) + 10);
            default:
                return null;
        }
    }

    private static String randomNumber(){
        StringBuilder number = new StringBuilder();
        for (int i = 1; i <= 2; i++) {
            number.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }
        for (int i = 1; i <= 4; i++) {
            number.append(random.nextInt(10));
        }
        number.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        return  number.toString();
    }
}
