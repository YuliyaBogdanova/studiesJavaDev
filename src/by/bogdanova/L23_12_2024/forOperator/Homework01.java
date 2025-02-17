package by.bogdanova.L23_12_2024.forOperator;

/*Задание 1
        Написать программу, которая вычисляет для заданного N следующее выражение
        (показан пример для N = 6):
        6^2 − 5^2 + 4^2 − 3^2 + 2^2 − 1^2 = 21*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

// Расчет доступен только для целых чисел в т.ч. отрицательных
public class Homework01 {

    private final static String TEXTFORUSER = "Введите целое число";
    private static int countNumber;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {

        System.out.println(TEXTFORUSER);
        countNumber = 1;
        numbers = enterIntegerArray(countNumber);
        System.out.println(getResult(Math.abs(numbers.get(0))));

    }
    private static long getResult (int number) {
        long result = 0;
        for (int i = number; i >= 1; i--) {
            if ((number - i) % 2 == 0) {
                result += i * i;
            } else {
                result -= i * i;
            }
        }
        return result;

    }

}
