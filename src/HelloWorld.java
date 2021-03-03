public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello Luna");

        //TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);

        //TODO: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = 3.14159;
//        System.out.println(myString);

        //TODO: Change your code to assign a character value to myString. What do you notice?
        //cannot assign a char to a String

        //TODO: Change your code to assign the value 3.14159 to myString. What happens?
        //cannot assign a float/double to a String

        //TODO: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber); // cannot print bc myNumber has not been initialized

        //TODO: Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14; //expects a long and we are providing a double

        //TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;

        //TODO: Change your code to assign the value 123 to myNumber.
//        myNumber = 123;

        //TODO: Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // 3.14 is a float/double number while 123 is a whole integer which is assignable to a long

        //TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14;
//        float myNumber = 3.14F; //needs F at end of number in order to declare it as float or else the default type is double

        //TODO: Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++); //prints 5
//        System.out.println(x); //prints 6

//        int x = 5;
//        System.out.println(++x); //prints 6
//        System.out.println(x); //prints 6

        //TODO: What is the difference between the above code blocks? Explain why the code outputs what it does.
        //first code is incrementing afterwards therefore +1 is being done after printing 'x' again
        //second code is incrementing before therefore +1 is being added to x before printing 'x' again

        //TODO: Try to create a variable named class. What happens?

//        class myAge = 29; //this code cannot run bc a class is defined almost like a function

        //TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";
//        System.out.println(three);

        //TODO: Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
//        x += 5; //shorthand

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x; //shorthand

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        x /= y; //shorthand
//        y = y - x;
//        y -= x; //shorthand

        //TODO: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        //byte num = 128; //error when trying to assign a value higher than what byte holds

        byte num = 127;
        System.out.println(++num); //since byte capacity is high end 127 and we incremented inside the print then our console prints the lowest capacity for byte

        byte num2 = -128;
        System.out.println(--num2); //since byte low end capacity is -128 and decremented the number then the console will print out the high end capacity for byte



    }
}
