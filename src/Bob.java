import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, I'm Bob.\n");
        System.out.println("You can: \nAsk Bob a question\nYell at Bob\nSay nothing to Bob\nSay whatever you want to Bob\n");
        System.out.println("Type below:");
        String userInput = sc.nextLine();

        if(userInput.endsWith("?")) {
            System.out.println("\nBob: Sure.");
        } else if(userInput.endsWith("!")) {
            System.out.println("\nBob: Whoa, chill out!");
        } else if(userInput.equals("")) {
            System.out.println("\nBob: Fine. Be that way!");
        } else {
            System.out.println("\nBob: Whatever.");
        }
    }
}
