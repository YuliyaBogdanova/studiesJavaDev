package by.bogdanova.L23_12_2024;

/*Задача 19: Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
        8888
        8888*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework19 {

    private final static String TEXTFORUSER = "Введите два целых числа соответсвующих правилу:" +
            "\n1 - количество столбцов;" +
            "\n2 - количество строк";

    private static int countNumber;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {
        System.out.println(TEXTFORUSER);
        countNumber = 2;
        numbers = enterIntegerArray(countNumber);
        printRectangle(numbers);

    }

    private static void printRectangle(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.get(1); i++) {
            for (int j = 0; j < numbers.get(0); j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
