package by.bogdanova.L23_12_2024;

/*Задача 4: Факториал
Напишите программу, которая вычисляет факториал числа, введенного пользователем, с помощью цикла for.*/

import java.util.ArrayList;
import java.util.List;

public class Homework04 extends EnterStringData {
    private static int countOfNumber;
    private static List<Integer> numbers;

    public static void main(String[] args) {

        countOfNumber = 3;
        numbers = convertDoubleArrayToIntegerArray(enterDoubleArray(countOfNumber));
        for (int num : numbers) {
            if (num < 0) {
                System.out.println("Расчет факториала не доступен для отрицательных чисел (" + num + ")");
            } else {
                System.out.println("Расчет факториала:\n!" + num + " = " + getFactorial(num));
            }
        }
    }

    private static long getFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static ArrayList<Integer> convertDoubleArrayToIntegerArray(ArrayList<Double> DoubleNumbers) {
        ArrayList<Integer> numbersInt = new ArrayList<>();
        for (Double d : DoubleNumbers) {
            try {
                numbersInt.add(returnIntFromDouble(d));
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: доступно вычисление факторала только для целых чисел. " + e.getMessage());
            }
        }
        return numbersInt;
    }
}
