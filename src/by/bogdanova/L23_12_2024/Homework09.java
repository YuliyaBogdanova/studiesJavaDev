package by.bogdanova.L23_12_2024;

/*Задача 9: Конвертер температур
Напишите программу, которая конвертирует температуру из Цельсия в Фаренгейт и наоборот.
Пользователь выбирает направление конверсии с помощью switch.
        System.out.println("Выберите направление конверсии:");
        System.out.println("1 - Цельсий в Фаренгейт");
        System.out.println("2 - Фаренгейт в Цельсий");
Формула для расчета:
F= 5/9С×C+32
C=9/5×(F−32)
F — температура в градусах Фаренгейта
C — температура в градусах Цельсия*/

import java.text.DecimalFormat;

import static by.bogdanova.L23_12_2024.EnterStringData.enterDoubleArray;
import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("Введите температуру");
        double tempUsers = enterDoubleArray(1).get(0);

        System.out.println("Выберите направление конверсии:");
        System.out.println("1 - Цельсий в Фаренгейт");
        System.out.println("2 - Фаренгейт в Цельсий");
        int choseUserForConvert = enterIntegerArray(1).get(0);
        convertTemp (tempUsers, choseUserForConvert);

    }
    private static void convertTemp (double tempUsers, int choseUserForConvert) {
        DecimalFormat rounding = new DecimalFormat("#.##");
        switch (choseUserForConvert) {
            case 1: {
                double result = (9 * tempUsers) / 5 + 32;
                System.out.println("Цельсий в Фаренгейт: " + tempUsers + "C = " + rounding.format(result) + "F");
            }
            break;
            case 2: {
                double result = 5 * (tempUsers - 32) / 9;
                System.out.println("Фаренгейт в Цельсий: " + tempUsers + "F = " + rounding.format(result) + "C");
            }
            break;
            default:
                System.out.println("Выбор типа конвертации температур не верен. Попробуйте еще раз");
        }
    }
}
