public class Box2<X, Y> // We can also have multiple parameters in the class
{
    private X x;
    private Y y;

    public Box2(X x, Y y)   // Constructor
    {
        this.x = x;
        this.y = y;
    }

    // Methods

    public X getX()
    {
        return this.x;
    }
    public Y getY()
    {
        return this.y;
    }

    public void setX(X x)
    {
        this.x = x;
    }
    public void setY(Y y)
    {
        this.y = y;
    }
}
