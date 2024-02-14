public class Circle extends Shape   // A Circle "is-a" Shape
{
    // Each Circle "has-a" Point2D, inherited from its parent
    private int radius;

    public Circle(String name, int radius)  // Constructor, default centre is (0, 0)
    {
        super(name);    // Call the parent class's constructor
        this.radius = radius;
    }
    public Circle(String colour, String name, int radius)   // Overloaded Constructor, default centre is (0, 0)
    {
        super(colour, name);    // Call the parent's constructor
        this.radius = radius;
    }
    public Circle(String colour, String name, int x, int y, int radius)  // Overloaded Constructor
    {
        super(colour, name, x, y);    // Call the parent's constructor
        this.radius = radius;
    }
    public Circle(String colour, String name, Point2D centre, int radius)
    {
        super(colour, name, centre);    // Call the parent's constructor
        this.radius = radius;
    }

    // Methods
    public int getRadius()  // Return the radius of the Circle
    {
        return this.radius;
    }
    public double getArea()     // Override the inherited method, Return the Area of the Circle
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()    // Override the inherited method, Return the Perimeter of the Circle
    {
        return 2*Math.PI*radius;
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
            double distance = Math.sqrt(Math.pow(point.getX() - getCentre().getX(), 2) + Math.pow(point.getY() - getCentre().getY(), 2));
            return distance <= radius;
        }
    }
    public String toString()
    {
        return "Hi!, I am " + getName() + " and I am a Circle of colour " + getColour() + " with centre at (" + getCentre().getX() + ", " + getCentre().getY() + "), radius = " + getRadius() + ", perimeter = " + getPerimeter() + " and area = " + getArea() + ".";
    }
}
