package Candies;

public class Karakum extends ChocolateCandy {
    public Karakum(int weight, int cocoaAmount, ChocolateType chocolateType) {
        super(weight, cocoaAmount, chocolateType);
    }

    @Override
    public String toString() {
        return "Karakum "+super.toString();
    }
}
