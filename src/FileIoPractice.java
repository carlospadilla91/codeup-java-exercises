import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIoPractice {

    public static void deleteEntry(String name, Path p, List<String> list){
        name = name.toLowerCase();
    }

    public static void main(String[] args) {

        //TODO:
        //- write code in the main method that prints the following messages:
        //“Justin works at Codeup.”
        //“Casey works at Codeup.”
        //“Ry works at Codeup.”
        //“David works at Codeup.”

        Path p = Paths.get("fileIo", "people.txt");

        List<String> names = new ArrayList<>();

        try {
          names = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names); // prints out all names in 'people.txt'

        for (String name : names){
            System.out.println(name + " works at Codeup");
        }

//        List<String> newNames = new ArrayList<>();
//        newNames.add("Corey");
//        newNames.add("Sam");
//        newNames.add("Audi");
//        newNames.add("Carlos");
//
//        // this is replacing the og names put in people.txt with newNames in 'people.txt'
//        try{
//            Files.write(p, newNames);
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        //TODO:
        //- create a static method, `deleteEntry`, that takes in the name of someone (a string) and when invoked, rewrites a new list to the `people.txt` file
        //  with all entries except the passed in name (bonus: make the name to delete case insensitive)



    }
}
