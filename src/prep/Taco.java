package prep;

public class Taco extends Food{

    private String typeOfTaco;
    private boolean hasSalsa;

    public Taco(String name, String description, int calories) throws IllegalArgumentException {
        super(name, description, calories);
    }

    public String getTypeOfTaco(){
        return typeOfTaco;
    }

    public void setTypeOfTaco(String typeOfTaco){
        this.typeOfTaco = typeOfTaco;
    }
}
