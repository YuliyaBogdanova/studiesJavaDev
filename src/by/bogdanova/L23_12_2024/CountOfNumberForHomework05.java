package by.bogdanova.L23_12_2024;

import java.util.ArrayList;

public class CountOfNumberForHomework05 {

    private int countPositiveNumbers;
    private int countNegativeNumbers;
    private int countNullNumbers;

    public CountOfNumberForHomework05(int countPositiveNumbers, int countNegativeNumbers, int countNullNumbers) {
        this.countPositiveNumbers = countPositiveNumbers;
        this.countNegativeNumbers = countNegativeNumbers;
        this.countNullNumbers = countNullNumbers;
    }

    public int getCountPositiveNumbers() {
        return countPositiveNumbers;
    }

    public int getCountNegativeNumbers() {
        return countNegativeNumbers;
    }

    public int getCountNullNumbers() {
        return countNullNumbers;
    }

    protected static CountOfNumberForHomework05 getCountOfNumber(ArrayList<Integer> numbers) {
        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;
        int countNullNumbers = 0;
        for (int number : numbers) {
            if (number > 0) {
                countPositiveNumbers++;
            } else if (number < 0) {
                countNegativeNumbers++;
            } else if (number == 0) {
                countNullNumbers++;
            }
        }
        return new CountOfNumberForHomework05(countPositiveNumbers, countNegativeNumbers, countNullNumbers);
    }
}
