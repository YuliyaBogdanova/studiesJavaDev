package by.bogdanova.L23_12_2024.utilityBills;

public class Bills {

    public static void main(String[] args) {

        InputBillsData inputData = new InputBillsData();
        PrintBillsCalculation printBillsCalculation = new PrintBillsCalculation();
        PaymentCalculation paymentCalculation = new PaymentCalculation();

        System.out.println("Программа расчёта квартплаты и коммунальных платежей\n" +
                "-------------------------------------------------------------");

        int gasVolume = inputData.getGasVolume();
        int hotWaterVolume = inputData.getHotWaterVolume();
        int coldWaterVolume = inputData.getColdWaterVolume();
        int electricityVolume = inputData.getElectricityVolume();
        int apartmentArea = inputData.getApartmentArea();


        printBillsCalculation.printAllCosts(paymentCalculation.getGasCost(gasVolume)
                , paymentCalculation.getWaterCost(hotWaterVolume, coldWaterVolume)
                , paymentCalculation.getElectricityCost(electricityVolume)
                , paymentCalculation.getWaterHeatingCost(hotWaterVolume)
                , paymentCalculation.getApartmentCost(apartmentArea));

        printBillsCalculation.printTotalSum(paymentCalculation
                .getSumApartment(gasVolume
                        , coldWaterVolume
                        , electricityVolume
                        , hotWaterVolume
                        , apartmentArea));
    }
}
