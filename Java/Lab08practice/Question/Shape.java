public interface Shape
{
    // Methods are implicitly public and abstract, abstract means that we cannot define the methods here
    double getArea();       // Now any class implementing Shape interface will have to define these methods
    double getPerimeter();
}