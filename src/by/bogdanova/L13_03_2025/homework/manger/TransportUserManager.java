package by.bogdanova.L13_03_2025.homework.manager;

import by.bogdanova.L13_03_2025.homework.model.Transport;
import by.bogdanova.L13_03_2025.homework.comparator.TransportComparatorBySpeed;
import by.bogdanova.L27_02_2025.User;

import java.util.*;

public class TransportUserManager {

    private Map<User, List<Transport>> transportByOwner = new HashMap<>();

    //
    public void addTransport(User owner, Transport transport){
        transportByOwner.putIfAbsent(owner, new ArrayList<>()).add(transport);
    }

    public List<Transport> getTransportByOwner(User owner){
        return transportByOwner.getOrDefault(owner, new ArrayList<>());
    }

    public void removeTransport(User owner, String licensePlate){
        List<Transport> transports = transportByOwner.get(owner);
        if (transports != null) {
            transports.removeIf(transport -> licensePlate.equals(transport.getLicensePlate()));
        }
    }

    public Transport getFastestTransport(User owner) {
        List<Transport> transports = transportByOwner.get(owner);
        transports.sort(new TransportComparatorBySpeed());
        return transports.get(transports.size() - 1);
    }

    public User findOwnerWithMostCars(){
        Map<Integer, User> ownerWithCountCar = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            User owner = entry.getKey();
            List<Transport> transports = entry.getValue();
            ownerWithCountCar.put(transports.size(), owner);
        }
        return ((TreeMap<Integer, User>) ownerWithCountCar).lastEntry().getValue();
    }

    public void printAllOwnersAndTransport(){
        transportByOwner.forEach((user, transports) -> System.out.println(user + ": " + transports));
    }
}
