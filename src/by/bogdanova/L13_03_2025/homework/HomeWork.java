package by.bogdanova.L13_03_2025.homework;

import by.bogdanova.L13_03_2025.homework.comparator.TransportComparatorBySpeed;
import by.bogdanova.L13_03_2025.homework.factory.TransportFactory;
import by.bogdanova.L13_03_2025.homework.manager.TransportManager;
import by.bogdanova.L13_03_2025.homework.model.Transport;

public class HomeWork {
    
    private static final int COUN_TRANSPORT = 20;
    
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();

        for (int i = 0; i < COUN_TRANSPORT; i++) {
            Transport transport = TransportFactory.nextTransport();
            transportManager.addTransport(transport);
        }
        System.out.println("Map transport");
        transportManager.printTransport();

        String randomLicensePlate = transportManager.getRandomLicensePlate();
        System.out.println("Transport by random license plate: " + randomLicensePlate);
        transportManager.printAllListTransport(
                transportManager.findTransportByPlate(randomLicensePlate));
        transportManager.removeAllTransportByLicensePlate(randomLicensePlate);
        System.out.println("Transport by random license plate: " + randomLicensePlate);
        transportManager.printAllListTransport(
                transportManager.findTransportByPlate(randomLicensePlate));
        System.out.println("Map after removing by random license plate (after removing): " + randomLicensePlate);
        transportManager.printTransport();

        System.out.println("getTransportByType:");
        transportManager.printAllListTransport(transportManager.getTransportByType("Car"));

        System.out.println("getFastestTransportByType");
        System.out.println(transportManager.getFastestTransportByType(new TransportComparatorBySpeed()
                , "Car").toString());
    }
}