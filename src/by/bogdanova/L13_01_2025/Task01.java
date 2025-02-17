package by.bogdanova.L13_01_2025;

/*Заполните массив размером 10.
Любыми числами (int). Найдите сумму всех его элементов и выведите результат на экран.*/

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Элементы массива:");
        for (int num : array) {
            System.out.print(num + " ");
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        System.out.println();

        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int indexOfThree = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                indexOfThree = i;
                break;
            }
        }

        System.out.print("Массив в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("max = " + max);
        System.out.println(evenCount);
        System.out.println(indexOfThree);
    }
}
