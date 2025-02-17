package by.bogdanova.L19_12_2024;

/*4. Проверка делимости на 3 и 5
        Напишите программу, которая:

Принимает целое число из переменной n.
Проверяет:
Делится ли число на 3?
Делится ли на 5?
Делится ли одновременно на 3 и 5?

Пример ввода:
n = 15

Пример вывода:
Число 15 делится на 3.
Число 15 делится на 5.
Число 15 делится на 3 и на 5.*/

public class Homework04 {
    public static void main(String[] args) {
        int n;
        int divider3 = 3;
        int divider5 = 5;
        n = 15;

        if (checkDivision(n, divider3) == 0) {
            printResult(n, divider3);
        }

        if (checkDivision(n, divider5) == 0) {
            printResult( n, divider5);
        }

        if (checkDivision(n, divider3) == 0 & checkDivision(n, divider5) == 0) {
            System.out.println("Число " + n + " делится на " + divider3 + " и на " + divider5);
        }
    }

    private static int checkDivision (int n, int divider) {
        return n%divider;
    }

    private static void printResult(int n, int divisor) {
        System.out.println("Число " + n + " делится на " + divisor);
    }
}
