import java.util.Arrays;

public class Driver 
{
    public static void main(String[] args) 
    {
        // Check what the Box class is doing

        System.out.println();

        Box<String> stringBox = new Box<>("Happy Bday Kohli");
        Box<Integer> intBox = new Box<>(35);

        // Will this line give an error?
        // Box<Integer> wrongBox = new Box<>("Wrong"); 

        System.out.println(stringBox.get());
        System.out.println(intBox.get());

        stringBox.set("Score a century!!");

        System.out.println(stringBox.get());

        // Will this line give an error?
        // stringBox.set(49); 

        System.out.println();
        System.out.println();
//---------------------------------------------------------------------------------

        // Check what the Box2 class is doing

        Box2<String, Integer> stringIntBox = new Box2<>("Sachin", 49);
        System.out.println(stringIntBox.getX());
        System.out.println(stringIntBox.getY());

        Box2<String, String> strStrBox = new Box2<>("Hardik", "Prasidh");
        System.out.println(strStrBox.getX());
        System.out.println(strStrBox.getY());
        System.out.println();
        System.out.println();

//---------------------------------------------------------------------------------

        // Uncomment the following after completing the Circle, Rectangle and ShapeCollection classes.

        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(3, 4);
        Rectangle r3 = new Rectangle(4, 5);
        Rectangle r4 = new Rectangle(2, 3);

        Circle c1 = new Circle(0, 0, 2);
        Circle c2 = new Circle(0, 0, 3);
        Circle c3 = new Circle(0, 0, 5);
        Circle c4 = new Circle(0, 0, 2);

        Rectangle[] rectArr = {r1}; 
        ShapeCollection<Rectangle> rectCollection = new ShapeCollection<>(rectArr);
        rectCollection.addShape(r2);
        rectCollection.addShape(r3);

        System.out.println(rectCollection.getArea());
        System.out.println(rectCollection.getPerimeter());

        // Will this line give an error?
        // rectCollection.addShape(c1);

        Circle[] circleArr = {c1}; 
        ShapeCollection<Circle> circleCollection = new ShapeCollection<>(circleArr);
        circleCollection.addShape(c2);
        circleCollection.addShape(c3);

        System.out.println(circleCollection.getArea());
        System.out.println(circleCollection.getPerimeter());

        System.out.println();
        System.out.println();
        
        
// ----------------------------------------------------------------------------------
        // Check what the Max Class is doing

        Circle maxCircle1 = Max.max(c1, c2);
        System.out.println(maxCircle1.getArea());
        Circle maxCircle2 = Max.max(c1, c4);
        System.out.println(maxCircle2.getArea());
        Circle maxCircle3 = Max.max(c3, c2);
        System.out.println(maxCircle3.getArea());

        Rectangle maxRect1 = Max.max(r1, r2);
        System.out.println(maxRect1.getArea());
        Rectangle maxRect2 = Max.max(r1, r4);
        System.out.println(maxRect2.getArea());
        Rectangle maxRect3 = Max.max(r3, r2);
        System.out.println(maxRect3.getArea());

        // Will this line give an error?
        //Shape maxShape = Max.max(r1, c1);

        System.out.println();
        System.out.println();
        

// ------------------------------------------------------------------------

        // Uncomment the following after completing the Pair class
        Rectangle rect1 = new Rectangle(5, 8);
        Rectangle rect2 = new Rectangle(3, 6);
        Rectangle rect3 = new Rectangle(7, 4);
        Rectangle rect4 = new Rectangle(9, 2);
        Rectangle rect5 = new Rectangle(6, 5);
        Rectangle rect6 = new Rectangle(4, 7);
        Rectangle rect7 = new Rectangle(8, 3);
        Rectangle rect8 = new Rectangle(2, 9);
        Rectangle rect9 = new Rectangle(5, 5);
        Rectangle rect10 = new Rectangle(10, 1);
        

        Circle circle1 = new Circle(0, 0, 3);
        Circle circle2 = new Circle(0, 0, 9);
        Circle circle3 = new Circle(0, 0, 7);
        Circle circle4 = new Circle(0, 0, 1);
        Circle circle5 = new Circle(0, 0, 5);
        Circle circle6 = new Circle(0, 0, 8);
        Circle circle7 = new Circle(0, 0, 2);
        Circle circle8 = new Circle(0, 0, 6);
        Circle circle9 = new Circle(0, 0, 10);
        Circle circle10 = new Circle(0, 0, 4);

        Pair<Rectangle, Circle> pair1 = new Pair<>(rect1, circle1);
        Pair<Rectangle, Circle> pair2 = new Pair<>(rect2, circle2);
        Pair<Rectangle, Circle> pair3 = new Pair<>(rect3, circle3);
        Pair<Rectangle, Circle> pair4 = new Pair<>(rect4, circle4);
        Pair<Rectangle, Circle> pair5 = new Pair<>(rect5, circle5);
        Pair<Rectangle, Circle> pair6 = new Pair<>(rect6, circle6);
        Pair<Rectangle, Circle> pair7 = new Pair<>(rect7, circle7);
        Pair<Rectangle, Circle> pair8 = new Pair<>(rect8, circle8);
        Pair<Rectangle, Circle> pair9 = new Pair<>(rect9, circle9);
        Pair<Rectangle, Circle> pair10 = new Pair<>(rect10, circle10);
        Pair<Rectangle, Circle> pair11 = new Pair<>(rect10, circle7);
        Pair<Rectangle, Circle> pair12 = new Pair<>(rect9, circle6);
        Pair<Rectangle, Circle> pair13 = new Pair<>(rect8, circle1);
        Pair<Rectangle, Circle> pair14 = new Pair<>(rect7, circle4);
        Pair<Rectangle, Circle> pair15 = new Pair<>(rect6, circle10);
        Pair<Rectangle, Circle> pair16 = new Pair<>(rect5, circle7);
        Pair<Rectangle, Circle> pair17 = new Pair<>(rect4, circle9);
        Pair<Rectangle, Circle> pair18 = new Pair<>(rect3, circle7);
        Pair<Rectangle, Circle> pair19 = new Pair<>(rect2, circle5);
        Pair<Rectangle, Circle> pair20 = new Pair<>(rect1, circle1);

        Pair<Rectangle, Circle>[] pairArray= new Pair[20];
        pairArray[0] = pair1;
        pairArray[1] = pair2;
        pairArray[2] = pair3;
        pairArray[3] = pair4;
        pairArray[4] = pair5;
        pairArray[5] = pair6;
        pairArray[6] = pair7;
        pairArray[7] = pair8;
        pairArray[8] = pair9;
        pairArray[9] = pair10;
        pairArray[10] = pair11;
        pairArray[11] = pair12;
        pairArray[12] = pair13;
        pairArray[13] = pair14;
        pairArray[14] = pair15;
        pairArray[15] = pair16;
        pairArray[16] = pair17;
        pairArray[17] = pair18;
        pairArray[18] = pair19;
        pairArray[19] = pair20;
        Arrays.sort(pairArray);
        for(Pair<Rectangle, Circle> pair : pairArray)
        {
            System.out.println(pair);
        }

        System.out.println();
        System.out.println();
    }
}
