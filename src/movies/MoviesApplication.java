package movies;

import util.Input;

public class MoviesApplication {

    //TODO: Create a class named MoviesApplication that has a main method.

    //TODO: Give the user a list of options for viewing all the movies or viewing movies by category.

    //TODO: Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)

    //TODO: If a category is selected, only movies from that category should be displayed.

    //TODO: Your application should continue to run until the user chooses to exit.

    // this method prints all the movies and all categories
    public static void getMovieList(Movie[] movieList){
        for (Movie movie : movieList){
            System.out.printf("%s -- %s\n",movie.getName(),movie.getCategory());
        }
    }
    // this method prints movies based on passed in array of movies and specific category
    public static void getMovieList(Movie[] movieList, String category){
        for (Movie movie : movieList){
            if (movie.getCategory().equalsIgnoreCase(category)){
                System.out.printf("%s -- %s\n",movie.getName(),movie.getCategory());
            }
        }
    }


    public static void main(String[] args) {

        Input userInput = new Input();

        Movie[] movieList = MoviesArray.findAll(); //generates all movies


        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n");
        System.out.print("Enter your choice: ");
        int userInt = userInput.getInt();

        switch (userInt){
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                System.out.println("Here is a list of all the movies!\n");
                getMovieList(movieList);
                break;
            case 2:
                System.out.println("Here is a list of all animated movies!\n");
                getMovieList(movieList, "animated");
                break;
            case 3:
                System.out.println("Here is a list of all drama movies!\n");
                getMovieList(movieList, "drama");
                break;
            case 4:
                System.out.println("Here is a list of all horror movies!\n");
                getMovieList(movieList, "horror");
                break;
            case 5:
                System.out.println("Here is a list of all scifi movies!\n");
                getMovieList(movieList, "scifi");

        }
    }
}
