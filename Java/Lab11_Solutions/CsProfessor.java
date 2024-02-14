public class CsProfessor extends Professor {
    
    public CsProfessor(String name, int age, Course course){
        super(name, age, course);
    }

    public void setLabMarks(Student student,int labMarks) {
        if(student instanceof CsStudent){
            student.setLabMarks(getCourse(),labMarks);
        }
        else{
            System.out.println("This student is not a CS student.");
        }
    }

    public void setMidTermMarks(Student student,int midTermMarks) {
        if(student instanceof CsStudent){
            student.setMidTermMarks(getCourse(),midTermMarks);
        }
        else{
            System.out.println("This student is not a CS student.");
        }
    }

    public void setFinalMarks(Student student,int finalMarks) {
        if(student instanceof CsStudent){
            student.setFinalMarks(getCourse(),finalMarks);
        }
        else{
            System.out.println("This student is not a CS student.");
        }
    }

    public double getGrade(Student student) {
        if(student instanceof CsStudent){
            CsStudent csStudent = (CsStudent) student;
            return csStudent.getGrade(this.getCourse());
        }
        else{
            System.out.println("This student is not a CS student.");
            return 0;
        }
    }

    public boolean isPassed(Student student) {
        if(student instanceof CsStudent){
            CsStudent csStudent = (CsStudent) student;
            return csStudent.isPassed(this.getCourse());
        }
        else{
            System.out.println("This student is not a CS student.");
            return false;
        }
    }

    public String toString() {
        return "Professor: " + getName() + ", " + getAge();
    }



}
