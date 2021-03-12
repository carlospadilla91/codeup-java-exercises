public class Xmen {

    private String name;
    private String power;

    // getter for name
    public String getName() {
        return this.name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter for power
    public String getPower() {
        return this.power;
    }

    // setter for power
    public void setPower(String power) {
        this.power = power;
    }

    //constructor
    public Xmen(String _name, String _power) {
        this.name = _name;
        this.power = _power;
    }


//    public static void attack(){
//        if (getName() == null || getPower() == null){
//            System.out.println("No Xmen to attack");
//        } else {
//            System.out.println(getName() + " attacks the enemy with " + getPower());
//        }
//    }

    public void mutantAttack(){
        if (getName() == null || getPower() == null){
            System.out.println("No Xmen to attack");
        } else {
            System.out.println(getName() + " attacks the enemy with " + getPower());
        }
    }
}
