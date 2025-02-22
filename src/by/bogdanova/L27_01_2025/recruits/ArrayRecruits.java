package by.bogdanova.L27_01_2025.recruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayRecruits {

    private List<Recruit> recruits = new ArrayList<>();

    public void add(Recruit recruit) {
        recruits.add(recruit);
    }

    public Recruit get(int index) {
        return recruits.get(index);
    }

    public int getSize() {
        return recruits.size();
    }

    public void sortByLastName() {
//        Collections.sort(recruits, (recruit1, recruit2) -> recruit1.getLastName().compareTo(recruit2.getLastName()));

        // сортировка пузырьком по ФИО
        int n = recruits.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareRecruits(recruits.get(j), recruits.get(j + 1)) > 0) {
                    Recruit temp = recruits.get(j);
                    recruits.set(j, recruits.get(j + 1));
                    recruits.set(j + 1, temp);
                }
            }
        }
    }

    public static int compareRecruits(Recruit r1, Recruit r2) {
        int lastNameCompare = r1.getLastName().compareTo(r2.getLastName());
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }
        int firstNameCompare = r1.getFirstName().compareTo(r2.getFirstName());
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }
        return r1.getMiddleName().compareTo(r2.getMiddleName());
    }

    public List<Recruit> getRecruits() {
        return recruits;
    }
}
