package by.bogdanova.L23_12_2024.forOperator;

/*Задание 2
        Написать программу, которая выводит таблицу умножение в виде таблицы Пифагора:
          1 2 3 ... 9 10
        1 1 2 3 ... 9 10
        2 2 4 6 ... 18 20
        3 3 6 9 ... 27 30
        ...........................
        9 9 18 27 ... 81 90
        10 10 20 30 ... 90 100*/

import java.io.OutputStream;

public class Homework02 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
//            System.out.printf("%5d", i); //  заменить 0 на пустоту?
            System.out.printf("%5s", (i == 0) ? " " : i);
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
