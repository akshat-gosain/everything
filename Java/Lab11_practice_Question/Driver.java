public class Driver {
    
    // permanent Employee
    PermanentEmployee p1 = new PermanentEmployee("John", 1, 1000, 100, 5);
    PermanentEmployee p2 = new PermanentEmployee("Mary", 2, 2000, 200, 10);

    // contract Employee
    ContractEmployee c1 = new ContractEmployee("Adam", 1, 1000, 5);
    ContractEmployee c2 = new ContractEmployee("Eve", 2, 2000, 10);

    public static void main(String[] args) {

        PermanentEmployee p1 = new PermanentEmployee("John", 1, 1000, 100, 5);
        PermanentEmployee p2 = new PermanentEmployee("Mary", 2, 2000, 200, 10);

        // contract Employee
        ContractEmployee c1 = new ContractEmployee("Adam", 1, 1000, 5);
        ContractEmployee c2 = new ContractEmployee("Eve", 2, 2000, 10);

        // Display details of permanent employees
        System.out.println("Permanent Employee Details");
        System.out.println(p1);
        System.out.println(p2);

        // Display details of contract employees
        System.out.println("Contract Employee Details");
        System.out.println(c1);
        System.out.println(c2);

    }
}
