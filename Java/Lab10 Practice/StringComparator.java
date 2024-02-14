import java.util.Comparator;
public class StringComparator implements Comparator<String>     // Used by a SortedSet of Strings to sort the Strings
{
    public int compare(String s1, String s2) // Custom comparator for strings based on length
    {
        if(s1.length() < s2.length())
        {
            return -1;
        }
        else if(s1.length() > s2.length())
        {
            return 1;
        }
        else if(s1.equals(s2))      // Why this additional check? Why cant we directly return 0?
        {
            return 0;
        }
        return 1;
    }
}
