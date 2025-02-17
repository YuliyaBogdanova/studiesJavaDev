package by.bogdanova.L19_12_2024;

/*5. Сумма цифр числа
        Напишите программу, которая:

Объявляет переменную number = 237.
Вычисляет сумму его цифр (2 + 3 + 7).

Пример вывода:
Сумма цифр числа 237 = 12.*/

import java.util.Arrays;

public class Homework05 {
    public static void main(String[] args) {
        int number = 965;
        int sum = 0;

        int numberForCounter = number;

        while (numberForCounter > 0) {
            int num = numberForCounter % 10;
            sum += num;
            numberForCounter /= 10;
        }
        System.out.println("Сумма цифр числа " + number + " = " + sum);

        // short solution
        int sumForCounter = String.valueOf(number).chars().map(Character::getNumericValue).sum();
        System.out.println(sumForCounter);
    }
}
