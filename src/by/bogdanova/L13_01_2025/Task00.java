package by.bogdanova.L13_01_2025;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        int [] arr = new int [10];
        int len = arr.length;
        System.out.println(len);
        int a = arr[5];
        for (int i = 0; i < len; i++) {
            arr[i] = i * 13;
        }
        System.out.println(Arrays.toString(arr));
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr3[] = new int[4]; //так не надо
        int[] arr4 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr4[2] = 7;
        System.out.println(Arrays.toString(arr4));

        char[] chars = new char[10];
        System.out.println(Arrays.toString(chars));
    }
}
