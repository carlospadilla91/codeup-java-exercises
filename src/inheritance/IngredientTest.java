package inheritance;

import jelly.Jelly;

public class IngredientTest {

    public static void throwAwayIngredient(Ingredient i){
        i.throwAway();
    }



    public static void main(String[] args) {

        Ingredient j = new Jelly();
        Ingredient pb = new PeanutButter();
        Ingredient b = new Bread();

        throwAwayIngredient(j);
        throwAwayIngredient(pb);
        throwAwayIngredient(b);


    }
}
