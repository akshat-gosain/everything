public class Driver 
{
    public static void main(String[] args) 
    {
        System.out.println("\n\nHello! Welcome to OOP Lab7 : Inheritance\n");

// ---------------------------------------------------------------------------------


        // Uncomment the following after completing the Point2D class


        Point2D p = new Point2D(-1, -3);
        Point2D q = new Point2D(10, 30);
        if(p.getX() != -1 || q.getX() != 10)
        {
            System.out.println("getX is Wrong");
            return;
        }
        if(p.getY() != -3 || q.getY() != 30)
        {
            System.out.println("getY is Wrong");
            return;
        }
        p.move(-2, -5);
        if(p.getX() != -2 || p.getY() != -5)
        {
            System.out.println("move is Wrong");
            return;
        }
        System.out.println("Point2D is correct, Proceed to the Shape class\n");

// ---------------------------------------------------------------------------------------


        // // Uncomment the following after completing the Shape class


        Shape shape1 = new Shape(-5, 10);
        if(shape1.getCentre().getX() != -5 || shape1.getCentre().getY() != 10)
        {
            System.out.println("getCentre() is Wrong");
            return;
        }
        if(shape1.getArea() != 0)
        {
            System.out.println("getArea is Wrong");
            return;
        }
        if(shape1.getPerimeter() != 0)
        {
            System.out.println("getPerimeter is Wrong");
            return;
        }
        shape1.move(5, 10);
        if(shape1.getCentre().getX() != 5 || shape1.getCentre().getY() != 10)
        {
            System.out.println("move is Wrong");
            return;
        }
        System.out.println("Shape is correct, Proceed to the Circle class\n");

// --------------------------------------------------------------------------------------------


        // Uncomment the following after completing the Circle class

        Circle circle1 = new Circle(p, 5);
        Circle circle2 = new Circle(25, 50, 10);
        if(circle1.getRadius() != 5 || circle2.getRadius() != 10)
        {
            System.out.println("getRadius is Wrong");
            return;
        }
        if(circle1.getArea() != 78.53981633974483 || circle2.getArea() != 314.1592653589793)
        {
            System.out.println("getArea is Wrong");
            return;
        }
        if(circle1.getPerimeter() != 31.41592653589793 || circle2.getPerimeter() != 62.83185307179586)
        {
            System.out.println("getPerimeter is Wrong");
            return;
        }
        if(circle1.withinCircle(new Point2D(-2, 0)) != true || circle1.withinCircle(new Point2D(-2, 1)) || circle1.withinCircle(new Point2D(-2, -5)) != true)
        {
            System.out.println("withinCircle is Wrong");
            return;
        }
        System.out.println("Circle is correct, Proceed to the GameObject class\n");

// -------------------------------------------------------------------------------------------


        // Uncomment the following after completing the GameObject class


        int[] damage1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] damage2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        GameObject ob1 = new GameObject("ob1", 100, damage1, 50, 50, 50);
        GameObject ob2 = new GameObject("ob2", 200, damage2, 100, 100, 100);
        if(ob1.getName() != "ob1" || ob2.getName() != "ob2")
        {
            System.out.println("getName is Wrong");
            return;
        }
        if(ob1.getHealth() != 100 || ob2.getHealth() != 200)
        {
            System.out.println("getHealth is Wrong");
            return;
        }
        if(ob1.getLevel() != 0)
        {
            System.out.println("getLevel is Wrong");
            return;
        }
        if(ob1.getRange().getCentre().getX() != 50 || ob2.getRange().getCentre().getY() != 100 || ob1.getRange().getRadius() != 50)
        {
            System.out.println("getRange is Wrong");
            return;
        }
        ob1.move(-50, -50);
        if(ob1.getRange().getCentre().getX() != -50 || ob1.getRange().getCentre().getY() != -50 || ob1.getRange().getRadius() != 50)
        {
            System.out.println("move is Wrong");
            return;
        }
        for(int i = 0; i < damage1.length; i++)
        {
            if(ob1.getLevel() != i)
            {
                System.out.println("incLevel is Wrong");
                return;
            }
            ob1.incLevel();
        }
        for(int i = 0; i < 5; i++)
        {
            if(ob1.getLevel() != damage1.length - 1)
            {
                System.out.println("incLevel is Wrong");
                return;
            }
            ob1.incLevel();
        }
        if(ob1.withinRange(ob2) || ob2.withinRange(ob1))
        {
            System.out.println("withinRange is Wrong");
            return;
        }
        ob2.move(0, -50);
        if(!ob1.withinRange(ob2) || !ob2.withinRange(ob1))
        {
            System.out.println("withinRange is Wrong");
            return;
        }
        if(ob1.isDead() || ob2.isDead())
        {
            System.out.println("isDead is Wrong");
            return;
        }
        ob1 = new GameObject("ob1", 100, damage1, -50, -50, 50);
        for(int i = 0; i < damage1.length; i++)
        {
            if(ob1.getDamage() != damage1[i])
            {
                System.out.println("getDamage is Wrong");
                return;
            }
            ob1.incLevel();
        }
        for(int i = 0; i < 10; i++)
        {
            if(ob1.getHealth() != 100 - i*10)
            {
                System.out.println("takeDamage is Wrong");
                return;
            }
            ob1.takeDamage(10);
        }
        for(int i = 0; i < 10; i++)
        {
            if(ob1.getHealth() != 0)
            {
                System.out.println("takeDamage is Wrong");
                return;
            }
            ob1.takeDamage(10);
        }
        System.out.println("GameObject is correct, Proceed to the Archer class\n");


// ----------------------------------------------------------------------------------------------

        // Uncomment the following after completing the Archer class


        // Archer archer1 = new Archer("Archer 1", 1000, damage1, 50, 50, 50);
        // GameObject ob3 = new GameObject("ob3", 100, damage1, 1000, 1000, 0);
        // archer1.attack(ob3);
        // if(ob3.getHealth() != 100)
        // {
        //     System.out.println("attack is Wrong");
        //     return;
        // }
        // ob3.move(25, 25);
        // int[] levelarcher1 = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        // for(int i = 0; i < 10; i++)
        // {
        //     int init = ob3.getHealth();
        //     //System.out.println(init);
        //     archer1.attack(ob3);
        //     //System.out.println(ob3.getHealth());
        //     if(archer1.getLevel() != levelarcher1[i + 1])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        //     if(ob3.getHealth() != init - damage1[levelarcher1[i]])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        // }
        // for(int i = 0; i < 20; i++)
        // {
        //     if(archer1.getLevel() >= damage1.length)
        //     {
        //         System.out.println("incLevel is Wrong");
        //         return;
        //     }
        //     archer1.incLevel();
        // }
        // System.out.println("Archer is correct, Proceed to the ArcherQueen class\n");


// ---------------------------------------------------------------------------------------------

        // Uncomment the following after completing the ArcherQueen class


        // ArcherQueen aq = new ArcherQueen("aq", 1000, damage1, 0, 0, 50);
        // GameObject ob4 = new GameObject("ob4", 100, damage1, 1000, 1000, 0);
        // aq.attack(ob4);
        // if(ob4.getHealth() != 100)
        // {
        //     System.out.println("attack is Wrong");
        //     return;
        // }
        // for(int i = 0; i < 10; i++)
        // {
        //     int init = ob3.getHealth();
        //     //System.out.println(init);
        //     aq.attack(ob3);
        //     //System.out.println(ob3.getHealth());
        //     if(aq.getLevel() != levelarcher1[i + 1])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        //     if(ob3.getHealth() != init - 2*damage1[levelarcher1[i]])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        // }
        // for(int i = 0; i < 20; i++)
        // {
        //     if(aq.getLevel() >= damage1.length)
        //     {
        //         System.out.println("incLevel is Wrong");
        //         return;
        //     }
        //     aq.incLevel();
        // }
        // System.out.println("ArcherQueen is correct, Proceed to the Cannon class\n");

// ------------------------------------------------------------------------------------------------


        // Uncomment the following after completing the Cannon class


        // Cannon c1 = new Cannon("c1", 100, damage1, 50, 50, 50);
        // Cannon c2 = new Cannon("c2", 100, damage1, 50, 50, 50);
        // c1.attack(c2);
        // if(c2.getHealth() != 100)
        // {
        //     System.out.println("attack is Wrong");
        //     return;
        // }
        // archer1.move(100, 100);
        // aq.move(100, 100);
        // int aqhel2 = aq.getHealth();
        // c1.attack(aq);
        // if(aq.getHealth() != aqhel2)
        // {
        //     System.out.println("attack is Wrong");
        //     return;
        // }
        // int ahel2 = archer1.getHealth();
        // c1.attack(archer1);
        // if(archer1.getHealth() != ahel2)
        // {
        //     System.out.println("attack is Wrong");
        //     return;
        // }
        // archer1.move(25, 25);
        // aq.move(26, 27);
        // int[] levelc = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9};
        // for(int i = 0; i < levelc.length - 1; i++)
        // {
        //     int init = aq.getHealth();
        //     //System.out.println(init);
        //     c1.attack(aq);
        //     //System.out.println(aq.getHealth());
        //     if(c1.getLevel() != levelc[i + 1])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        //     if(aq.getHealth() != init - damage1[levelc[i]])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        // }
        // for(int i = 0; i < levelc.length - 1; i++)
        // {
        //     int init = archer1.getHealth();
        //     //System.out.println(init);
        //     c2.attack(archer1);
        //     //System.out.println(archer1.getHealth());
        //     if(c2.getLevel() != levelc[i + 1])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        //     if(archer1.getHealth() != init - damage1[levelc[i]])
        //     {
        //         System.out.println("attack is Wrong");
        //         return;
        //     }
        // }
        // System.out.println("Cannon is correct, Proceed to the Healer class\n");

// -----------------------------------------------------------------------------------------------------


        // Uncomment the following after completing the Healer class

        
        // int[] damage3 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        // Healer h = new Healer("h", 100, damage3, 0, 0, 50);
        // Healer h2 = new Healer("h2", 100, damage3, 0, 0, 1000);
        // if(h2.getHealth() != 100)
        // {
        //     System.out.println("heal is Wrong");
        //     return;
        // }
        // Cannon cannon = new Cannon("cannon", 100, damage1, 0, 0, 50);
        // h.heal(cannon);
        // if(cannon.getHealth() != 100)
        // {
        //     System.out.println("heal is Wrong");
        //     return;
        // }
        // int[] levelh = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9, 9};
        // for(int i = 0; i < levelh.length - 1; i++)
        // {
        //     int init = aq.getHealth();
        //     //System.out.println(init);
        //     h.heal(aq);
        //     //System.out.println(ob3.getHealth());
        //     if(h.getLevel() != levelh[i + 1])
        //     {
        //         System.out.println("heal is Wrong");
        //         return;
        //     }
        //     if(aq.getHealth() != init - damage3[levelh[i]])
        //     {
        //         System.out.println("heal is Wrong");
        //         return;
        //     }
        // }
        // for(int i = 0; i < levelh.length - 1; i++)
        // {
        //     int init = archer1.getHealth();
        //     //System.out.println(init);
        //     h2.heal(archer1);
        //     //System.out.println(ob3.getHealth());
        //     if(h2.getLevel() != levelh[i + 1])
        //     {
        //         System.out.println("heal is Wrong");
        //         return;
        //     }
        //     if(archer1.getHealth() != init - damage3[levelh[i]])
        //     {
        //         System.out.println("heal is Wrong");
        //         return;
        //     }
        // }
        // archer1.move(100, 100);
        // aq.move(100, 100);
        // int aqhel = aq.getHealth();
        // h.heal(aq);
        // if(aq.getHealth() != aqhel)
        // {
        //     System.out.println("heal is Wrong");
        //     return;
        // }
        // int ahel = archer1.getHealth();
        // h.heal(archer1);
        // if(archer1.getHealth() != ahel)
        // {
        //     System.out.println("heal is Wrong");
        //     return;
        // }
        // System.out.println("Healer is correct, Proceed to the ArcherCannon class\n");

// -----------------------------------------------------------------------------------------


        // Uncomment the following after completing the ArcherCannon class


        // Archer archer2 = new Archer("archer 2", 0, damage1, 100, 100, 100);
        // ArcherCannon ac = new ArcherCannon("ac", 100, damage1, 100, 100, 100, archer2);
        // if(!ac.isArcherDead())
        // {
        //     System.out.println("isArcherDead is Wrong");
        //     return;
        // }
        // archer2 = new Archer("Archer 2", 1000, damage1, 50, 50, 50);
        // ac = new ArcherCannon("ac", 0, damage1, 50, 50, 100, archer2);
        // if(!ac.isArcherDead())
        // {
        //     System.out.println("isArcherDead is Wrong");
        //     return;
        // }
        // ob3 = new GameObject("ob3", 100, damage1, 1000, 1000, 0);
        // ac.ArcherAttack(ob3);
        // if(ob3.getHealth() != 100)
        // {
        //     System.out.println("ArcherAttack is Wrong");
        //     return;
        // }
        // ob3.move(25, 25);
        // for(int i = 0; i < 10; i++)
        // {
        //     int init = ob3.getHealth();
        //     //System.out.println(init);
        //     ac.ArcherAttack(ob3);
        //     //System.out.println(ob3.getHealth());
        //     if(archer2.getLevel() != levelarcher1[i + 1])
        //     {
        //         System.out.println("ArcherAttack is Wrong");
        //         return;
        //     }
        //     if(ob3.getHealth() != init - damage1[levelarcher1[i]])
        //     {
        //         System.out.println("ArcherAttack is Wrong");
        //         return;
        //     }
        // }
        // System.out.println("ArcherCannon is correct\n");
        // System.out.println("Congratulations on finishing the Lab !!\nHope You Had Fun.\nGood Luck for The Quiz !\n\n");

// -----------------------------------------------------------------------------------

    }
}
