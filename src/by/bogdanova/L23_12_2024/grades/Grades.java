package by.bogdanova.L23_12_2024.grades;

import java.util.ArrayList;

// расчет и вывод данных о размере степендии производится без округления в большую сторону

public class Grades {
    private static int countNumber;
    private static long recordBook;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {

        InputGradesData inputData = new InputGradesData();

        recordBook = inputData.enterLongRecordBook();

        countNumber = 4;
        numbers = inputData.enterIntegerArrayGrades(countNumber);
        System.out.println("-----------------------------------");
        System.out.println();
        CheckGrades checkGrades = new CheckGrades(numbers);
        CheckStudent checkStudent = new CheckStudent(recordBook);

        checkStudent.isStudentPaying();

        if (checkGrades.checkStudentStatus() != null) {
            System.out.println(checkGrades.checkStudentStatus());
        } else {
            if (checkStudent.isStudentPaying()) {
                System.out.println("Стипендия не начислена (студент – платник)");
            } else {
                System.out.println("Средний балл в сессию..........................: "
                        + checkGrades.calculateAverageGrade());
                checkGrades.getCategoryGrades(checkGrades.calculateAverageGrade());
            }
        }
    }
}
