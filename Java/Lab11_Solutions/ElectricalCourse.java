public class ElectricalCourse  extends Course{
    public ElectricalCourse(String courseName, String courseCode, int creditWeight) {
        super(courseName, courseCode, creditWeight);
    }

    public String toString() {
        return "Course: " + getCourseName() + ", " + getCourseCode() + ", " + getCreditWeight();
    }
}
