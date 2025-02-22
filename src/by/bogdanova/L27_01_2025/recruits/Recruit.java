package by.bogdanova.L27_01_2025.recruits;

import java.util.ArrayList;
import java.util.List;

public class Recruit {
    private int id; //порядковый номер, автоматически увеличивается) int
    private static int totalAnimals = 0;
    private String firstName; // (имя) String
    private String middleName; // (отчество) String
    private String lastName; // (фамилия) String
    private List<Boolean> valid = new ArrayList<>(); // (годен или не годен) boolean
    private List<String> diagnosis = new ArrayList<>(); // (диагноз, например, "Шизофрения")
    private double visionCoeff; //(уровень зрения) double
    private boolean flatFeet; // (наличие плоскостопия)  boolean
    private int implantCount; // (количество зубных протезов) int
    private int cardiogram; // (результат кардиограммы, число ударов сердца)  int

    public Recruit(String firstName, String middleName, String lastName
            , double visionCoeff, boolean flatFeet, int implantCount, int cardiogram) {
        this.id = ++totalAnimals;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.visionCoeff = visionCoeff;
        this.flatFeet = flatFeet;
        this.implantCount = implantCount;
        this.cardiogram = cardiogram;
    }

    public void setDiagnosis(String diagnos) {
        this.diagnosis.add(diagnos);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public int getCardiogram() {
        return cardiogram;
    }

    public void setValid(boolean val) {
        this.valid.add(val);
    }

    // Если хотя бы одно значение false, возвращаем false
    public boolean isValid() {
        for (Boolean value : valid) {
            if (!value) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str = String.format("%-10s %-10s %-15s - ", lastName, firstName, middleName);
        if (isValid()) {
            return str + "годен";
        }
        StringBuilder diagnosisList = new StringBuilder("не годен (");
        for (String diag : diagnosis) {
            diagnosisList.append("").append(diag).append("; ");
        }
        diagnosisList.setLength(diagnosisList.length() - 2);
        return str + diagnosisList + ")";
    }

    public String displayInfo() {
        return "ID: " + id + ". ФИО: " + lastName + " " + firstName + " " + middleName
                + "\nКоэффициент зрения: " + visionCoeff + "; плоскостопие: " + (flatFeet ? "Да" : "Нет")
                + "; количество имплантов: " + implantCount + "; кардиограмма: " + cardiogram;
    }
}
