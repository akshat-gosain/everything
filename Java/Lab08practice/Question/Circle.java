public class Circle implements Shape, Comparable    // A class can implement multiple interfaces (Note that a class cannot extend multiple classes)
{
    private Point2D centre;     // Fields
    private int radius;      

    public Circle(int x, int y, int radius)     // Constructor
    {
       // TODO
    }
    public Circle(Point2D centre, int radius)   // Overloaded Constructor
    {
        // TODO
    }

    // Methods
    public Point2D getCentre()
    {
        // TODO
    }
    public int getRadius()
    {
        // TODO
    }
    
    public double getDistance()     // Returns the distance of the centre of the Circle from the Origin
    {
        // TODO
    }


    // Need to define the methods inherited from the interfaces

    // TODO


    // For the compareTo method, return 1 if both the circles are same(same centre and same radius) and 0 otherwise

}
