public class Rectangle extends Shape
{
    // Each Rectangle "has-a" Point2D, inherited from its parent, representing the point of intersection of its diagonals
    private int length;
    private int breadth;

    public Rectangle(String name, int length, int breadth)  // Constructor, default centre is (0, 0)
    {
        // TODO
    }
    public Rectangle(String colour, String name, int length, int breadth)   // Overloaded Constructor, default centre is (0, 0)
    {
        // TODO
    }
    public Rectangle(String colour, String name, int x, int y, int length, int breadth)  // Overloaded Constructor
    {
        // TODO
    }
    public Rectangle(String colour, String name, Point2D centre, int length, int breadth)   // Overloaded Constructor
    {
        // TODO
    }

    // Methods

    public int getLength()  // Return the length of the Rectangle
    {
        // TODO
    }
    public int getBreadth()  // Return the breadth of the Rectangle
    {
        // TODO
    }
    public double getArea()     // Override the inherited method, Return the Area of the Rectangle
    {
       // TODO
    }
    public double getPerimeter()    // Override the inherited method, Return the Perimeter of the Rectangle
    {
        // TODO
    }
    public boolean withinRectangle(Point2D point)  // Return true if the point lies within the Rectangle
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
