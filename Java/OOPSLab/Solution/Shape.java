public class Shape 
{
    private String colour;  // Fields
    private String name;
    private Point2D centre;     // Represents the geometric centre of the shape
    // Each Shape "has-A" Point2D as the centre

    public Shape(String name)   // Constructor, default colour is "Black" and default centre is (0, 0)
    {
        this.colour = "Black";
        this.name = name;
        this.centre = new Point2D(0, 0);
    }
    public Shape(String colour, String name)    // Overloaded Constructor
    {
        this.colour = colour;
        this.name = name;
        this.centre = new Point2D(0, 0);
    }
    public Shape(String colour, String name, int x, int y)    // Overloaded Constructor
    {
        this.colour = colour;
        this.name = name;
        this.centre = new Point2D(x, y);
    }
    public Shape(String colour, String name, Point2D centre)
    {
        this.colour = colour;
        this.name = name;
        this.centre = centre;
    }

    // Methods

    public void changeColour(String newCol)     // Change the colour of the shape
    {
        this.colour = newCol;
    }
    public String getColour()   // Return the colour of the shape
    {
        return this.colour;
    }
    public String getName()     // Return the name of the shape
    {
        return this.name;
    }
    public Point2D getCentre()     // Return the centre of the shape
    {
        return this.centre;
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
