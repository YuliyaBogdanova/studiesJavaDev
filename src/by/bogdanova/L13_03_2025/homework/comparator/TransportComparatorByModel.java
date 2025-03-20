package by.bogdanova.L13_03_2025.homework.comparator;

import by.bogdanova.L13_03_2025.homework.model.Transport;

import java.util.Comparator;

public class TransportComparatorByModel implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2) {
        return t1.getModel().compareTo(t2.getModel());
    }
}
