package by.bogdanova.L06_03_2025.homework;

import java.util.*;

public class TransportManager {

    private List<Transport> transportList = new ArrayList<>();
    private Set<Transport> uniqueTransportSet = new HashSet<>();

    public void addTransport(Transport transport) {
            transportList.add(transport);
            uniqueTransportSet.add(transport);
    }

    public void removeAllTransportByModel(String model) {
        transportList.removeIf(transport -> model.equals(transport.getModel()));
        uniqueTransportSet.removeIf(transport -> model.equals(transport.getModel()));
    }

    public void sortTransport(Comparator<Transport> comparator) {
//        Set<Transport> uniqueTransportTreeSet = new TreeSet<>(comparator);
//        uniqueTransportTreeSet.addAll(uniqueTransportSet);
//        uniqueTransportSet = uniqueTransportTreeSet;
        List<Transport> tempTransportList = new ArrayList<>(uniqueTransportSet);
        tempTransportList.sort(comparator);
        uniqueTransportSet.addAll(tempTransportList);
        uniqueTransportSet = new LinkedHashSet<>(tempTransportList);
        transportList.sort(comparator);
        }

    public void printAllTransport() {
        for (Transport transport : transportList) {
            System.out.println(transport.toString());
        }
    }

    public void printUniqueTransport() {
        for (Transport transport : uniqueTransportSet) {
            System.out.println(transport.toString());
        }
    }
}
