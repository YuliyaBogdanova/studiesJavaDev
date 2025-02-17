package by.bogdanova.L03_02_2025;

public class Author {
    private String name;
    private String surname;
    private int birthYear;

    Author(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String toString() {
        return surname + " " +  name + " - " +  birthYear;
     }

    public int getBirthYear() {
        return birthYear;
    }
}
