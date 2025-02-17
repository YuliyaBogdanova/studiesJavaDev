package by.bogdanova.L23_12_2024;

/*Задача 20:

Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.*/

import java.util.ArrayList;
import java.util.Collections;

import static by.bogdanova.L23_12_2024.EnterStringData.enterDoubleArray;

public class Homework20 {

    private final static String TEXTFORUSER = "Введите три числа";
    private static int countNumber;
    private static ArrayList<Double> numbers;

    public static void main(String[] args) {

        System.out.println(TEXTFORUSER);
        countNumber = 3;
        numbers = enterDoubleArray(countNumber);
        System.out.println("Среднее из введенных чисел = " + getAverage(numbers));
    }

    private static double getAverage(ArrayList<Double> numbers) {
        double average = 0;
        if (numbers.get(0).equals(numbers.get(1)) && numbers.get(1).equals(numbers.get(2))) {
            average = numbers.get(0);
        } else if ((numbers.get(0).equals(numbers.get(1)) || numbers.get(1).equals(numbers.get(2))
                || numbers.get(0).equals(numbers.get(2)))) {
            throw new ArithmeticException("Для данного набора чисел нельзя определить среднее");
//            System.out.println("Для данного набора чисел нельзя определить средне");
        } else {
            Collections.sort(numbers);
            average = numbers.get(1);
        }
        return average;
    }
}
