package by.bogdanova.L13_03_2025.homework.manager;

import by.bogdanova.L13_03_2025.homework.comparator.TransportComparatorByYear;
import by.bogdanova.L13_03_2025.homework.model.Bike;
import by.bogdanova.L13_03_2025.homework.model.Car;
import by.bogdanova.L13_03_2025.homework.model.Transport;
import by.bogdanova.L27_02_2025.User;

import java.time.Year;
import java.util.*;

public class TransportService {

    private static final String SMALL_QUANTITY = "1-2 cars";
    private static final String MEDIUM_QUANTITY = "3-5 cars";
    private static final String LARGE_QUANTITY = "6 and more cars";

    private static final String NEW = "Новые"; // 0-3 года
    private static final String MEDIUM = "Средние"; // 4-10 лет
    private static final String OLD = "Старые"; // 11+ лет

    private final List<Transport> transports = new ArrayList<>();
    private Map<User, List<Transport>> userTransports = new HashMap<>();

    // не поняла откуда надо было взять транспорт, потому беру его из Map
    public void addTransport(Transport transport) {
        for (List<Transport> transportList : userTransports.values()) {
            transports.addAll(transportList);
        }
    }

    // 1 задача
    public User findOwnerByLicensePlate(String licensePlate) {
        User getOwnerByLicensePlate = null;
        for (Map.Entry<User, List<Transport>> entry : userTransports.entrySet()) {
            for (Transport transport : entry.getValue()) {
                if (licensePlate.equals(transport.getLicensePlate())) {
                    getOwnerByLicensePlate = entry.getKey();
                }
            }
        }
        return getOwnerByLicensePlate;
    }

    // 2 задача
    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> listMap = Map.of(
                SMALL_QUANTITY, new ArrayList<>(),
                MEDIUM_QUANTITY, new ArrayList<>(),
                LARGE_QUANTITY, new ArrayList<>()
        );

