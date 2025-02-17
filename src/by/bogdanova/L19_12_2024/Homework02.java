package by.bogdanova.L19_12_2024;

/*Объявить переменную num и присвоить ей значение 23.
Используя остаток от деления (%), определить, делится ли число на 2 без остатка (четное или нет)

Пример вывода:
        23 - нечетное число.*/

public class Homework02 {
    public static void main(String[] args) {
        int num;
        num = 24;

        int checkEven = num%2;

        if (checkEven == 0){
            System.out.println(num + " is even");
        } else
            System.out.println(num + " is odd");
    }
}
