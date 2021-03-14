package inheritance;

public class Bread extends Ingredient{

    public String typeOfBread;

    public boolean hasCrust;

    public void toast(){
        System.out.println("Your bread has been toasted!");
    }

    public void sliceBread(){
        System.out.println("Your bread has been sliced!");
    }

    public void throwAway() {
        System.out.println("Throwing away bread...");
    }
}
