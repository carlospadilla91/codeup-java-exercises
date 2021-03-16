package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Quadrilateral myShape;

        myShape = new Rectangle(4, 5);

        myShape.getPerimeter();
        myShape.getArea();


        myShape = new Square(5);

        myShape.getPerimeter();
        myShape.getArea();

    }
}
