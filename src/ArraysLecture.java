import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getByteArray())); // returns [0, 0, 0, 0, 0] since we have not assigned values to each index
        System.out.println(Arrays.toString(getStringArray())); // returns [null, null, null, null, null] since we have not assigned values to each index
        fillArray(getByteArray());
        fillArray();

        String[] strArray; // declaring an array

        strArray = new String[2];  // initializing an array with length of 3; length is immutable/not changeable

        //assigning values to each of the two index
//        strArray[0] = "Carlos";
//        strArray[1] = "Sarah";
//
//        System.out.println(Arrays.toString(strArray));
//
//        strArray[0] = "Padilla";
//        System.out.println(Arrays.toString(strArray));


    }

    String[] languages = {"html", "css", "javascript", "java"};
    String[] languages1 = {"html", "css", "javascript", "java"};

    public static byte[] getByteArray(){
        return new byte[5];
    }
    public static String[] getStringArray(){
        return new String[5];
    }
    public static void fillArray(byte[] arr){ //Arrays.fill is filling array with what you pass into method and can be overloaded to fill specific index
        Arrays.fill(arr, (byte)1);
        System.out.println(Arrays.toString(arr));
    }
    public static void fillArray(){
        int[] intArr = {1,2,3,4,}; // we can also declare arrays with just passing in the number of index values
        System.out.println(Arrays.toString(intArr));
    }


}
