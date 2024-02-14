public class ArcherCannon extends GameObject// Something changes Here!
// An ArcherCannon "is-a" Cannon!
// This is a Cannon with an Archer and both can attack separately. 
{

    // An ArcherCannon "has-a" Archer!
    // A Field needs to be added here !!!!! 

    public ArcherCannon(String name, int initialHealth, int[] damage, int x, int y, int radius, Archer archer) 
    {
        // TODO
    }
    public ArcherCannon(String name, int initialHealth, int[] damage, int radius, Point2D centre, Archer archer)   
    {
        // TODO
    }

    public boolean isArcherDead()   
    // Check if the Archer is dead, the Archer can die alone while the Cannon is alive 
    // But if the Cannon is dead, the Archer is also dead
    {
        // TODO
    }
    public void ArcherAttack(GameObject obj)     
    // The Archer attacks another GameObject, the Archer should behave like any other normal Archer
    // An Archer can attack any other GameObject
    // If we try to attack an object which is out of range, print "Out of Range"
    // The level of the Archer increases after every 2 attacks
    {
        // TODO
    }
}
