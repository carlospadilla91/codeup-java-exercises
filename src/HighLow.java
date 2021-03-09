import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        guessNumber();
    }


    public static int randomNumber(){
        return (int)(Math.random() * (100 - 1 + 1) + 1);
    }

    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number between 1-100: ");
        int userGuess = sc.nextInt();
        System.out.println(randomNumber());
        if (userGuess < randomNumber()) {
            System.out.println("HIGHER");
            guessNumber();
        } else if (userGuess > randomNumber()) {
            System.out.println("LOWER");
            guessNumber();
        } else {
            System.out.println("GOOD GUESS!");
        }

    }

}
