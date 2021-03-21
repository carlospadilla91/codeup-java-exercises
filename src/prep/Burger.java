package prep;

public class Burger extends Food{

    private int numOfPatties;
    private boolean hasCheese;

    public Burger(String name, String description, int calories) throws IllegalArgumentException{
        super(name, description, calories);
    }

    public int getNumOfPatties(){
        return numOfPatties;
    }

    public void setNumOfPatties(int numOfPatties){
        this.numOfPatties = numOfPatties;
    }

    public boolean getHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }
}
