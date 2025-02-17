package by.bogdanova.L23_12_2024;

/*Задача 7: Фибоначчи
Напишите программу, которая выводит первые 10 чисел Фибоначчи с помощью цикла for.F(0)=0
Числа Фибоначчи:F(0)=0
F(1)=1
F(n)=F(n−1)+F(n−2) для n≥2*/

public class Homework07 {
    public static void main(String[] args) {
        int countNumbersFibonacci = 10;
        int numberFibonacci = 0;
        int tempB = 1;
        System.out.println("Вывод первых 10 чисел Фибоначчи с помощью цикла for");
        for (int i = 1; i <= countNumbersFibonacci; i++) {
            System.out.print(numberFibonacci + " ");
            int temp = numberFibonacci + tempB;
            numberFibonacci = tempB;
            tempB = temp;
        }
    }
}