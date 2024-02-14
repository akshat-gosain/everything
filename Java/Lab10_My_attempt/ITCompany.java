import java.util.*;

public class ITCompany extends Company<Student> //  !!!!     Something Changes on this line      !!!!
// An ITCompany "is-a" Company that can hire and hires any type of Students 
{
    private int minDSA;     // Company wants the Student to have atleast some grasp of DSA
    private int minCPLevel; // Company wants the Student to be atleast this much good in CP
    private int wowDSA;     // A company would be delighted if the student has done this much DSA and may want to hire regardless of other skills
    private int wowCP;      // A company would be delighted if the student is this much good in CP and may want to hire regardless of other skills

    public ITCompany(String name, double minCGPA, int maxPassingYear, int studentsRemaining, int stipend, int minProjects, int wowProjects, int minDSA, int minCPLevel, int wowDSA, int wowCP)
    {
        super(name,minCGPA,maxPassingYear,studentsRemaining,stipend,minProjects,wowProjects);
        this.minDSA = minDSA;
        this.minCPLevel = minCPLevel;
        this.wowDSA = wowDSA;
        this.wowCP = wowCP;
    }

    public int getMinDSA()
    {
        return this.minDSA;
        // TODO
    }
    public int getMinCPLevel()
    {
        return this.minCPLevel;
        // TODO
    }
    public int getWowDSA()
    {
        return this.wowDSA;
        // TODO
    }
    public int getWowCP()
    {
        return this.wowCP;
        // TODO
    }

}
