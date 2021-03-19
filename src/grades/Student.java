package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // private property for student name
    private String name;
    // private array list for grades
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // NON STATIC METHODS FOR STUDENT INSTANCES

    // returns the student's name
    public String getName(){
        return this.name;
    }
    public List<Integer> getGrades(){
        return this.grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }


    public static void main(String[] args) {

        Student c = new Student("Carlos");
        Student s = new Student("Sarah");
        Student m = new Student("Maggie");
        Student p = new Student("Piper");
        System.out.println(c.getName());
        c.addGrade(95);
        c.addGrade(90);
        c.addGrade(86);
        System.out.println(c.grades);
        System.out.println(c.getGradeAverage());
        System.out.println(s.getName());
        s.addGrade(93);
        s.addGrade(97);
        s.addGrade(88);
        System.out.println(s.grades);
        System.out.println(s.getGradeAverage());
        m.addGrade(90);
        m.addGrade(88);
        m.addGrade(92);
        p.addGrade(94);
        p.addGrade(90);
        p.addGrade(89);


    }
}
