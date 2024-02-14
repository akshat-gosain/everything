public class Archer extends GameObject   // An Archer "is-a" GameObject
{
    protected int numAttacks;     // Number of attacks done by the archer
    public Archer(String name, int initialHealth, int[] damage, int x, int y, int radius)   // Constructor
    {
        super(name, initialHealth, damage, x, y, radius);     // Call the parent class's constructor
        numAttacks = 0;
    }
    public Archer(String name, int initialHealth, int[] damage, int radius, Point2D centre)   // Overloaded Constructor
    {
        super(name, initialHealth, damage, radius, centre);     // Call the parent class's constructor
        numAttacks = 0;
    }
    
    public void attack(GameObject obj)     // Attack another GameObject
    {
        if(withinRange(obj))            // Only attack if the object is within the range
        {
            obj.takeDamage(getDamage());
            numAttacks++;               // inc the number of attacks
            if(numAttacks%2 == 0)       // level should be increased after every 2 attacks
            {
                incLevel();
            }
        }
        else
        {
            System.out.println("Out of Range");
        }
    }
}
