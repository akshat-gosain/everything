import java.util.Arrays;

public class NGO implements LibraryInterface
{
    // Fields
    private Book[] items;   // An array of Books that the library has, initally it has no books so the size of the array should be zero and increases or decreases as books are added or sold
    // The array should always be SORTED based on the prices of the books in ascending order
    private int itemCount;   // Number of books in the library
    private int budget;     // Budget that the NGO has

    public NGO(int initialBudget) // Constructor
    {
        this.items = new Book[0];
        this.itemCount = 0;
        this.budget = initialBudget;
    }

    // Methods
    public Book[] getBooks()    // Returns the Books in the NGO
    {
        return this.items;
    }
    public int getBudget()         // Returns the budget of the NGO
    {
        return this.budget;
    }
    public int getItemCount()    // Returns the number of items of the ngo
    {
        return this.itemCount;
    }

    public void receiveMoney(int amount)    // Used by the NGO to recieve money
    {
        this.budget += amount;
        System.out.println("Donation received: Rs" + amount);
    }


    // Need to implement the methods inherited from the interface
    //  When we add a book to an NGO, it is done using the budget of the NGO and should have enough budget for the book
    //  An NGO issues books to UnderPrivileged Kids only !!!!
    
    public void addBook(Book item) 
    {
        if(budget >= item.getCost())    // A book can only be added if the ngo has enough budget
        {
            // Deduct the cost from the budget
            budget -= item.getCost();

            // Add the book to the NGO's collection
            Book[] updatedItems = Arrays.copyOf(items, items.length + 1);
            updatedItems[items.length] = item;
            items = updatedItems;

            itemCount++;
            // Sort the books by price
            Arrays.sort(items);     // sort uses the compareTo method
            System.out.println(item.getTitle() + " added to the NGO's library.");
        } 
        else 
        {
            System.out.println("NGO's budget is not sufficient to add the book.");
        }
    }

    public boolean canGetBook(Kid k, Book item)      
    {
        if(k instanceof UnderprivilegedKid)     // If the kid is underprivileged
        {
            for (int i = 0; i < items.length; i++)  // Check all the books
            {
                if (items[i].equals(item))  // If the book is equal to the one that the kid wants
                {
                    // Remove the book from the NGO's collection
                    items[i] = items[itemCount-1];  // Replace the book with the last book in the array
                    items[itemCount-1] = null;  // Replace the last book in the array with null
                    Book[] updatedItems = Arrays.copyOf(items, items.length - 1);   
                    items = updatedItems;

                    itemCount--;

                    // Sort the books by price
                    Arrays.sort(items);
                    System.out.println(item.getTitle() + " issued from the NGO's library.");
                    return true;
                }
            }
            System.out.println(item.getTitle() + " not found in the NGO's library.");
            return false;
        }
        else    // The ngo doesnt give books to privileged kids
        {
            System.out.println("Please buy the book from a Book Store");
            return false;
        }
    }

    public void displayItems() 
    {
        System.out.println("Books currently in the NGO's library:");
        for(Book libraryItem : items) 
        {
            if(libraryItem != null) 
            {
                System.out.println(libraryItem);
            }
        }
    }
}
