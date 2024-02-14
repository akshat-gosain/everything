public class PhoenixStudent extends Student     // !!!! Something changes on this line  !!!!
// A PhoenixStudent "is-a" Student
{
    private int coreSkill;  // The amount of core skill the Student has
    
    public PhoenixStudent(String name, double CGPA, int passingYear, int semsDone, int numProjects, int coreSkill, int expectedStipend)
    {
        super(name,CGPA,passingYear,semsDone,numProjects,expectedStipend);
        this.coreSkill = coreSkill;
        // TODO
    }

    public int getCoreSkill()
    {
        return this.coreSkill;
        // TODO
    }

    public int upSkill(int extraSkill)  // The student has learnt some new skill, increase his coreSkill and return the latest coreskill
    {
        int coreskill2 = this.coreSkill+extraSkill;
        this.coreSkill=coreskill2;
        return this.coreSkill;
        // TODO
    }
}
