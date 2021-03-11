package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    //TODO: When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.next();
    }

    public boolean yesNo(){
        System.out.println("Please enter yes/no: ");
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }
//
//    public int getInt(int min, int max){
//        System.out.println("Please enter number between " + min + " and " + max);
//        int userNum = this.scanner.nextInt();
//        if (userNum >= min && userNum <= max){
//            return userNum;
//        }
//    }


}


