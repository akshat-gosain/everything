public class Archer extends GameObject// Something changes Here!
// An Archer "is-a" GameObject !
{
    protected int numAttacks;     // Number of attacks done by the archer

    public Archer(String name, int initialHealth, int[] damage, int x, int y, int radius)
    {
        super(name,initialHealth,damage,x,y,radius);
        // TODO
    }
    public Archer(String name, int initialHealth, int[] damage, int radius, Point2D centre)
    {
        super(name,initialHealth,damage,x,y,radius,circle);
        // TODO
    }
    
    public void attack(GameObject obj)     
    // An Archer can attack any other GameObject
    // If we try to attack an object which is out of range, print "Out of Range"
    // The level of an Archer increases after every 2 attacks
    {
        if(this.withinRange(obj)){
        

        }
        // TODO
    }
}
