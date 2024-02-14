/** Represents a staff memeber who prepares food or beverage items. */
public abstract class Staff {
    /** Stores the name of the staff member (cook or bartender). */
    private String name;

    /** Sets staff name
     * 
     * @param name Name of staff member.
     */
    public Staff(String name) {
        this.name = name;
    }

    /**
     * Tells if the staff is available (or free) for preparing a menu item.
     * 
     * @param time Current time.
     * @param item Item to prepare.
     * @return true if available else false..
     */
    public abstract Boolean isAvailable(Integer time, MenuItem item);

    /**
     * Represents the staff member.
     */
    public String toString() {
        return this.name;
    }
}
