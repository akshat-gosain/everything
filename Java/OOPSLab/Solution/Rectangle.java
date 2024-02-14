public class Rectangle extends Shape
{
    
    // Each Rectangle "has-a" Point2D, inherited from its parent, representing the point of intersection of its diagonals
    private int length;
    private int breadth;

    public Rectangle(String name, int length, int breadth)  // Constructor, default centre is (0, 0)
    {
        super(name);    // Call the parent class's constructor
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(String colour, String name, int length, int breadth)   // Overloaded Constructor, default centre is (0, 0)
    {
        super(colour, name);    // Call the parent's constructor
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(String colour, String name, int x, int y, int length, int breadth)  // Overloaded Constructor
    {
        super(colour, name, x, y);    // Call the parent's constructor
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(String colour, String name, Point2D centre, int length, int breadth)
    {
        super(colour, name, centre);    // Call the parent's constructor
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
    public boolean withinRectangle(Point2D point)  // Return true if the point lies within the Rectangle
    {
        if(point instanceof Point3D)    // Check if the Point2D passed "is-A" Point3D, if it is, dont check
        {
            System.out.println("Cannot Check");
            return false;
        }
        else
        {
            int x = point.getX();
            int y = point.getY();

            int x1 = getCentre().getX() - length/2; // left side
            int x2 = getCentre().getX() + length/2; // right side
            int y1 = getCentre().getY() - breadth/2; // top side
            int y2 = getCentre().getY() + breadth/2; // bottom side

            return x >= x1 && x <= x2 && y >= y1 && y <= y2;
        }
    }

    public String toString()
    {
        return "Hi!, I am " + getName() + " and I am a Rectangle of colour " + getColour() + " with centre at (" + getCentre().getX() + ", " + getCentre().getY() + "), length = " + length + ", breadth = " + breadth + ", perimeter = " + getPerimeter() + " and area = " + getArea() + ".";
    }
}
