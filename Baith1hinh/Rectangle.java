package Baith1hinh;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.width=1;
        this.length=1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
       return width* this.length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" +
                 width +
                " and length=" + length +
                " which is a subclass of"
                +super.toString()
                ;
    }
}
 class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle.getArea();
        System.out.println(rectangle.getArea());
        rectangle = new Rectangle("2.5", true, 4, 5);
        System.out.println(rectangle);
    }
}
