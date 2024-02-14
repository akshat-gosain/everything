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
    private ArrayList<Student> remStudents;     // Stores the Students who are left to be hired
    private SortedSet<Company<? extends Student>> companies;    // Stores the Companies who have come to hire and have not yet finished their hiring

    public PlacementUnit()
    {
        this.remStudents = new ArrayList<>();
        this.companies = new TreeSet<>(new CompanyComparator());
    }

    public Collection<Student> getRemStudents()     
    {
        return this.remStudents;
    }

    public Collection<Company<? extends Student>> getCompanies()    
    {
        return this.companies;
    }

    public void enrollStudent(Student s)   // The Student enrolls with the PU   
    {
        remStudents.add(s);
    }

    public void addCompany(Company<? extends Student> c)    // The Company enrolls with the PU  
    {
        companies.add(c);
    }
    
    public void applyCompanies()    // The enrollment of students and companies is over. The PU lets the Students apply for the Companies
    {
        for(Student s : remStudents)
        {
            for(Company<? extends Student> comp : companies)
            {
                if(s.canApply(comp))
                {
                    s.apply(comp);
                }
            }
        }
        Iterator<Company<? extends Student>> iterator = companies.iterator();
        while(iterator.hasNext()) 
        {
            Company<? extends Student> comp = iterator.next();
            if(comp.getNumApplicants() == 0)    // Nobody applied for the Company
            {
                iterator.remove();  // Use iterator's remove to avoid ConcurrentModificationException
            }
        }

    }

    public void takeInterview()     // The PU lets the best company interview and hire the student that the company wants to
    {
        if(companies.isEmpty())
        {
            System.out.println("No more companies left");
            return;
        }
        Company<? extends Student> keepReference = companies.first();      // This is important coz if we dont do this, the company may go back in order on updation of fields, so we need to keep a reference.
        if(companies.first() instanceof ITCompany)
        {
            ITCompany itComp = ((ITCompany)companies.first());
            if(itComp.takeInterview())      // The Company wants to hire the student
            {
                remStudents.remove(itComp.getFirstApplicant());     // Remove the student from the PU's collection
                itComp.hire();      // The company hires the Student
            }
        }
        else
        {
            CoreCompany coreComp = ((CoreCompany)companies.first());    
            if(coreComp.takeInterview())    // The Company wants to hire the student
            {
                remStudents.remove(coreComp.getFirstApplicant());   // Remove the student from the PU's collection
                coreComp.hire();    // The company hires the Student
            }
        }
        if(keepReference.getStudentsRem() == 0 || keepReference.getNumApplicants() == 0)     // The company has fulfilled its reqd number of students
        {
            companies.remove(keepReference);    // Remove the company from the PU's collection
        }
    }
}