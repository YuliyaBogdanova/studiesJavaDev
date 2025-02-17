package by.bogdanova.L23_12_2024.utilityBills;

public class PrintBillsCalculation {
// метод вывода не округляет вверх
    public void printCost(String serviceName, double cost) {
        System.out.printf("%s: %d руб. %02d коп.\n", serviceName, (int) cost, (int) ((cost % 1) * 100));
    }

    public void printAllCosts(double gasCost, double waterCost, double electricityCost, double waterHeatingCost, double apartmentCost) {
        System.out.println();
        System.out.println("Сумма Ваших платежей:");
        printCost("За газ..............", gasCost);
        printCost("За воду.............", waterCost);
        printCost("За электроэнергию...", electricityCost);
        printCost("За подогрев воды....", waterHeatingCost);
        printCost("За квартиру.........", apartmentCost);
    }

    public void printTotalSum(double sum) {
        System.out.println("--------------------------------------");
        printCost("Итого...............:", sum);
    }

}
