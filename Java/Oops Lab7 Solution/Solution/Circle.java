public class Circle extends Shape   // A Circle "is-a" Shape
{
    // Each Circle "has-a" Point2D, inherited from its parent
    private int radius;

    public Circle(int x, int y, int radius)  // Constructor
    {
        super(x, y);    // Call the parent's constructor
        this.radius = radius;
    }
    public Circle(Point2D centre, int radius)   // Overloaded Constructor
    {
        super(centre);    // Call the parent's constructor
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
        double distance = Math.sqrt(Math.pow(point.getX() - getCentre().getX(), 2) + Math.pow(point.getY() - getCentre().getY(), 2));
        return distance <= radius;
    }
    public String toString()
    {
        return "Hi!, I am a Circle with centre at (" + getCentre().getX() + ", " + getCentre().getY() + "), radius = " + getRadius() + ", perimeter = " + getPerimeter() + " and area = " + getArea() + ".";
    }
}
