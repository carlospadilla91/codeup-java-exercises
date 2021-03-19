public class ExceptionsAndErrors {

    public static void main(String[] args) throws Exception {

//        throw new Exception("Something bad happened!");
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]);

        try {
            System.out.println("Let's see...");
            int result = 1 / 0;
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!");
        }


//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[1];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!"); // this one will never print bc the above exception is more specific to the exception happening
//        } finally {
//            System.out.println("This will always run."); // anything in finally will always run
//        }
    }
}
