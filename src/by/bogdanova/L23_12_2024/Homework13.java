package by.bogdanova.L23_12_2024;

/*Задача 13: Переходим дорогу вслепую

Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
        Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
        "зелёный" - если горит зелёный цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зелёный
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зелёный*/

import java.util.regex.Pattern;

import static by.bogdanova.L23_12_2024.EnterStringData.enterString;

public class Homework13 {

    private final static String TEXTFORUSER = "Введите время в формате чч:мм";

    public static void main(String[] args) {

        System.out.println(TEXTFORUSER);
        int minutes = getMinutes (checkFormatTime(enterString("time", 1)));
        System.out.println(getColorTrafficLight (minutes));

    }

    private static String getColorTrafficLight(int timeMinutes) {
        String color;
        double timeInCycle = timeMinutes % 5;
        if (timeInCycle < 3) {
            color = "зелёный";
        } else if (timeInCycle < 4) {
            color = "желтый";
        } else {
            color = "красный";
        }
        return color;
    }

    private static String checkFormatTime(String inputTime) {
        while (!inputTime.matches("^([01]\\d|2[0-3]):([0-5]\\d)$")) {
            System.out.println("Ошибка: не верный формат. " + TEXTFORUSER);
            inputTime = enterString("time", 1);
        }
        return inputTime;
    }

    private static int getMinutes(String inputTime) {
        String[] parts = inputTime.split(":");
        int minutes =0;
        if (parts.length == 2) {
            String minutesString = parts[1];
            try {
                minutes = Integer.parseInt(minutesString);
            } catch (NumberFormatException e) {
                System.out.println(parts[1] + " не может быть преобразовано в Integer");
            }
        } else {
            System.out.println("Неверный формат времени");
        }
        return minutes;
    }
}
