package by.bogdanova.L09_01_2025;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i > 5) {
            if (i ==7) {  // условие всегда выполняется - бесконечный цикл
                System.out.println("i = 7 это значит, что мы не будем выполнять код ниже этого блока");
                continue;
            }
            if (i == 6) {
                System.out.println("i = 6 это значит, что мы прекращаем while");
                break;
            }
            System.out.println(i);
            i--;
        }
    }
}
