public interface GetBooksInterface 
{
    void getFromBookStore(BookStore bs, Book b); // Used by a kid to get a book from the bookstore

    void getFromNGO(NGO ngo, Book b);    // Used by a kid to get a book from the ngo

    // Both these methods will use the canGetBook method of the LibraryInterface to check if the kid can get the book or not
    // Update any fields of the kids within these methods and not within the canGetBook method
}



