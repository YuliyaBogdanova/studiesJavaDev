package by.bogdanova.L23_12_2024;

/*Задача 5: Положительные и отрицательные числа
Напишите программу, которая запрашивает у пользователя 10 целых чисел и подсчитывает,
сколько из них положительных, отрицательных и нулей. Используйте оператор if-else и цикл for. (Вводить числа в цикле for)*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.CountOfNumberForHomework05.getCountOfNumber;
import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework05 {
    private static int countNumber;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {
        countNumber = 10;
        numbers = enterIntegerArray(countNumber);
        CountOfNumberForHomework05 countOfNumberForHomework05 = getCountOfNumber(numbers);
        System.out.println("Number of positive numbers: " + countOfNumberForHomework05.getCountPositiveNumbers());
        System.out.println("Number of negative numbers: " + countOfNumberForHomework05.getCountNegativeNumbers());
        System.out.println("Number of zeros: " + countOfNumberForHomework05.getCountNullNumbers());
        // обычный способ
        getCount(numbers);
    }

    private static void getCount(ArrayList<Integer> numbers) {
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
        System.out.println("Number of positive numbers: " + countPositiveNumbers);
        System.out.println("Number of negative numbers: " + countNegativeNumbers);
        System.out.println("Number of of zeros: " + countNullNumbers);
    }
}
