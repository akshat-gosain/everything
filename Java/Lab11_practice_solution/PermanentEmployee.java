public class PermanentEmployee extends Employee{

    private double bonus;
    private int noOfYearsWorked;

    public PermanentEmployee(String name, int employeeId, double salary, double bonus, int noOfYearsWorked) {
        super(name, employeeId, salary);
        this.bonus = bonus;
        this.noOfYearsWorked = noOfYearsWorked;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus > 0) {
            this.bonus = bonus;
        }
    }

    public int getNoOfYearsWorked() {
        return noOfYearsWorked;
    }

    public double calculateSalary() {
        double salary = getSalary();
        double bonus = getBonus();
        int noOfYearsWorked = getNoOfYearsWorked();
        double newSalary = salary + (bonus * noOfYearsWorked);
        return newSalary;
    }

    public double calculateTotalCash() {
        double salary = getSalary();
        double bonus = getBonus();
        int noOfYearsWorked = getNoOfYearsWorked();
        double totalCash = ((2*salary + (noOfYearsWorked-1)*bonus)*bonus)/2; // Sum of first n terms of an AP
        return totalCash;
    }
    
    public String toString() {
        String name = getName();
        int employeeId = getEmployeeId();
        double salary = getSalary();
        double bonus = getBonus();
        int noOfYearsWorked = getNoOfYearsWorked();
        String employeeDetails = "Name: " + name + "\nEmployee ID: " + employeeId + "\nSalary: " + salary + "\nBonus: " + bonus + "\nNo. of years worked: " + noOfYearsWorked;
        return employeeDetails;
    }
}
