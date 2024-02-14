public interface LibraryInterface 
{
    void addBook(Book item);    // Adds the book to the collection

    boolean canGetBook(Kid k, Book item);   // Used by the library to check if the kid can get the book. If the kid can, return true and remove the book from the library. The true will be used by the kid to add the book to its collection.
    // This method does not do any updation to the kid's fields and only reads the kid's fields
    //  A BookStore sells books to Privileged Kids only  !!!!
    //  An NGO issues books to UnderPrivileged Kids only !!!!
    
    void displayItems();    // Prints the info about all the books
}
