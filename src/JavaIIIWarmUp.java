import java.util.Locale;

public class JavaIIIWarmUp {

    public static boolean sameFirstAndLast(String str) {
      char first = str.toLowerCase().charAt(0);
      char last = str.toLowerCase().charAt(str.length() - 1);
      return first == last;
    };

    public static void main(String[] args) {

        System.out.println(sameFirstAndLast("Bob"));
        System.out.println(sameFirstAndLast("Carlos"));

    }
}
