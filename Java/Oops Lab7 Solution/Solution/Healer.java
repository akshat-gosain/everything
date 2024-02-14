public class Healer extends GameObject      // For a healer, the damage array will have negative values
{
    private int numHeals;     // Number of heals done by the healer
    public Healer(String name, int initialHealth, int[] damage, int x, int y, int radius)   // Constructor
    {
        super(name, initialHealth, damage, x, y, radius);     // Call the parent class's constructor
        numHeals = 0;
    }
    public Healer(String name, int initialHealth, int[] damage, int radius, Point2D centre)   // Overloaded Constructor
    {
        super(name, initialHealth, damage, radius, centre);     // Call the parent class's constructor
        numHeals = 0;
    }
    public void heal(GameObject obj)     // A healer should heal only an Archer(Keep in mind that an ArcherQueen is also an Archer)
    // If we try to heal a Cannon or another Healer, you should print "Heal Failed".
    {
        if(obj instanceof Archer)   // Only heal an Archer
        {   
            if(withinRange(obj))    // Only heal an Archer that is within the range
            {
                obj.takeDamage(getDamage());
                numHeals++;               // inc the number of heals
                if(numHeals%3 == 0)       // level should be increased after every 3 heals
                {
                    incLevel();
                }
            }
            else
            {
                System.out.println("Out of Range");
            }
        }
        else
        {
            System.out.println("Heal Failed");
        }
    }
}
