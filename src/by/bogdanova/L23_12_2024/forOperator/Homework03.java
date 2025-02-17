package by.bogdanova.L23_12_2024.forOperator;

/*Задание 3
Для заданного пользователем числа N вывести следующий набор чисел (показан пример для N = 6):
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework03 {

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
        for (int i = number; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
