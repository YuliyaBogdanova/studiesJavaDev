package by.bogdanova.L13_02_2025_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Owner {

    private int id; // - уникальный идентификатор
    private String name; // – имя владельца.
    private String surname; // – фамилия владельца.
    private static String[] names = new String[5];; // - массив имен.
    private static String[] surnames = new String[5];; // - массив фамилий.
    private List<Pet> pets = new ArrayList<>(); // - массив животных которые есть у владельца.
    private static int totalOwners; // – общее количество владельцев.
    private static String[] arrSex = new String[2];
    private String sex; // пол хозяина

    private Random random = new Random();

    static {
        System.out.println("Класс Owner загружен в память!");
        surnames[0] = "Антипенко";
        surnames[1] = "Сергеенко";
        surnames[2] = "Степаненко";
        surnames[3] = "Тарасенко";
        surnames[4] = "Моисенко";

        names[0] = "Анна";
        names[1] = "Семен";
        names[2] = "Антип";
        names[3] = "Олег";
        names[4] = "Алина";
    }

    static  {
        arrSex[0] = "male";
        arrSex[1] = "female";
    }

    public Owner() {
        this.id = ++totalOwners;
        this.name = names[random.nextInt(names.length)];
        this.surname = surnames[random.nextInt(surnames.length)];
        this.sex = arrSex[random.nextInt(arrSex.length)];
    }

    public String getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public static int getTotalOwners(){
        return totalOwners;
    }

    public void addPet(Pet pet){
        pets.add(pet);
        pet.setOwner(this);
    }
}
