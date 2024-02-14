import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class University {
    private SortedSet<Student> students;
    private ArrayList<Professor> professors;

    public University() {
        this.students = new TreeSet<>(new StudentComparator());
        this.professors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        // add all the courses of the same department to the student
        for (Professor professor : professors) 
        {
            if(student instanceof CsStudent && professor instanceof CsProfessor)
            {
                student.addCourse(professor.getCourse());
            }
            else if(student instanceof ElectricalStudent && professor instanceof ElectricalProfessor)
            {
                student.addCourse(professor.getCourse());
            }
        }
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
        // add all the students of the same department to the course
        for (Student student : students) 
        {
            if(student instanceof CsStudent && professor instanceof CsProfessor)
            {
                student.addCourse(professor.getCourse());
            }
            else if(student instanceof ElectricalStudent && professor instanceof ElectricalProfessor)
            {
                student.addCourse(professor.getCourse());
            }
        }
    }

    public SortedSet<Student> getStudents() {
        return students;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void printStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printProfessors() {
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(professor);
        }
    }

    public void printPassedStudents() {
        System.out.println("Passed Students:");
        for (Student student : students) {
            if (student.isPassed()) {
                System.out.println(student);
            }
        }
    }

    public void printRanking() {
        System.out.println("Ranking:");
        Student[] studentArray = students.toArray(new Student[students.size()]);
        Arrays.sort(studentArray, new StudentComparator());
        int rank = 0;
        double previousGrade = -1;
        int previousRank = 0;
        for (Student student : studentArray) 
        {
            if (student.getGrade() == previousGrade) 
            {
                System.out.println(previousRank + " " + student);
                rank++;
            }
            else 
            {
                rank++;
                previousRank = rank;
                System.out.println(rank + " " + student);
            }
            previousGrade = student.getGrade();
        }
    }

    // for a given prof conduct lab exam
    public void conductLabExam(Professor professor, Map<Student, Integer> labMarks) {
        for (Student student : students) {
            if (labMarks.containsKey(student)) {
                if (student instanceof CsStudent && professor instanceof CsProfessor) {
                    ((CsProfessor) professor).setLabMarks(student, labMarks.get(student));
                } else if (student instanceof ElectricalStudent && professor instanceof ElectricalProfessor) {
                    ((ElectricalProfessor) professor).setLabMarks(student, labMarks.get(student));
                }
            }
        }
    }

    // for a given prof conduct mid term exam
    public void conductMidTermExam(Professor professor, Map<Student, Integer> midTermMarks) {
        for (Student student : students) {
            if (midTermMarks.containsKey(student)) {
                if (student instanceof CsStudent && professor instanceof CsProfessor) {
                    ((CsProfessor) professor).setMidTermMarks(student, midTermMarks.get(student));
                } else if (student instanceof ElectricalStudent && professor instanceof ElectricalProfessor) {
                    ((ElectricalProfessor) professor).setMidTermMarks(student, midTermMarks.get(student));
                }
            }
        }
    }

    // for a given prof conduct final exam
    public void conductFinalExam(Professor professor, Map<Student, Integer> finalMarks) {
        for (Student student : students) {
            if (finalMarks.containsKey(student)) {
                if (student instanceof CsStudent && professor instanceof CsProfessor) {
                    ((CsProfessor) professor).setFinalMarks(student, finalMarks.get(student));
                } else if (student instanceof ElectricalStudent && professor instanceof ElectricalProfessor) {
                    ((ElectricalProfessor) professor).setFinalMarks(student, finalMarks.get(student));
                }
            }
        }
    }
}
