package by.bogdanova.L19_12_2024;

/*Максимум из трёх чисел
Написать программу, которая:

Создаёт три переменные a = 12, b = 25, c = 7.
Выводит наибольшее из этих чисел.

Пример вывода:
Наибольшее число: 25*/

import java.util.stream.Stream;

public class Homework06 {
    public static void main(String[] args) {
         int a = 12;
         int b = 25;
         int c = 7;

         int max = 0;
         if (max < a) {
             max = a;
         }
         if (max < b) {
             max = b;
         }
         if (max < c) {
             max = c;
         }

        System.out.println("Наибольшее число: " + max);

         int maxNumber = Stream.of(a, b, c).max(Integer::compare).get();
         System.out.println("Наибольшее число: " + maxNumber);
    }
}
