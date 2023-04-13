package Baitap3;

public class main {
    public static void main(String[] args) {
        Point point=new Point(2,4);
        System.out.println(point);
        MoveablePoint moveablePoint=new MoveablePoint(2,3,3,2);
        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
