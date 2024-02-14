public class Circle extends Shape   // A Circle "is-a" Shape
{
    // Each Circle "has-a" Point2D, inherited from its parent
    private int radius;

    public Circle(String name, int radius)  // Constructor, default centre is (0, 0)
    {
        // TODO
    }
    public Circle(String colour, String name, int radius)   // Overloaded Constructor, default centre is (0, 0)
    {
        // TODO
    }
    public Circle(String colour, String name, int x, int y, int radius)  // Overloaded Constructor
    {
        // TODO
    }
    public Circle(String colour, String name, Point2D centre, int radius)   // Overloaded Constructor
    {
        // TODO
    }

    // Methods
    public int getRadius()  // Return the radius of the Circle
    {
        // TODO
    }
    public double getArea()     // Override the inherited method, Return the Area of the Circle
    {
        // TODO
    }
    public double getPerimeter()    // Override the inherited method, Return the Perimeter of the Circle
    {
       // TODO
    }
    public boolean withinCircle(Point2D point)  // Return true if the point lies within the Circle
    {
        if(point instanceof Point3D)    // Check if the Point2D passed "is-A" Point3D, if it is, dont check
        {
            System.out.println("Cannot Check");
            return false;
        }
        else
        {
            // TODO

        }
    }
    public String toString()
    {
        // TODO
    }
}
 