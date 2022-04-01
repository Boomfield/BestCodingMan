package Candies;

import java.util.Objects;

public abstract class Candy {
    private int weight; // вес конфеты

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("weight " + getWeight() + " cannot be <0");
        }

        this.weight = weight;
    }

    public Candy(int weight) {
        setWeight(weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return weight == candy.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "weight=" + weight +
                '}';
    }

}
