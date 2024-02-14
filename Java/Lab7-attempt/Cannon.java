public class Cannon extends GameObject// Something changes Here!
// A Cannon "is-a" GameObject !
{
    protected int numAttacks;     // Number of attacks done by the cannon

    public Cannon(String name, int initialHealth, int[] damage, int x, int y, int radius) 
    {
        // TODO
    }
    public Cannon(String name, int initialHealth, int[] damage, int radius, Point2D centre)
    {
        // TODO
    }

    public void attack(GameObject obj)     
    // Attack another GameObject, should not attack other Cannons.
    // If we try to attack another Cannon, print "Attack Failed" 
    // (Keep in mind that an ArcherCannon is also a Cannon)
    // If we try to attack an out of range object, print "Out of Range"
    // The level of a Cannon should increase after every 4 attacks
    {
        // TODO
    }
}
