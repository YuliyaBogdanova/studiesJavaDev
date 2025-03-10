package by.bogdanova.L06_03_2025.homework;

import java.util.Random;

public class TransportFactory {

    private TransportFactory() {}

    private static final String[] models = {"BMW", "Honda", "Tesla", "Mustang"};
    private static final Random random = new Random();

    public static Transport nextTransport() {
        String model = models[random.nextInt(models.length)];
        int type = random.nextInt(3);

        switch (type) {
            case 0:
                return new Car(model, random.nextInt(100) + 50, random.nextBoolean() ? "Бензин" : "Дизель");
            case 1:
                return new Bike(model, random.nextInt(100) + 50, random.nextBoolean());
            case 2:
                return new Truck(model, random.nextInt(100) + 50, random.nextInt(16) + 10);
            default:
                return null;
        }
    }
}
