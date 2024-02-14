public class GameObject 
{
    private String name;    // Name of the object
    private Circle range;   // Represents the range of the object
    private int health;     // Current health of the object
    private int[] damage;   // An array of damage for each level
    private int level;    // level is also 0-indexed, so initial level should be 0

    public GameObject(String name, int initialHealth, int[] damage, int x, int y, int radius)   // Constructor
    {
        this.name = name;
        this.health = initialHealth;
        this.damage = damage;
        level = 0;
        this.range = new Circle(x, y, radius);
    }
    public GameObject(String name, int initialHealth, int[] damage, int radius, Point2D centre)    // Overloaded Constructor
    {
        this.name = name;
        this.health = initialHealth;
        this.damage = damage;
        level = 0;
        this.range = new Circle(centre, radius);
    }

    public String getName()     // Return the name of the object
    {
        return name;
    }
    public int getHealth()      // Return the health of the object
    {
        return health;
    }
    public int getLevel()
    {
        return level;
    }
    public Circle getRange()    // Return the range of the object
    {
        return range;
    }
    public void move(int x, int y)  // Move the object to another location
    {
        range.move(x, y);
    }
    public void move(Point2D newLocation)   // Overloaded Method
    {
        range.move(newLocation);
    }
    public void incLevel()      // increases the level of the object, make sure that the level does not pass the Max Level
    {
        level++;
        level = Math.min(level, damage.length - 1);
    }
    public boolean withinRange(GameObject obj)  // Check if the object is within the range
    {
        return range.withinCircle(obj.getRange().getCentre());
    }
    public boolean isDead()     // Return if the object is dead ie if its health is 0
    {
        return health == 0;
    }
    public int getDamage()  // Return the damage the object does based on its level
    {
        return damage[level];
    }
    public void takeDamage(int damage)  // When another object attacks this object
    //Make sure that the health does not become negative
    {
        health -= damage;
        health = Math.max(health, 0);
    }
}
