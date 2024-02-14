public class PhoenixStudent extends Student // A PhoenixStudent "is-a" Student     
{
    private int coreSkill;  // The amount of core skill the Student has
    
    public PhoenixStudent(String name, double CGPA, int passingYear, int semsDone, int numProjects, int coreSkill, int expectedStipend)
    {
        super(name, CGPA, passingYear, semsDone, numProjects, expectedStipend);
        this.coreSkill = coreSkill;
    }

    public int getCoreSkill()
    {
        return this.coreSkill;
    }

    public int upSkill(int extraSkill)  // The student has leant some new skill, increase his coreSkill
    {
        coreSkill += extraSkill;
        return coreSkill;
    }
}
