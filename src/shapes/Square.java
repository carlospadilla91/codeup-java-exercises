package shapes;

public class Square extends Rectangle{


    public Square(double side) {
        super(side, side);
        //super() is another way of saying new Rectangle()
    }

    //TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square

    @Override
    public double getArea(){
        System.out.println("Square getArea running...");
        return Math.pow(super.length, 2);
    }

    @Override
    public double getPerimeter(){
        System.out.println("Square getPerimeter running...");
        return 4 * super.length;
    }
}
