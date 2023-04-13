package Baith3dongvat;

public class Animal {
    protected double weight;
    protected double height;
    public Animal(){
        this.weight=0.0;
        this.height=0.0;
    }
    public Animal(double weight,double height){
        this.weight=weight;
        this.height=height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "  A Animal with weight  :  " + weight +
                "  and height  : " + height
              ;
    }
}
 class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        Animal animal1 = new Animal(5, 6);
        System.out.println(animal1);
        Animal animal2 = new Animal();
        animal2.setHeight(1);
        animal2.setWeight(10);
        System.out.println(animal2);
    }
}


