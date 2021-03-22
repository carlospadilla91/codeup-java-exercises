package prep;

public class App {

    public static void main(String[] args) {

        try {
            Food dish = new Food("", "pasta", 1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Food dish = new Food("fdas", "", 1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Food dish = new Food("fdas", "pasta", -1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Food taco = new Taco("Chorizo and egg taco", "Mixed chorizo with egg", 150);

        taco.consume(taco.getName());
    }
}
