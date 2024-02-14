// Purpose: This class is a subclass of Student class. It has a list of courses, and maps for lab, midterm and final marks.
import java.util.*;

public class CsStudent extends Student {

    private List<Course> courses;
    private Map<Course, Integer> labMarksMap;
    private Map<Course, Integer> midTermMarksMap;
    private Map<Course, Integer> finalMarksMap;
    private int programmingSkills;
    private String department;

    public CsStudent(String name, int age, int programmingSkills) {
        super(name, age);
        this.programmingSkills = programmingSkills;
        this.department = "CS";
        courses = new ArrayList<Course>();
        labMarksMap = new HashMap<Course, Integer>();
        midTermMarksMap = new HashMap<Course, Integer>();
        finalMarksMap = new HashMap<Course, Integer>();
        
    }

    public void addCourse(Course course) {
        if(course instanceof CsCourse)
        {
            courses.add(course);
        }
    }

    public void setLabMarks(Course course, int labMarks) {
        if(course instanceof CsCourse)
        {
            labMarksMap.put(course, labMarks);
        }
    }

    public void setMidTermMarks(Course course, int midTermMarks) {
        if(course instanceof CsCourse)
        {
            midTermMarksMap.put(course, midTermMarks);
        }
    }

    public void setFinalMarks(Course course, int finalMarks) {
        if(course instanceof CsCourse)
        {
            finalMarksMap.put(course, finalMarks);
        }
    }


    public void setProgrammingSkills(int programmingSkills) {
        this.programmingSkills = programmingSkills;
    }

    public int getProgrammingSkills() {
        return programmingSkills;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public double getGrade() {
        double labMarks = 0;
        double midTermMarks = 0;
        double finalMarks = 0;
        
        int credits = 0;
        for (Map.Entry<Course, Integer> entry : labMarksMap.entrySet()) {
            labMarks += entry.getValue()*entry.getKey().getCreditWeight();
            credits += entry.getKey().getCreditWeight();
        }
        labMarks /= credits;

        credits = 0;
        for (Map.Entry<Course, Integer> entry : midTermMarksMap.entrySet()) {
            midTermMarks += entry.getValue()*entry.getKey().getCreditWeight();
            credits += entry.getKey().getCreditWeight();
        }
        midTermMarks /= credits;

        credits = 0;
        for (Map.Entry<Course, Integer> entry : finalMarksMap.entrySet()) {
            finalMarks += entry.getValue()*entry.getKey().getCreditWeight();
            credits += entry.getKey().getCreditWeight();
        }
        finalMarks /= credits;

        return labMarks*0.2 + midTermMarks*0.3 + finalMarks*0.5;
    }

    public double getGrade(Course course) {
        if(course instanceof CsCourse)
        {
            double labMarks = 0;
            double midTermMarks = 0;
            double finalMarks = 0;
            
            int credits = 0;
            for (Map.Entry<Course, Integer> entry : labMarksMap.entrySet()) {
                if(entry.getKey().equals(course))
                {
                    labMarks += entry.getValue()*entry.getKey().getCreditWeight();
                    credits += entry.getKey().getCreditWeight();
                }
            }
            labMarks /= credits;

            credits = 0;
            for (Map.Entry<Course, Integer> entry : midTermMarksMap.entrySet()) {
                if(entry.getKey().equals(course))
                {
                    midTermMarks += entry.getValue()*entry.getKey().getCreditWeight();
                    credits += entry.getKey().getCreditWeight();
                }
            }
            midTermMarks /= credits;

            credits = 0;
            for (Map.Entry<Course, Integer> entry : finalMarksMap.entrySet()) {
                if(entry.getKey().equals(course))
                {
                    finalMarks += entry.getValue()*entry.getKey().getCreditWeight();
                    credits += entry.getKey().getCreditWeight();
                }
            }
            finalMarks /= credits;

            return labMarks*0.2 + midTermMarks*0.3 + finalMarks*0.5;
        }
        else
        {
            return 0;
        }
    }

    public boolean isPassed() {
        for(Course course : courses)
        {
            if(!isPassed(course))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPassed(Course course) {
        if(course instanceof CsCourse)
        {
            return getGrade(course) >= 30 && programmingSkills >= 50;
        }
        else
        {
            return false;
        }
    }

    public String toString() {
        return "Student: " + getName() + ", Department: " + department + ", Grade: " + getGrade() + ", Passed: "
                + isPassed();
    }
}
