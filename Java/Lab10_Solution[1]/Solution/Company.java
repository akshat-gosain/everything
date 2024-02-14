import java.util.*;                        

public class Company<T extends Student>     // A Company is parametrised by a various kinds of Students
{
    private String name;    // Name of the Company
    private double minCGPA;    // minimum CGPA reqd to apply for the Company
    private int maxPassingYear;     // Maximum passing year that a Student can apply
    private int studentsRemaining;  // Number of students the Company wants to hire more
    private int stipend;    // Stipend the Company is paying
    private int minProjects;    // Company wants the student to have done atleast some projects
    private int wowProjects;    // A company would be delighted if the student has done these many projects and may want to hire regardless of other skills
    private SortedSet<T> appliedStudents;   // Stores the Students who have applied for the Company
    private ArrayList<T> hiredStudents;     // Stores the Students who have been hired by the Company

    public Company(String name, double minCGPA, int maxPassingYear, int studentsRemaining, int stipend, int minProjects, int wowProjects)
    {
        this.name = name;
        this.minCGPA = minCGPA;
        this.maxPassingYear = maxPassingYear;
        this.studentsRemaining = studentsRemaining;
        this.stipend = stipend;
        this.minProjects = minProjects;
        this.wowProjects = wowProjects;
        this.appliedStudents = new TreeSet<>(new StudentComparator());  // Want the applied students in order of their CGPA
        this.hiredStudents = new ArrayList<>();
    }
    public String getName()
    {
        return this.name;
    }
    public double getMinCGPA()
    {
        return this.minCGPA;
    }
    public int getMaxPassingYear()
    {
        return this.maxPassingYear;
    }
    public int getStudentsRem()
    {
        return this.studentsRemaining;
    }
    public int getStipend()
    {
        return this.stipend;
    }
    public int getMinProjects()
    {
        return this.minProjects;
    }
    public int getWowProjects()
    {
        return this.wowProjects;
    }
    public Collection<T> getAppliedStudents()  
    {
        return this.appliedStudents;
    }
    public Collection<T> getHiredStudents()     
    {
        return this.hiredStudents;
    }
    public T getFirstApplicant()    // Returns the Applicant who the Company would like to interview first
    {
        return this.appliedStudents.first();
    }
    public void decStudentsRem()    // Decreases the number of students the company is left to hire
    {
        this.studentsRemaining--;
    }
    public int getNumApplicants() 
    {
        return appliedStudents.size();
    }
    
    public boolean hasApplied(T s)      // Checks if the Student has applied for the Company
    {
        return appliedStudents.contains(s);
    }

    public boolean isHired(T s)         // Checks if the Company has hired the Student
    {
        return hiredStudents.contains(s);
    }

    public void receiveApplication(T s)     // Company receives the Student's Application
    {
        appliedStudents.add(s);
    }
    public void addToHired(T s)     // The Student has been hired by the Company
    {
        hiredStudents.add(s);
    }

    public String toString() 
    {
        return "Company [name = " + name + ", minCGPA = " + minCGPA + ", maxPassingYear = " + maxPassingYear
                + ", studentsRemaining = " + studentsRemaining + ", stipend = " + stipend + "]";
    }
}
