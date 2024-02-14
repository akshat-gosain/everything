import java.util.HashMap;
import java.util.Map;

/** Represents a menu containing information about beverage items. */
public class BeverageMenu implements Menu {
    /** Stores the items in the menu. Maps the name of the menu item to the MenuItem object.*/
    private Map<String, MenuItem> beverages;

    /**
     * Initializes beverages.
     */
    public BeverageMenu() {
        this.beverages = new HashMap<String, MenuItem>();
    }

    /**
     * Adds an item to the menu.
     * @param newItem Item to be added.
     */
    @Override
    public void addItem(MenuItem newItem) {
        this.beverages.put(newItem.getName(), newItem);
    }
    
    /**
     * Finds if the item is in the menu.
     * @param name Name of the item
     * @return beverage item if the item is in the menu, null otherwise.
     */
    @Override
    public MenuItem findItem(String name) {
        if (this.beverages.containsKey(name)) 
            return this.beverages.get(name);
        else
            return null;
    }
}