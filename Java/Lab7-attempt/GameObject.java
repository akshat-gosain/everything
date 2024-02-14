public class GameObject 
{
    private String name;    // Name of the object, can be anything like "JOHN"
    private Circle range;   // represents range of attack
    private int health;     // Current health of the object
    private int[] damage;   // An array of damage for each level
    private int level;    // level is also 0-indexed, so initial level should be 0

    public GameObject(String name, int initialHealth, int[] damage, int x, int y, int radius)
    {
        // TODO
        this.name = name;
        this.health = initialHealth;
        this.range = new Circle(x,y,radius);
        this.damage = damage;
    }
    public GameObject(String name, int initialHealth, int[] damage, int radius, Point2D centre)
    {
        this.centre = new Point2D(x, y);
        this.name = name;
        this.health = initialHealth;
        this.range = new Circle(x,y,radius);
        this.damage = damage;
        // TODO
    }

    public String getName()     
    // Return the name of the object
    {
        return this.name;
        // TODO
    }
    public int getHealth()      
    // Return the health of the object
    {
        return this.health;
        // TODO
    }
    public int getLevel()       
    // Return the level of the object
    {
        // TODO
        return this.level;
    }
    public Circle getRange()    
    // Return the range of the object
    {
        return this.range;
        // TODO
    }
    public void move(int x, int y)  
    // Move the object to another location
    {
        this.centre = new Point2D(x,y);
        // TODO
    }
    public void move(Point2D newLocation)   
    // Move the object to another location
    {
        this.centre = newLocation;
        // TODO
    }

    public void incLevel()      
    // increases the level of the object by 1
    // make sure that the level does not pass the Max Level (Size of the array)
    {
        if(this.level<damage.length){
            this.level++;
        }
        // TODO
    }
    public boolean withinRange(GameObject obj)  
    // Check if the object is within the range
    {
        return this.range.withinCircle[Obj.range.get()];
        // TODO
    }
    public boolean isDead()     
    // Return if the object is dead ie if its health is 0
    {
        if(this.health == 0){
            return true;
        }else{
            return false;
        }
        // TODO
    }
    public int getDamage()  
    // Return the damage the object does based on its level
    {
        return this.damage(this.level);

        }
        // TODO
    
    public void takeDamage(int damage)
    // Used when another object attacks this object
    // Make sure that the health does not become negative
    {
        if((this.health >= 0) || (this.health>=this.damage)){
            this.health = this.health - this.damage;
        }
    }



