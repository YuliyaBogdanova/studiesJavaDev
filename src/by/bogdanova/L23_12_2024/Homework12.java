package by.bogdanova.L23_12_2024;

/*12Задача 12: Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterDoubleArray;

public class Homework12 {

    private final static String TEXTFORUSER = "Введите 4 числа для сравнения";

    private static int countOfNumber;
    private static ArrayList<Double> numbers;
    private static double max;

    public static void main(String[] args) {

        countOfNumber = 4;
        System.out.println(TEXTFORUSER);
        numbers = enterDoubleArray(countOfNumber);
        max = numbers.get(0);

        if (numbers.get(1) > max) {
            max = numbers.get(1);
        }
        if (numbers.get(2) > max) {
            max = numbers.get(2);
        }
        if (numbers.get(3) > max) {
            max = numbers.get(3);
        }

        System.out.println("Max = " + max);
    }
}
