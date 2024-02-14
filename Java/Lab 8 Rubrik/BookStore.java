import java.util.Arrays;

public class BookStore implements LibraryInterface          // (11 marks total)
{
    // Fields
    private Book[] items;   // An array of Books that the library has, initally it has no books so the size of the array should be zero and increases or decreases as books are added or sold
    // The array should always be sorted based on the prices of the books in ascending order
    private int itemCount;  // Number of books in the library
    private int income;     // Money earned by the library

    public BookStore()
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

    public void addBook(Book item)              // (2 marks total)
    {
        // Add the book to the book store
        Book[] updatedItems = Arrays.copyOf(items, items.length + 1);
        updatedItems[items.length] = item;
        items = updatedItems;
        // 1 marks only if the above 3 conditions are entirely correct

        itemCount++; // 0.5 mark

        // Sort the books by price
        Arrays.sort(items); // 0.5 mark
        System.out.println(item.getTitle() + " added to the BookStore's library.");
    }

    public boolean canGetBook(Kid k, Book item)     // (9 marks total)                              
    {
        if(k instanceof PrivilegedKid) // 1 mark for the condition(students can also check if its instance of UnderprivilegedKid and write the PrivilegedKid part in else block)
        {
            for(int i = 0; i < itemCount; i++)  // 0.5 mark for the loop
            {
                if(items[i].equals(item))   // 1 mark for comparison(only using equals)
                {
                    PrivilegedKid k_new = (PrivilegedKid) k;    // Typecast the Kid into PrivilegedKid so that we can use the methods of the PrivilegedKid class
                    if(k_new.getMoney() < item.getCost())  // 1 mark
                    {
                        System.out.println("Insufficient balance");
                        return false;
                    }
                    // Remove the book from the store

                    items[i] = items[itemCount-1];  // Replace the sold book with the last book in the array
                    Book[] updatedItems = Arrays.copyOf(items, items.length - 1);   
                    items = updatedItems;
                    // 2 marks if the logic is entirely correct(student could also have used for loops instead of copyOf)


                    itemCount--; // 0.5 mark

                    // Sort the books by price
                    Arrays.sort(items); // 0.5 mark

                    System.out.println(item.getTitle() + " sold from the book store.");
                    this.income += item.getCost(); // 0.5 mark
                    return true; // 0.5 mark for returning true
                }
            }
            System.out.println(item.getTitle() + " not found in the book store.");
            return false; // 0.5 mark for returning false
        }
        else // The kid is underprivileged
        {
            System.out.println("Purchase Unsuccessfull");
            return false; // 1 mark for returning false
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
