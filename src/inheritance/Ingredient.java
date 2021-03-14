package inheritance;

import org.w3c.dom.ls.LSOutput;

public class Ingredient {

    protected int calories;
    public boolean isOrganic;
    public boolean isHomemade;

    public void grabIngredient(){
        System.out.println("You've grabbed your ingredient for use!");
    }
    public void storeIngredient(){
        System.out.println("You've stored away your ingredient!");
    }

    public void throwAway(){
        System.out.println("Throwing away ingredient...");
    }

}
