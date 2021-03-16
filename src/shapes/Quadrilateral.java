package shapes;

public abstract class Quadrilateral implements Shape {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

    public void getArea(){
        System.out.println(this.length * this.width);
    }

    public void getPerimeter(){
        System.out.println((this.length * 2) + (this.width * 2));
    }
}
