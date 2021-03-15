package inheritance;

public class KitchenTools {

    public boolean washable;
    public String name;
    public boolean isClean;

    public KitchenTools(String name){
        this.name = name;
    }

    public void getKitchenTool(){ System.out.println("You grabbed a kitchen tool!"); }

    public void putAway(){
        System.out.println("Your dish has been put away!");
    }

    public void washDish(){
        System.out.println("You washed your kitchen dish!");
    }

}
