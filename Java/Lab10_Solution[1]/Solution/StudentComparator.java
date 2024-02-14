import java.util.*;

public class StudentComparator implements Comparator<Student>   // Used to sort based on their CGPA
{
    public int compare(Student s1, Student s2)      // Sort based on decreasing order of CGPA
    {
        if(s1.getCGPA() > s2.getCGPA())
        {
            return -1;
        }
        else if(s1.getCGPA() < s2.getCGPA())
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
