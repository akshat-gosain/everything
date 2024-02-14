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
        // TODO
        this.x = x;
        this.y = y;
    }

    public int getX()   // Methods
    {
        // TODO
        return this.x;
    }
    public int getY()
    {
        // TODO
        return this.y;
    }
    public double getDistance()     // Returns the distance of the point from the origin
    {
        // TODO
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int compareTo(Object other)      // Need to define the method declared in the interface
    // HAS TO BE DEFINED AS public coz it is implicitly defined as public in the interface
    // Returns 1 if both the points are equal(ie both x and y are equal) and 0 otherwise. 
    // Note that the method definition is totally decided by the class and that the interface only tells the class to define the method
    // If the other object is not a Point2D, return 0
    {
        // TODO
    }
}
