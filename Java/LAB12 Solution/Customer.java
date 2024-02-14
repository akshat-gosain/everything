import java.util.ArrayList;

/** Represents a Customer dining in the restaurant. */
public class Customer {

    /** Stores the name of the customer. */
    private String name;
    /** Stores the orders placed by the customer in past. */
    private ArrayList<Order> orders;
    
    /**
     * Sets name and initialises orders.
     * 
     * @param name Name of the customer.
     */
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<Order>();
    }

    /**
     * Gets name of the customer.
     * 
     * @return Name of customer.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the tier status of the customer.
     * Tier status is calculated by the total money paid by customer over all orders.
     * 
     * @return 0 if total money paid is less than 1000, 1 if the toal money paid is less than 2000, 2 otherwise.
     */
    public Integer getTierStatus() {

        Integer totalCost = 0;
        for (Order o: this.orders) {
            totalCost += o.generateBill();
        }

        if (totalCost < 1000) return 0;
        else if (totalCost < 1500) return 1;
        else return 2;
    }

    /**
     * Adds the order to the orders list
     * 
     * @param newOrder Order to be added against the customer.
     */
    public void addOrder(Order newOrder) {
        this.orders.add(newOrder);
    }

    /**
     * Represents the customer.
     * 
     * @return The name of the customer.
     */
    public String toString() {
        return this.name;
    }
}
