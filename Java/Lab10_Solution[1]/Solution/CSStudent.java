public class CSStudent extends Student      // A CSStudent "is-a" Student       
{
    private int DSALevel;   // The amount of DSA the student has done
    private int CPLevel;    // The amount of CP the student has done

    public CSStudent(String name, double CGPA, int passingYear, int semsDone, int numProjects, int DSALevel, int CPLevel, int expectedStipend)
    {
        super(name, CGPA, passingYear, semsDone, numProjects, expectedStipend);
        this.DSALevel = DSALevel;
        this.CPLevel = CPLevel;
    }

    public int getDSALevel()    
    {
        return this.DSALevel;
    }
    public int getCPLevel()     
    {
        return this.CPLevel;
    }
    
    public int doLeetCode(String typeOfQues)    // "Easy", "Medium" and "Hard" incs the DSALevel by 1, 2, 3 resp. Returns the latest DSALevel
    {
        if(typeOfQues.equals("Easy"))
        {
            DSALevel += 1;
        }
        else if(typeOfQues.equals("Medium"))
        {
            DSALevel += 2;
        }
        else
        {
            DSALevel += 3;
        }
        return DSALevel;
    }

    public int doCodeForces(int QuesRating)    // 1200, 1400 and 1600 incs the CPLevel by 1, 2, 3 resp. Returns the latest CPLevel
    {
        if(QuesRating == 1200)
        {
            CPLevel += 1;
        }
        else if(QuesRating == 1400)
        {
            CPLevel += 2;
        }
        else
        {
            CPLevel += 3;
        }
        return CPLevel;
    }
}
