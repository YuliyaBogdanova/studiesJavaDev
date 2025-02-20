package by.bogdanova.L09_01_2025;

/*Прерывание цикла
        Напишите программу, которая запрашивает у пользователя ввод чисел,
        пока не будет введено число 0. Если число 0 введено,
        программа должна завершить ввод и вывести сообщение о завершении.*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Введите число (0 для выхода): ");
            number = sc.nextInt();
            System.out.println("Вы ввели число " + number);
            if (number == 0) {
                System.out.println("Завершение ввода");
                break;
            }
        }
    }
}
