import java.util.*;

public class Company<T extends Student>    // !!!! Something changes on this line !!!!
// A Company is parametrised by various kinds of Students
{
    private String name;    // Name of the Company
    private double minCGPA;    // minimum CGPA reqd to apply for the Company
    private int maxPassingYear;     // Maximum passing year that a Student can apply
    private int studentsRemaining;  // Number of students the Company wants to hire more
    private int stipend;    // Stipend the Company is paying
    private int minProjects;    // Company wants the student to have done atleast some projects
    private int wowProjects;    // A company would be delighted if the student has done these many projects and may want to hire regardless of other skills
    private SortedSet<T> appliedStudents;
    private SortedSet<T> hiredStudents;

    // Add two Collections here, both parametrised with T i.e. <T>
    // Both SHOULD and MUST be "private"
    // One stores the Students who have applied for the Company and should be named "appliedStudents"
    // Second stores the Students who have been hired by the Company and should be named "hiredStudents"
    // Think of Collections which would make your's and also the Company's work easier. :)

    // !!!!    TODO    !!!!


    public Company(String name, double minCGPA, int maxPassingYear, int studentsRemaining, int stipend, int minProjects, int wowProjects)
    {
        this.name = name;
        this.minCGPA = minCGPA;
        this.maxPassingYear = maxPassingYear;
        this.studentsRemaining = studentsRemaining;
        this.stipend = stipend;
        this.minProjects = minProjects;
        this.wowProjects = wowProjects;
        

        // TODO
    }
    public String getName()
    {
        return this.name;
        // TODO
    }
    public double getMinCGPA()
    {
        return this.minCGPA;
        // TODO
    }
    public int getMaxPassingYear()
    {
        return this.maxPassingYear;
        // TODO
    }
    public int getStudentsRem()
    {
        return this.studentsRemaining;
        // TODO
    }
    public int getStipend()
    {
        return this.stipend;
        // TODO
    }
    public int getMinProjects()
    {
        return this.minProjects;
        // TODO
    }
    public int getWowProjects()
    {
        return this.wowProjects;
        // TODO
    }
    public Collection<T> getAppliedStudents()
    {
        return this.appliedStudents;

        // TODO
    }
    public Collection<T> getHiredStudents()
    {
        return this.hiredStudents;
        // TODO
    }
    public T getFirstApplicant()    // Returns the Applicant who the Company would like to interview first
    {
        return this.appliedStudents.first();
        // TODO
    }
    public void decStudentsRem()    // Decreases the number of students the company is left to hire
    {
        this.studentsRemaining--;
        // TODO
    }
    public int getNumApplicants()
    {
        return this.appliedStudents.size();
        // TODO
    }
    
    public boolean hasApplied(T s)      // Checks if the Student has applied for the Company
    {
        return this.appliedStudents.contains(s);
        
        // TODO
    }

    public boolean isHired(T s)         // Checks if the Company has hired the Student
    {
        return this.hiredStudents.contains(s);
        // TODO
    }

    public void receiveApplication(T s)     // Company receives the Student's Application
    {
        this.appliedStudents.add(s);
        // TODO
    }
    public void addToHired(T s)     // The Student has been hired by the Company
    {
        this.hiredStudents.add(s);
        // TODO
    }



    public String toString() 
    {
        return "Company [name = " + name + ", minCGPA = " + minCGPA + ", maxPassingYear = " + maxPassingYear
                + ", studentsRemaining = " + studentsRemaining + ", stipend = " + stipend + "]";
    }
}

