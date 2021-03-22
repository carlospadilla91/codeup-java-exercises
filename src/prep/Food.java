package prep;

import java.util.Collection;

public class Food implements Consumable {

    //TODO:
    //has private properties for String name, String description, and int calories
    //takes in arguments in constructor in order to assign values to those properties (this.prop = value;)
    //CONSTRUCTOR throws an IllegalArgumentException if any of the arguments are null or empty (note: integers cannot be null)
    //You will need to both define the constructor as able to throw the exception and also conditionally actually throw the exception in the method body of the constructor
    //create public getter and setter methods for each property
    //HINT: there is a shortcut in Intellij that will do this for you

    private String name;
    private String description;
    private int calories;

    public Food(String name, String description, int calories) throws IllegalArgumentException{
            this.name = name;
            this.description = description;
            this.calories = calories;

            if (name.isEmpty() || name == null){
                throw new IllegalArgumentException("Invalid input for name.");
            }
            if (description.isEmpty() || description == null){
                throw new IllegalArgumentException("Invalid input for description.");
            }
            if (calories < 0){
                throw new IllegalArgumentException("Invalid input for calories.");
            }
    }

//    public Food(String name, String description, int calories){
//        try{
//            this.name = name;
//            this.description = description;
//            this.calories = calories;
//        } catch (IllegalArgumentException e){
//
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void consume(String name) {

    }

    @Override
    public Collection<String> getFullDescription() {
        return null;
    }
}
