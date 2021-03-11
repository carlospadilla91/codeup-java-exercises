package shapes;

import util.Input; // importing Input Class

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input(); //Creating a new instance of Scanner, that makes new user input available

        System.out.println("Please enter the radius of a circle: ");
        double radius = input.getDouble(); // stores users input

        Circle circle = new Circle(radius); // creates new circle with users input

        System.out.println(circle.getArea()); // prints area of circle

        System.out.println(circle.getCircumference()); // prints circumference fo circle
    }
}
