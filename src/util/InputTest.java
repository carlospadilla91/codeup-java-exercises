package util;

public class InputTest {

    public static void main(String[] args) {


        Input userInput = new Input();

//        System.out.println(userInput.yesNo());

//        System.out.println(userInput.getString("Enter anything:"));

//        System.out.println("Please enter an integer:");
//        int userInt = userInput.getInt(1, 10);
//        System.out.println("Your nubmer is " + userInt);

        System.out.println("Please enter a double number:");
//        double intDbl = userInput.getDouble();
//        System.out.println("Your double is " + intDbl);

//        System.out.println("Please enter a number between 1.5 and 9.5");
//        double userInt = userInput.getDouble(1.5,9.5);
//        System.out.println("Your number is " + userInt);

//        try {
//            System.out.println(userInput.getDouble());
//        } catch (NumberFormatException e){
//            e.getMessage();
//        }
        System.out.println(userInput.getInt());
    }
}
