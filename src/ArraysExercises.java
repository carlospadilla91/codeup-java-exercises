import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // this will shows us the array reference ID
//        System.out.println(Arrays.toString(numbers)); // this will show us the actual elements in side an array

        //TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] people = new Person[3]; // creating a new array with length of 3
        people[0] = new Person("Carlos");
        people[1] = new Person("Sarah");
        people[2] =  new Person("Padilla");
        System.out.println(Arrays.toString(people));

        for (Person person : people){
            System.out.println(person.getName());
        }

        //TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


        System.out.println(Arrays.toString(addPerson(people, new Person("Noriega"))));



    }
    public static Person[] addPerson(Person[] people, Person person){
        Person[] newArr = Arrays.copyOf(people, people.length + 1);
        Arrays.fill(newArr, person);
        return newArr;
    }



}
