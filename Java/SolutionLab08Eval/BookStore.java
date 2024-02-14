import java.util.Arrays;

public class BookStore implements LibraryInterface
{
    // Fields
    private Book[] items;   // An array of Books that the library has, initally it has no books so the size of the array should be zero and increases or decreases as books are added or sold
    // The array should always be sorted based on the prices of the books in ascending order
    private int itemCount;  // Number of books in the library
    private int income;     // Money earned by the library

    public BookStore()      // Constructor
    {
        this.items = new Book[0];
        this.itemCount = 0;
        this.income = 0;
    }

    // Methods
    public Book[] getBooks()    // Returns the Books in the BookStore
    {
        return this.items;
    }
    public int getItemCount()   // Returns the number of items in the store
    {
        return this.itemCount;
    }
    public int getIncome()      // Returns the store's income
    {
        return this.income;
    }

    // Need to implement the methods inherited from the interface

    //  A BookStore sells books to Privileged Kids only  !!!!

    public void addBook(Book item)              
    {
        // Add the book to the book store
        Book[] updatedItems = Arrays.copyOf(items, items.length + 1);
        updatedItems[items.length] = item;
        items = updatedItems;

        itemCount++;

        // Sort the books by price
        Arrays.sort(items); // sort uses the compareTo method
        System.out.println(item.getTitle() + " added to the BookStore's library.");
    }

    public boolean canGetBook(Kid k, Book item)                                 
    {
        if(k instanceof PrivilegedKid)      // if the Kid is Privileged
        {
            for(int i = 0; i < itemCount; i++)  // Check all the books
            {
                if(items[i].equals(item))   // If the book is equal to the one that the kid wants
                {
                    PrivilegedKid k_new = (PrivilegedKid) k;    // Typecast the Kid into PrivilegedKid so that we can use the methods of the PrivilegedKid class
                    if(k_new.getMoney() < item.getCost())   // If the kid does not have enough money
                    {
                        System.out.println("Insufficient balance");
                        return false;
                    }
                    // Remove the book from the store
                    items[i] = items[itemCount-1];  // Replace the sold book with the last book in the array
                    items[itemCount-1] = null;  // Replace the last book in the array with null
                    Book[] updatedItems = Arrays.copyOf(items, items.length - 1);   
                    items = updatedItems;

                    itemCount--;

                    // Sort the books by price
                    Arrays.sort(items);

                    System.out.println(item.getTitle() + " sold from the book store.");
                    this.income += item.getCost();      // Income of the store increases
                    return true;
                }
            }
            System.out.println(item.getTitle() + " not found in the book store.");
            return false;
        }
        else        // The kid is underprivileged
        {
            System.out.println("Purchase Unsuccessfull");
            return false;
        }
    }

    public void displayItems() 
    {
        System.out.println("Books currently in the book store:");
        for (Book b : items) 
        {
            if (b != null) 
            {
                System.out.println(b);
            }
        }
    }
}
