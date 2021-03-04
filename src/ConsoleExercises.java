import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {


        double pi = 3.14159;

        //TODO: Write some Java code that uses the variable pi to output the following: The value of pi is approximately 3.14.

//        System.out.printf("The value of pi is approximately %.2f", pi);

        //TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //
        //What happens if you input something that is not an integer? // IT WILL RETURN AN ERROR SINCE EXPECTING AN 'INT'

        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your favorite number?");
//        int favNum = sc.nextInt();
//        System.out.println(favNum);

        //TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        //
        //What happens if you enter less than 3 words? IF ONLY 2 WORDS ENTERED IT WILL NOT PRINT UNTIL THE 3RD WORD IS ENTERED
        //What happens if you enter more than 3 words? IT ONLY CAPTURES THE FIRST THREE WORDS

//        System.out.print("Please enter your full name:");
//        String fName = sc.next();
//        String lName = sc.next();
//        String otherLName = sc.next();
//
//        System.out.println(fName + " " + lName + " " + otherLName);

        //TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //
        //do you capture all the words? // ONLY CAPTURES THE FIRST WORD WITH .next()
        //Rewrite the above example using the nextLine method. // CAPTURES THE WHOLE SENTENCE

//        System.out.println("What is your favorite quote:");
//        String quote = sc.nextLine();
//        System.out.println("Your favorite quote is: " + quote);

        //TODO: Prompt the user to enter values of length and width of a classroom at Codeup.
        //
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
        //
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.

        System.out.println("Please enter the length of the classroom:");
        String userLength = sc.nextLine();
        System.out.println("Please enter the width of the classroom:");
        String userWidth = sc.nextLine();


        int length = Integer.parseInt(userLength);
        int width = Integer.parseInt(userWidth);

        //TODO: Display the area and perimeter of that classroom.
        //
        //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        System.out.println("The area is " + (length * width));
        System.out.println("The perimeter is " + (length * 2 + width * 2));
    }
}
