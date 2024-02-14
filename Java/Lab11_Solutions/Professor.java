public abstract class Professor {
    private String name;
    private int age;
    private Course course;

    public Professor(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public abstract void setLabMarks(Student student, int labMarks);

    public abstract void setMidTermMarks(Student student, int midTermMarks);

    public abstract void setFinalMarks(Student student, int finalMarks);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Course getCourse() {
        return course;
    }

    public abstract double getGrade(Student student);

    public abstract boolean isPassed(Student student);

    public String toString() {
        return "Professor: " + name + ", " + age;
    }
}
