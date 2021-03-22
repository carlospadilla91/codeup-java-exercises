package prep;

import java.util.Collection;

public class Taco extends Food implements Consumable{

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

    public boolean getHasSalsa(){
        return hasSalsa;
    }

    public void setHasSalsa(boolean hasSalsa){
        this.hasSalsa = hasSalsa;
    }

    public void consume(String name){
        System.out.println("Crunch...crunch..." + name + " is amazing.");
    }

    @Override
    public Collection<String> getFullDescription() {
        return null;
    }
}
