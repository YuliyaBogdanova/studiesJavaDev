package by.bogdanova.L23_12_2024;

/*
Задача 1: Сумма чисел
        Напишите программу, которая вычисляет и выводит сумму всех четных чисел от 1 до 100 с помощью цикла for.
*/

public class Homework01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех четных чисел от 1 до 100 равна " + sum);
    }
}
