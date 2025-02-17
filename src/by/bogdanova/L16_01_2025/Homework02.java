package by.bogdanova.L16_01_2025;

/*Задача вывести сколько раз встречается цифры в массиве.
Например дан массив [1,1,2,2,2,3,4,5,5,5,5] в консоли выводим.
1 - 2 раза
2 - 3 раза
3 - 1 раз
4 - 1 раз
5 - 4 раза*/

public class Homework02 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 2, 5, 3, 3, 5, 5, 5, 0};
//        int[] arr = {0, 0, 0, 0};

        int maxValue = 0;
        for (int number : arr) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        int[] countArray = new int[maxValue + 1];
        for (int number : arr) {
            countArray[number]++;
        }

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > 0) {
                if (countArray[i] > 1 && countArray[i] < 4) {
                    System.out.println(i + " - " + countArray[i] + " раза");
                } else
                    System.out.println(i + " - " + countArray[i] + " раз");
            }
        }
    }
}
