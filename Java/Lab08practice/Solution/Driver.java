public class Driver 
{
    public static void main(String[] args) 
    {
        Point2D p1 = new Point2D(3, 4);
        System.out.println(p1.getDistance());

        Point2D p2 = new Point2D(6, 8);
        System.out.println(p2.getDistance());

        Point2D p3 = new Point2D(-3, -4);
        System.out.println(p3.getDistance());

        Point2D p4 = new Point2D(0, 0);
        System.out.println(p4.getDistance());

        Point2D p5 = new Point2D(3, 4);
        System.out.println(p5.getDistance());

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.compareTo(p5));

        Circle c1 = new Circle(3, 4, 5);
        System.out.println(c1.getDistance());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Circle c2 = new Circle(p1, 5);
        System.out.println(c1.compareTo(c2));

        Circle c3 = new Circle(p1, 10);
        System.out.println(c1.compareTo(c3));

        Circle c4 = new Circle(p2, 5);
        System.out.println(c1.compareTo(c4));

        System.out.println(c1.compareTo(p1));
    }
}

