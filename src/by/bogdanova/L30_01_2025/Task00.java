package by.bogdanova.L30_01_2025;

public class Task00 {
    public static void main(String[] args) {
        Wheel[] wheel = new Wheel[4];

        for (int i = 0; i < wheel.length; i++) {
            wheel[i] = new Wheel("Зимняя", 19, "Резина");
        }
        Car audi = new Car("Audi", "TT", 1999, wheel);
        // System.out.println(audi);
        WheelArray wheelArray = new WheelArray(4);
        wheelArray.add(new Wheel("Зимняя", 19, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 19, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 19, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 19, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 19, "Резина"));
        wheelArray.add(new Wheel("Атняя", 16, "Резина"));
        System.out.println(wheelArray);
        Wheel wheel1 = wheelArray.get(wheelArray.size - 1);
        System.out.println(wheel1);
        // вывод сортировки
        wheelArray.sortByDiameter();
        System.out.println(wheelArray);
        wheelArray.sortByType();
        System.out.println(wheelArray);
        int size = wheelArray.getSize();
        System.out.println(size);

    }
}