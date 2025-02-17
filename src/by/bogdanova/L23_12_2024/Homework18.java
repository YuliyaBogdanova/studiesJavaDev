package by.bogdanova.L23_12_2024;

/*Задача 18: Положительные и отрицательные числа

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.CountOfNumberForHomework05.getCountOfNumber;
import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework18 {

    private final static String TEXTFORUSER = "Введите три целых числа";
    private static int countNumber;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {
        System.out.println(TEXTFORUSER);
        countNumber = 3;
        numbers = enterIntegerArray(countNumber);
        CountOfNumberForHomework05 countOfNumberForHomework05 = getCountOfNumber(numbers);
        System.out.println("количество положительных чисел: " + countOfNumberForHomework05.getCountPositiveNumbers());
        System.out.println("количество отрицательных чисел: " + countOfNumberForHomework05.getCountNegativeNumbers());
    }
}
