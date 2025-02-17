package by.bogdanova.L13_02_2025;

import java.util.Random;

public abstract class Pet extends Animal {

    private String nameOwner;
    private String surnameOwner;

    private static String[] surnames = new String[5];

    static {
        surnames[0] = "Антипенко";
        surnames[1] = "Сергеенко";
        surnames[2] = "Степаненко";
        surnames[3] = "Тарасенко";
        surnames[4] = "Моисенко";
    }

    private Random getSurname = new Random();

    public Pet(String name, String species, int age, String nameOwner) {
        super(name, species, age);
        this.nameOwner = nameOwner;
        this.surnameOwner = surnames[getSurname.nextInt(surnames.length)];
    }

    public void play(){
        System.out.println(super.getName() + " играет с хозяином " + nameOwner);
    }

    @Override
    public String toString() {
        return super.toString() + " (Домашнее животное, хозяин: " + nameOwner +
                " " + surnameOwner + ")";
    }
}
