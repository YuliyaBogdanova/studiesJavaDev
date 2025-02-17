package by.bogdanova.L16_01_2025;

/*Дан массив int. Найти индекс элемента который удовлетворяет условиям.
        - Сам элемент не равен 0, и его соседние элементы тоже не равны 0.
        - Элемент должен делиться без остатка на оба соседних элемента (т.е. на предыдущий и следующий).
Если такой элемент найден, вывести в консоль. Если таких элементов нет, вывести -1.*/

import java.util.ArrayList;

public class Homework03 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1, 2, 3, 3, 3, 5, 5, 0};
        ArrayList<Integer> index = findIndex(arr);

        if (!index.isEmpty()) {
            for (int i : index) {
                System.out.println(arr[i]);
            }
        } else System.out.println(-1);
    }

    private static ArrayList<Integer> findIndex(int[] arr) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            int current = arr[i];
            int prev = arr[i - 1];
            int next = arr[i + 1];

            if (current != 0 && prev != 0 && next != 0) {
                if (current % prev == 0 && current % next == 0) {
                    index.add(i);
                }
            }
        }
        return index;
    }
}
