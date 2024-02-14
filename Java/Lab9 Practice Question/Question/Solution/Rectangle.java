public class Rectangle extends Shape implements Comparable<Rectangle>
{
    
    // Each Rectangle "has-a" Point2D, inherited from its parent, representing the point of intersection of its diagonals
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth)  // Constructor, default centre is (0, 0)
    {
        super(0, 0);    // Call the parent class's constructor
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(int x, int y, int length, int breadth)  // Constructor, default centre is (0, 0)
    {
        super(x, y);    // Call the parent class's constructor
        this.length = length;
        this.breadth = breadth;
    }

    // Methods

    public int getLength()  // Return the length of the Rectangle
    {
        return this.length;
    }
    public int getBreadth()  // Return the breadth of the Rectangle
    {
        return this.breadth;
    }
    public double getArea()     // Override the inherited method, Return the Area of the Rectangle
    {
        return length*breadth;
    }
    public double getPerimeter()    // Override the inherited method, Return the Perimeter of the Rectangle
    {
        return 2*(length + breadth);
    }

    public String toString()
    {
        return "Hi!, I am a Rectangle with centre at (" + getCentre().getX() + ", " + getCentre().getY() + "), length = " + length + ", breadth = " + breadth + ", perimeter = " + getPerimeter() + " and area = " + getArea() + ".";
    }

    public int compareTo(Rectangle other)   // Defining the method inherited from the interface
    // Returns 1 if this Rectangle has more area than other, 0 if equal and -1 if less
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
