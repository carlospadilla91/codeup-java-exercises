package OopLecture;

class Student {

    // ======================== slide 8 (constructors)

//        public String name;
//        public String cohort;
//////
//        public Student(String studentName) {
//            name = studentName;
//            cohort = "Unassigned";
//        }
////
//        public Student(String studentName, String assignedCohort) {
//            this.name = studentName;
//            this.cohort = assignedCohort;
//        }
//
//
//
//
//    public static void main(String[] args) {
//
//        Student s1 = new Student("Carlos", "Luna");
//        Student s2 = new Student("Sarah");
//        System.out.println(s2.name);
//        System.out.println(s2.cohort);
//        System.out.println(s1.cohort);
//        System.out.println(s1.name);
//    }

    // ======================== slide 9 (this keyword)

//        public String name;
//        public String cohort;
//
//        public Student(String name) {
//            this(name, "Unassigned");
//        }
//
//        public Student(String name, String cohort) {
//            this.name = name;
//            this.cohort = cohort;
//        }
//
//        public String sayHello() {
//            return "Hello from " + this.name + "!";
//        }


    // ======================== slide 10 (visibility)

        public String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public double shareGrade() {
            return grade;
        }

        public void changeGrade(double grade) {
            this.grade = grade;
        }
//
}