package Baitap3;

public class MoveablePoint extends Point {
    protected float xSpeed;
    protected float ySpeed;
    public MoveablePoint(){
        this.xSpeed=0;
        this.ySpeed=0;
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float [] getXYZ(){
        float[]arr=new float[2];
        arr[0]=this.xSpeed;
        arr[1]=this.ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return  " xSpeed = " + xSpeed +
                " ySpeed = " + ySpeed +
                " x = " + x +
                " y = " + y ;
    }
    public MoveablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
