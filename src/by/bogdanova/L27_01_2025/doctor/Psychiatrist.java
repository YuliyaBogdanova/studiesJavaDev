package by.bogdanova.L27_01_2025.doctor;

import by.bogdanova.L27_01_2025.recruits.Recruit;

import java.util.Random;

public class Psychiatrist extends Doctor {

    private Random random = new Random();

    public void test(Recruit recruit) {
        if (random.nextBoolean()) {
            recruit.setValid(true);
        } else {
            recruit.setValid(false);
            recruit.setDiagnosis("плохое психическое состоние");
        }
    }
}
