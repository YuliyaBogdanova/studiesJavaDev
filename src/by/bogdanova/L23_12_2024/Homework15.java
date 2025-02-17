package by.bogdanova.L23_12_2024;

/*Задача 15: Количество дней в году

Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — не високосные.*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework15 {

    private final static String TEXTFORUSER = "Введите год";
    private static int countNumber;
    private static ArrayList<Integer> year;

    public static void main(String[] args) {
        System.out.println(TEXTFORUSER);
        countNumber = 1;
        year = enterIntegerArray(countNumber);
        checkYear(year.get(0));
    }

    private static void checkYear (int year) {
        int daysInYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 366 : 365;
        System.out.println("Количество дней в году: " + daysInYear);
    }
}
