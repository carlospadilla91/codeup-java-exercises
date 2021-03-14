package inheritance;

public class Plate extends KitchenTools{

    public String shape;

    public String material;

    public void placeFoodOnIt(){
        System.out.println("You placed food on your plate!");
    }

    public void putAway(){
        System.out.println("You've put your knife away.");
    }
}
