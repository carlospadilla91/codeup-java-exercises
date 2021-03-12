import java.util.Arrays;

public class ServerNameGenerator {



    //TODO:Create a method that will return a random element from an array of strings.

    public static String randomArrayElement(String[] array){
        int randomNum = (int)(Math.random() * 10 - 1 + 1) + 1;
        return array[randomNum];
    }


    public static void main(String[] args) {

        //TODO:Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

        String[] adjectives = {"Accurate", "Ambitious", "Considerate", "Cultured", "Dynamic", "Friendly", "Funny", "Generous", "Modest", "Reliable"};
        String[] nouns = {"Apple", "Car", "Dog", "Garden", "Chicken", "Fish", "Computer", "Picture", "Cup", "Phone"};

        System.out.printf("Here is your server name:\n%s %s", randomArrayElement(adjectives),randomArrayElement(nouns));
    }
}
