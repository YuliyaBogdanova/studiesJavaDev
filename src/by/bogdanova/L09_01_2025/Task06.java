package by.bogdanova.L09_01_2025;

/*Поиск числа
Напишите программу, которая запрашивает у пользователя ввод чисел до тех пор,
пока не будет введено число 7. Если пользователь вводит число 5,
программа должна пропустить его и продолжить выполнение.*/

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Введите число (7 для выхода): ");
            number = sc.nextInt();
            System.out.println("Вы ввели число " + number);
            if (number == 5) {
                System.out.println("Пропускаем");
                continue;
            }
            if (number == 7) {
                System.out.println("Завершаем");
                break;
            }
        }
    }
}
