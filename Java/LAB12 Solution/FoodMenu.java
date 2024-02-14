import java.util.HashMap;
import java.util.Map;

/** Represents a menu containing information about food items. */
public class FoodMenu implements Menu {
    /** Stores the items in the menu. Maps the name of the menu item to the MenuItem object. */
    private Map<String, MenuItem> food;

    /**
     * Initializes food.
     */
    public FoodMenu() {
        this.food = new HashMap<String, MenuItem>();
    }

    /**
     * Adds an item to the menu.
     * @param newItem Item to be added.
     */
    @Override
    public void addItem(MenuItem newItem) {
        this.food.put(newItem.getName(), newItem);
    }

    /**
     * Finds if the item is in the menu.
     * @param name Name of the item
     * @return food item if the item is in the menu, null otherwise.
     */
    @Override
    public MenuItem findItem(String name) {
        if (this.food.containsKey(name)) 
            return this.food.get(name);
        else
            return null;
    }
}
