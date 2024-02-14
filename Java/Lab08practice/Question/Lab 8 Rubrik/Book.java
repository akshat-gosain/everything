// Total 8 marks

public class Book implements Comparable { // (1 mark for implementing Comparable)
    private String title;       // Fields
    private int cost;
    private String author;

    public Book(String title, int cost, String author) { // (1 mark if all correct)  
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

    public boolean equals(Object obj)   // Checks if the object is equal to this book ie the title and author are same (Cost may be different)          //(2 marks total)
    {
        if(obj instanceof Book) // (1 mark for checking instanceof)
        {
            Book other = (Book)obj;
            return this.author == other.getAuthor() && this.title == other.getTitle(); 
            // (1 mark if both these comparisons are present, dont cut marks if cost is also equated)
        }
        return false;
    }


    // Need to define the method inherited from the interface
    // Compares on the basis of the cost
    // Returns 1 if cost of this book is more than the other
    // Returns 0 if both are equal
    // Returns -1 if other book has more cost
    // It is guaranteed that other "is-a" Book
    public int compareTo(Object other)      // (4 marks total)
    {
        Book otherBook = (Book)other; // (1 mark)
        if(this.cost > otherBook.getCost()) // (1 mark only if the condtion and return value is correct)
        {
            return 1;
        } 
        else if(this.cost == otherBook.getCost()) // (1 mark only if the condtion and return value is correct)
        {
            return 0;
        }
        return -1; // (1 mark only if the condtion and return value is correct)
    }

    
}