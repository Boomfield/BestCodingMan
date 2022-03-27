package Candies;

public abstract class Candy {
    private int weight; // вес конфеты
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        if (weight<=0){
            throw new IllegalArgumentException("weight "+ getWeight() + " cannot be <0");
        }
        this.weight = weight;
    }
    public  Candy(int weight){
        setWeight(weight);
    }
}
