public class SyntaxTypesVariablesLec {


    public static void main(String[] args) {
        String sentence = "Hi, my name is Carlos";
//        System.out.println(sentence);

        // ==== DATA TYPES - PRIMITIVE ===

        // *** BYTE, SHORT, INT, LONG ***

        // byte range is -128 to 127

//        byte bite = 127;
//        System.out.println(
//                ((Object) bite)
//                        .getClass()
//                        .getName());

        short shrt = 32000;

//        int myInt = 2147483647;
//        System.out.println(myInt + 1);
//
//        int minValue = Integer.MIN_VALUE;
//        System.out.println(minValue);

        // *** FLOAT ***

        float flt = 1.1F;

        // ** DOUBLE **

        double dbl = 1873e3;

        // ** BOOLEAN **

//        boolean isTrue = true;
//        boolean isFalse = (1 > 2);
//        boolean isTrue = (1 < 2 && 1 > 0);

        // ** CHAR and STRING **
        // ** STRING IS A REFERENCE TYPE **

        char letter = 'a';
        char letter2 = 'b';
        var output = letter + letter2;
//        System.out.println(output); // output returns an integer bc of unicode

        String myStr = "string";
        System.out.println(myStr.length());

        // ** CONSTANTS **

        final String myName = "Carlos";

        // ** CASTING **
        // TWO TYPES: IMPLICIT AND EXPLICIT CASTING

        // implicit
//        int anInteger = 345;
//        long aLong = anInteger;
        double aDouble = 345;
        Integer anInterger = 345;


        //explicit
//        var anotherDouble = (double)anInteger;



    }



}

