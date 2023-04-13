package Baitap2;

public class Point3D extends Point2D{
    protected float z;
    public Point3D(){
        this.z=0;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float [] getXYZ(){
        float[]arr=new float[3];
        arr[0]=this.x;
        arr[1]=this.y;
        arr[2]=this.z;
        return arr;
    }

    @Override
    public String toString() {
        return " z = " + z +
                " x =" + x +
                " y= " + y;
    }
}
