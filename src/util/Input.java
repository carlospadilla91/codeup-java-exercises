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
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        } else {
            System.out.println("Invalid integer; please enter an integer.");
            scanner.nextLine();
            return getInt();
        }
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

    public double getDouble(){
        if (scanner.hasNextDouble()){
            return scanner.nextDouble();
        } else {
            System.out.println("Invalid double number; please enter a valid double number.");
            return getDouble();
        }
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


