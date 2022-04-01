package Candies;

import java.util.Objects;

public abstract class ChocolateCandy extends Candy{
    private int cocoaAmount;
    private ChocolateType chocolateType;
    public int getCocoaAmount(){
        return cocoaAmount;
    }
    public void setCocoaAmount(int cocoaAmount){
        if (cocoaAmount<=0){
            throw new IllegalArgumentException("not chocolate candy");
        }
        this.cocoaAmount = cocoaAmount;
    }
    public ChocolateType getChocolateType(){
        return chocolateType;
    }
    public ChocolateCandy(int weight,int cocoaAmount, ChocolateType chocolateType){
        super(weight) ;
        setCocoaAmount(cocoaAmount);
        this.chocolateType = chocolateType;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChocolateCandy that = (ChocolateCandy) o;
        return cocoaAmount == that.cocoaAmount && chocolateType == that.chocolateType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cocoaAmount, chocolateType);
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" +
                "cocoaAmount=" + cocoaAmount +
                ", chocolateType=" + chocolateType +
                '}';
    }
}
