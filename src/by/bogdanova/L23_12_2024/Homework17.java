package by.bogdanova.L23_12_2024;

/*Задача 17:
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
        2
Пример для чисел -6 -6 -3:
        0*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework17 {

    private final static String TEXTFORUSER = "Введите три целых числа";
    private static int countNumber;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {
        System.out.println(TEXTFORUSER);
        countNumber = 3;
        numbers = enterIntegerArray(countNumber);
        System.out.println(getCountNumber(numbers));

    }

    private static int getCountNumber(ArrayList<Integer> numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number < 0) {
                counter++;
            }
        }
        return counter;
    }
}
