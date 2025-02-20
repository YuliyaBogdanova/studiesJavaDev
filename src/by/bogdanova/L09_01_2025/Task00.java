package by.bogdanova.L09_01_2025;

//области видимости

public class Task00 {
    public static void main(String[] args) {
        int a = 2;
        for (int i = 0; i<10; i++ ) {
            int b = 2;
            for (int j = 0; j < 20; j++) {
                a = 99;
            }
        }
//        b = 7; // переменная здесь не видна
    }
}
