// Abstract class representing an Employee
abstract class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Abstract method to calculate the salary
    abstract double calculateSalary();

    // Abstract method to calculate the total cash
    abstract double calculateTotalCash();

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display method for common employee details
    public abstract String toString();
}
