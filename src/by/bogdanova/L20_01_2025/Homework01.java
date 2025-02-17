package by.bogdanova.L20_01_2025;

/*Напишите метод, который:

1 Копирует первый массив в новый массив (используйте Arrays.copyOf).
Копирует часть массива (например, первые 3 элемента).
Пример:
Ввод: [1, 2, 3, 4, 5]
Результат: [1, 2, 3]

2 сравнивает два массива на равенство с использованием Arrays.equals().

3 находит второй по величине элемент в массиве. Используйте сортировку.

4 который принимает два отсортированных массива и возвращает новый массив,
содержащий элементы из обоих массивов, также отсортированный*/

import java.util.Arrays;

public class Homework01 {

    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        int[] originalArr2 = {1, 2, 7, 4, 6};
        int[] copiedArray1 = copyPartArray(originalArr, 2);
        int[] copiedArray2 = copyFullArray(originalArr);
        int[] mergeSortedArrays = mergeSortedArrays(originalArr,originalArr2);

        System.out.println(Arrays.toString(copiedArray1));
        System.out.println(Arrays.toString(copiedArray2));
        System.out.println(compareArray(originalArr, copiedArray1) ? "Массивы одинаковы" : "Массивы НЕ одинаковы");
        System.out.println("Второй по величине элемент: " + findSecondLargestElement(originalArr2));
        System.out.println(Arrays.toString(mergeSortedArrays));

    }

    private static int[] copyPartArray(int[] arr, int length) {
        return Arrays.copyOf(arr, length);
    }

    private static int[] copyFullArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    private static boolean compareArray(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    private static int findSecondLargestElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j =0;
        int m = 0;
        while (i < arr1.length) {
            mergedArr[m++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArr[m++] = arr2[j++];
        }
        Arrays.sort(mergedArr);
        return mergedArr;
    }
}
