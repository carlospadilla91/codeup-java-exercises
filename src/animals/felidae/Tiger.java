package animals.felidae;

public class Tiger extends Felidae{

    private final boolean isEndangered;
    public Tiger(String size, String commonName, String subSpecies, String sound, boolean isEndangered){
        super(size, commonName, subSpecies, sound);
        this.isEndangered = isEndangered;
    }

    @Override
    public void printDelimiter() {
        System.out.println("------------------------");
    }

    private String getEndangeredStatus(){
        if (isEndangered){
            return "No";
        }else{
            return "Yes";
        }
    }

    public void printEndangeredStatus(){
        System.out.printf("Endangered: %s\n", getEndangeredStatus());
    }

    public void printDetails(){
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printSize();
        printDelimiter();
        printEndangeredStatus();
    }
}
