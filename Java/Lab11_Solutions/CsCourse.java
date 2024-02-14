public class CsCourse extends Course{
    public CsCourse(String courseName, String courseCode, int creditWeight) {
        super(courseName, courseCode, creditWeight);
    }

    public String toString() {
        return "Course: " + getCourseName() + ", " + getCourseCode() + ", " + getCreditWeight();
    }
}
