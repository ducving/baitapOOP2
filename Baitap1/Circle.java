package Baitap1;

public class Circle {
    protected double radius;
    protected String color;
    public Circle(){
        this.radius=0.0;
        this.color="xanh";
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void getPerimeter(){
        System.out.println("Chu vi hình tròn là : "+radius*radius*2);
    }
    public void getArea(){
        System.out.println("bán kính hình tròn là"+ radius*radius*3.14);
    }

    @Override
    public String toString() {
        return " Bán kính hình tròn là =" + radius +
                "  màu hình trong : " + color ;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle.getPerimeter();
        circle.getArea();
        circle=new Circle(5.0,"do");
        System.out.println(circle);
        circle.getPerimeter();
        circle.getArea();
    }
}