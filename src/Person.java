public class Person {

    private String name;

    public String getName(){
        return name;
//TODO: return the person's name
    }

    public void setName(String name){
        this.name = name;
//TODO: change the name property to the passed value
    }
    public void sayHello(){
        System.out.printf("Hello, %s", this.name);
//TODO: print a message to the console using the person's name
    }

    //TODO: The class should have a constructor that accepts a `String` value and set the person's name to the passed string.
    public Person(String name){
        setName(name);
    }

    public static void main(String[] args) {
//        Person p1 = new Person("Carlos");
//        System.out.println(p1.getName());
//        p1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // Jane
//        System.out.println(person2.getName()); // Jane

    }
}
