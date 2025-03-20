package by.bogdanova.L13_03_2025.homework.manager;

import by.bogdanova.L13_03_2025.homework.model.Transport;

import java.util.HashMap;
import java.util.Map;

import static by.bogdanova.L13_03_2025.homework.manager.TransportManager.printMap;

public class TransportStatistics {
    private Map<String, Integer> brandCount = new HashMap<>();

    //toDo может не работать
    public void addTransport(Transport transport) {
        String brand = transport.getModel();
        brandCount.put(brand, brandCount.getOrDefault(brand, 0) + 1);
    }

    public int getBrandCount(String brand) {
        return brandCount.getOrDefault(brand, 0);
    }

    public void printBrandStatistics() {
        System.out.println("printBrandStatistics: ");
        printMap(brandCount);
    }
}
