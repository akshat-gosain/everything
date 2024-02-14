public class Shape 
{
    private String colour;  // Fields
    private String name;
    private Point2D centre;     // Represents the geometric centre of the shape
    // Each Shape "has-A" Point2D as the centre

    public Shape(String name)   // Constructor, default colour is "Black" and default centre is (0, 0)
    {
        // TODO
    }
    public Shape(String colour, String name)    // Overloaded Constructor
    {
        // TODO
    }
    public Shape(String colour, String name, int x, int y)    // Overloaded Constructor
    {
        // TODO
    }
    public Shape(String colour, String name, Point2D centre)    // Overloaded Constructor
    {
        // TODO
    }

    // Methods

    public void changeColour(String newCol)     // Change the colour of the shape
    {
        // TODO
    }
    public String getColour()   // Return the colour of the shape
    {
        // TODO
    }
    public String getName()     // Return the name of the shape
    {
        // TODO
    }
    public Point2D getCentre()     // Return the centre of the shape
    {
        // TODO
    }

    // The following two methods will be overriden in the child classes, so just return 0 in both of them
    public double getArea()     // Return the area of the shape
    {
        return 0;
    }
    public double getPerimeter()    // Return the perimiter of the shape
    {
        return 0;
    }
}
