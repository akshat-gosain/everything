public class Driver 
{
    public static void main(String[] args) 
    {
        // Create a Point2D object
        Point2D point2D = new Point2D(2, 3);

        // Create a Point3D object
        Point3D point3D = new Point3D(-1, -2, -3);

        // Create a Circle with a center at (0, 0), radius of 5
        Circle circle1 = new Circle("Red", "Circle 1", 5);

        // Create a Circle with a center at (1, 2), radius of 3
        Circle circle2 = new Circle("Blue", "Circle 2", 1, 2, 3);

        // Create a Circle with a center as a Point2D object, radius of 4
        Point2D center3 = new Point2D(3, 4);
        Circle circle3 = new Circle("Green", "Circle 3", center3, 4);

        // Create a Rectangle with a center at (0, 0), length of 6, and breadth of 4
        Rectangle rectangle1 = new Rectangle("Orange", "Rectangle 1", 6, 4);

        // Create a Rectangle with a center at (1, 1), length of 8, and breadth of 5
        Rectangle rectangle2 = new Rectangle("Purple", "Rectangle 2", 1, 1, 8, 5);

        // Create a Rectangle with a center as a Point2D object, length of 7, and breadth of 3
        Point2D center3D = new Point2D(20, 20);
        Rectangle rectangle3 = new Rectangle("Yellow", "Rectangle 3", center3D, 7, 3);

        // Test cases
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println("Is Point2D (2, 3) within Circle 1?");
        if(circle1.withinCircle(point2D))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        System.out.println("Can we check if Point3D (-1, -2, -3) is within Circle 2?");
        if(circle2.withinCircle(point3D))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("Is Point2D (2, 3) within Rectangle 2?");
        if(rectangle2.withinRectangle(point2D))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        System.out.println("Is Point2D (2, 3) within Rectangle 3?");
        if(rectangle3.withinRectangle(point2D))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        System.out.println("Can we check if Point3D (-1, -2, -3) is within Rectangle 1?");
        if(rectangle1.withinRectangle(point3D))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
