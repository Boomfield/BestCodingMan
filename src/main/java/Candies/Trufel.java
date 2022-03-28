package Candies;

public class Trufel extends ChocolateCandy{

    public Trufel(int weight, int cocoaAmount, ChocolateType chocolateType) {
        super(weight, cocoaAmount, chocolateType);
    }

    @Override
    public String toString() {

        return "Trufel " + super.toString();
    }
}
