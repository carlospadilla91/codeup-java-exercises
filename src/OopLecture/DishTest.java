package OopLecture;

public class DishTest {

    public static void main(String[] args) {


        Dish dish1 = new Dish("Spaghetti aglio e olio",1400,true);
//        dish1.costInCents = 1400;
//        dish1.nameOfDish = "Spaghetti aglio e olio";
//        dish1.wouldRecommend = true;
//        dish1.printSummary();
//        DishTools.shoutDishName(dish1);
//        DishTools.analyzeDishCost(dish1);
//        DishTools.flipRecommendation(dish1);

        System.out.println(dish1.getNameOfDish());
//        System.out.println(dish1.nameOfDish);

    }
}
