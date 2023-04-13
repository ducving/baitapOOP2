package Baitap1;

public class Cylinder extends Circle {
    protected double width;
    protected double length;
    public Cylinder(){
        super();
        this.width=0.0;
        this.length=0.0;
    }

    public Cylinder(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Cylinder(double radius, String color, double width, double length) {
        super(radius, color);
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
    public void getVolume(){
        System.out.println("Thể tích hình trụ là : "+3.12*radius*radius*length);
    }

    @Override
    public String toString() {
        return  " chiều dài : " + width +
                " Dường cao bằng :  " + length +
                " Bán kính hình tròn : " + radius +
                " Màu sắc : " + color ;
    }
}
class AppCylinder{
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder.getVolume();
        cylinder=new Cylinder(5.4,"tím",5.5,6.0);
        System.out.println(cylinder);
        cylinder.getVolume();
    }
}