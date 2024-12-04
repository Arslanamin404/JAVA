package Employee;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee() {
        id = 0;
        name = "";
        salary = 0.0;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "EMP-ID: " + this.id +
                "\nEmployee-Name: " + this.name +
                "\nEmployee-Salary: " + this.salary;
    }

}
