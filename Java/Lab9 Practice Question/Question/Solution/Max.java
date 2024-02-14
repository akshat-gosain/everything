public class Max 
{
    public static <E extends Comparable<E>> E max(E obj1, E obj2)   // Defining a static method that is paramterised, where the parameter E implements the Comparable<E> interface. Note that even though E "implements" Comparable<E> in the class definition, but here we write extends for interfaces as well classes. The method takes two E objects and returns an E object based on the compareTo method.
    {
        if(obj1.compareTo(obj2) == 1)
        {
            return obj1;
        }
        return obj2;
    }
}