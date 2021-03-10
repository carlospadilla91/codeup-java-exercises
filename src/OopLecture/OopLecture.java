package OopLecture;

public class OopLecture {

    public static void main(String[] args) {


        //BASIC SYNTAX FOR CREATING A NEW OBJECT SPECIFICALLY A PERSON OBJECT
//        Person p1 = new Person();
//        p1.firstName = "Carlos";
//        p1.lastName = "Padilla";
//        System.out.println(p1.sayHello());
////        p1.age = 29;
//        Person otherP1Name = p1;
//        System.out.printf("%s %s age: %s", p1.firstName, p1.lastName, p1.age);

//        Person p2 = new Person();
//        p2.firstName = "Sarah";
////        System.out.println(p2.firstName);
//
//        Person p3 = new Person();
//        p3.firstName = "Penelope";
////        System.out.println(p3.firstName);
//
//        Person p4 = new Person();
//        p4.firstName = "Olivia";
////        System.out.println(p4.firstName);
//
//        System.out.printf("Hello from %s, %s, %s and %s", p1.firstName,p2.firstName,p3.firstName,p4.firstName);


//        int pipersAgeInDogYears = 3;
//        int pipersAgeInHumansYears = (int) DogHelper.humanToDogYears(pipersAgeInDogYears);
//        System.out.println(pipersAgeInHumansYears);



//        Person bestDrummerAlive = new Person();
//        bestDrummerAlive.name = "Neil Peart";
//
//        Person bestSinger = new Person();
//        bestSinger.name = "Weird Al";
//
//        Person.worldPopulation += 1;
//        System.out.println(bestDrummerAlive.name);
//        System.out.println(Person.worldPopulation);

        Student s1 = new Student("Carlos", 90.00);

        //s1.grade; DON'T DO THIS BC 'grade' is private in Student Class
        System.out.println(s1.shareGrade());
        s1.changeGrade(99.00);
        System.out.println(s1.shareGrade());


        /* ================================= OOP INTRO

-- UP TO NOW --

 - using functions/methods to group together steps for a program to work


-- DEFINITION --

  OOP - Object-oriented programming

  - A programming paradigm where state (data/properties) and behavior (functionality/methods)
    are grouped together (often into objects)
  - Objects in Java are created from classes (a blueprint for an object/instance)


-- ADVANTAGES OF OOP --

  Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:

  - implementation details can be abstracted away making code more readable (Abstraction)
  - restriction of access to various levels of abstraction preventing data inconsistencies (Encapsulation)
  - duplication is minimized through inheritance hierarchies (Inheritance)
  - flexible code where multiple implementations may be swapped out behind a common interface (Polymorphism)




-- THE FOUR PILLARS OF OOP --

  1. Abstraction - keep it clean
  2. Encapsulation - keep it contained
  3. Inheritance - keep it DRY
  4. Polymorphism - keep it versatile

  https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219

  Today we will focus on Abstraction and Encapsulation.


-- CONCEPTS COVERED --

  - how to create custom classes and objects from these classes
  - defining and using instance and static fields
  - how to control class constructors
  - using the "this" keyword
  - controlling encapsultation with visibility modifiers

         */

    }
}