        // мой вариант
        for (Map.Entry<User, List<Transport>> entry : userTransports.entrySet()) {
            int carCount = entry.getValue().size();
            if (carCount >= 1 && carCount <= 2) {
                listMap.get(SMALL_QUANTITY).add(entry.getKey());
            } else if (carCount >= 3 && carCount <= 5) {
                listMap.get(MEDIUM_QUANTITY).add(entry.getKey());
            } else if (carCount >= 6) {
                listMap.get(LARGE_QUANTITY).add(entry.getKey());
            }
        }
//        Map<User, Integer> userIntegerMap = new HashMap<>();
//        for (Transport transport : transports) {
//            User user = transport.getUser();
//            userIntegerMap.putIfAbsent(user, 1);
//            if (userIntegerMap.containsKey(user)) {
//                Integer sizeTransports = userIntegerMap.get(user);
//                userIntegerMap.put(user, ++sizeTransports);
//            }
//        }
//        for (Map.Entry<User, Integer> entry : userIntegerMap.entrySet()) {
//            Integer size = entry.getValue();
//            if(size > 0 && size < 3){
//                listMap.get(SMALL_QUANTITY).add(entry.getKey());
//            }
//            if(size > 2 && size < 6){
//                listMap.get(MEDIUM_QUANTITY).add(entry.getKey());
//            } else listMap.get(LARGE_QUANTITY).add(entry.getKey());
//
//        }
        return listMap;
    }

    // 3 задача
    public List<String> findTop5MostPopularBrands() {
        Map<String, Integer> brandCount = new TreeMap<>(Collections.reverseOrder());
        List<String> topFiveEntries = new ArrayList<>();
        for (List<Transport> transportList : userTransports.values()) {
            for (Transport transport : transportList) {
                String brand = transport.getModel().toLowerCase();
                brandCount.put(brand, brandCount.getOrDefault(brand, 0) + 1);
            }
        }

        int count = 0;
        for (Map.Entry<String, Integer> entry : brandCount.entrySet()) {
            if (count < 5) {
                topFiveEntries.add(entry.getKey());
                count++;
            } else break;
        }
        return topFiveEntries;
    }

    // 4 задача
    public Map<String, List<Transport>> groupByAge() {
        Map<String, List<Transport>> ageCategories = Map.of(
                NEW, new ArrayList<>(),
                MEDIUM, new ArrayList<>(),
                OLD, new ArrayList<>()
        );

        for (List<Transport> transportList : userTransports.values()) {
            for (Transport transport : transportList) {
                int age = Year.now().getValue() - transport.getYear();
                if (age <= 3) {
                    ageCategories.get(NEW).add(transport);
                } else if (age <= 10) {
                    ageCategories.get(MEDIUM).add(transport);
                } else {
                    ageCategories.get(OLD).add(transport);
                }
            }
        }
        return ageCategories;
    }

    // 5 задача
    public Map<String, Integer> countTransportByType() {
        Map<String, Integer> countTransportByType = new HashMap<>();
        Set<String> uniqueTypeTransports = new HashSet<>();
        for (Transport transport : transports) {
            uniqueTypeTransports.add(transport.getClass().getSimpleName());
        }

        for (String type : uniqueTypeTransports) {
            int count = 0;
            for (Transport transport : transports) {
                if (type.equals(transport.getClass().getSimpleName())) {
                    count++;
                }
            }
            countTransportByType.put(type, count);
        }
        return countTransportByType;
    }

    // 6 задача может быть несколько владельцев с самой старой машиной, т.к. считаем только год
    public Set<User> findOwnerWithOldestCar() {
        // сортировка машины по году по возрастанию
        // узнать год первой в списке машины
        // найти по году владельцев

        if (transports.isEmpty()) {
            return null;
        }

        transports.sort(new TransportComparatorByYear());
        int oldestYear = transports.get(0).getYear();

        Set<User> ownersOldestCar = new HashSet<>();
        for (Map.Entry<User, List<Transport>> entry : userTransports.entrySet()) {
            for (Transport transport : entry.getValue()) {
                if (oldestYear == transport.getYear()) {
                    ownersOldestCar.add(entry.getKey());
                }
            }
        }
        return ownersOldestCar;
    }

    // 7 задача
    // toDo надо проверить, может не работать
    public List<User> findOwnersWithSingleBrand() {
        // забрать список транспорта у владельца
        // найти все машины
        // если список машин больше 1, проверить на совпадение бренда
        // если все машины одного бренда - занести user в  список

        List<User> ownersWithSingleBrand = new ArrayList<>();

        for (Map.Entry<User, List<Transport>> entry : userTransports.entrySet()) {
            String firstBrand;
            boolean isOneBrand = true;

            List<Transport> transports = entry.getValue();
            List<Car> onlyCars = new ArrayList<>();
            for (Transport transport : transports) {
                if (transport instanceof Car) {
                    onlyCars.add((Car) transport);
                }
            }
            if (onlyCars.size() > 1) {
                firstBrand = onlyCars.get(0).getModel();
                for (Car car : onlyCars) {
                    if (firstBrand != null) {
                        if (!firstBrand.equals(car.getModel())) {
                            isOneBrand = false;
                            break;
                        }
                    }
                }
                if (isOneBrand && firstBrand != null) {
                    ownersWithSingleBrand.add(entry.getKey());
                }
            }
        }
        return ownersWithSingleBrand;
    }

    // 8 задача
    public List<User> findOwnersWithCarAndBike() {
        List<User> ownersWithCarAndBike = new ArrayList<>();

        for (Map.Entry<User, List<Transport>> entry : userTransports.entrySet()) {
            boolean hasCar = false;
            boolean hasBike = false;
            for (Transport transport : entry.getValue()) {
                if (transport instanceof Car) {
                    hasCar = true;
                } else if (transport instanceof Bike) {
                    hasBike = true;
                }
                if (hasCar && hasBike) {
                    ownersWithCarAndBike.add(entry.getKey());
                    break;
                }
            }
        }
        return ownersWithCarAndBike;
    }

    public double getAverageCarAge() {
        int totalAge = 0;
        int carCount = 0;

        for (Transport transport : transports) {
            if (transport instanceof Car) {
                totalAge += (Year.now().getValue() - transport.getYear());
                carCount++;
            }
        }
        return carCount > 0 ? (double) totalAge / carCount : 0.0;
    }

    // 10 задача (без учета равного максимального пробега)

    public User findOwnerWithHighestMileage() {
        // создать сортированную мапу с user и пробегом
        // отсортировать по пробегу
        // забрать последнего

        TreeMap<Integer, User> mileageMap = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> entry : userTransports.entrySet()) {
            int totalMileage = 0;
            for (Transport transport : entry.getValue()) {
                totalMileage += transport.getCarMileage();
            }
            mileageMap.put(totalMileage, entry.getKey());
        }
        if (!mileageMap.isEmpty()) {
            return mileageMap.lastEntry().getValue();
        } else {
            return null;
        }
    }
}
