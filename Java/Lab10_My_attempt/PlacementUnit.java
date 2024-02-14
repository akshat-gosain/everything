import java.util.*;

public class PlacementUnit 
/*  Students enroll with the PU at the start of the SIP Season.
    Companies also do the same.
    After the enrollment is over, the PU lets the students apply for the companies.
    If no student applies for a company, the company is taken off the PU's list
    After the application process is over, PU will host the companies to take interviews.
    PU will host the companies in order of the Stipend (Everybody wants Money :) ).
    If the stipend of two companies is same, the one with more number of remaining students is hosted first.
    The Company interviews the student that they want to interview first.
    If the company is happy with the student, it informs the PU.
    PU allows the Company to hire the student.
 */
{

    // Add two Collections here
    // Both SHOULD and MUST be "private"
    // One stores the Students who have not been hired yet and should be named "remStudents"
    // Second stores the Companies that are enrolled with the PU and should be named "companies"
    // If a company has fulfilled its need of hirings, it is removed from the PU's collection
    // Think of Collections which would make your's and also the PU's work easier. :)

    // !!!!     TODO     !!!!

    public PlacementUnit()
    {
        // TODO
    }

    public Collection<Student> getRemStudents()
    {
        // TODO
    }

    public Collection<Company<? extends Student>> getCompanies()
    {
        // TODO
    }

    public void enrollStudent(Student s)   // The Student enrolls with the PU
    {
        // TODO
    }

    public void addCompany(Company<? extends Student> c)    // The Company enrolls with the PU
    {
        // TODO
    }
    
    public void applyCompanies()    // The enrollment of students and companies is over. The PU lets the Students apply for the Companies
    {
        // TODO
    }

    public void takeInterview()     // The PU lets the best company interview and hire the student that the company wants to
    {
        // TODO
    }
}