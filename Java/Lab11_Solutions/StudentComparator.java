import java.util.*;

public class StudentComparator implements Comparator<Student>  
{
    public int compare(Student s1, Student s2)    
    {
        if(s1.getGrade() > s2.getGrade())
        {
            return -1;
        }
        else if(s1.getGrade() < s2.getGrade())
        {
            return 1;
        }
        else if(s1.equals(s2))      // IMPORTANT
        {
            return 0;
        }
        return -1;
    }
}
