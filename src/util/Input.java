package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    //TODO: When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();

    }

    public int getInt() {
//        int userInt;
//        try{
//            System.out.println("Please enter an integer: ");
//            userInt = Integer.parseInt(getString());
//            return userInt;
////            System.out.println("You entered the correct input!");
//        } catch (NumberFormatException e){
//            System.out.println("Invalid input, please try again");
//            return getInt();
//        }
        try {
            return Integer.parseInt(getString());
        } catch(NumberFormatException e){
            System.out.println("Input could not be parsed into an integer");
            System.out.println("Try again!");
            return getInt();
        }


//        if (scanner.hasNextInt()){
//            return scanner.nextInt();
//        } else {
//            System.out.println("Invalid integer; please enter an integer.");
//            scanner.nextLine();
//            return getInt();
//        }
    }

    public int getInt(int min, int max){
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Your number is not in range; please enter a number between " + min + " and " + max);
            return getInt(min, max);
        }
    }

    public double getDouble() throws NumberFormatException{
        Double userDbl = Double.valueOf(getString());
        if (!userDbl.getClass().getSimpleName().equals("Double")){
            throw new NumberFormatException("Invalid input");
        }
        return userDbl;
//        if (scanner.hasNextDouble()){
//            return scanner.nextDouble();
//        } else {
//            System.out.println("Invalid double number; please enter a valid double number.");
//            return getDouble();
//        }
    }

    public double getDouble(double min, double max){
        double userDbl = getDouble();
        if (userDbl >= min && userDbl <= max) {
            return userDbl;
        } else {
            System.out.println("Your number is not in range; please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        }
    }

}


