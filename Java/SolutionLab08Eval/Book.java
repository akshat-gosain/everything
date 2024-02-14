public class Book implements Comparable // A Book is Comparable
{
    private String title;       // Fields
    private int cost;
    private String author;

    public Book(String title, int cost, String author)      // Constructor
    {
        this.title = title;
        this.cost = cost;
        this.author = author;
    }

    public String getTitle()    // Methods
    {
        return this.title;
    }

    public String getAuthor() 
    {
        return this.author;
    }

    public int getCost() 
    {
        return this.cost;
    }

    public String toString() 
    {
        return "Book{title='" + title + "', cost=" + cost + ", author='" + author + "'}";
    }

    public boolean equals(Object obj)   // Checks if the object is equal to this book ie the title and author are same (Cost may be different)
    {
        if(obj instanceof Book)
        {
            Book other = (Book)obj;
            return this.author == other.getAuthor() && this.title == other.getTitle();
        }
        return false;
    }


    // Need to define the method inherited from the interface
    // Compares on the basis of the cost
    // Returns 1 if cost of this book is more than the other
    // Returns 0 if both are equal
    // Returns -1 if other book has more cost
    // It is guaranteed that other "is-a" Book
    public int compareTo(Object other)      
    {
        Book otherBook = (Book)other;
        if(this.cost > otherBook.getCost()) 
        {
            return 1;
        } 
        else if(this.cost == otherBook.getCost()) 
        {
            return 0;
        }
        return -1;
    }

    
}