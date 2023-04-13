package Baith3dongvat;

public class Cat extends Animal{
    protected double age;
    public Cat(){
        super();
        this.age=1.0;

    }

    public Cat(double age) {
        super();
        this.age = age;
    }

    public Cat(double weight, double height, double age) {
//        su dung ham co tham so cua lop cha
        super(weight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public String sound(){
        return "meo meo ";
    }
    public void eat(){
        System.out.println("Mouse!!!");
    }

    @Override
    public String toString() {
        return "A Cat with age :" + age +
                " which is a subclass of : "+
                super.toString();
    }
}
 class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        cat = new Cat(3.5,4.4,6.6);
        System.out.println(cat);
        cat = new Cat(3.5, 5, 10);
        System.out.println(cat);
    }
}


