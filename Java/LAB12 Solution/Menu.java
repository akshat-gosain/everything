/** Represents the blueprint for food or beverage menu. */
public interface Menu {
    /**
     * Adds an item to the menu.
     * @param newItem Item to be added.
     */
    public void addItem(MenuItem newItem);

    /**
     * Finds if the item is in the menu.
     * @param name Name of the item
     * @return menu item if the item is in the menu, null otherwise.
     */
    public MenuItem findItem(String name);
}
