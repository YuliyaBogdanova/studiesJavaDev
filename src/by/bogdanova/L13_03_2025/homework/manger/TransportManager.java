package by.bogdanova.L13_03_2025.homework.manager;

import by.bogdanova.L13_03_2025.homework.model.Transport;

import java.util.*;
import static by.bogdanova.L13_03_2025.homework.factory.TransportFactory.random;

public class TransportManager {

    private Map<String, Transport> transportByPlate = new HashMap<>(); // хранит транспорт по номеру (licensePlate).
    private Map<String, List<Transport>> transportByType = new HashMap<>(); // группирует транспорт по типу (Car, Bike, Truck)

    public void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);
//        transportByType.computeIfAbsent(transport.getClass().getSimpleName()
//        , key -> new ArrayList<>()).add(transport);
        transportByType.putIfAbsent(transport.getClass().getSimpleName(), new ArrayList<>());
        transportByType.get(transport.getClass().getSimpleName()).add(transport);
    }

    public void removeAllTransportByLicensePlate(String licensePlate) {
        Transport transport = transportByPlate.remove(licensePlate);
        for (Map.Entry<String, List<Transport>> entry : transportByType.entrySet()) {
            List<Transport> value = entry.getValue();
            Iterator<Transport> iterator = value.iterator();
            while (iterator.hasNext()) {
                Transport next = iterator.next();
                if (licensePlate.equals(next.getLicensePlate())) {
                    iterator.remove();
                }
            }
        }
    }

    public List<Transport> findTransportByPlate(String licensePlate) {
        List<Transport> transports = new ArrayList<>();
        if (transportByPlate.containsKey(licensePlate)) {
            transports.add(transportByPlate.get(licensePlate));
        }
        return transports;
    }

    // т.к номер генерится ранндомно, сделан доп метод получения списка номеров и выбора случайного
    public String getRandomLicensePlate() {
        List<String> uniquePlates = new ArrayList<>(transportByPlate.keySet());
        if (uniquePlates.isEmpty()) {
            return null;
        }
        int randomIndex = random.nextInt(uniquePlates.size());
        return uniquePlates.get(randomIndex);
    }

    public List<Transport> getTransportByType(String type) {
        return transportByType.getOrDefault(type, new ArrayList<>());
    }

    public Transport getFastestTransportByType(Comparator<Transport> comparator, String str) {
        List<Transport> tempTransportList = new ArrayList<>(transportByType.get(str));
        tempTransportList.sort(comparator);

        if (tempTransportList.isEmpty()) {
            return null;
        } else
            return tempTransportList.get(tempTransportList.size()-1);
        }

    public void printTransport() {
        System.out.println("transportByPlate: ");
        printMap(transportByPlate);
//        System.out.println("transportByType: ");
//        print(transportByType);
    }

     static void printMap(Map map) {
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void printAllListTransport(List<Transport> list) {
        for (Transport transport : list) {
            System.out.println(transport.toString());
        }
    }
}
