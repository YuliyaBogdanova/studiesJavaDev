package by.bogdanova.L23_12_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterStringData {

    private static final String NUMBER = "number";
    private static final String OPERATOR = "operator";

    static ArrayList<Double> enterDoubleArray(int n) {
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = enterString(NUMBER, i);
            while (!input.matches("[0-9.-]+")) {
                System.out.println("Ошибка: введите число (дроби через \".\")");
                input = enterString(NUMBER, i);
            }
            try {
                numbers.add(Double.parseDouble(input));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректные данные. Попробуйте еще раз");
                i--;
            }
        }
        return numbers;
    }

   public static ArrayList<Integer> enterIntegerArray(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = enterString(NUMBER, i);
            while (!input.matches("[0-9-]+")) {
                System.out.println("Ошибка: введите целое число");
                input = enterString(NUMBER, i);
            }
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректные данные. Попробуйте еще раз");
                i--;
            }
        }
        return numbers;
    }

    static int returnIntFromDouble(Double number) {
        if (number % 1 != 0) {
            throw new IllegalArgumentException(number + " не может быть преобразовано в Integer");
        }
        return number.intValue();
    }

    static char getOperator() {
        String input = enterString(OPERATOR, 1);
        while (!input.matches("[+\\-*/%^!]")) {
            System.out.println("Ошибка: недопустимые символы");
            input = enterString(OPERATOR, 1);
        }
        return input.charAt(0);
    }

    static String enterString(String str, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + str + " " + i + ": ");
        return scanner.nextLine();
    }
}
