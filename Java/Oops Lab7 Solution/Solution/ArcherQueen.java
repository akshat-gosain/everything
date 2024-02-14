public class ArcherQueen extends Archer     // An ArcherQueen "is-a" Archer
{
    public ArcherQueen(String name, int initialHealth, int[] damage, int x, int y, int radius)  // Constructor
    {
        super(name, initialHealth, damage, x, y, radius);     // Call the parent class's constructor
    }
    public ArcherQueen(String name, int initialHealth, int[] damage, int radius, Point2D centre)   // Overloaded Constructor
    {
        super(name, initialHealth, damage, radius, centre);     // Call the parent class's constructor
    }

    public void attack(GameObject obj)     // Override the inherited method
    {
        if(withinRange(obj))            // Only attack if the object is within the range
        {
            obj.takeDamage(2*getDamage());      // An ArcherQueen does twice the damage as an Archer
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
