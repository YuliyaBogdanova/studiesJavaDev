package by.bogdanova.L23_12_2024;

/*Задача 6: Перевод числа в римские цифры
Напишите программу, которая запрашивает у пользователя число от 1 до 10 и выводит его в римских цифрах,
используя оператор switch.*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework06 {
    private final static String TEXTFORUSER = "Enter number from 1 to 10";
    private static int countNumber;
    private static ArrayList<Integer> numbers;
    private static final String RESULT = "Римская цифра для числа ";

    public static void main(String[] args) {
        System.out.println(TEXTFORUSER);
        countNumber = 1;
        numbers = enterIntegerArray(countNumber);
        conertNumberToRoman(numbers.get(0));
    }

    private static void conertNumberToRoman(int number) {
        switch (number) {
            case 1:
                System.out.println(RESULT + number + " = I");
                break;
            case 2:
                System.out.println(RESULT + number + " = II");
                break;
            case 3:
                System.out.println(RESULT + number + " = III");
                break;
            case 4:
                System.out.println(RESULT + number + " = IV");
                break;
            case 5:
                System.out.println(RESULT + number + " = V");
                break;
            case 6:
                System.out.println(RESULT + number + " = VI");
                break;
            case 7:
                System.out.println(RESULT + number + " = VII");
                break;
            case 8:
                System.out.println(RESULT + number + " = VIII");
                break;
            case 9:
                System.out.println(RESULT + number + " = IX");
                break;
            case 10:
                System.out.println(RESULT + number + " = X");
                break;
            default:
                System.out.println("Введенное число не соответсвует требованиям. Попробуйте еще раз");
        }
    }
}
