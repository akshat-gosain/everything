import java.util.ArrayList;

/** Represents an order placed by a Customer in the restaurant */
public class Order {
    /** Stores the food and beverage items ordered by the customer. */ 
    public ArrayList<MenuItem> items;
    /**  Stores the customer to which the order belongs. */
    public Customer customer;

    /**
     * Sets customer and items
     * 
     * @param newCustomer Customer to which the order belongs to.
     */
    public Order(Customer newCustomer) {
        this.items = new ArrayList<MenuItem>();
        this.customer = newCustomer;
    }

    /**
     * Adds an item to the order.
     * 
     * @param item Menu item to be added to the items list.
     */
    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    /**
     * Generates the bill.
     * 
     * @return Total bill to be paid by customer which is sum of the price of all items in the order.
     */
    public Integer generateBill() { 
        Integer cost = 0;
        for (MenuItem item : this.items) {
            cost += item.getPrice();
        }
        return cost;
    }
}