package by.bogdanova.L16_01_2025;

/*Определить все ли элементы в массиве одинаковые. В консоль написать Да элементы в
массиве одинаковые или Нет элементы в массиве разные.*/

public class Homework01 {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 1};
        int[] arr = {1, 5, 7, -1, 5};
//        int[] arr = {};
        System.out.println(checkArray(arr));

    }

    private static boolean checkEqualElements(int[] arr) {
        int firstElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != firstElement) {
                return false;
            }
        }
        return true;
    }

    private static String checkArray(int[] arr) {
        if (arr.length == 0) {
            return "Массив пустой";
        } else {
            return (checkEqualElements(arr) ? "Да, ВСЕ элементы в массиве одинаковые."
                    : "Нет, ВСЕ элементы в массиве разные.");
        }
    }
}
