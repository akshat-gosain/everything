public class ContractEmployee extends Employee{
    
    private int noOfYearsWorked;

    public ContractEmployee(String name, int employeeId, double salary, int noOfYearsWorked) {
        super(name, employeeId, salary);
        this.noOfYearsWorked = noOfYearsWorked;
    }

    public int getNoOfYearsWorked() {
        return noOfYearsWorked;
    }

    public void setNoOfYearsWorked(int noOfYearsWorked) {
        if (noOfYearsWorked > 0) {
            this.noOfYearsWorked = noOfYearsWorked;
        }
    }

    public double calculateSalary() {
        return getSalary();
    }

    public double calculateTotalCash() {
        double salary = getSalary();
        int noOfYearsWorked = getNoOfYearsWorked();
        double totalCash = salary * noOfYearsWorked;
        return totalCash;
    }

    public String toString() {
        String name = getName();
        int employeeId = getEmployeeId();
        double salary = getSalary();
        int noOfYearsWorked = getNoOfYearsWorked();
        String employeeDetails = "Name: " + name + "\nEmployee ID: " + employeeId + "\nSalary: " + salary + "\nNo. of years worked: " + noOfYearsWorked;
        return employeeDetails;
    }

}
