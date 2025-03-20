package by.bogdanova.L13_03_2025.homework.manager;

import by.bogdanova.L13_03_2025.homework.model.Transport;
import by.bogdanova.L13_03_2025.homework.comparator.TransportComparatorBySpeed;
import by.bogdanova.L27_02_2025.User;

import java.util.*;

public class TransportAnalytics {

    private static final String SLOW = "Медленный";
    private static final String MEDIUM = "Средний";
    private static final String FAST = "Быстрый";

    private List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> filteredTransports = new ArrayList<>();
        for (Transport transport : transports) {
            if (year > transport.getYear()) {
                filteredTransports.add(transport);
            }
        }
        return filteredTransports;
    }

    public List<Transport> findTop3Fastest() {
        List<Transport> listTop3 = new ArrayList<>();
        transports.sort(new TransportComparatorBySpeed());
        listTop3.add(transports.get(transports.size() - 1));
        listTop3.add(transports.get(transports.size() - 2));
        listTop3.add(transports.get(transports.size() - 3));
        return listTop3;
    }

    public Set<String> getUniqueBrands() {
        Set<String> uniqueBrands = new HashSet<>();
        for (Transport transport : transports) {
            uniqueBrands.add(transport.getModel());
        }
        return uniqueBrands;
    }

    public Map<String, List<Transport>> groupBySpeedRange() {
        Map<String, List<Transport>> speedCategories = Map.of(
                SLOW, new ArrayList<>(),
                MEDIUM, new ArrayList<>(),
                FAST, new ArrayList<>()
        );
        for (Transport transport : transports) {
            int speed = transport.getSpeed();
            if (speed < 100) {
                speedCategories.get(SLOW).add(transport);
            } else if (speed <= 200) {
                speedCategories.get(MEDIUM).add(transport);
            } else {
                speedCategories.get(FAST).add(transport);
            }
        }
        return speedCategories;
    }
}
