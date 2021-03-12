public class Program {

    public static void main(String[] args) {

//        Xmen.attack();

        Xmen wolverine = new Xmen("Wolverine", "Berserker Barrage"); // creating new instance of the Xmen Class
//        wolverine.attack();
        Xmen cyclopse = new Xmen("Cyclopse", "Eye Beam Attack");
//        cyclopse.attack();
//        wolverine.attack();
//        wolverine.attack();
        Xmen[] xmens = new Xmen[]{wolverine, cyclopse}; // assigning the two new instances created above into new array
//
        for (Xmen xmen : xmens){  // loops through each element of xmens array and prints out message from mutantAttack method()
            xmen.mutantAttack();
        }
    }
}
