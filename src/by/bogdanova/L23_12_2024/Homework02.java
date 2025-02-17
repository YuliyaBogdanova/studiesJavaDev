package by.bogdanova.L23_12_2024;

/*Задача 2: Оценка
Напишите программу, которая запрашивает у пользователя оценку (от 0 до 100)
и выводит соответствующий текст в зависимости от оценки.
Используйте оператор if-else.
болльше 90 - Отлично,
75 (включительно)-90 (включительно) - Хорошо,
50 (включительно)-75  - Удовлетворительно,
меньше 50 неудовлетворительно)*/

import java.util.Scanner;

public class Homework02 {
    private final static String EXCELLENT = "Отлично";
    private final static String GOOD = "Хорошо";
    private final static String SATISFACTORY = "Удовлетворительно";
    private final static String POOR = "Неудовлетворительно";

    public static void main(String[] args) {
        int usersNumber = enterInteger();
        usersNumber = checkValidNumber(usersNumber);

        if (usersNumber > 90) {
            printResult(EXCELLENT);
        } else if (usersNumber <= 90 && usersNumber >= 75) {
            printResult(GOOD);
        } else if (usersNumber < 75 && usersNumber >= 50) {
            printResult(SATISFACTORY);
        } else printResult(POOR);
    }

    private static int enterInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String usersEnter = scanner.nextLine();
        try {
            return Integer.parseInt(usersEnter);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input, failed to convert string to number");
            return 0;
        }
    }

    private static int checkValidNumber(int userNumber) {
        int usersNumber = userNumber;
        while (usersNumber > 100 || usersNumber < 0) {
            System.out.println("Enter a number between 0 and 100");
            usersNumber = enterInteger();
        }
        return usersNumber;
    }

    private static void printResult(String str) {
        System.out.println("Оценка: " + str);
    }
}