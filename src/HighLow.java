import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        playGame(new Scanner(System.in), (int)(Math.random() * 100) + 1);
    }

    public static void initGame(){
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.print("Please guess a number between 1-100: ");

        playGame(sc, randomNum);
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

    public static String checkGuess(int guess, int targetNum){
        if (guess == targetNum) {
            return "GOOD GUESS!";
        }else if (guess > targetNum){
            return "LOWER";
        } else if (guess < targetNum){
            return "HIGHER";
        }
        return "wut";
    }

    public static void playGame(Scanner sc, int randomNum){
        System.out.print("Please guess a number between 1-100: ");
        int userGuess = sc.nextInt();

        if (userGuess < 1 || userGuess > 100){
            System.out.println("Your guess is out of bounds, please try again");
        } else {
            String response = checkGuess(userGuess, randomNum);
            if (response.equals("GOOD GUESS!")){
                System.out.println(response);
            }else{
                playGame(sc, randomNum);
            }
        }
    }

}
