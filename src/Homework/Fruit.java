package Homework;

public abstract class Fruit {

    private float weight;
    private String name = "Фрукт";

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
