/*
    Comparable Interface is defined within Java as :

    public interface Comparable
    {
        int compareTo(Object other);    // implicitly public and abstract
    }

    It has only one method declaration.
*/

public class Point2D implements Comparable      // Now, the class will have to provide the definition for the methods in the interface
{
    private int x;  // Fields
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
    public double getDistance()     // Returns the distance of the point from the origin
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int compareTo(Object other)      // Need to define the method declared in the interface
    // Has to be defined as public coz it is implicitly defined as public in the interface
    // Returns 1 if both the points are equal and 0 otherwise. 
    // Note that the method definition is totally decided by the class and that the interface only tells the class to define the method
    {
        if(other instanceof Point2D)    // If other "is-a" Point2D
        {
            Point2D otherPoint = (Point2D)other;    // Typecast the Object to Point2D so that we can use the methods of Point2D class.
            if(this.x == otherPoint.getX() && this.y == otherPoint.getY())  // If both x and y are equal
            {
                return 1;   // Points are equal
            }
            return 0;       // Points are not equal
        }
        return 0;   // If other is not a Point2D, it is not equal
    }
}
