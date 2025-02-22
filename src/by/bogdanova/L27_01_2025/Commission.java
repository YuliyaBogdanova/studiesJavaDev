package by.bogdanova.L27_01_2025;

import by.bogdanova.L27_01_2025.doctor.*;
import by.bogdanova.L27_01_2025.recruits.Recruit;

public class Commission {

    private Doctor[] doctors;

    public Commission() {
        doctors = new Doctor[] {
                new Dentist(),
                new Oculist(),
                new Surgeon(),
                new Psychiatrist(),
                new Therapist()
        };
    }
    public void test(Recruit recruit) {
        for (Doctor doctor : doctors) {
            doctor.test(recruit);
        }
    }
}
