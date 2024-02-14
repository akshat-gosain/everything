public class Student    // !!!!! Something Changes on this line !!!!
// A Student can apply to companies
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
        // TODO
    }

    public String getName()
    {
        return this.name;
        // TODO
    }
    public double getCGPA()
    {
        return this.CGPA;        // TODO
    }
    public int getPassingYear()
    {
        return this.passingYear;
        // TODO
    }
    public int getSemsDone()
    {
        return this.semsDone;
        // TODO
    }
    public int getNumProjects()
    {
        return this.numProjects;
        // TODO
    }
    public int getExpectedStipend()
    {
        return this.expectedStipend;
        // TODO
    }
    public boolean isHired()
    {
        return this.hired;
        // TODO
    }
    public String getCompany()
    {
        return this.company;
        // TODO
    }

    public double semResult(double SGPA)    // Updates the CGPA based on the SGPA and returns the updated CGPA. Assume all sems have equal credits
    {
        this.semsDone++;
        double CGPAN = ((this.CGPA)*(this.semsDone-1)+SGPA)/((double)semsDone);
        this.CGPA = CGPAN;
        return CGPA;
        // TODO
    }

    public int doProject()      // The Student does a project. Returns the updated number of projects
    {
        this.numProjects++;
        return this.numProjects;
        // TODO
    }
    
    public void congrats(String companyName)      // The student has been hired by a company :)
    {
        this.company = companyName;
        this.hired=true;
        // TODO
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
    }
    
}