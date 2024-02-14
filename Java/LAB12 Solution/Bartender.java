/** Represents a Bartender who prepares beverages. */
public class Bartender extends Staff {
    /** Stores the time (in future) when the bartender will be free. */
    public Integer timeBartenderFree;

    /**
     * Sets name and timeBartenderFree.
     * 
     * @param name Name of the bartender.
     */
    public Bartender (String name) {
        super(name);
        this.timeBartenderFree = 0;
    }

    /**
     * Tells if the bartender is available (or free) for preparing a beverage.
     * If the bartender is free then the bartender begins preparing the beverage.
     * 
     * @param time Current time.
     * @param item Beverage to be prepared. 
     * @return true if bartender is free else false.
     */
    @Override
    public Boolean isAvailable(Integer time, MenuItem item) {
        if (this.timeBartenderFree < time)  {
            this.timeBartenderFree = time + item.getprepTime();
            return true;
        } else 
            return false;
    }
}
