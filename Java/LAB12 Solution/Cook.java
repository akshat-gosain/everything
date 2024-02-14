/** Represents a Cook who prepares food. */
public class Cook extends Staff {
    
    /** Stores the time (in future) when stove1 will be free. */
    private Integer timeStove1Free;
    /** Stores the time (in future) when stove2 will be free. */
    private Integer timeStove2Free;

    /**
     * Sets name, timeStove1Free, timeStove2Free.
     * 
     * @param name Name of the cook.
     */
    public Cook(String name) {
        super(name);
        this.timeStove1Free = 0;
        this.timeStove2Free = 0;
    }

    /**
     * Tells if the cook is available (or free) for preparing food.
     * The cook is free when at least one stove is free.
     * If the cook is free then the cook begins preparing the food item.
     * 
     * @param time Current time.
     * @param item Food to be prepared. 
     * @return true if cook is free else false.
     */
    @Override
    public Boolean isAvailable(Integer time, MenuItem item) {
        if (this.timeStove1Free < time) {
            this.timeStove1Free = time + item.getprepTime();
            return true;
        } else if (this.timeStove2Free < time) {
            this.timeStove2Free = time + item.getprepTime();
            return true;
        } else 
            return false;
    }
}
