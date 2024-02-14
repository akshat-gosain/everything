public class ShapeCollection<E extends Shape>   // Now E can only be those classes which extend the Shape class
{
    private E[] array;  // Defining an Array of a Shape. Note that all elements in array will be of same type 'E'

    public ShapeCollection(E[] array)   // Constructor
    {
        this.array = array;
    }

    public void addShape(E shape)    // Adding a shape to the Array
    {
        Shape[] newArray = new Shape[array.length + 1];
        for(int i = 0; i < array.length; i++) 
        {
            newArray[i] = array[i];
        }
        newArray[array.length] = shape;
        array = (E[])newArray;
    }

    public double getArea()
    {
        double area = 0;
        for(E shape : array)
        {
            area += shape.getArea();
        }
        return area;
    }
    public double getPerimeter()
    {
        double perimeter = 0;
        for(E shape : array)
        {
            perimeter += shape.getPerimeter();
        }
        return perimeter;
    }
}
