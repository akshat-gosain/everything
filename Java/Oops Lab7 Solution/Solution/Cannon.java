public class Cannon extends GameObject
{
    protected int numAttacks;     // Number of attacks done by the cannon
    public Cannon(String name, int initialHealth, int[] damage, int x, int y, int radius)   // Constructor
    {
        super(name, initialHealth, damage, x, y, radius);     // Call the parent class's constructor
        numAttacks = 0;
    }
    public Cannon(String name, int initialHealth, int[] damage, int radius, Point2D centre)   // Overloaded Constructor
    {
        super(name, initialHealth, damage, radius, centre);     // Call the parent class's constructor
        numAttacks = 0;
    }

    public void attack(GameObject obj)     // Attack another GameObject, should not attack other Cannons.
    // If we try to attack another Cannon, print "Attack Failed" (Keep in mind that an ArcherCannon is also a Cannon)
    {
        if(obj instanceof Cannon)
        {
            System.out.println("Attack Failed");
        }
        else if(withinRange(obj))            // Only attack if the object is within the range
        {
            obj.takeDamage(getDamage());
            numAttacks++;               // inc the number of attacks
            if(numAttacks%4 == 0)       // level should be increased after every 4 attacks
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
