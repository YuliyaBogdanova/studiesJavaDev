package by.bogdanova.L27_01_2025;

import by.bogdanova.L27_01_2025.recruits.ArrayRecruits;
import by.bogdanova.L27_01_2025.recruits.Recruit;
import by.bogdanova.L27_01_2025.recruits.RecruitGenerator;

public class Task00 {

    private static int countRecruits;

    public static void main(String[] args) {
        countRecruits = 100;

        RecruitGenerator generator = new RecruitGenerator();
        ArrayRecruits arrayRecruits = new ArrayRecruits();
        Commission commission = new Commission();

        ArrayRecruits fitRecruits = new ArrayRecruits();
        ArrayRecruits unfitRecruits = new ArrayRecruits();

        for (int i = 0; i < countRecruits; i++) {
            Recruit recruit = generator.generate();
            commission.test(recruit);
            arrayRecruits.add(recruit);
            if (recruit.isValid()) {
                fitRecruits.add(recruit);
            } else {
                unfitRecruits.add(recruit);
            }
        }

//        // данные по всем новобранцам
//        System.out.println(printCountRecruits("", arrayRecruits));
//        arrayRecruits.sortByLastName();
//        text(arrayRecruits.getSize());
//        for (Recruit recruit : arrayRecruits.getRecruits()) {
//            System.out.println(recruit.displayInfo());
//        }
//        System.out.println();
//
//        //общий список с результатами медкомисси в алфавитном порядке
//        System.out.println(printCountRecruits("", arrayRecruits));
//        arrayRecruits.sortByLastName();
//        text(arrayRecruits.getSize());
//        printLisRecruits(arrayRecruits);

        // список годных в алфавитном порядке
        System.out.println(printCountRecruits("годных к службе", fitRecruits));
        fitRecruits.sortByLastName();
        text(fitRecruits.getSize());
        printLisRecruits(fitRecruits);
        // вывод информации о годном рекруте
        for (Recruit recruit : fitRecruits.getRecruits()) {
            System.out.println(recruit.displayInfo());
        }

        System.out.println();

        // список НЕ годных в алфавитном порядке
        System.out.println(printCountRecruits("НЕ годных к службе", unfitRecruits));
        unfitRecruits.sortByLastName();
        text(unfitRecruits.getSize());
        printLisRecruits(unfitRecruits);
    }

    private static void printLisRecruits(ArrayRecruits recruits) {
        for (Recruit recruit : recruits.getRecruits()) {
            System.out.println(recruit.toString());
        }
        System.out.println();
    }

    private static String printCountRecruits(String str, ArrayRecruits recruits) {
        return "Количество " + str + " новобранцев: " + recruits.getSize();
    }

    private static void text(int k) {
        if (k > 0) {
            System.out.println("Список:");
        }
    }
}
