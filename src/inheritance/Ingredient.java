package inheritance;

import org.w3c.dom.ls.LSOutput;

public class Ingredient {

    boolean isOrganic;
    boolean isHomemade;

    public void grabIngredient(){
        System.out.println("You've grabbed your ingredient for use!");
    }
    public void storeIngredient(){
        System.out.println("You've stored away your ingredient!");
    }

}
