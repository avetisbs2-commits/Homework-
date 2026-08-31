package system_design;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public Employee(String name) {
        this(name, 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee name '" + name + "', salary " + salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Hayk", 550000.0);
        Employee emp2 = new Employee("Alex");

        System.out.println(emp1);
        System.out.println(emp2);
    }
}