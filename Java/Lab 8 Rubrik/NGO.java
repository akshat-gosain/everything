import java.util.Arrays;

public class NGO implements LibraryInterface            // (12 marks total)
{
    // Fields
    private Book[] items;   // An array of Books that the library has, initally it has no books so the size of the array should be zero and increases or decreases as books are added or sold
    // The array should always be SORTED based on the prices of the books in ascending order
    private int itemCount;   // Number of books in the library
    private int budget;     // Budget that the NGO has

    public NGO(int initialBudget)
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

    public void receiveMoney(int amount)    // Used by the NGO to recieve money     (1 marks total)
    {
        this.budget += amount; // 1 mark
        System.out.println("Donation received: Rs" + amount);
    }


    // Need to implement the methods inherited from the interface
    //  When we add a book to an NGO, it is done using the budget of the NGO and should have enough budget for the book
    //  An NGO issues books to UnderPrivileged Kids only !!!!
    
    public void addBook(Book item)          // (3.5 marks total)
    {
        if(budget >= item.getCost()) // 1 mark for this check
        {
            // Deduct the cost from the budget
            budget -= item.getCost(); // 0.5 mark

            // Add the book to the NGO's collection
            Book[] updatedItems = Arrays.copyOf(items, items.length + 1);
            updatedItems[items.length] = item;
            items = updatedItems;
            // 1 marks only if the above 3 conditions are entirely correct

            itemCount++; // 0.5 mark
            // Sort the books by price
            Arrays.sort(items); // 0.5 mark
            System.out.println(item.getTitle() + " added to the NGO's library.");
        } 
        else 
        {
            System.out.println("NGO's budget is not sufficient to add the book.");
        }
    }

    public boolean canGetBook(Kid k, Book item)      // (7.5 marks total)
    {
        if(k instanceof UnderprivilegedKid) // 1 mark for the condition(students can also check if its instance of UnderprivilegedKid and write the PrivilegedKid part in else block)
        {
            for (int i = 0; i < items.length; i++) // 0.5 mark for the loop
            {
                if (items[i].equals(item))  // 1 mark for comparison(only using equals)
                {
                    // Remove the book from the NGO's collection
                    items[i] = items[itemCount-1];  // Replace the book with the last book in the array
                    Book[] updatedItems = Arrays.copyOf(items, items.length - 1);   
                    items = updatedItems;
                    // 2 marks if the logic is entirely correct(student could also have used for loops instead of copyOf)

                    itemCount--; // 0.5 mark

                    // Sort the books by price
                    Arrays.sort(items); // 0.5 mark
                    System.out.println(item.getTitle() + " issued from the NGO's library.");
                    return true; // 0.5 mark for returning true
                }
            }
            System.out.println(item.getTitle() + " not found in the NGO's library.");
            return false; // 0.5 mark for returning false
        }
        else    // The ngo doesnt give books to privileged kids
        {
            System.out.println("Please buy the book from a Book Store");
            return false; // 1 mark for returning false
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
