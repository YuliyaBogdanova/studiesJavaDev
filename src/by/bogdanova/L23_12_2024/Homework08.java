package by.bogdanova.L23_12_2024;

/*Задача 8: Квадраты чисел
Напишите программу, которая выводит квадраты чисел от 1 до 20 с помощью цикла for.*/

public class Homework08 {
    public static void main(String[] args) {
        int countOfNumber = 20;
         for (int i = 1; i <= countOfNumber; i++) {
             int result = i*i;
             System.out.print(result + " ");
         }
    }
}
