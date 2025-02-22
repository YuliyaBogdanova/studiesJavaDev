package by.bogdanova.L27_01_2025.doctor;

import by.bogdanova.L27_01_2025.recruits.Recruit;

public class Therapist extends Doctor {
    int lowerBorder = 60;
    int upperBorder = 100;

    public void test(Recruit recruit) {
        if (recruit.getCardiogram() < lowerBorder || recruit.getCardiogram() > upperBorder) {
            recruit.setValid(false);
            recruit.setDiagnosis("плохая кардиограмма");
        }
    }
}
