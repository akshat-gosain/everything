public class CSStudent extends Student     // !!!! Something changes on this line  !!!!
// A CSStudent "is-a" Student
{
    private int DSALevel;   // The amount of DSA the student has done
    private int CPLevel;    // The amount of CP the student has done

    public CSStudent(String name, double CGPA, int passingYear, int semsDone, int numProjects, int DSALevel, int CPLevel, int expectedStipend)
    {
        super(name,CGPA,passingYear,semsDone,numProjects,expectedStipend);
        this.DSALevel = DSALevel;
        this.CPLevel = CPLevel;
        // TODO
    }

    public int getDSALevel()
    {
        return this.DSALevel;
        // TODO
    }
    public int getCPLevel()
    {
        return this.CPLevel;
        // TODO
    }
    
    public int doLeetCode(String typeOfQues)    // "Easy", "Medium" and "Hard" incs the DSALevel by 1, 2, 3 resp. Returns the latest DSALevel
    {
        if(typeOfQues=="Easy"){
            this.DSALevel++;
        }else if(typeOfQues=="Medium"){
            this.DSALevel++;
            this.DSALevel++;
        }else if(typeOfQues=="Hard"){
            this.DSALevel++;
            this.DSALevel++;
            this.DSALevel++;
        }
        return this.DSALevel;
        // TODO
    }

    public int doCodeForces(int QuesRating)    // 1200, 1400 and 1600 incs the CPLevel by 1, 2, 3 resp. Returns the latest CPLevel
    {
        if(QuesRating==1200){
            this.CPLevel++;
        }else if(QuesRating==1400){
            this.CPLevel++;
            this.CPLevel++;
        }else if(QuesRating==1600){
            this.CPLevel++;
            this.CPLevel++;
            this.CPLevel++;
        }       
        return this.CPLevel;
        // TODO
    }
}
