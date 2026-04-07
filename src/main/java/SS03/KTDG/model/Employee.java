package SS03.KTDG.model;

public class Employee {
    private int id;
    private String fullname;
    private String department;
    private double salary;

    public Employee() {}

    public Employee(int id, String fullname, String department, double salary) {
        this.id = id;
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
