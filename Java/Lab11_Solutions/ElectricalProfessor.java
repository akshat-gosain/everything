public class ElectricalProfessor extends Professor{
    public ElectricalProfessor(String name, int age, Course course){
        super(name, age, course);
    }

    public void setLabMarks(Student student,int labMarks) {
        if(student instanceof ElectricalStudent){
            student.setLabMarks(getCourse(),labMarks);
        }
        else{
            System.out.println("This student is not a Electrical student.");
        }
    }

    public void setMidTermMarks(Student student,int midTermMarks) {
        if(student instanceof ElectricalStudent){
            student.setMidTermMarks(getCourse(),midTermMarks);
        }
        else{
            System.out.println("This student is not a Electrical student.");
        }
    }

    public void setFinalMarks(Student student,int finalMarks) {
        if(student instanceof ElectricalStudent){
            student.setFinalMarks(getCourse(),finalMarks);
        }
        else{
            System.out.println("This student is not a Electrical student.");
        }
    }

    public double getGrade(Student student) {
        if(student instanceof ElectricalStudent){
            ElectricalStudent electricalStudent = (ElectricalStudent) student;
            return electricalStudent.getGrade(this.getCourse());
        }
        else{
            System.out.println("This student is not a Electrical student.");
            return 0;
        }
    }

    public boolean isPassed(Student student) {
        if(student instanceof ElectricalStudent){
            ElectricalStudent electricalStudent = (ElectricalStudent) student;
            return electricalStudent.isPassed(this.getCourse());
        }
        else{
            System.out.println("This student is not a Electrical student.");
            return false;
        }
    }

    public String toString() {
        return "Professor: " + getName() + ", " + getAge();
    }
}
