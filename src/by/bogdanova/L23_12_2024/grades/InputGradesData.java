package by.bogdanova.L23_12_2024.grades;

import java.util.ArrayList;
import java.util.Scanner;

public class InputGradesData {

    private static final String TEXT = "Введите оценку за экзамен № ";
    private static final String TEXT_RECOD_BOOK = "Введите номер зачетной книжки ";

    static String enterString(String str, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(str + i + ":  ");
        return scanner.nextLine();
    }

    public static ArrayList<Integer> enterIntegerArrayGrades(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = enterString(TEXT, i);
            if (!input.matches("[0-9]+")) {
                System.out.println("Ошибка: введите целое число");
                input = enterString(TEXT, i);
            }
            try {
                int number = Integer.parseInt(input);
                if (number < 0 || number > 10) {
                    System.out.println("Ошибка: введите число от 0 до 10");
                    i--;
                } else {
                    numbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректные данные. Попробуйте еще раз");
                i--;
            }
        }
        return numbers;
    }

    public static long enterLongRecordBook() {
        long number = 0;
        String input = enterString(TEXT_RECOD_BOOK, 1);
        if (!input.matches("[0-9]+")) {
            System.out.println("Ошибка: введите целое число");
            input = enterString(TEXT_RECOD_BOOK, 1);
        }
        try {
            number = Long.parseLong(input);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректные данные. Попробуйте еще раз");
        }
        return number;
    }
}
