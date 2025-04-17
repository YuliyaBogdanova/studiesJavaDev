package by.bogdanova.L14_04_2025;

public class Apple {

    private Colour colour;
    private int weight;

    public Apple() {}

    public Apple(Colour colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public Colour getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "colour=" + colour +
                ", weight=" + weight +
                '}';
    }
}
