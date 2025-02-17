package by.bogdanova.L23_12_2024.utilityBills;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

public class PaymentCalculation {
    private double gasTariff = 0.5477;
    private double waterTariff = 2.8648;
    private double electricityTariff = 0.2537;
    private double waterHeatingTariff = 24.7187;
    private double apartmentTariffMaintenance = 0.1771;
    private double apartmentTariffMajorRepairs = 0.2335;
    private double apartmentTariffHeatingPerSquareMeter = 0.2335;

    public double getGasCost(int gas) {
        return round(getResult(gas, gasTariff), 2);
    }

    public double getWaterCost(int coldWater, int hotWater) {
        return round(getResult((coldWater + hotWater), waterTariff), 2);
    }

    public double getElectricityCost(int electricity) {
        return round(getResult(electricity, electricityTariff), 2);
    }

    public double getWaterHeatingCost(int hotWater) {
        return round(getResult(hotWater, waterHeatingTariff), 2);
    }

    private double getResult(int data, double tariff) {
        return data * tariff;
    }

    public double getApartmentCost(int apartArea) {
        double sum = apartArea * apartmentTariffMaintenance
                + apartArea * apartmentTariffMajorRepairs
                + apartmentTariffHeatingPerSquareMeter * apartArea * waterHeatingTariff;
        return round(sum, 2);
    }

    public double getSumApartment(int gas, int coldWater, int electricity, int hotWater, int apartArea) {
//        return (getGasCost(gas)
//                + getWaterCost(coldWater, hotWater)
//                + getElectricityCost(electricity)
//                + getWaterHeatingCost(hotWater)
//                + getApartmentCost(apartArea));

        return Stream.of(getGasCost(gas)
                , getWaterCost(coldWater, hotWater)
                , getElectricityCost(electricity)
                , getWaterHeatingCost(hotWater)
                , getApartmentCost(apartArea)).mapToDouble(Double::doubleValue).sum();
    }

    private double round(double data, int places) {
        BigDecimal bd = new BigDecimal(data);
        return bd.setScale(places, RoundingMode.HALF_UP
        ).doubleValue();
    }
}
