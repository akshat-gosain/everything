import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    private String name;
    private int age;
    private int labMarks;
    private int midTermMarks;
    private int finalMarks;
    private List<Course> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.labMarks = 0;
        this.midTermMarks = 0;
        this.finalMarks = 0;
        this.courses = new ArrayList<Course>();
    }

    public abstract void addCourse(Course course);

    public abstract void setLabMarks(Course course,int labMarks);

    public abstract void setMidTermMarks(Course course,int midTermMarks);

    public abstract void setFinalMarks(Course course,int finalMarks);

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLabMarks(Course course) {
        return labMarks;
    }

    public int getMidTermMarks(Course course) {
        return midTermMarks;
    }

    public int getFinalMarks(Course course) {
        return finalMarks;
    }

    public abstract double getGrade();

    public abstract double getGrade(Course course);

    public abstract boolean isPassed();

    public abstract boolean isPassed(Course course);

    public abstract String toString();
}
