package by.bogdanova.L27_01_2025.doctor;

import by.bogdanova.L27_01_2025.recruits.Recruit;

public class Surgeon extends Doctor {

    public void test(Recruit recruit) {
        if (recruit.isFlatFeet()) {
            recruit.setValid(false);
            recruit.setDiagnosis("плоскостопие");
        }
    }
}
