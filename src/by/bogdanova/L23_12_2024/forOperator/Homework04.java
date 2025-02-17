package by.bogdanova.L23_12_2024.forOperator;

import java.util.ArrayList;

/*Задание 4
Для заданного пользователем числа N вывести следующий набор чисел (показан пример для N = 6):
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        6 5 4 3 2 1*/

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework04 {

    private final static String TEXTFORUSER = "Введите целое число";
    private static int countNumber;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {
        System.out.println(TEXTFORUSER);
        countNumber = 1;
        numbers = enterIntegerArray(countNumber);
        printResult(numbers.get(0));

    }
    private static void printResult(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
