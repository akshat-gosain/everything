public class ArcherQueen extends GameObject// Something changes Here!
// An ArcherQueen "is-a" Archer !
{
    public ArcherQueen(String name, int initialHealth, int[] damage, int x, int y, int radius)
    {
        // TODO
    }
    public ArcherQueen(String name, int initialHealth, int[] damage, int radius, Point2D centre)
    {
        // TODO
    }

    public void attack(GameObject obj)   
    // An ArcherQueen does TWICE the damage as an Archer, rest all properties are same as an Archer
    // An Archer can attack any other GameObject
    // If we try to attack an object which is out of range, print "Out of Range"
    // The level of an ArcherQueen also increases after every 2 attacks
    {
        // TODO
    }
}
