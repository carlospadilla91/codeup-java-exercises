public class Employee extends Person{

    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }



    public static void main(String[] args) {

//        Employee emp = new Employee("Peter Gibbons", "IT");
//        System.out.println(emp.getName() + "works in " + emp.getDepartment());

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }
}
