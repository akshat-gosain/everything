public class Student implements ApplyingInterface   // A Student can apply to companies     
{
    private String name;    // Name of the student
    private double CGPA;    // CGPA of the student
    private int passingYear;    // The year in which the student graduates
    private int semsDone;   // Number of sems done by the student
    private int numProjects;    // Number of projects done by the student
    private int expectedStipend;    // The stipend that the Student wants
    private boolean hired;      // Whether or not the student is hired
    private String company;     // Company in which the Student is hired
    public Student(String name, double CGPA, int passingYear, int semsDone, int numProjects, int expectedStipend)
    {
        this.name = name;
        this.CGPA = CGPA;
        this.passingYear = passingYear;
        this.semsDone = semsDone;
        this.numProjects = numProjects;
        this.expectedStipend = expectedStipend;
        this.hired = false;
        this.company = null;
    }

    public String getName() 
    {
        return this.name;
    }
    public double getCGPA() 
    {
        return this.CGPA;
    }
    public int getPassingYear() 
    {
        return this.passingYear;
    }
    public int getSemsDone()    
    {
        return this.semsDone;
    }
    public int getNumProjects() 
    {
        return this.numProjects;
    }
    public int getExpectedStipend() 
    {
        return this.expectedStipend;
    }
    public boolean isHired()  
    {
        return this.hired;
    }
    public String getCompany() 
    {
        return this.company;
    }

    public double semResult(double SGPA)    // Updates the CGPA based on the SGPA and returns the updated CGPA                                                 
    {
        CGPA = (CGPA*semsDone + SGPA)/(semsDone + 1);
        semsDone++;
        return CGPA; 
    }
    public int doProject()      // The Student does a project. Returns the updated number of projects
    {
        this.numProjects++;
        return numProjects;
    }
    
    public void congrats(String companyName)      // The student has been hired by a company :)
    {
        this.hired = true;
        this.company = companyName;
    }

    public boolean canApply(Company<? extends Student> c)   // Returns true if the Student can and wants to apply to the Company 
    {
        if(c instanceof ITCompany)      // Any branch can apply for IT company
        {
            return !hired && this.getCGPA() >= c.getMinCGPA() && this.getPassingYear() <= c.getMaxPassingYear() && this.getExpectedStipend() <= c.getStipend();
        }
        else         // Only Phoenix can apply to Core
        {
            return this instanceof PhoenixStudent && !hired && this.getCGPA() >= c.getMinCGPA() && this.getPassingYear() <= c.getMaxPassingYear() && this.getExpectedStipend() <= c.getStipend();
        }
    }

    
    public void apply(Company<? extends Student> c) // The Student applies to the Company
    {
        if(c instanceof CoreCompany)
        {
            ((CoreCompany)c).receiveApplication((PhoenixStudent)this);
        }
        else
        {
            ((ITCompany)c).receiveApplication(this);
        }
    }

    public String toString()
    {
        if(hired)
        {
            return "Student { " +
                "name = '" + name + '\'' +
                ", CGPA = " + CGPA +
                ", passingYear = " + passingYear +
                ", semsDone = " + semsDone +
                ", numProjects = " + numProjects +
                ", expectedStipend = " + expectedStipend +
                ", company = '" + company + '\'' +
                '}';
        }
        else 
        {
            return "Student {" +
                "name = '" + name + '\'' +
                ", CGPA = " + CGPA +
                ", passingYear = " + passingYear +
                ", semsDone = " + semsDone +
                ", numProjects = " + numProjects +
                ", expectedStipend = " + expectedStipend +
                ", not Hired yet"+
                '}';
        }
        // return name;
    }
}