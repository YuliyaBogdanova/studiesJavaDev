package by.bogdanova.L16_12_2024;

import java.util.Scanner;

/*Напишите программу на Java, которая из 5-значного числа с помощью операций деления и остатка от деления выделяет и выводит его цифры по отдельности. Программа должна:

Принять положительное 5-значное число от пользователя.
С помощью математических операций (деления нацело и взятия остатка от деления) выделить все цифры числа.
Вывести каждую цифру числа на экран в отдельной строке.

54321 -> 5 4 3 2 1 каждое число с новой строки*/

public class Homework01 {
    public static void main(String[] args) {
        int input = enterString();
        printNumber (countOfNumber(input),input);
    }

    private static int enterString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String usersEnter = scanner.nextLine().replace("-", "");
        try {
            return Integer.parseInt(usersEnter);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input, failed to convert string to number");
            return 0;
        }
    }

    private static int countOfNumber(int number) {
        return String.valueOf(number).length();
    }

    private static void printNumber(int countOfNumber, int usersNumber) {
        while (countOfNumber > 0) {
            System.out.println(usersNumber % 10);
            usersNumber /= 10;
            countOfNumber--;
        }
    }
}
