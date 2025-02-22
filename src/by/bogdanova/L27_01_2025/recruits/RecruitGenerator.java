package by.bogdanova.L27_01_2025.recruits;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RecruitGenerator {

    private static String[] firstNames = new String[5];
    private static String[] middleNames = new String[5];
    private static String[] lastNames = new String[5];

    static {
        lastNames[0] = "Антипенко";
        lastNames[1] = "Иванов";
        lastNames[2] = "Семенков";
        lastNames[3] = "Тарасов";
        lastNames[4] = "Степанов";

        firstNames[0] = "Петр";
        firstNames[1] = "Семен";
        firstNames[2] = "Антип";
        firstNames[3] = "Олег";
        firstNames[4] = "Аркадий";

        middleNames[0] = "Васильевич";
        middleNames[1] = "Олегович";
        middleNames[2] = "Дмитриеич";
        middleNames[3] = "Григорьевич";
        middleNames[4] = "Карлович";
    }

    private Random random;

    public Recruit generate() {
        random = new Random();

        return new Recruit(firstNames[random.nextInt(firstNames.length)]
                , middleNames[random.nextInt(middleNames.length)]
                , lastNames[random.nextInt(lastNames.length)]
                , df(0.5 + random.nextDouble())
                , random.nextBoolean()
                , random.nextInt(3)
                , random.nextInt(101) + 10);
    }

    private double df(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
