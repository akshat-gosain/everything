public class Box<T>     // Defining a Parameterised Class called Box with T as a parameter, T acts a datatype throughout the class
{
    private T element;  // Defining a field called element with 'T' as the type

    public Box(T obj)   // Constructor
    {
        this.element = obj;
    }

    // Methods
    public T get()      // Returns the element
    {
        return this.element;
    }

    public void set(T obj)  // Sets the element to another value
    {
        this.element = obj;
    }
}

/*
 * Now, this class can be used in various ways with different Ts
 * 
 * Eg : Box<String> stringBox = new Box<>("Kohli");
 *      Box<Integer> intBox = new Box<>(35);
 */