package grades;

import inheritance.Ingredient;
import util.Input;

import java.awt.*;
import java.util.Collections;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        prompt();
    }

    public static HashMap<String, Student> getStudents(){

        HashMap<String, Student> students = new HashMap<>();

        Student c = new Student("Carlos");
        c.addGrade(95);
        c.addGrade(90);
        c.addGrade(86);

        Student s = new Student("Sarah");
        s.addGrade(93);
        s.addGrade(97);
        s.addGrade(88);

        Student m = new Student("Maggie");
        m.addGrade(90);
        m.addGrade(88);
        m.addGrade(92);

        Student p = new Student("Piper");
        p.addGrade(94);
        p.addGrade(90);
        p.addGrade(89);

        students.put("carlospadilla91", c);
        students.put("sarahjean326", s);
        students.put("maggierules", m);
        students.put("piper1234", p);

        return students;
    }

    public static String studentInfo(Student student, String key){
        return "Name: " + student.getName() + "\n" + "Github username: " + key + "\n" + "Average grade: " + student.getGradeAverage() + "\n" + student.getName() +"'s" + " grades: " + student.getGrades();
    }

    public static void displayUsernames(){
        HashMap<String, Student> students = getStudents();
        System.out.println("Here are the Github usernames of our students: ");
        students.forEach((k, v) -> System.out.print("|" + k + "| "));
        System.out.println();
        System.out.println();
    }

    public static void prompt(){

        HashMap<String, Student> students = getStudents();

        Input sc = new Input();

        boolean userContinue = true;

        do {
            System.out.println("Welcome!\n");

            displayUsernames();

            System.out.println("What student would you like to see more information on?");
            String userInput = sc.getString();

            if (students.containsKey(userInput)) {
                System.out.println("\n" + studentInfo(students.get(userInput), userInput) +"\n");
            } else {
                System.out.println("Sorry, no student found with the Github username of " + "'" + userInput + "'\n");
            }
            System.out.println("Would you like to see another student?");
            userInput = sc.getString();

            if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
                System.out.println("Goodbye and have a wonderful day!");
                userContinue = false;
            }
        }
        while(userContinue);
    }
}
