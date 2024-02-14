public class Circle implements Shape, Comparable    // A class can implement multiple interfaces (Note that a class cannot extend multiple classes)
{
    private Point2D centre;     // Fields
    private int radius;      

    public Circle(int x, int y, int radius)     // Constructor
    {
        this.centre = new Point2D(x, y);
        this.radius = radius;
    }
    public Circle(Point2D centre, int radius)   // Overloaded Constructor
    {
        this.centre = centre;
        this.radius = radius;
    }

    // Methods
    public Point2D getCentre()
    {
        return this.centre;
    }
    public int getRadius()
    {
        return this.radius;
    }
    
    public double getDistance()     // Returns the distance of the centre of the Circle from the Origin
    {
        return centre.getDistance();
    }


    // Need to define the methods inherited from the interfaces
    // TODO

    public double getArea()     
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()     
    {
        return 2*Math.PI*radius;
    }
    public int compareTo(Object other)  // Return 1 if the two Circles are same, 0 otherwise
    {
        if(other instanceof Circle)     // If other "is-a" Circle
        {
            Circle otherCircle = (Circle)other; // Typecast other into Circle so that we can use the methods of Circle class
            if(centre.compareTo(otherCircle.getCentre()) == 1 && radius == otherCircle.getRadius())
            // Centre must be same and radius must be same
            {
                return 1;
            }
            return 0;   // Not Same
        }
        return 0;       // Other is not a Circle, so Not Same
    }
}
