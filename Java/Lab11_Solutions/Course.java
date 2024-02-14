public abstract class Course {
    private String courseName;
    private String courseCode;
    private int creditWeight; // Assuming a course has a credit weight

    public Course(String courseName, String courseCode, int creditWeight) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditWeight = creditWeight;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCreditWeight() {
        return creditWeight;
    }

    public abstract String toString();

}
