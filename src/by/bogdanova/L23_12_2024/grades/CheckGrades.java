package by.bogdanova.L23_12_2024.grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckGrades {
    private ArrayList<Integer> grades;

    private final String SOCIAL = "социальная";
    private final String ORDINARY = "обычная";
    private final String INCREASED = "повышенная";
    private final String SPECIAL = "специальная";

    private double socialScholarship = 65.5;
    private double ordinaryScholarship = 95.5;
    private double coefficientForIncreasedScholarship = 1.5;
    private double coefficientForSpesialScholarship = 2.25;


    private int minGades = 4;
    private int maxGrade = 8;

    public CheckGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String checkStudentStatus() {
        if (countGrades(minGades, maxGrade).get("countMin") >= 3) {
            return "Студент отчислен за неуспеваемость";
        } else if (countGrades(minGades, maxGrade).get("countMin") >= 1) {
            return "Студент имеет академическую задолженность\nСтипендия не начислена";
        }
        return null;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }

    public void getCategoryGrades(double averageGrade) {
        if (averageGrade <= 5) {
            printResult(SOCIAL, getIncreaseOrSpecialScholarship(SOCIAL));
        } else if (averageGrade <= 7) {
            printResult(ORDINARY, getIncreaseOrSpecialScholarship(ORDINARY));
        } else if (averageGrade > 9 && countGrades(minGades, maxGrade).get("countMax") == grades.size()) {
            printResult(SPECIAL, getIncreaseOrSpecialScholarship(SPECIAL));
        } else {
            printResult(INCREASED, getIncreaseOrSpecialScholarship(INCREASED));
        }
    }

    private Map<String, Integer> countGrades(int minGades, int maxGrade) {
        Map<String, Integer> resultMap = new HashMap<>();
        int countMin = 0;
        int countMax = 0;
        for (int grade : grades) {
            if (grade < minGades) {
                countMin++;
            }
            if (grade >= maxGrade) {
                countMax++;
            }
        }
        resultMap.put("countMin", countMin);
        resultMap.put("countMax", countMax);
        return resultMap;
    }

    private double getIncreaseOrSpecialScholarship(String scholarship) {
        double result = 0;
        switch (scholarship) {
            case SOCIAL:
                result = socialScholarship;
                break;
            case ORDINARY:
                result = ordinaryScholarship;
                break;
            case INCREASED:
                result = ordinaryScholarship * coefficientForIncreasedScholarship;
                break;
            case SPECIAL:
                result = ordinaryScholarship * coefficientForSpesialScholarship;
                break;
        }
        return result;
    }

    public void printResult(String scholarship, double sum) {
        printCost("Ежемесячная " + scholarship + " стипендия...............", sum);
    }

    public void printCost(String serviceName, double cost) {
        System.out.printf("%s: %d руб. %02d коп.\n", serviceName, (int) cost, (int) ((cost % 1) * 100));
    }
}
