package by.bogdanova.L13_01_2025;

/*Поиск второго по величине элемента
Условие: Найдите второй по величине элемент массива.
Пример:
int[] arr = {10, 20, 4, 45, 99};                       // Output: 45*/

public class Homework02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int secondLargest = findSecondLargest(arr);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Второй по величине элемент: " + secondLargest);
        } else {
            System.out.println("В массиве недостаточно уникальных элементов.");
        }

    }
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
