package by.bogdanova.L13_03_2025.homework.comparator;

import by.bogdanova.L13_03_2025.homework.model.Transport;

import java.util.Comparator;

public class TransportComparatorBySpeed implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2) {
        return Integer.compare(t1.getSpeed(), t2.getSpeed());
    }
}
