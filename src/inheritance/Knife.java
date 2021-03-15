package inheritance;

public class Knife extends KitchenTools{

        public boolean isSharp;

        public String typeOfKnife;

        public Knife(String name, boolean isSharp){
            super(name);
            this.isSharp = isSharp;
        }

        public void cut(){
            System.out.println("You cut something!");
        }
        public void spread(){
            System.out.println("Nice spreading!");
        }

        public void putAway(){
            System.out.println("You've put your knife away.");
        }

        public void washDish(){
            System.out.println("You washed your knife!");
        }
}
