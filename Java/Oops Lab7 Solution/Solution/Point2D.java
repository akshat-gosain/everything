public class Point2D 
{
    private int x;      // Fields
    private int y;

    public Point2D(int x, int y)    // Constructor
    {
        this.x = x;
        this.y = y;
    }
    public int getX()   // Methods
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void move(int x, int y)  // Moves the point to a new location
    {
        this.x = x;
        this.y = y;
    }
}