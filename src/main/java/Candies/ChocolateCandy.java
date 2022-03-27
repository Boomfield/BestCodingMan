package Candies;

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

}
