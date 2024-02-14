/** Represents a food or beverage item in a menu. */
public class MenuItem {
    /** Stores the name of the item. */
    private String name;
    /** Stores the price of the item. */
    private Integer price;
    /** Stores the time it will take a staff member to prepare it. */
    private Integer prepTime;
    
    /**
     * Sets name, price and prepTime.
     * 
     * @param name Name of the item.
     * @param price Price of the item.
     * @param prepTime Preparation time of the item.
     */
    public MenuItem(String name, Integer price, Integer prepTime) {
        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
    }

    /**
     * Gets name.
     * @return Name of the item.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets price.
     * @return Price of the item.
     */
    public Integer getPrice() {
        return this.price;
    }

    /**
     * Gets prepTime.
     * @return Name of the prepTime.
     */
    public Integer getprepTime() {
        return this.prepTime;
    }

    /**
     * Represents the item.
     * 
     * @return The name of the item.
     */
    public String toString() {
        return this.name;
    }
}
