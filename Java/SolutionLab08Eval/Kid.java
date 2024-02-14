import java.util.Arrays;

public class Kid 
{
    private Book[] books;       // A Kid "has-a" array of Books, initially there are 0 books, so the size of array is 0

    public Kid()    // Constructor
    {
        this.books = new Book[0];
    }

    // Methods

    public Book[] getBooks()    // Returns the Books of the Kid
    {
        return books;
    }

    public void addBook(Book book)  // Add the book to the kid's collection
    {
        Book[] updatedBooks = Arrays.copyOf(books, books.length + 1);
        updatedBooks[books.length] = book;
        books = updatedBooks;
    }

    public void displayBooks() // Print the books owned by the kid
    {
        System.out.println("Books owned by the kid:");
        for(Book book : books) 
        {
            System.out.println(book);
        }
    }
}
