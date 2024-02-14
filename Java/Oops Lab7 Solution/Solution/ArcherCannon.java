public class ArcherCannon extends Cannon    // A Cannon with an Archer, both can attack separately.
// If the Cannon dies, the Archer also dies
{
    private Archer archer;  // An ArcherCannon "has-a" Archer

    public ArcherCannon(String name, int initialHealth, int[] damage, int x, int y, int radius, Archer archer)   // Constructor
    {
        super(name, initialHealth, damage, x, y, radius);     // Call the parent class's constructor
        this.archer = archer;
    }
    public ArcherCannon(String name, int initialHealth, int[] damage, int radius, Point2D centre, Archer archer)   // Overloaded Constructor
    {
        super(name, initialHealth, damage, radius, centre);     // Call the parent class's constructor
        this.archer = archer;
    }

    public boolean isArcherDead()   // The Archer dies if the Cannon dies
    {
        return archer.isDead() || isDead();
    }
    public void ArcherAttack(GameObject obj)     // The Archer attacks another GameObject
    {
        // if(archer.withinRange(obj))            // Only attack if the object is within the range of the archer
        // {
        //     obj.takeDamage(archer.getDamage()); // damage is caused by the archer
        //     archer.numAttacks++;               // inc the number of attacks of the archer
        //     if(archer.numAttacks%2 == 0)       // level ofshould be increased after every 2 attacks
        //     {
        //         archer.incLevel();
        //     }
        // }

        archer.attack(obj);
    }
}
