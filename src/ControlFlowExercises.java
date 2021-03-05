import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {

    public static void main(String[] args){

        //TODO: Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;

            //Do While
            //
            //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
            //Alter your loop to count backwards by 5's from 100 to -10.
            //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
            // 2
            // 4
            // 16
            // 256
            // 65536

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

        //TODO: For
        //
        //Refactor the previous two exercises to use a for loop instead.

//        for(int i = 5; i <= 15; i += 1) {
//            System.out.println(i);
//        }

//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        //TODO: Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 1; i <= 100; i += 1) {
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //TODO: Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.

        //example output
        // What number would you like to go up to? 5
        //
        //Here is your table!
        //
        //number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125

        Scanner sc = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userInput = sc.nextInt();
//
//        // build table
//
//        System.out.println("Here is your table!");
//        System.out.println(" ");
//        System.out.println("number" + " | " + "squared" + "  | " + "cubed");
//        System.out.println("------" + " | " + "-------" + "  | " + "-----");
//
//        for(int i = 1; i <= userInput; i+= 1) {
//            System.out.println(i + "      | " + (i * i) + "        | " + (i * i * i));
//            if(i == userInput) {
//                System.out.print("Would you like to continue? ");
//                String userResponse = sc.next();
//                if(userResponse.equalsIgnoreCase("yes")) {
//                    System.out.print("How much further would you like to go? ");
//                    int furtherNum = sc.nextInt();
//                    userInput += furtherNum;
//                }
//            }
//        }




        // table pretty much complete just some formatting issues

        //TODO: Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0

//        System.out.print("Would you like to enter your grade? ");
//        String userInput = sc.next();
//
//        if(userInput.equalsIgnoreCase("yes")) {
//            System.out.println("Great!");
//        } else {
//            System.exit(0);
//        }
//
//        System.out.print("Enter your number grade 0-100: ");
//        int numGrade = sc.nextInt();
//
//        if(numGrade >= 88) {
//            System.out.println("Your letter grade is: A");
//        } else if(numGrade >=80) {
//            System.out.println("Your letter grade is: B");
//        } else if(numGrade >= 67) {
//            System.out.println("Your letter grade is: C");
//        } else if(numGrade >= 60) {
//            System.out.println("Your letter grade is: D");
//            System.out.println("Push more code!");
//        } else if(numGrade >= 59) {
//            System.out.println("Your letter grade is: F");
//            System.out.println("I recommend seeing a tutor.");
//        }




    }
}

