package inheritance;

public class Plate extends KitchenTools{

    public String shape;

    public String material;

    public Plate(String name, String shape){
        super(name);
        this.shape = shape;
    }

    public void placeFoodOnIt(){
        System.out.println("You placed food on your plate!");
    }

    public void putAway(){
        System.out.println("You've put your knife away.");
    }

    public void washDish(){
        System.out.println("You washed your plate!");
    }
}
