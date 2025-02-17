package by.bogdanova.L23_12_2024;

/*Задача 3: Калькулятор
Напишите программу, которая реализует простой калькулятор.
Пользователь вводит два числа и оператор (+, -, *, /), программа выводит результат.
Используйте оператор switch. (char operator = scanner.next().charAt(0);)*/

import java.util.ArrayList;

public class Homework03 extends EnterStringData {
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private static int countOfNumber;
    private static double num1;
    private static double num2;
    private static char operator;
    private static ArrayList<Double> numbers;

    public static void main(String[] args){
        countOfNumber = 2;
        numbers = enterDoubleArray(countOfNumber);
        operator = getOperator ();
        num1 = numbers.get(0);
        num2 = numbers.get(1);

        getResultCalculator(num1, num2, operator);
    }

    private static void printResult(double num1, double num2, char operator, double result) {
        System.out.println("Результат: " + num1 + " " + operator + " " + num2 + " = " + result);
    }

    private static void getResultCalculator(double num1, double num2, char operator) {
        double result = 0;
        try {
            switch (operator) {
                case ADDITION:
                    result = num1 + num2;
                    printResult(num1, num2, ADDITION, result);
                    break;
                case SUBTRACTION:
                    result = num1 - num2;
                    printResult(num1, num2, SUBTRACTION, result);
                    break;
                case MULTIPLICATION:
                    result = num1 * num2;
                    printResult(num1, num2, MULTIPLICATION, result);
                    break;
                case DIVISION:
                    if (num2 == 0) {
                        throw new ArithmeticException("Ошибка: деление на ноль");
                    }
                    result = num1 / num2;
                    printResult(num1, num2, DIVISION, result);
                    break;
                default:
                    System.out.println("Ошибка: неверный оператор. Доступны операции: " + ADDITION + " "
                            + SUBTRACTION + " " + MULTIPLICATION + " " + DIVISION);
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
