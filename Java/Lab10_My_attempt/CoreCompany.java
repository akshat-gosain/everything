import java.util.*;

public class CoreCompany extends Company<Student>    // !!!! Something changes here  !!!!
// A CoreCompany "is-a" Company that can hire and hires only PhoenixStudents 
{
    private int minCoreSkill;   // Company wants the Student to have atleast some core skill
    private int wowCoreSkill;   // A company would be delighted if the student has done this much core skill and may want to hire regardless of other skills

    public CoreCompany(String name, double minCGPA, int maxPassingYear, int studentsRemaining, int stipend, int minProjects, int wowProjects, int minCoreSkill, int wowCoreSkill)
    {
        super(name,minCGPA,maxPassingYear,studentsRemaining,stipend, minProjects, wowProjects);
        this.minCoreSkill = minCoreSkill;
        this.wowCoreSkill = wowCoreSkill;
        // TODO
    }
    public int getMinCoreSkill()
    {
        return this.minCoreSkill;
        // TODO
    }
    public int getWowCoreSkill()
    {
        return this.wowCoreSkill;
        // TODO
    }
    
}
