package by.bogdanova.L23_12_2024.utilityBills;

import java.util.Scanner;

public class InputBillsData implements InputDataForBill {
    private int data;

    private static final String GAS = "Введите объём потреблённого газа (м. куб.)............: ";
    private static final String HOT_WATER = "Введите объём потреблённой горячей воды (м. куб.).....: ";
    private static final String COLD_WATER = "Введите объём потреблённой холодной воды (м. куб.)....: ";
    private static final String ELECTRICITY = "Введите объём потреблённой электроэнергии (кВт * ч)...: ";
    private static final String APARTMENT = "Введите площадь квартиры (м. кв.).....................: ";

    private Scanner scanner;

    public InputBillsData() {
        this.scanner = new Scanner(System.in);
    }

    public int getGasVolume() {
        return enterIntegerData(GAS);
    }

    public int getHotWaterVolume() {
        return enterIntegerData(HOT_WATER);
    }

    public int getColdWaterVolume() {
        return enterIntegerData(COLD_WATER);
    }

    public int getElectricityVolume() {
        return enterIntegerData(ELECTRICITY);
    }

    public int getApartmentArea() {
        return enterIntegerData(APARTMENT);
    }

    private String enterString(String str) {
        System.out.print(str);
        return scanner.nextLine();
    }

    public Integer enterIntegerData(String str) {
        int number = 0;
        String input = enterString(str);
        while (!input.matches("[0-9]+")) {
            System.out.println("Ошибка: введите целое положительное число");
            input = enterString(str);
        }
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректные данные. Попробуйте еще раз");
        }
        return number;
    }
}
