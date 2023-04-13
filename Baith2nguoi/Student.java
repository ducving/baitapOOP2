package Baith2nguoi;

public class Student extends People {
    private String className;

    public Student(){
        super();
        this.className = "D101_C1K14";
    }

    public Student(String className){
        super();
        this.className = className;
    }

    public Student(String name, boolean gender, int age, String className) {
        super(name,gender,age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void study() {
        System.out.println("Learning code.......");
    }

    @Override
    public String toString() {
        return "A student with class name: "
                + getClassName()
                + " ,which is a subclass of "
                + super.toString();
    }

} class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student = new Student("D101_C2K14");
        System.out.println(student);
        student = new Student("Ta Van A", false, 23, "IBSK1D1");
        System.out.println(student);
    }
}



