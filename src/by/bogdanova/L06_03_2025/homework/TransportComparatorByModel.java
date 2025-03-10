package by.bogdanova.L06_03_2025.homework;

import java.util.Comparator;

public class TransportComparatorByModel implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2) {
        return t1.getModel().compareTo(t2.getModel());
    }
}
