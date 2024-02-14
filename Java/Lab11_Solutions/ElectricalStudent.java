import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectricalStudent extends Student{
    
    private List<Course> courses;
    private Map<Course, Integer> labMarksMap;
    private Map<Course, Integer> midTermMarksMap;
    private Map<Course, Integer> finalMarksMap;
    private int circuitDesignSkills;
    private String department;
    
    public ElectricalStudent(String name, int age,int circuitDesignSkills){
        super(name, age);
        this.circuitDesignSkills = circuitDesignSkills;
        this.department = "Electrical";
        courses = new ArrayList<Course>();
        labMarksMap = new HashMap<Course, Integer>();
        midTermMarksMap = new HashMap<Course, Integer>();
        finalMarksMap = new HashMap<Course, Integer>();
    }

    public void addCourse(Course course) {
        if(course instanceof ElectricalCourse)
        {
            courses.add(course);
        }
    }
    
    public void setLabMarks(Course course, int labMarks) {
        if(course instanceof ElectricalCourse)
        {
            labMarksMap.put(course, labMarks);
        }
    }

    public void setMidTermMarks(Course course, int midTermMarks) {
        if(course instanceof ElectricalCourse)
        {
            midTermMarksMap.put(course, midTermMarks);
        }
    }

    public void setFinalMarks(Course course, int finalMarks) {
        if(course instanceof ElectricalCourse)
        {
            finalMarksMap.put(course, finalMarks);
        }
    }

    public void setCircuitDesignSkills(int circuitDesignSkills) {
        this.circuitDesignSkills = circuitDesignSkills;
    }

    public int getCircuitDesignSkills() {
        return circuitDesignSkills;
    }

    public List<Course> getCourses() {
        return courses;
    }
    
    public double getGrade(){
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
        if(course instanceof ElectricalCourse)
        {
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
        else{
            System.out.println("This course is not a Electrical course.");
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
        if(course instanceof ElectricalCourse)
        {
            return getGrade(course) >= 30 && circuitDesignSkills >= 50;
        }
        else{
            System.out.println("This course is not a Electrical course.");
            return false;
        }
    }

    public String toString() {
        return "Student: " + getName() + ", Department: " + department + ", Grade: " + getGrade() + ", Passed: "
                + isPassed();
    }
}
