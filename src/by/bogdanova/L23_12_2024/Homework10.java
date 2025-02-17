package by.bogdanova.L23_12_2024;

/*Задача 10: Сумма чисел от 1 до N
Напишите программу, которая запрашивает у пользователя число N и вычисляет сумму всех чисел от 1 до N,
используя цикл for.*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

// Расчет производится ТОЛЬКО для целых чисел
public class Homework10 {

    private static int countNumber;
    private static int number;

    public static void main(String[] args) {
        countNumber = 1;
        number = enterIntegerArray(countNumber).get(0);
        long sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
