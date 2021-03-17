package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

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

        System.out.println(students);

    }
}
