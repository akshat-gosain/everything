import java.util.*;             

public class ITCompany extends Company<Student> implements HiringInterface
// An ITCompany "is-a" Company that can hire and hires any type of Students 
{
    private int minDSA;     // Company wants the Student to have atleast some grasp of DSA
    private int minCPLevel; // Company wants the Student to be atleast this much good in CP
    private int wowDSA;     // A company would be delighted if the student has done this much DSA and may want to hire regardless of other skills
    private int wowCP;      // A company would be delighted if the student is this much good in CP and may want to hire regardless of other skills

    public ITCompany(String name, double minCGPA, int maxPassingYear, int studentsRemaining, int stipend, int minProjects, int wowProjects, int minDSA, int minCPLevel, int wowDSA, int wowCP)
    {
        super(name, minCGPA, maxPassingYear, studentsRemaining, stipend, minProjects, wowProjects);
        this.minDSA = minDSA;
        this.minCPLevel = minCPLevel;
        this.wowDSA = wowDSA;
        this.wowCP = wowCP;
    }

    public int getMinDSA()    
    {
        return this.minDSA;
    }
    public int getMinCPLevel()  
    {
        return this.minCPLevel;
    }
    public int getWowDSA() 
    {
        return this.wowDSA;
    }
    public int getWowCP()   
    {
        return this.wowCP;
    }

    public boolean takeInterview()
    // The Company interviews the Student that they would like to interview first, and returns true/false depending on whether or not they are impressed by the Student. If they are not impressed, they reject the student and his application is cancelled.
    {
        SortedSet<Student> applicants = (SortedSet<Student>)getAppliedStudents();
        Student first = applicants.first();
        if(first.isHired())     // The Student got hired by some other company before this company could interview // VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV IMPORTANT
        ///////////////////////////////////////////////////////////////////////////////
        {
            applicants.remove(first);
            return false;
        }
        if(first instanceof CSStudent)
        {
            CSStudent firstCS = (CSStudent)first;
            if(firstCS.getNumProjects() >= this.getMinProjects() && firstCS.getCPLevel() >= this.getMinCPLevel() && firstCS.getDSALevel() >= this.getMinDSA())
            {
                return true;
            }
            else if(firstCS.getNumProjects() >= getWowProjects() || firstCS.getCPLevel() >= getWowCP() || firstCS.getDSALevel() >= getWowDSA())
            {
                return true;
            }
            
        }
        else if(first.getNumProjects() >= getWowProjects())
        {
            return true;
        }
        applicants.remove(first);
        return false;
    }
    public void hire()  // The Company hires the Student that they just interviewed.
    {
        SortedSet<Student> applicants = (SortedSet<Student>)getAppliedStudents();
        Student first = applicants.first();
        decStudentsRem();
        addToHired(first);
        applicants.remove(first);
        first.congrats(getName());
    }
}
