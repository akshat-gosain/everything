public class Point3D extends Point2D    
// Point3D inherits from the Point2D class and hence each Point3D "is-a" Point2D
{
    private int z;  // Extra Fields

    public Point3D(int x, int y, int z)     // Constructor
    {
        super(x, y);    // Call the parent's constructor using the "super" reference to initialise the inherited fields
        this.z = z;     // Initialise the extra fields
    }
    public int getZ()   // Methods
    {
        return this.z;
    }
    public void move(int x, int y, int z)   // Overriding the inherited Method
    {
        super.move(x, y);   // Call the move method from the parent class
        this.z = z;
    }
}
