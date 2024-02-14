public class Circle extends Shape implements Comparable<Circle>  // A Circle "is-a" Shape and can be compared with other Circles

/*
 * Comparable<Circle> will be an interface :
 * public interface Comparable<Circle>
 * {
 *     int compareTo(Circle other);     // Note the change from Object in previous lab to Circle
 * }
 */
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
    public String toString()
    {
        return "Hi!, I am a Circle with centre at (" + getCentre().getX() + ", " + getCentre().getY() + "), radius = " + getRadius() + ", perimeter = " + getPerimeter() + " and area = " + getArea() + ".";
    }

    public int compareTo(Circle other)      // Defining the method inherited from the interface
    // Returns 1 if this Circle has more area than other, 0 if equal and -1 if less
    {
        // if(this.getArea() > other.getArea())
        // {
        //     return 1;
        // }
        // else if(this.getArea() == other.getArea())
        // {
        //     return 0;
        // }
        // return -1;
        return (int)Math.signum(this.getArea() - other.getArea());
    }
}
