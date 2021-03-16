package animals.felidae;

public class Cat extends Felidae{

    private final boolean isPottyTrained;
    public Cat(String size, String commonName, String subSpecies, String sound, boolean isPottyTrained){
        super(size, commonName, subSpecies, sound);
        this.isPottyTrained = isPottyTrained;
    }

    public void printDelimiter(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void printIsPottyTrained(){
        System.out.printf("Potty Trained: %s\n", this.isPottyTrained);
    }

    public void printDetails(){
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printSize();
        printDelimiter();
        printIsPottyTrained();
    }
}
