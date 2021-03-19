package warmups;

import util.Input;
import java.util.HashMap;
import java.util.Map;

    // TODO: I can't seem to start the application. Help!
// TODO: Even when it was running, it never let me enter in more than one student before exiting.
// TODO: The grade average is WAY too precise. It only needs to display to two decimal places.
// TODO: Why do I keep seeing information for Fred when I search for Cathy's info?
    public class GradesApplicationWarmup {

        private final Map<String, StudentWarmup> students;
        private final Input input;

        public GradesApplicationWarmup(Map<String, StudentWarmup> students, Input input) {
            this.students = students;
            this.input = input;
        }

        // Starts App
        public void init() {
            System.out.println("Welcome!");
            runInteraction();
        }

        // Abstracts the Part that Repeats
        private void runInteraction() {
            System.out.println(getStudentsList());
            System.out.println("\nWhat student would you like to see more information on?");
            String response = input.getString();
            if (students.containsKey(response)) {
                System.out.println(getStudentInfo(response));
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of " + response);
            }
            System.out.println("\nWould you like to enter a new response?");
            String userResponse = input.getString();
//            boolean willContinue = true; // needed to get user response and use in the if/else statement in to order to do recursion and keep running if user enters 'yes'
            if (userResponse.equalsIgnoreCase("yes")) {
                runInteraction();
            } else {
                System.out.println("\nGoodbye!");
            }
        }

        // Returns a message containing a list of students
        private String getStudentsList() {
            String output = "Here are the user names of our students:\n\n";
            for (Map.Entry<String, StudentWarmup> entry : students.entrySet()) {
                output += "|" + entry.getKey() + "| ";
            }
            return "\n" + output.trim();
        }

        // Returns a formatted message containing student information
        private String getStudentInfo(String username) {
            return String.format(
                    "%nName: %s - GitHub Username: %s%nCurrent Average: %.2f", // needed to change %f -> %.2f to format to 2 decimal spots
                    students.get(username).getName(),
                    username,
                    students.get(username).getGradeAverage());
        }

        // Used to populate the HashMap of students
        private static HashMap<String, StudentWarmup> createStudents() {

            HashMap<String, StudentWarmup> students = new HashMap<>();

            StudentWarmup s1 = new StudentWarmup("Fred");
            s1.addGrade(0);
            s1.addGrade(50);
            s1.addGrade(100);

            StudentWarmup s2 = new StudentWarmup("Cathy");
            s2.addGrade(50);
            s2.addGrade(50);
            s2.addGrade(75);

            StudentWarmup s3 = new StudentWarmup("Bob");
            s3.addGrade(80);
            s3.addGrade(20);
            s3.addGrade(100);

            students.put("fred123", s1);
            students.put("cathy123", s2); // had wrong student object being passed into it
            students.put("bob123", s3);

            return students;

        }

        public static void main(String[] args) {

            GradesApplicationWarmup ga = new GradesApplicationWarmup(createStudents(), new Input());
            ga.init();
        }
    }

