package by.bogdanova.L06_03_2025.homework;

public class HomeWork {
    
    private static final int COUN_TRANSPORT = 20;
    
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        
        for (int i = 0; i < COUN_TRANSPORT; i++) {
            Transport transport = TransportFactory.nextTransport();
            transportManager.addTransport(transport);
        }

        System.out.println("transportList:");
        transportManager.printAllTransport();
        System.out.println("uniqueTransportSet:");
        transportManager.printUniqueTransport();

        transportManager.sortTransport(new TransportComparatorByModel());
        System.out.println("transportList after sort by model:");
        transportManager.printAllTransport();
        System.out.println("uniqueTransportSet after sort by model:");
        transportManager.printUniqueTransport();

        transportManager.sortTransport(new TransportComparatorBySpeed());
        System.out.println("transportList after sort by speed:");
        transportManager.printAllTransport();
        System.out.println("uniqueTransportSet after sort by speed:");
        transportManager.printUniqueTransport();

        transportManager.removeAllTransportByModel("BMW");
        System.out.println("transportList after remove bmw:");
        transportManager.printAllTransport();
        System.out.println("uniqueTransportSet after remove bmw:");
        transportManager.printUniqueTransport();
    }
}