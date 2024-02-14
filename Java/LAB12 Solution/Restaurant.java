import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/** Represents the restaurant. */
public class Restaurant {
    /** Stores the Orders in the Restaurant. Each table can hold one Order. */
    private ArrayList<Order> tables;
    /** Stores all the staff members (cooks and bartenders). */
    private ArrayList<Staff> staffMembers;
    /** Stores normal food menu. */
    public FoodMenu foodMenu;
    /** Stores kids food menu. */
    public FoodMenu kidsFoodMenu;
    /** Stores mocktail beverage menu. */
    public BeverageMenu mocktailMenu;
    /** Stores cocktail beverage menu. */
    public BeverageMenu cocktailMenu;
    /** Stores the next food to be prepared by a cook in the order of their arrival (queue). */
    public Queue<MenuItem> foodQueue;
    /** Stores the next beverage to be prepared by a bartender in the order of their arrival (queue). */
    public Queue<MenuItem> beverageQueue;

    /**
     * Initializes all fields. 
     * All tables must have a null order (to represent unoccupied table).
     * @param numTables Number of tables in restaurant.
     */
    public Restaurant(int numTables) {
        this.tables = new ArrayList<Order>();
        for (int i=0; i<numTables; i++)
            this.tables.add(null);

        this.staffMembers = new ArrayList<Staff>();
        this.foodMenu = new FoodMenu();
        this.kidsFoodMenu = new FoodMenu();
        this.mocktailMenu = new BeverageMenu();
        this.cocktailMenu = new BeverageMenu();
        this.foodQueue = new LinkedList<>();
        this.beverageQueue = new LinkedList<>();
    }

    /**
     * Adds a staff member to staffMembers.
     * @param newStaff Staff to be added.
     */
    public void addStaff(Staff newStaff) {
        this.staffMembers.add(newStaff);
    }

    /**
     * Assigns a table to an order. 
     * Iterates over all tables and assigns newOrder to an unoccupied table (null).
     * HINT: If a null entry is found, set it as newOrder and call addOrder to place the order with the restaurant
     * 
     * @param newOrder New Order of the table.
     * @return true if unoccupied table found, false otherwise.
     */
    public Boolean assignTable(Order newOrder) {
        for (int i=0; i<this.tables.size(); i++)
            if (this.tables.get(i) == null) {
                this.tables.set(i, newOrder);
                this.addOrder(newOrder);
                return true;
            }
        return false;
    }

    /**
     * Adds a new order in the restaurant. 
     * Iterate over all items in the order and place them in the appropriate queue (food or beverage).
     * HINT 1: There a re multiple food menus, but same queue for all food items. Same for beverages.
     * HINT 2: Make sure that the order is also added to the orders of the customer.
     * 
     * 
     * @param newOrder New order added in the restaurant.
     */
    private void addOrder(Order newOrder) {
        for (MenuItem item: newOrder.items) {
            if (this.foodMenu.findItem(item.getName()) != null
                    || this.kidsFoodMenu.findItem(item.getName()) != null) {
                this.foodQueue.add(item);
            } else if (this.cocktailMenu.findItem(item.getName()) != null 
                    || this.mocktailMenu.findItem(item.getName()) != null) {
                this.beverageQueue.add(item);
            }
        }

        newOrder.customer.addOrder(newOrder);
    }

    /**
     * Starts preparing the first item in the foodQueue if cook is available.
     * HINT 1: Use the isAvailable() method to check if the cook is available. 
     * HINT 2: What if queue is empty?
     * HINT 3: Make sure the food item is removed if cook is available.
     * 
     * @param time Current time
     * @return return food item if the food preparation has started, null otherwise.
     */
    public MenuItem startPreparingFood(Integer time) {
        
        if (foodQueue.isEmpty())
            return null;

        for (Staff staff: this.staffMembers) {
            if (staff instanceof Cook && staff.isAvailable(time, foodQueue.peek())) {
                return foodQueue.remove();
            }
        }
        return null;
    }

    /**
     * Starts preparing the first item in the beverageQueue if bartender is available.
     * HINT 1: Use the isAvailable() method to check if the bartender is available. 
     * HINT 2: What if queue is empty?
     * HINT 3: Make sure the beverage item is removed if bartender is available.
     * 
     * @param time Current time
     * @return return beverage item if the food preparation has started, null otherwise.
     */
    public MenuItem startPreparingBeverage(Integer time) {
        
        if (beverageQueue.isEmpty())
            return null;

        for (Staff staff: this.staffMembers) {
            if (staff instanceof Bartender && staff.isAvailable(time, beverageQueue.peek())) {
                return beverageQueue.remove();
            }
        }
        return null;
    }

    /**
     * Frees up a table. 
     * Iterates over all tables and and checks if oldOrder matches the order at a table.
     * HINT 1: 2 orders are same if their customer name is same.
     * 
     * @param oldOrder Order to be removed/ completed.
     * @return Bill amount if the order is found at a table, -1 otherwise.
     */
    public Integer freeTable(Order oldOrder) {
        for (int i=0; i<this.tables.size(); i++) {
            if (this.tables.get(i) != null && oldOrder.customer.getName() == this.tables.get(i).customer.getName()) {
                this.tables.set(i, null);
                return oldOrder.generateBill();
            }
        }
        return -1;
    }
}
