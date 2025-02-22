package by.bogdanova.L27_01_2025.doctor;

import by.bogdanova.L27_01_2025.recruits.Recruit;

public class Dentist extends Doctor {

    public void test(Recruit recruit) {
        if (recruit.getImplantCount() >= 1) {
            recruit.setValid(false);
            recruit.setDiagnosis("более одного зубного протеза");
        }
    }
}
