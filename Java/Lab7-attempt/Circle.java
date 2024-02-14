public class Circle extends Shape// Something changes Here!
// A Circle "is-a" Shape !
{
    private int radius;

    public Circle(int x, int y, int radius)
    {
        this.radius = radius;
        // TODO
    }
    public Circle(Point2D centre, int radius)   
    {
        super(centre);
        this.radius = radius;
        // TODO
    }

    public int getRadius()  
    // Return the radius of the Circle
    {
        return this.radius;
        // TODO
    }
    public double getArea()     
    // Override the inherited method, Return the Area of the Circle
    {
        return Math.PI*radius*radius;
        // TODO
    }
    public double getPerimeter()    
    // Override the inherited method, Return the Perimeter of the Circle
    {
        return 2*Math.PI*radius;
        // TODO
    }
    public boolean withinCircle(Point2D point)  
    // Return true if the point lies within the Circle
    {
        
        
            double distance = Math.sqrt(Math.pow(point.getX() - getCentre().getX(), 2) + Math.pow(point.getY() - getCentre().getY(), 2));
            return distance <= radius;
        
        // TODO
    }
    public String toString()
    {
        return "Hi! I am a Circle with centre at (" + getCentre().getX() + ", " + getCentre().getY() + "), radius = " + getRadius() + ", perimeter = " + getPerimeter() + " and area = " + getArea() + ".";
        // TODO
    }
}
