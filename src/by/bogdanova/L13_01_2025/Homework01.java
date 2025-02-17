package by.bogdanova.L13_01_2025;

/*Объединение двух массивов
Условие: Реализуйте метод, который объединяет два массива в один.  Пример:                                                                                                                    int[] arr1 = {1, 2, 3};
int[] arr2 = {4, 5, 6};
// Output: {1, 2, 3, 4, 5, 6}   */

public class Homework01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] mergedArray = getMergeArrays(arr1, arr2);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

    }
    public static int[] getMergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        return mergedArray;
    }
}
