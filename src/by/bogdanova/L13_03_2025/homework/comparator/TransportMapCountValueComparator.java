package by.bogdanova.L13_03_2025.homework.comparator;

import java.util.Comparator;
import java.util.Map;

public class TransportMapCountValueComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}
