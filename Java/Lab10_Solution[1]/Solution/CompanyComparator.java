import java.util.*;

public class CompanyComparator implements Comparator<Company<? extends Student>>    // Used to sort companies based on their stipend and number of students remaining
{
    public int compare(Company<? extends Student> c1, Company<? extends Student> c2) 
    {
        if(c1.getStipend() == c2.getStipend())
        {
            if(c1.getStudentsRem() > c2.getStudentsRem())
            {
                return -1;
            }
            else if(c1.getStudentsRem() < c2.getStudentsRem())
            {
                return 1;
            }
            else if(c1.equals(c2))      // Coz the sorted sort uses this comparator to eliminate duplicates, this is needed so that companies with the same stipend and same remstudents arent considered same.
            {
                return 0;
            }
            return 1;
        }
        return (int)Math.signum(c2.getStipend() - c1.getStipend());
    }
}