package by.bogdanova.L09_01_2025;

/*Задача 3: Сумма положительных чисел
Напишите программу, которая запрашивает у
пользователя ввод чисел до тех пор, пока не будет введено отрицательное число.
Подсчитайте сумму всех введенных положительных чисел. Используйте break для выхода из цикла.
*/

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        while (true) {
            System.out.print("Введите число (отрицательное для выхода): ");
            number = sc.nextInt();
            System.out.println("Вы ввели число " + number);
            sum +=number;
            if (number < 0) {
                System.out.println("Завершение ввода");
                sum -=number;
                break;
            }
        }
        System.out.println(sum);
    }
}
