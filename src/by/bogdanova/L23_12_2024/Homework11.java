package by.bogdanova.L23_12_2024;

/*Задача 11: Ввести с клавиатуры два целых числа, которые будут координатами точки,
не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6: 1
Пример для чисел -6 -6: 3*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterDoubleArray;

public class Homework11 {

    private final static String TEXTFORUSER = "Введите значение координат для точки: OX(1) и OY(2)";
    private static int countOfNumber;
    private static ArrayList<Double> numbers;

    public static void main(String[] args) {
        countOfNumber = 2;
        System.out.println(TEXTFORUSER);
        numbers = enterDoubleArray(countOfNumber);
        int getQuarter = getQuarter(numbers.get(0), numbers.get(1));
        if (getQuarter != 0) {
            System.out.println("Точка с координатами (x,y) = " + numbers.get(0) + numbers.get(1) +
                    " находится в " + getQuarter + " четверти");
        } else {
            System.out.println("Точка с координатами (x,y) = " + numbers.get(0) + numbers.get(1) +
                    " не принадлежит ни одной из четвертей, т.к. лежит на осях координат");
        }
    }

    private static int getQuarter(double a, double b) {
        int quarter;
        if (a > 0 && b > 0) {
            quarter = 1; // Первая четверть
        } else if (a < 0 && b > 0) {
            quarter = 2; // Вторая четверть
        } else if (a < 0 && b < 0) {
            quarter = 3; // Третья четверть
        } else if (a > 0 && b < 0) {
            quarter = 4; // Четвертая четверть
        } else {
            quarter = 0; // Точка находится на осях
        }
        return quarter;
    }
}
