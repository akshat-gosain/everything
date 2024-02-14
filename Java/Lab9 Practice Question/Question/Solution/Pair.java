public class Pair<X extends Shape & Comparable<X>, Y extends Shape & Comparable<Y>> implements Comparable<Pair<X, Y>>
// X, Y are both Shapes and are Comparable to other Xs and Ys. Also, a Pair is also Comparable to other pairs.
{
    private X x;
    private Y y;

    public Pair(X x, Y y)   // Constructor
    {
        this.x = x;
        this.y = y;
    }

    // Methods
    public X getX()
    {
        return x;
    }
    public Y getY()
    {
        return y;
    }
    public String toString()
    {
        return "{" + x.getArea() + ", " + y.getArea() + "}";
    }
    public int compareTo(Pair<X, Y> other)
    // Helps in sorting a pair. First compare X. if X is same, compare Y
    {
        if(this.x.compareTo(other.getX()) != 0)
        {
            return this.x.compareTo(other.getX());
        }
        return this.y.compareTo(other.getY());
    }
}
