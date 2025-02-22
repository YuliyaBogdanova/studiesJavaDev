package by.bogdanova.L13_02_2025_2;

public abstract class WildAnimal extends Animal {

    private String livingArea;

    public WildAnimal(String name, String species, int age, String livingArea) {
        super(name, species, age);
        this.livingArea = livingArea;
    }

    public void hunt() {
        System.out.println(super.getName() + " охотится в саванне");
    }

    @Override
    public String toString() {
        return super.toString() + " (Дикое животное, среда обитания: " + livingArea + ")";
    }
}
