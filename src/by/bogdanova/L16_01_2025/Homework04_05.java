package by.bogdanova.L16_01_2025;

/*Подсчитать количество пар с заданной суммой
Условие: Найдите количество пар в массиве, сумма которых равна заданному числу k.
Пример:
Ввод: Массив [1, 5, 7, -1, 5], k = 6
Вывод: 3 пары: (1, 5), (7, -1), (5, 1)*/

public class Homework04_05 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;
        homework04(arr, k);
        System.out.println();
        homework05(arr, k);

    }

    private static int countPairsWithSum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    private static String[] getPairsWithSum(int[] arr, int k, int countPairs) {
        String[] pairs = new String[countPairs];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    pairs[count] = ("(" + arr[i] +", " + arr[j] + ")");
                    count++;
                }
            }
        }
        return pairs;
    }

    private static void homework04(int[] arr, int k) {
        String[] pairs = getPairsWithSum(arr, 6, countPairsWithSum(arr, k));

        if (countPairsWithSum(arr, k) > 0) {
            System.out.print("Пар с суммой " + countPairsWithSum(arr, k) + ":");
            for (String pair : pairs) {
                System.out.print(" " + pair);
            }
        } else System.out.println("Пар с суммой = " + k + " не найдено");
    }

    private static void homework05(int[] arr, int k) {
        String[] pairs = getPairsWithSum(arr, 6, countPairsWithSum(arr, k));

        if (countPairsWithSum(arr, k) > 0) {
            for (String pair : pairs) {
                System.out.print("Да ");
                System.out.print(pair + "\n");
            }
        } else System.out.println("Пар с суммой = " + k + " не найдено");
    }
}
