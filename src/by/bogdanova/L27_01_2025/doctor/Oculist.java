package by.bogdanova.L27_01_2025.doctor;

import by.bogdanova.L27_01_2025.recruits.Recruit;

public class Oculist extends Doctor {

    double lowerBorder = 0.8;
    double upperBorder = 1.2;

    public void test(Recruit recruit) {
        if (!(recruit.getVisionCoeff() >= lowerBorder && recruit.getVisionCoeff() <= upperBorder)) {
            recruit.setValid(false);
            recruit.setDiagnosis("плохое зрение");
        }
    }
}
