package by.bogdanova.L23_01_2025;

public class Task00 {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.name = "Молоко";
        product1.quantity = 800;
        product1.price = 10;

        System.out.println("Общая стоимость молока на складе: "
                + product1.getTotalValue());

        Product product2 = new Product();
        product2.name = "Хлеб";
        product2.quantity =1000;
        product2.price = 15;

        System.out.println("Общая стоимость хлеба на складе: "
                + product2.getTotalValue());

        product1 = product2;
        product1.quantity = 500;
        System.out.println("Общая стоимость молока на складе - 2: "
                + product1.getTotalValue());

        Product product3 = new Product("яблоко", 40, 900);
        int totalValue3 = product3.getTotalValue();
        System.out.println("Общая стоимость " + product3.name + " = "
                + product3.getTotalValue());

    }
}
