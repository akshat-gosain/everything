// 5 marks total

public class PrivilegedKid extends Kid implements GetBooksInterface     // A PrivilegedKid "is-a" Kid and can get books
{
    private int money;   // A PrivilegedKid has money   
    
    public PrivilegedKid(int money) // Constructor
    {
        //super();  // No need to call the parameterless super constructor coz it is called implicitly
        this.money = money;
    }

    // Methods
    public int getMoney()   // Returns the current amount of money
    {
        return money;
    }

    public void deductMoney(int amount) // 1 mark if entirely correct logic
    {
        if(this.money < amount)
        {
            return;
        }
        this.money -= amount;
    }

    public void donateMoney(NGO ngo, int amount) // 2 marks if entirely correct
    {
        if(this.getMoney() < amount)
        {
            System.out.println("Insufficient funds");
            return;
        }
        ngo.receiveMoney(amount);
        this.deductMoney(amount);
    }

    // Need to implement the methods inherited from the Interface

    public void getFromBookStore(BookStore bs, Book b) // 2 marks if entirely correct
    {
        if(bs.canGetBook(this, b))
        {
            this.deductMoney(b.getCost());
            this.addBook(b);
        }
    }
    public void getFromNGO(NGO ngo, Book b)
    {
        if(ngo.canGetBook(this, b))    // If the kid can get the book from the ngo
        {
            this.addBook(b);    // Add the book to the kid's collection
        }
    }
}
