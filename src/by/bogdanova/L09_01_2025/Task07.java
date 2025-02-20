package by.bogdanova.L09_01_2025;

/*Задача 5: Счетчик чисел
Напишите программу, которая считает количество введенных
пользователем чисел до тех пор,
пока не будет введено число 10. Используйте break для выхода из цикла.*/

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        while (true) {
            System.out.print("Введите число (10 для выхода): ");
            number = sc.nextInt();
            count++;
            System.out.println("Вы ввели число " + number);
            if (number == 10) {
                System.out.println("Завершение ввода");
                break;
            }
        }
        System.out.println(count);
    }
}
