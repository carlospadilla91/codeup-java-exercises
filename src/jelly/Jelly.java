package jelly;

import inheritance.Ingredient;

public class Jelly extends Ingredient {

    public String flavor;

    public String jamOrJelly;


    public void openJar(){
        System.out.println("Jar has been opened!");
    }

    public void throwAway() {
        System.out.println("Throwing away jelly...");
    }

    public void printCalories(){
        System.out.println("Your jelly has " + calories + " calories per serving.");
    }
}
