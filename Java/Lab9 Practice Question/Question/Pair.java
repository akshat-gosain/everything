public class Pair<X extends Shape & Comparable<X>, Y extends Shape & Comparable<Y>> implements Comparable<Pair<X, Y>>
// X, Y are both Shapes and are Comparable to other Xs and Ys. Also, a Pair is also Comparable to other pairs.
{
    private X x;
    private Y y;

    public Pair(X x, Y y)   // Constructor
    {
        // TODO
    }

    // Methods
    public X getX()
    {
        // TODO
    }
    public Y getY()
    {
        // TODO
    }
    public String toString()
    {
        return "{" + x.getArea() + ", " + y.getArea() + "}";
    }
    public int compareTo(Pair<X, Y> other)
    // Helps in sorting a pair. First compare X. If X is same, compare Y
    {
        // TODO
    }
}
