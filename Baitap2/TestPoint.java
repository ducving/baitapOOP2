package Baitap2;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(3,5);
        Point3D point3D=new Point3D(3,4,7);
        System.out.println(point2D);
        point2D.setXY(7,9);
        System.out.println(point2D);
        System.out.println("------------------------");
        System.out.println(point3D);
        point3D.setXYZ(5,8,3);
        System.out.println(point3D);
    }
}
