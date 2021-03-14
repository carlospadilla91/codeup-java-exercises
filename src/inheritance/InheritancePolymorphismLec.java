package inheritance;

public class InheritancePolymorphismLec {

    /*TODO:What is Polymorphism?
    // means "many forms"
    // occurs when we have many classes that are related to each other by inheritance
    // Real life example of polymorphism: A person at the same time can have different characteristic. Like a man at the same time is a father, a husband, an employee. So the same person posses different behavior in different situations. This is called polymorphism.
    // https://www.geeksforgeeks.org/polymorphism-in-java/

    // =================================================================================================================

    //TODO:Can a subclass instance, when stored in a variable of it’s parent type, use methods unique to the subclass?
    // No (unless we cast the type)
     */


    // =================================================================================================================
    /*TODO:Aside from defining constants, what are some additional uses of the final keyword?
    // it can prevent inheritance or overriding
    // it can also be used in method parameters like with variables to prevent reassignment


    // PREVENTING INHERITANCE
    // e.g Public final class Movie {}
    // e.g Public class Drama extends Movie {} ===== THIS WILL THROW AN ERROR BC MOVIE WAS DECLARED FINAL AND NO CLASS IS ALLOWED TO INHERIT FROM IT

    // PREVENTING PARAMETER REASSIGNMENT
    // e.g Public int increment(final int x){
        x += 1;
        return x // ERROR BC FINAL WORD IN PARAMETER

     // PREVENTING METHOD OVERRIDING
     // e.g. public class Employee {
     //    public final String work() {
     //        return "Filling out TPS reports";
     //    }
     //}
     //  public class Developer extends Employee {
     //    // ERROR!
     //    public String work() {
     //        return "Writing code";
     //    }
     //}
     */

    //================================= INHERITANCE AND POLYMORPHISM
    //-- Pre-Lecture Research Questions
    //What is inheritance?
    //  Share variables and methods between parent and child classes in Java
    //What is the difference between a subclass and a super class?
    //  Subclass == Child class / Super class == Parent Class
    //Can a class extend from multiple classes?
    //  Nope.
    //Can a class be both a parent of another class and child of yet another class?
    //  Yes
    //What is method overriding?
    //  Where the child class has a different implementation of the same method from it’s parent.
    //Can a subclass overload methods of it’s parent class?
    //  Yes
    //What is the difference between private and protected visibility?
    //  Protected class members are visible to any child classes (even in different packages)
    //What are two uses of the “super” keyword in a subclass?
    //  1. Call the parent constructor
    //  2. Call the parent implementation of an overridden method
    //What is Polymorphism?
    //  Different implementations of a common code structure
    //Can a subclass instance, when stored in a variable of it’s parent type, use methods unique to the subclass?
    //  No (unless we cast the type)
    //Aside from defining constants, what are some additional uses of the final keyword?
    //  1. prevent a parameter from being reassigned
    //  2. prevent a class from being extended


    //---------- Mini-Exercise 1
    //Consider making a PB&J sandwhich (again...).
    //You have the following categories:

    //  KitchenTool (what is common between knifes and plates?)
    //    Knife; -- boolean isSharp; cut(); spread(); String typeOfKnife
    //    Plate; -- String shape; String material;


    //boolean washable



    //  Ingredient (what is common between these ingredients?)
    //    Jelly; -- String flavor; String jamOrJelly;
    //    PeanutButter; -- boolean isCrunchy; String typeOfNut;
    //    Bread; -- String typeOfBread; boolean hasCrust; sliceBread(); toast()

    //boolean edible; expirationDate(); boolean isPackaged; boolean isOrganic; productionProcess(); boolean isHomemade

    //Add at least two characteristics and two actions relevent to each thing.

    //---------- Mini-Exercise 2
    //Create Java classes for the following:
    //  KitchenTool
    //    Knife (should extend from KitchenTool)
    //    Plate (should extend from KitchenTool)
    //  Ingredient
    //    Jelly (should extend from Ingredient)
    //    PeanutButter (should extend from Ingredient)
    //    Bread (should extend from Ingredient)
    //Add the variables and methods (two each per class) to the classes. To keep things simple enough, the methods can be void and simply sout out simple messages about what the method is doing (no need to manipulate the variables).

    //---------- Mini-Exercise 3
    //- add a void method, throwAway, to your Ingredient class that souts out "Throwing away ingredient..."
    //- override the method, throwAway, in your Jelly, PeanutButter, and Bread classes to sout out a more specific message (e.g. "Throwing away Jelly...", etc.)
    //- add another method to the KitchenTool class and override it in the Knife and Plate classes.

    //---------- Mini-Exercise 4
    //- add a protected integer property to Ingredient of calories
    //- add a method to the Jelly class that prints out the calories
    //- does the code work if you change the visibility of the calories to public? Private?
    //- create a package called "jelly" and place the Jelly class in it and experiment with public, private, protected visibility for calories

    //---------- Mini-Exercise 5
    //- add a constructor to KitchenTool that sets all properties
    //- resolve the compile error in the subclasses by adding a default constructor to KitchenTool
    //- remove the default constructor and add a constructor to the child classes that calls the super constructor and sets the child class properties for Knife and Plate

    //---------- Mini-Exercise 6
    //- create a class, IngredientTest, that has a main method
    //- add a static void method, throwAwayIngredient that takes in an Ingredient instance and invokes the throwAway method
    //- instantiate an instance of Jelly, PeanutButter, and Bread stored in type Ingredient
    //- call the throwAwayIngredient() method multiple times passing various instances of the above ingredients


    public static void main(String[] args) {

        Knife knife = new Knife();
        Plate plate = new Plate();
        Bread bread = new Bread();
        Jelly jelly = new Jelly();
        PeanutButter pb = new PeanutButter();

        knife.isClean = false;
        knife.washable = true;
//        knife.getKitchenTool();
//        plate.putAway();
//        System.out.println(knife.isClean);

        knife.isSharp = true;
//        System.out.println(knife.isSharp);
        knife.cut();
//        plate.cut(); // error bc cut() is only in Knife class which is child of KitchenTools

        plate.shape = "Round";
        System.out.println(plate.shape);
        plate.placeFoodOnIt();
        jelly.throwAway();
        pb.throwAway();


    }
}
