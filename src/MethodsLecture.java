import java.util.Scanner;

public class MethodsLecture {

    public static void main(String[] args) {

        String name1 = "Carlos";
        String name2 = "Sarah";
        String name3 = "Ruth";
        getName(name1);
        getName(name1, name2);
        getName(name1, name2, name3);
    }



        // ============== Method Definitions ===============
// *** Access Modifiers ***


// *** Static vs Instance ***


// *** Returning vs Void ***


// *** Parameters ***


// ============ Mini Exercise #1 =============
    /* TODO:
     *   -Write a public static method which returns an integer
     *   -The method should take in *two parameters* and *return* the product of multiplying them
     *   -Print the output to the console by calling the method, passing in params, and logging its output
     *   BONUS: Use the Scanner class to get the numbers from the user input
     * */

//    public static int multiply(int x, int y) {
//        return x * y;
//    }


// ============== Method Overloading ===============
    //can write several methods with same name and only difference is the parameters being passed in


// ============ Mini Exercise #2 =============

    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     *  */

    public static void getName(String name1){
        System.out.printf("Hello, %s\n", name1);
    }
    public static void getName(String name1, String name2){
        System.out.printf("Hello, %s and %s\n", name1, name2);
    }
    public static void getName(String name1, String name2, String name3){
        System.out.printf("Hello, %s, %s and %s\n", name1, name2, name3);
    }

    public static void getName() {}



// ============== Recursion ===============

//    public static String printName(String name, int numTimesToRun){
//
//        if (numTimesToRun > 0) {
//            System.out.println(name);
//            return printName(name, numTimesToRun - 1);
//        }
//
//    }

    public static int sum(int k){
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }


// ============== Responsible Method Use ===============




}
