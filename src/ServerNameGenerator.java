import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {



    //TODO:Create a method that will return a random element from an array of strings.

    public static String randomArrayElement(String[] array){
        Random random = new Random(); // using Random class from util package
        int randomElement = random.nextInt(array.length);
        return array[randomElement];
    }


    public static void main(String[] args) {

        //TODO:Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

        String[] adjectives = {"Accurate", "Ambitious", "Considerate", "Cultured", "Dynamic", "Friendly", "Funny", "Generous", "Modest", "Reliable"};
        String[] nouns = {"Apple", "Car", "Dog", "Garden", "Chicken", "Fish", "Computer", "Picture", "Cup", "Phone"};

        System.out.printf("Here is your server name:\n%s %s", randomArrayElement(adjectives),randomArrayElement(nouns));
    }
}
