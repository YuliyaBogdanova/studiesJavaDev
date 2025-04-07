package by.bogdanova.L07_04_2025;

import java.io.*;
import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {

//        try (FileReader fileReader = new FileReader("file.txt");) {
//            int ch;
//            while ((ch = fileReader.read()) != -1) {
//                System.out.print((char) ch);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try (BufferedReader bufferedReader = new BufferedReader(
//                new FileReader("files/file.txt"))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Файл не найден или поврежден file.txt");
//        }
//
//        File file = new File("files/file2.txt");
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Файл не найден или поврежден file.txt");
//        }

//        try (FileWriter fileWriter = new FileWriter("file2.txt", true)) {
//            fileWriter.write("hello i'm new line \n");
//        } catch (IOException e) {
//            System.out.println("Не удалось записать в файл");
//        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("file2.txt"))) {
            bufferedWriter.write("hello i'm new line");
            bufferedWriter.newLine();
            bufferedWriter.write("hello i'm new line - 2");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }

        String str1 = "str1";
        String str2 = "str2";
        try (PrintWriter printWriter = new PrintWriter("file2.txt")) {
            printWriter.println("hello i'm new line");
            printWriter.format("[%s] [%s]", str1, str2);
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }
    }
}
