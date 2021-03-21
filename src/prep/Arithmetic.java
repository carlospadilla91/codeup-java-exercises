package prep;

import java.lang.reflect.Array;

public class Arithmetic {

    //TODO:
    //Arthimetic.java - all static methods inside
    //square - takes in an int argument, returns the square of that number as an int
    //sum - takes in two numeric (your choice of type) arguments, returns the sum of both
    //difference - takes in two numeric (your choice of type) arguments, returns the difference between the two
    //product - takes in two numeric (your choice of type) arguments, returns the product (multiply)
    //average - takes in a numeric array as an argument, returns the average of that array

    public static int square(int x){
        return x * x;
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static int difference(int x, int y){
        return x - y;
    }

    public static int product(int x, int y){
        return x * y;
    }

    public static double average(int[] intArr){
        double sum = 0;
        for (int num : intArr){
            sum += num;
        }
        return sum / intArr.length;
    }

}
