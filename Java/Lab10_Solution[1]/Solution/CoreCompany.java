import java.util.*;             

public class CoreCompany extends Company<PhoenixStudent> implements HiringInterface
// A CoreCompany "is-a" Company that can hire and hires only PhoenixStudents 
{
    private int minCoreSkill;   // Company wants the Student to have atleast some core skill
    private int wowCoreSkill;   // A company would be delighted if the student has done this much core skill and may want to hire regardless of other skills

    public CoreCompany(String name, double minCGPA, int maxPassingYear, int studentsRemaining, int stipend, int minProjects, int wowProjects, int minCoreSkill, int wowCoreSkill)
    {
        super(name, minCGPA, maxPassingYear, studentsRemaining, stipend, minProjects, wowProjects);
        this.minCoreSkill = minCoreSkill;
        this.wowCoreSkill = wowCoreSkill;
    }
    public int getMinCoreSkill()    
    {
        return this.minCoreSkill;
    }
    public int getWowCoreSkill()    
    {
        return this.wowCoreSkill;
    }
    public boolean takeInterview()  // The Company interviews the Student that they would like to interview first, and returns true/false depending on whether or not they are impressed by the Student. If they are not impressed, they reject the student and his application is cancelled.
    {
        SortedSet<PhoenixStudent> applicants = (SortedSet<PhoenixStudent>)getAppliedStudents();
        PhoenixStudent first = applicants.first();
        if(first.isHired())     // The Student got hired by some other company before this company could interview // VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV IMPORTANT
        ///////////////////////////////////////////////////////////////////////////////
        {
            applicants.remove(first);
            return false;
        }
        if(first.getNumProjects() >= getMinProjects() && first.getCoreSkill() >= getMinCoreSkill())
        {
            return true;
        }
        else if(first.getNumProjects() >= getWowProjects() || first.getCoreSkill() >= getWowCoreSkill())
        {
            return true;
        }
        applicants.remove(first);
        return false;
    }
    public void hire()  // The Company hires the Student that they just interviewed.
    {
        SortedSet<PhoenixStudent> applicants = (SortedSet<PhoenixStudent>)getAppliedStudents();
        PhoenixStudent first = applicants.first();
        decStudentsRem();
        addToHired(first);
        applicants.remove(first);
        first.congrats(getName());
    }
}
