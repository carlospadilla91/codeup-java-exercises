package DataStructuresAndAlgorithms;

import java.util.Arrays;

// code along https://www.youtube.com/watch?v=BBpAmxU_NQo
public class Main {

    // runs constant O(1)
    public void log(int[] numbers){
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    };

    // runs linearly O(n)
    public void loopLog(int[] numbers){
        // O(n) runtime complexity; n represents size of the input; this algorithm grows linearly
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // run quadratic O(n^2)
    public void nestedLoop(int[] numbers){
        for (int first : numbers){  // O(n)
            for (int second : numbers){ // O(n^2)
                System.out.println(first + ", " + second);
            }
        }
    }

    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        System.out.println(numbers);


        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(4);
        numbers.print();



    }



}
