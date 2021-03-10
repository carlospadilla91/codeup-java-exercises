package BurgerExercise;

public class BurgerTester {

    public static void main(String[] args) {

        BurgerTools burger = new BurgerTools();
        burger.mostPopularTopping = "cheese";
        burger.temperatureWhenCooked = 145;
        burger.averageDaysBeforeExpiration = 2;

        BurgerTools.grill();

        System.out.printf("The most popular topping on a burger is %s, I like it cooked to %s and it usually expires in %s days",burger.mostPopularTopping,burger.temperatureWhenCooked,burger.averageDaysBeforeExpiration);
    }
}
