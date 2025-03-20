package by.bogdanova.L13_03_2025.homework.manager;

import by.bogdanova.L13_03_2025.homework.model.Transport;

import java.util.*;

public class TransportSpeedGrouper {
    TransportUserManager transportUserManager = new TransportUserManager();

    private Map<Integer, Set<Transport>> transportBySpeed = new HashMap<>();

    public void addTransport(Transport transport) {
        transportBySpeed
                .computeIfAbsent(transport.getSpeed(), k -> new HashSet<>())
                .add(transport);
    }

    public Set<Transport> getTransportBySpeed(int speed) {
        return transportBySpeed.getOrDefault(speed, new HashSet<>());
    }
}
