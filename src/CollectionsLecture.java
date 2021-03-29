import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsLecture {

    public static void main(String[] args) {

        //TODO: create ArrayList and play with it and different ways to manipulate it

//        List<String> names = new ArrayList<>();
//        names.add("Carlos");
//        names.add("Sarah");
//        names.add("Maggie");
//        names.add("Piper");
//
//        System.out.println(names);
//
//        System.out.println(names.size());
//        System.out.println(names.get(2));
//
//        names.remove(0);
//        System.out.println(names);
//
//        names.add(3, "Carlos");
//        System.out.println(names);
//        names.set(3, "Penelope"); // replaced "Carlos" with "Penelope" with .set method
//        System.out.println(names);
//        for (String str : names){       // prints out each name in the array list
//            System.out.println(str);
//        }

        // ----------------------------- Array Lists

        // creating Array Lists

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
//
//        List<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));

        // peeking into list

//        System.out.println(numbers);
//        System.out.println(names);


        // get elements

//        System.out.println(numbers.get(2));
//        System.out.println(numbers.get(5));


        // adding & editing elements

//        numbers.add(20);
//        numbers.add(0, 21); // we can add at specific index of 0
//        numbers.add(10, 22); // error bc index of 10 does not exist
//        System.out.println(numbers);


        // removing elements

//        System.out.println(names);
//        names.remove(0); // we can remove object with specific index
//        names.remove("Cindy"); // we can also remove with the specific object
//        System.out.println(names);


//        numbers.remove(3);
//        numbers.remove(Integer.valueOf(3));
//        System.out.println(numbers);


        // reordering list

//        Collections.sort(numbers);
//        Collections.reverse(numbers);
//        System.out.println(numbers);


        // info about list and getting elements

        System.out.println(numbers.size());
//        System.out.println(numbers.indexOf(3));
//        System.out.println(numbers);
//        System.out.println(numbers.indexOf(105));
//
//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("medium");
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("dark");
//        System.out.println(roasts);
//        System.out.println(roasts.contains("dark"));
//        System.out.println(roasts.contains("espresso"));
//        System.out.println(roasts.lastIndexOf("medium"));
//        System.out.println(roasts.isEmpty());
//
//        ArrayList<String> roast = roasts;
//        System.out.println(roast == roasts);


        // ----------------------------- Hash Maps

//        Map<String, String> usernames = new HashMap<>();
//
//        usernames.put("Carlos", "cpadilla39");
//        usernames.put("Sarah", "sarahjean326");
//        usernames.put("Maggie", "maggierules");
//        System.out.println(usernames); // this is printing out Sarah, Maggie then Carlos...Should it not be Carlos first?

        // creating hash maps
//        Map<String, String> usernames = new HashMap<>();
//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Luis", "MontealegreLuis");
//        usernames.put("Zach", "zgulde");
//        usernames.put("Fernando", "fmendozaro");
//        usernames.put("Justin", "jreich5");
//        System.out.println(usernames);

        // getting values from and info about hash map
//        System.out.println(usernames);
//        System.out.println(usernames.get("Justin"));
//        System.out.println(usernames.get("Phillip"));
//        System.out.println(usernames.get("Justin"));
//        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
//        System.out.println(usernames.containsKey("Luis"));

        // updating hash maps

//        usernames.put("Ryan", "rorsinger");
//        System.out.println(usernames);
//        usernames.put("Ryan", "Test");
//
//        usernames.putIfAbsent("Zach", "coderdude24");
//        usernames.replace("Ryan", "torvalds"); // same as put
//        System.out.println(usernames);

        // removing pairs from hash map

//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames);
//        System.out.println(usernames);
//        usernames.clear();
//        System.out.println(usernames);
//        System.out.println(usernames.isEmpty());


    }

}