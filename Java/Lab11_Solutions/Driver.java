import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {

        // ------------------------------------------------------------
        // Work on the course first (Cs and Electrical)
       
        CsCourse csCourse1 = new CsCourse("OOPs", "CS101", 4);
        CsCourse csCourse2 = new CsCourse("Data Structures", "CS102", 3);
        CsCourse csCourse3 = new CsCourse("Algorithms", "CS103", 4);

        ElectricalCourse electricalCourse1 = new ElectricalCourse("Circuit Design", "EE101", 4);
        ElectricalCourse electricalCourse2 = new ElectricalCourse("Electrical Machines", "EE102", 3);
        ElectricalCourse electricalCourse3 = new ElectricalCourse("Power Systems", "EE103", 4);

        Boolean flag = true;

        if(!(csCourse1.getCourseName().equals("OOPs") && csCourse2.getCourseName().equals("Data Structures") && csCourse3.getCourseName().equals("Algorithms")))
        {
            System.out.println("Get course name is incorrect");
            flag = false;
        }
        
        if(!(csCourse1.getCourseCode().equals("CS101") && csCourse2.getCourseCode().equals("CS102") && csCourse3.getCourseCode().equals("CS103")))
        {
            System.out.println("Get course code is incorrect");
            flag = false;
        }

        if(!(csCourse1.getCreditWeight() == 4 && csCourse2.getCreditWeight() == 3 && csCourse3.getCreditWeight() == 4))
        {
            System.out.println("Get credit weight is incorrect");
            flag = false;
        }

        if(!(electricalCourse1.getCourseName().equals("Circuit Design") && electricalCourse2.getCourseName().equals("Electrical Machines") && electricalCourse3.getCourseName().equals("Power Systems")))
        {
            System.out.println("Get course name is incorrect");
            flag = false;
        }

        if(!(electricalCourse1.getCourseCode().equals("EE101") && electricalCourse2.getCourseCode().equals("EE102") && electricalCourse3.getCourseCode().equals("EE103")))
        {
            System.out.println("Get course code is incorrect");
            flag = false;
        }

        if(!(electricalCourse1.getCreditWeight() == 4 && electricalCourse2.getCreditWeight() == 3 && electricalCourse3.getCreditWeight() == 4))
        {
            System.out.println("Get credit weight is incorrect");
            flag = false;
        }
        
        if(flag)
        {
            System.out.println("Course class is correct");
        }
        else
        {
            System.out.println("Course class is incorrect");
        }

        

        // ------------------------------------------------------------

        // Work on the student next (Cs and Electrical)

        CsStudent csStudent1 = new CsStudent("John", 20, 70);
        CsStudent csStudent2 = new CsStudent("Jane", 21, 60);
        CsStudent csStudent3 = new CsStudent("Jack", 22, 100);
        CsStudent csStudent4 = new CsStudent("Jill", 23, 40);

        ElectricalStudent electricalStudent1 = new ElectricalStudent("Adam", 20, 70);
        ElectricalStudent electricalStudent2 = new ElectricalStudent("Alex", 21, 60);
        ElectricalStudent electricalStudent3 = new ElectricalStudent("Alicia", 22, 100);
        ElectricalStudent electricalStudent4 = new ElectricalStudent("Alan", 23, 40);

        flag = true;

        if(!(csStudent1.getName().equals("John") && csStudent2.getName().equals("Jane") && csStudent3.getName().equals("Jack") && csStudent4.getName().equals("Jill")))
        {
            System.out.println("Get name is incorrect");
            flag = false;
        }

        if(!(csStudent1.getAge() == 20 && csStudent2.getAge() == 21 && csStudent3.getAge() == 22 && csStudent4.getAge() == 23))
        {
            System.out.println("Get age is incorrect");
            flag = false;
        }

        if(!(csStudent1.getProgrammingSkills() == 70 && csStudent2.getProgrammingSkills() == 60 && csStudent3.getProgrammingSkills() == 100 && csStudent4.getProgrammingSkills() == 40))
        {
            System.out.println("Get programming skills is incorrect");
            flag = false;
        }

        if(!(electricalStudent1.getName().equals("Adam") && electricalStudent2.getName().equals("Alex") && electricalStudent3.getName().equals("Alicia") && electricalStudent4.getName().equals("Alan")))
        {
            System.out.println("Get name is incorrect");
            flag = false;
        }

        if(!(electricalStudent1.getAge() == 20 && electricalStudent2.getAge() == 21 && electricalStudent3.getAge() == 22 && electricalStudent4.getAge() == 23))
        {
            System.out.println("Get age is incorrect");
            flag = false;
        }

        if(!(electricalStudent1.getCircuitDesignSkills() == 70 && electricalStudent2.getCircuitDesignSkills() == 60 && electricalStudent3.getCircuitDesignSkills() == 100 && electricalStudent4.getCircuitDesignSkills() == 40))
        {
            System.out.println("Get programming skills is incorrect");
            flag = false;
        }

        if(flag)
        {
            System.out.println("Student class is correct");
        }
        else
        {
            System.out.println("Student class is incorrect");
        }


        //  -----------------------------------------------------------

        // Work on the professor next (Cs and Electrical)

        CsProfessor csProfessor1 = new CsProfessor("Dr. Smith", 45, csCourse1);
        CsProfessor csProfessor2 = new CsProfessor("Dr. Brown", 50, csCourse2);
        CsProfessor csProfessor3 = new CsProfessor("Dr. Lee", 55, csCourse3);

        ElectricalProfessor electricalProfessor1 = new ElectricalProfessor("Dr. Jones", 45, electricalCourse1);
        ElectricalProfessor electricalProfessor2 = new ElectricalProfessor("Dr. Davis", 50, electricalCourse2);
        ElectricalProfessor electricalProfessor3 = new ElectricalProfessor("Dr. Miller", 55, electricalCourse3);

        flag = true;

        if(!(csProfessor1.getName().equals("Dr. Smith") && csProfessor2.getName().equals("Dr. Brown") && csProfessor3.getName().equals("Dr. Lee")))
        {
            System.out.println("Get name is incorrect");
            flag = false;
        }

        if(!(csProfessor1.getAge() == 45 && csProfessor2.getAge() == 50 && csProfessor3.getAge() == 55))
        {
            System.out.println("Get age is incorrect");
            flag = false;
        }

        if(!(csProfessor1.getCourse().equals(csCourse1) && csProfessor2.getCourse().equals(csCourse2) && csProfessor3.getCourse().equals(csCourse3)))
        {
            System.out.println("Get course is incorrect");
            flag = false;
        }

        if(!(electricalProfessor1.getName().equals("Dr. Jones") && electricalProfessor2.getName().equals("Dr. Davis") && electricalProfessor3.getName().equals("Dr. Miller")))
        {
            System.out.println("Get name is incorrect");
            flag = false;
        }

        if(!(electricalProfessor1.getAge() == 45 && electricalProfessor2.getAge() == 50 && electricalProfessor3.getAge() == 55))
        {
            System.out.println("Get age is incorrect");
            flag = false;
        }

        if(!(electricalProfessor1.getCourse().equals(electricalCourse1) && electricalProfessor2.getCourse().equals(electricalCourse2) && electricalProfessor3.getCourse().equals(electricalCourse3)))
        {
            System.out.println("Get course is incorrect");
            flag = false;
        }

        if(flag)
        {
            System.out.println("Professor class is correct");
        }
        else
        {
            System.out.println("Professor class is incorrect");
        }

        //  -----------------------------------------------------------

        // Work on the university next

        University university = new University();

        university.addStudent(csStudent1);
        university.addStudent(csStudent2);
        university.addStudent(csStudent3);
        university.addStudent(csStudent4);

        university.addStudent(electricalStudent1);
        university.addStudent(electricalStudent2);
        university.addStudent(electricalStudent3);
        university.addStudent(electricalStudent4);

        if(university.getStudents().size() != 8)
        {
            System.out.println("Add student is incorrect");
            flag = false;
        }

        university.addProfessor(csProfessor1);
        university.addProfessor(csProfessor2);
        university.addProfessor(csProfessor3);

        university.addProfessor(electricalProfessor1);
        university.addProfessor(electricalProfessor2);
        university.addProfessor(electricalProfessor3);

        if(university.getProfessors().size() != 6)
        {
            System.out.println("Add professor is incorrect");
            flag = false;
        }

        // Complete the rest of the university class
        // Conduct the exams and print the results

        Map<Student, Integer> OOPsLabMarks = new HashMap<>();
        OOPsLabMarks.put(csStudent1, 55);
        OOPsLabMarks.put(csStudent2, 72);
        OOPsLabMarks.put(csStudent3, 100);
        OOPsLabMarks.put(csStudent4, 20);

        Map<Student, Integer> DataStructuresLabMarks = new HashMap<>();
        DataStructuresLabMarks.put(csStudent1, 30);
        DataStructuresLabMarks.put(csStudent2, 50);
        DataStructuresLabMarks.put(csStudent3, 100);
        DataStructuresLabMarks.put(csStudent4, 100);

        Map<Student, Integer> AlgorithmsLabMarks = new HashMap<>();
        AlgorithmsLabMarks.put(csStudent1, 20);
        AlgorithmsLabMarks.put(csStudent2, 70);
        AlgorithmsLabMarks.put(csStudent3, 100);
        AlgorithmsLabMarks.put(csStudent4, 90);

        Map<Student, Integer> CircuitDesignLabMarks = new HashMap<>();
        CircuitDesignLabMarks.put(electricalStudent1, 10);
        CircuitDesignLabMarks.put(electricalStudent2, 60);
        CircuitDesignLabMarks.put(electricalStudent3, 100);
        CircuitDesignLabMarks.put(electricalStudent4, 85);

        Map<Student, Integer> ElectricalMachinesLabMarks = new HashMap<>();
        ElectricalMachinesLabMarks.put(electricalStudent1, 15);
        ElectricalMachinesLabMarks.put(electricalStudent2, 65);
        ElectricalMachinesLabMarks.put(electricalStudent3, 100);
        ElectricalMachinesLabMarks.put(electricalStudent4, 90);

        Map<Student, Integer> PowerSystemsLabMarks = new HashMap<>();
        PowerSystemsLabMarks.put(electricalStudent1, 30);
        PowerSystemsLabMarks.put(electricalStudent2, 80);
        PowerSystemsLabMarks.put(electricalStudent3, 100);
        PowerSystemsLabMarks.put(electricalStudent4, 95);

        university.conductLabExam(csProfessor1, OOPsLabMarks);
        university.conductLabExam(csProfessor2, DataStructuresLabMarks);
        university.conductLabExam(csProfessor3, AlgorithmsLabMarks);

        university.conductLabExam(electricalProfessor1, CircuitDesignLabMarks);
        university.conductLabExam(electricalProfessor2, ElectricalMachinesLabMarks);
        university.conductLabExam(electricalProfessor3, PowerSystemsLabMarks);

        Map<Student, Integer> OOPsMidTermMarks = new HashMap<>();
        OOPsMidTermMarks.put(csStudent1, 20);
        OOPsMidTermMarks.put(csStudent2, 80);
        OOPsMidTermMarks.put(csStudent3, 100);
        OOPsMidTermMarks.put(csStudent4, 90);

        Map<Student, Integer> DataStructuresMidTermMarks = new HashMap<>();
        DataStructuresMidTermMarks.put(csStudent1, 15);
        DataStructuresMidTermMarks.put(csStudent2, 70);
        DataStructuresMidTermMarks.put(csStudent3, 100);
        DataStructuresMidTermMarks.put(csStudent4, 75);

        Map<Student, Integer> AlgorithmsMidTermMarks = new HashMap<>();
        AlgorithmsMidTermMarks.put(csStudent1, 10);
        AlgorithmsMidTermMarks.put(csStudent2, 75);
        AlgorithmsMidTermMarks.put(csStudent3, 100);
        AlgorithmsMidTermMarks.put(csStudent4, 80);

        Map<Student, Integer> CircuitDesignMidTermMarks = new HashMap<>();
        CircuitDesignMidTermMarks.put(electricalStudent1, 05);
        CircuitDesignMidTermMarks.put(electricalStudent2, 70);
        CircuitDesignMidTermMarks.put(electricalStudent3, 100);
        CircuitDesignMidTermMarks.put(electricalStudent4, 95);

        Map<Student, Integer> ElectricalMachinesMidTermMarks = new HashMap<>();
        ElectricalMachinesMidTermMarks.put(electricalStudent1, 10);
        ElectricalMachinesMidTermMarks.put(electricalStudent2, 70);
        ElectricalMachinesMidTermMarks.put(electricalStudent3, 100);
        ElectricalMachinesMidTermMarks.put(electricalStudent4, 75);

        Map<Student, Integer> PowerSystemsMidTermMarks = new HashMap<>();
        PowerSystemsMidTermMarks.put(electricalStudent1, 15);
        PowerSystemsMidTermMarks.put(electricalStudent2, 75);
        PowerSystemsMidTermMarks.put(electricalStudent3, 100);
        PowerSystemsMidTermMarks.put(electricalStudent4, 80);

        university.conductMidTermExam(csProfessor1, OOPsMidTermMarks);
        university.conductMidTermExam(csProfessor2, DataStructuresMidTermMarks);
        university.conductMidTermExam(csProfessor3, AlgorithmsMidTermMarks);

        university.conductMidTermExam(electricalProfessor1, CircuitDesignMidTermMarks);
        university.conductMidTermExam(electricalProfessor2, ElectricalMachinesMidTermMarks);
        university.conductMidTermExam(electricalProfessor3, PowerSystemsMidTermMarks);

        Map<Student, Integer> OOPsFinalMarks = new HashMap<>();
        OOPsFinalMarks.put(csStudent1, 10);
        OOPsFinalMarks.put(csStudent2, 70);
        OOPsFinalMarks.put(csStudent3, 100);
        OOPsFinalMarks.put(csStudent4, 90);

        Map<Student, Integer> DataStructuresFinalMarks = new HashMap<>();
        DataStructuresFinalMarks.put(csStudent1, 20);
        DataStructuresFinalMarks.put(csStudent2, 70);
        DataStructuresFinalMarks.put(csStudent3, 100);
        DataStructuresFinalMarks.put(csStudent4, 80);

        Map<Student, Integer> AlgorithmsFinalMarks = new HashMap<>();
        AlgorithmsFinalMarks.put(csStudent1, 25);
        AlgorithmsFinalMarks.put(csStudent2, 75);
        AlgorithmsFinalMarks.put(csStudent3, 100);
        AlgorithmsFinalMarks.put(csStudent4, 85);

        Map<Student, Integer> CircuitDesignFinalMarks = new HashMap<>();
        CircuitDesignFinalMarks.put(electricalStudent1, 15);
        CircuitDesignFinalMarks.put(electricalStudent2, 70);
        CircuitDesignFinalMarks.put(electricalStudent3, 100);
        CircuitDesignFinalMarks.put(electricalStudent4, 85);

        Map<Student, Integer> ElectricalMachinesFinalMarks = new HashMap<>();
        ElectricalMachinesFinalMarks.put(electricalStudent1, 20);
        ElectricalMachinesFinalMarks.put(electricalStudent2, 85);
        ElectricalMachinesFinalMarks.put(electricalStudent3, 100);
        ElectricalMachinesFinalMarks.put(electricalStudent4, 90);

        Map<Student, Integer> PowerSystemsFinalMarks = new HashMap<>();
        PowerSystemsFinalMarks.put(electricalStudent1, 25);
        PowerSystemsFinalMarks.put(electricalStudent2, 80);
        PowerSystemsFinalMarks.put(electricalStudent3, 100);
        PowerSystemsFinalMarks.put(electricalStudent4, 95);

        university.conductFinalExam(csProfessor1, OOPsFinalMarks);
        university.conductFinalExam(csProfessor2, DataStructuresFinalMarks);
        university.conductFinalExam(csProfessor3, AlgorithmsFinalMarks);

        university.conductFinalExam(electricalProfessor1, CircuitDesignFinalMarks);
        university.conductFinalExam(electricalProfessor2, ElectricalMachinesFinalMarks);
        university.conductFinalExam(electricalProfessor3, PowerSystemsFinalMarks);

        university.printStudents();

        university.printProfessors();

        university.printPassedStudents();

        university.printRanking();

        System.out.println("Congratulations! You have completed the assignment.");

    }
}
