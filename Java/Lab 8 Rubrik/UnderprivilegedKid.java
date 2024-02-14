// 2 marks total

public class UnderprivilegedKid extends Kid implements GetBooksInterface    // An UnderprivilegedKid "is-a" Kid and can get books
{
    // public UnderprivilegedKid()  // No need to define a no-args constructor coz Java implicitly defines it
    // {
    //     super();
    // }


    // Need to implement the methods inherited from the Interface

    public void getFromBookStore(BookStore bs, Book b)
    {
        if(bs.canGetBook(this, b))      // If the kid can get the book from the store
        {
            this.addBook(b);    // Add the book to the kid's collection
        }
    }
    public void getFromNGO(NGO ngo, Book b) // 2 marks if entirely correct
    {
        if(ngo.canGetBook(this, b))      // If the kid can get the book from the ngo
        {
            this.addBook(b);    // Add the book to the kid's collection
        }
    }
}
