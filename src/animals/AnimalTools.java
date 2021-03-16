package animals;

import animals.canine.Canine;
import animals.canine.Dog;
import animals.canine.Wolf;
import animals.felidae.Cat;
import animals.felidae.Felidae;
import animals.felidae.Tiger;

import java.util.Scanner;

public class AnimalTools {

    public static void getCanineDetails(){

        Scanner sc = new Scanner(System.in);
        Canine canine;
        Felidae feline;


        System.out.println("Choose your animal family 'canine' or 'feline': ");
        String famInput = sc.nextLine().toLowerCase();

        if (famInput.equals("canine")){
            System.out.println("Input 'dog' or 'wolf' to know its details: ");
        } else {
            System.out.println("Input 'cat' or 'tiger' to know its details: ");
        }
        String input = sc.nextLine().toLowerCase();


        if (input.equals("dog")) {
            canine = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                    "German Shepherd Dog", "Black and Tan");
        } else {
            canine = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                    "Northwestern Wolf", false, "North America");
        }
        canine.printDetails();

        System.out.println("Would you like more details on a canine? (yes/y)");

        String response = sc.nextLine().toLowerCase();

        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")){
            getCanineDetails();

            if (input.equals("cat")){
                feline = new Cat("Small", "Domestic cat", "African wildcat", "Meoww", true);
            } else{
                feline = new Tiger("X-Large", "Tiger", "Siberian Tiger", "Rawrr", true);
            }
            feline.printDetails();

            System.out.println("Would you like more details on a canine? (yes/y)");

            String response1 = sc.nextLine().toLowerCase();

            if (response1.equalsIgnoreCase("yes") || response1.equalsIgnoreCase("y")){
                getCanineDetails();
        }
    }
}
}
