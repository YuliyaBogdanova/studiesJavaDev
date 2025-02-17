package by.bogdanova.L23_12_2024;

/*Задача 14: Правило треугольника

Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
        "Треугольник существует." - если треугольник с такими сторонами существует.
        "Треугольник не существует." - если треугольник с такими сторонами не существует.
        Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterDoubleArray;

public class Homework14 {

    private final static String TEXTFORUSER = "Введите значения сторон треугольника";

    private static int countOfNumber;
    private static ArrayList<Double> sidesTriangle;

    public static void main(String[] args) {

        countOfNumber = 3;
        System.out.println(TEXTFORUSER);
        sidesTriangle = enterDoubleArray(countOfNumber);
        checkTriangle(sidesTriangle);
    }

    private static void checkTriangle(ArrayList<Double> triangle) {
        if (triangle.stream().allMatch(side -> side > 0)) {
            if (triangle.get(0) + triangle.get(1) > triangle.get(2)
                    && triangle.get(0) + triangle.get(2) > triangle.get(1)
                    && triangle.get(1) + triangle.get(2) > triangle.get(0)) {
                System.out.println("Треугольник существует.");
            } else {
                System.out.println("Треугольник не существует.");
            }
        } else
            System.out.println("Ошибка: введены не верные данные");
    }
}
