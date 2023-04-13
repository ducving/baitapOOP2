package Baith2nguoi;

public class Employee extends People {
    protected String enterprise;
    public Employee(){
        this.enterprise="CodeGym";
    }

    public Employee(String enterprise) {
        this.enterprise = enterprise;
    }

    public Employee(String name, boolean gender, int age, String enterprise) {
        super(name, gender, age);
        this.enterprise = enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public void work(){
        System.out.println("Working..........");
    }

    @Override
    public String toString() {
        return "   A employee work at: " +
                  enterprise +
               super.toString();
    }

}
   class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
        employee = new Employee("Nguyen Thi A", true, 21, "FPT");
        System.out.println(employee);
        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);
    }
}
