package by.bogdanova.L09_01_2025;

/*Задача 2: Пропуск четных чисел
Напишите программу, которая выводит все нечетные числа от 1 до 20,
используя цикл for. Пропустите четные числа с помощью оператора continue.*/

public class Task04 {
    public static void main(String[] args) {

        int number = 0;
        for (int i = 0; i < 10; i++) {
            number++;
            while (true) {
                if (number % 2 == 0) {
                    number++;
                    continue;
                }
                break;
            }
            System.out.println(number);
        }
    }
}
