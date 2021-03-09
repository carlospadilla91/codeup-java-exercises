import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(firstChar("Carlos"));
//        System.out.println(secondChar("Carlos"));
//        System.out.println(lastChar("Carlos"));
//        System.out.println(secondToLastChar("Carlos"));
//        System.out.println(userWantsToContinue());
//        System.out.println(isEven(2));
//        System.out.println(isOdd(3));
//        System.out.println(countOdds(1, 10));
//        System.out.println(countEvens(1, 10));
//        System.out.println(isVowel("b"));
//        System.out.println(hasVowels("Carlos"));
//        System.out.println(countVowels("Carlos"));
//        System.out.println(isPrime(7));
//        System.out.println(isPrime(4));
//        System.out.println(add(2, 3));
//        System.out.println(subtract(5, 3));
//        System.out.println(multiply(2, 3));
//        System.out.println(division(10, 5));
//        System.out.println(modulus(10, 5));
//        System.out.println(multiplyWithLoop(3, 10));
//        System.out.println(multiplyRecursion(5, 10));
//        System.out.println(getInteger(1, 10));
//        System.out.println(multiplyNumbers(4));
//        printTable();
        diceRoll();



    }


    //EXTRA EXERCISES
    //Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.

    public static char firstChar(String word){
            return word.charAt(0);
    }


    //Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.

    public static char secondChar(String word){
        return word.charAt(1);
    }


    //Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.

    public static char lastChar(String word){
        return word.charAt(word.length() - 1);
    }


    //Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.

    public static char secondToLastChar(String word) {
        return word.charAt(word.length() - 2);
    }

    //Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".

    public static boolean userWantsToContinue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String userInput = sc.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    //Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }


    //Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }


    //Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.

    public static int countOdds(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i += 1) {
            if (isOdd(i)) {
                count++;
            }
        }
        return count;
    }

    //Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.

    public static int countEvens(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i += 1) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    //Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".

    public static boolean isVowel(String ltr) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(ltr);
    }


    //Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.

    public static boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i += 1) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                return true;
            }
        }
        return false;
    }


    //Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.

    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i += 1) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    //Write a solution to FizzBuzz using recursion instead of a loop.




    //Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i += 1) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



    //Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.

//    public static String getTwentyPrimes(){
//        for (int i = 1; i <= 20; i += 1) {
//            if (i == 1 || i == 0) {
//                continue;
//            }
//        }
//    }

    //TODO: Basic Arithmetic
    //
    //Create four separate methods. Each will perform an arithmetic operation:
    //
    //Addition
    //Subtraction
    //Multiplication
    //Division
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //Test your methods and verify the output.
    //
    //Add a modulus method that finds the modulus of two numbers.
    //
    //Food for thought: What happens if we try to divide by zero? What should happen? ERROR WHEN TRYING TO DIVIDE BY 0

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int division(int x, int y){
        return x / y;
    }

    public static int modulus(int x, int y){
        return x % y;
    }

    public static int multiplyWithLoop(int x, int y){
        int result = 0;
        while (x > 0){
            result += y;
            x--;
        }
        return result;
    }

    public static int multiplyRecursion(int x, int y) {
        int result = 0;
        if (y != 0) {
            result += x + multiplyRecursion(x, y -1);
        }
        return result;
    }

    //TODO: Create a method that validates that user input is in a certain range
    //
    //The method signature should look like this:

    public static String getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1-10: ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return "Your number is: " + userInput;
        } else {
            System.out.println("Your number is not in range");
            return getInteger(min, max);
        }
    }

    public static long multiplyNumbers(int num){
        if (num >= 1) {
            return num * multiplyNumbers(num - 1);
        } else {
            return 1;
        }
    }


    public static void printTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        int userInt = sc.nextInt();
        if (userInt >= 1 && userInt <= 10) {
            for (int i = 1; i <= userInt; i += 1) {
                System.out.println(i + "!" + " = " + i + " = " + multiplyNumbers(i));
            }
                System.out.println("Would you like to continue?");
                String userInput = sc.next();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Enter a number of how much further you would like to continue: ");
                    int userNum = sc.nextInt();
                    userInt += userNum;
            }
        }
    }

    public static void diceRoll(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter how many sides the first die has: ");
        int firstDie = sc.nextInt();
        System.out.println("Please enter how many sides the second die has: ");
        int secondDie = sc.nextInt();
        int minRoll = 1;
        int firstRange = firstDie - minRoll + minRoll;
        int secondRange = secondDie - minRoll + minRoll;
        System.out.println("Enter 'Roll' to roll the dice");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("roll")) {
            int firstRoll = (int)(Math.random() * firstRange) + minRoll;
            int secondRoll = (int)(Math.random() * secondRange) + minRoll;
            System.out.println("Your first roll is: " + firstRoll);
            System.out.println("Your second roll is: " + secondRoll);
            System.out.println("Do you want to roll again? ");
            String userAnswer = sc.next();
            if (userAnswer.equalsIgnoreCase("yes")) {
                diceRoll();
            }
        }
    }

}
