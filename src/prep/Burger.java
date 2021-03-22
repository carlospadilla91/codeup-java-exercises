package prep;

import java.util.Collection;

public class Burger extends Food implements Consumable{

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

    @Override
    public void consume(String name) {

    }

    @Override
    public Collection<String> getFullDescription() {
        return null;
    }
}
