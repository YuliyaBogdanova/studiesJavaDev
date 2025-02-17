package by.bogdanova.L23_12_2024;

/*Задача 16:
Описываем числа

Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число*/

import java.util.ArrayList;

import static by.bogdanova.L23_12_2024.EnterStringData.enterIntegerArray;

public class Homework16 {

    private final static String TEXTFORUSER = "Введите целое число в диапазоне от 1 до 999 (включительно)";
    private static int countNumber;
    private static ArrayList<Integer> numbers;
    private static final String EVEN = "четное";
    private static final String ODD = "нечетное";
    private static final String SINGLE = "однозначное число";
    private static final String TWO = "двузначное число";
    private static final String THREE = "трехзначное число";

    public static void main(String[] args) {
        System.out.println(TEXTFORUSER);
        countNumber = 1;
        numbers = enterIntegerArray(countNumber);
        if (numbers.get(0) < 1000 & numbers.get(0) > 0) {
            System.out.println(numbers.get(0) + " - " + checkNumber(numbers.get(0)));
        }
    }

    public static String checkNumber(int number) {
        String desc = null;
        if (number < 10) {
            desc = number % 2 == 0 ? (EVEN + " " + SINGLE) : (ODD + " " + SINGLE);
        } else if (number < 100) {
            desc = number % 2 == 0 ? (EVEN + " " + TWO) : (ODD + " " + TWO);
        } else {
            desc = number % 2 == 0 ? (EVEN + " " + THREE) : (ODD + " " + THREE);
        }
        return desc;
    }
}
