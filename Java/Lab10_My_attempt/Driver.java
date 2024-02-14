import java.util.*;

public class Driver 
{
    public static void main(String[] args) 
    {
        System.out.println("\n\nWelcome to OOP Lab 10 : Collections\n\nMake sure your code is runnable and submit on time and check your submission after submitting.\n\nYou can add additional java files if you need to.\n");
        System.out.println("Lab Created by: Sehajpreet Singh Chawla\n");
        
//// ---------------------------------------------------------------------------------

        // Check what's in ApplyingInterface

           boolean done = true;

        // Done?
        // Proceed to complete Student class

        // Uncomment the following after completing the Student, CSStudent, PhoenixStudent class
        

        Student s1 = new Student("s1", 9.5, 2025, 4, 0, 1500);
        Student s2 = new Student("s2", 8.5, 2024, 6, 2, 2000);
        if(!s1.getName().equals("s1") || !s2.getName().equals("s2"))
        {
            System.out.println("getName in Student is Wrong");
            done = false;
        }
        if(s1.getCGPA() != 9.5 || s2.getCGPA() != 8.5)
        {
            System.out.println("getCGPA in Student is Wrong");
            done = false;
        }
        if(s1.getPassingYear() != 2025 || s2.getPassingYear() != 2024)
        {
            System.out.println("getPassingYear in Student is Wrong");
            done = false;
        }
        if(s1.getSemsDone() != 4 || s2.getSemsDone() != 6)
        {
            System.out.println("getSemsDone in Student is Wrong");
            done = false;
        }
        if(s1.getNumProjects() != 0 || s2.getNumProjects() != 2)
        {
            System.out.println("getSemsDone in Student is Wrong");
            done = false;
        }
        if(s1.getNumProjects() != 0 || s2.getNumProjects() != 2)
        {
            System.out.println("getSemsDone in Student is Wrong");
            done = false;
        }
        if(s1.getExpectedStipend() != 1500 || s2.getExpectedStipend() != 2000)
        {
            System.out.println("getExpectedStipend in Student is Wrong");
            done = false;
        }
        if(s1.isHired() || s2.isHired())
        {
            System.out.println("isHired in Student is Wrong");
            done = false;
        }
        s1.semResult(10);
        s2.semResult(9.5);
        if(s1.getCGPA() != 9.6 || s2.getCGPA() != 8.642857142857142)
        {
            System.out.println("semResult in Student is Wrong");
            done = false;
        }
        s1.doProject();
        s2.doProject();
        if(s1.getNumProjects() != 1 || s2.getNumProjects() != 3)
        {
            System.out.println("doProject in Student is Wrong");
            done = false;
        }
        s1.congrats("SomeComp");
        s2.congrats("Other");
        if(!s1.isHired() || !s2.isHired() || !s1.getCompany().equals("SomeComp") || !s2.getCompany().equals("Other"))
        {
            System.out.println("congrats or getCompany in Student is Wrong");
            done = false;
        }
        CSStudent cs1 = new CSStudent("cs1", 10, 2025, 4, 1, 50, 10, 20000);
        CSStudent cs2 = new CSStudent("cs2", 9.9, 2026, 2, 5, 1000, 10000, 0);
        if(cs1.getDSALevel() != 50 || cs2.getDSALevel() != 1000)
        {
            System.out.println("getDSALevel in CSStudent is Wrong");
            done = false;
        }
        if(cs1.getCPLevel() != 10 || cs2.getCPLevel() != 10000)
        {
            System.out.println("getCPLevel in CSStudent is Wrong");
            done = false;
        }
        boolean dlc = false;
        if(cs1.doLeetCode("Medium") != 52)
        {
            dlc = true;
        }
        if(cs1.doLeetCode("Easy") != 53)
        {
            dlc = true;
        }
        if(cs1.doLeetCode("Hard") != 56)
        {
            dlc = true;
        }
        if(dlc)
        {
            System.out.println("doLeetCode in CSStudent is Wrong");
            done = false;
        }
        boolean dcf = true;
        if(cs2.doCodeForces(1600) != 10003)
        {
            dcf = false;
        }
        if(cs2.doCodeForces(1200) != 10004)
        {
            dcf = false;
        }
        if(cs2.doCodeForces(1400) != 10006)
        {
            dcf = false;
        }
        if(!dcf)
        {
            System.out.println("doCodeForces in CSStudent is Wrong");
            done = false;
        }
        PhoenixStudent ps1 = new PhoenixStudent("ps1", 7, 2025, 4, 3, 150, 100);
        PhoenixStudent ps2 = new PhoenixStudent("ps2", 9, 2024, 6, 5, 1000, 10000);
        if(ps1.getCoreSkill() != 150 || ps2.getCoreSkill() != 1000)
        {
            System.out.println("getCoreSkill in PhoenixStudent is Wrong");
            done = false;
        }
        if(ps1.upSkill(450) != 600 || ps2.upSkill(500) != 1500)
        {
            System.out.println("upSkill in PhoenixStudent is Wrong");
            done = false;
        }


// //// ---------------------------------------------------------------------------------------------


//         //// Check what's in HiringInterface


//         // Done?

//         //// Uncomment the following after completing the Company, ITCompany, CoreCompany classes

//         Company<Student> comp1 = new Company<Student>("comp1", 8, 2025, 2, 2000, 1, 3);
//         Company<Student> comp2 = new Company<Student>("comp2", 9, 2024, 1, 200000, 3, 6);
//         if(!comp1.getName().equals("comp1") || !comp2.getName().equals("comp2"))
//         {
//             System.out.println("getName in Company is Wrong");
//             done = false;
//         }
//         if(comp1.getMinCGPA() != 8 || comp2.getMinCGPA() != 9)
//         {
//             System.out.println("getMinCGPA in Company is Wrong");
//             done = false;
//         }
//         if(comp1.getMaxPassingYear() != 2025 || comp2.getMaxPassingYear() != 2024)
//         {
//             System.out.println("getMaxPassingYear in Company is Wrong");
//             done = false;
//         }
//         if(comp1.getStudentsRem() != 2 || comp2.getStudentsRem() != 1)
//         {
//             System.out.println("getStudentsRem in Company is Wrong");
//             done = false;
//         }
//         if(comp1.getStipend() != 2000 || comp2.getStipend() != 200000)
//         {
//             System.out.println("getStipend in Company is Wrong");
//             done = false;
//         }
//         if(comp1.getMinProjects() != 1 || comp2.getMinProjects() != 3)
//         {
//             System.out.println("getMinProjects in Company is Wrong");
//             done = false;
//         }
//         if(comp1.getWowProjects() != 3 || comp2.getWowProjects() != 6)
//         {
//             System.out.println("getWowProjects in Company is Wrong");
//             done = false;
//         }
//         comp1.decStudentsRem();
//         comp2.decStudentsRem();
//         if(comp1.getStudentsRem() != 1 || comp2.getStudentsRem() != 0)
//         {
//             System.out.println("decStudentsRem in Company is Wrong");
//             done = false;
//         }
//         ITCompany it1 = new ITCompany("it1", 8, 2027, 2, 1000, 1, 3, 50, 40, 100, 200);
//         ITCompany it2 = new ITCompany("it2", 9, 2026, 3, 20000000, 4, 7, 1000, 1500, 2000, 2500);
//         if(it1.getMinDSA() != 50 || it2.getMinDSA() != 1000)
//         {
//             System.out.println("getMinDSA in ITCompany is Wrong");
//             done = false;
//         }
//         if(it1.getMinCPLevel() != 40 || it2.getMinCPLevel() != 1500)
//         {
//             System.out.println("getMinCPLevel in ITCompany is Wrong");
//             done = false;
//         }
//         if(it1.getWowDSA() != 100 || it2.getWowDSA() != 2000)
//         {
//             System.out.println("getWowDSA in ITCompany is Wrong");
//             done = false;
//         }
//         if(it1.getWowCP() != 200 || it2.getWowCP() != 2500)
//         {
//             System.out.println("getWowCP in ITCompany is Wrong");
//             done = false;
//         }
//         CoreCompany cc1 = new CoreCompany("cc1", 7, 2025, 2, 200, 1, 3, 100, 200);
//         CoreCompany cc2 = new CoreCompany("cc2", 6, 2024, 3, 100, 2, 4, 200, 400);
//         if(cc1.getMinCoreSkill() != 100 || cc2.getMinCoreSkill() != 200)
//         {
//             System.out.println("getMinCoreSkill in CoreCompany is Wrong");
//             done = false;
//         }
//         if(cc1.getWowCoreSkill() != 200 || cc2.getWowCoreSkill() != 400)
//         {
//             System.out.println("getWowCoreSkill in CoreCompany is Wrong");
//             done = false;
//         }

// ////---                                 ---                                      ---


//         boolean capply = false;

//         if(cs1.canApply(cc2) || !ps1.canApply(cc1) || !ps2.canApply(it2) || !cs2.canApply(it1))
//         {
//             capply = true;
//         }
//         ps1.congrats("Somewhere");
//         cs2.congrats("Nowhere");
//         if(ps1.canApply(cc1) || cs2.canApply(it1))
//         {
//             capply = true;
//         }
//         CSStudent cs3 = new CSStudent("cs3", 6, 0, 0, 0, 0, 0, 0);
//         CSStudent cs4 = new CSStudent("cs4", 10, 2025, 0, 0, 0, 0, 0);
//         CSStudent cs5 = new CSStudent("cs3", 10, 0, 0, 0, 0, 0, 10000);
//         CSStudent cs6 = new CSStudent("cs6", 9, 2024, 0, 0, 0, 0, 0);
//         ITCompany it3 = new ITCompany("it3", 8, 2024, 2, 0, 0, 0, 0, 0, 0, 0);
//         if(cs3.canApply(it3) || cs4.canApply(it3) || cs5.canApply(it3) || !cs6.canApply(it3))
//         {
//             capply = true;
//         }
//         PhoenixStudent ps3 = new PhoenixStudent("ps3", 8, 2026, 0, 0, 0, 0);
//         PhoenixStudent ps4 = new PhoenixStudent("ps4", 7, 0, 0, 0, 0, 0);
//         PhoenixStudent ps5 = new PhoenixStudent("ps5", 8, 0, 0, 0, 0, 1000);
//         PhoenixStudent ps6 = new PhoenixStudent("ps6", 10, 0, 0, 0, 0, 0);
//         CoreCompany cc3 = new CoreCompany("cc3", 8, 2024, 3, 0, 0, 0, 0, 0);
//         if(ps3.canApply(cc3) || ps4.canApply(cc3) || ps5.canApply(cc3) || !ps6.canApply(cc3) || !ps6.canApply(it3))
//         {
//             capply = true;
//         }
//         if(capply)
//         {
//             System.out.println("canApply in Student is Wrong");
//             done = false;
//         }
//         it3.receiveApplication(ps6);
//         Collection<Student> it3Collection = it3.getAppliedStudents();
//         if(it3Collection.size() != 1 || !it3Collection.contains(ps6))
//         {
//             System.out.println("getAppliedStudents or receiveApplication in Company is Wrong");
//             done = false;
//         }
//         Collection<Student> it1Collection = it1.getAppliedStudents();
//         if(it1Collection.size() != 0)
//         {
//             System.out.println("getAppliedStudents in Company is Wrong");
//             done = false;
//         }
//         if(!it3.hasApplied(ps6) || it1.hasApplied(cs1) || it1.hasApplied(ps1))
//         {
//             System.out.println("hasApplied in Company is Wrong");
//             done = false;
//         }
//         boolean gna = false;
//         boolean gfa = false;
//         if(it3.getNumApplicants() != 1)
//         {
//             gna = true;
//         }
//         if(!it3.getFirstApplicant().equals(ps6))
//         {
//             gfa = true;
//         }
//         it3.receiveApplication(cs1);
//         if(it3.getNumApplicants() != 2)
//         {
//             gna = true;
//         }
//         CSStudent cs7 = new CSStudent("cs7", 11, 0, 0, 0, 0, 0, 0);
//         it3.receiveApplication(cs7);
//         if(it3.getNumApplicants() != 3)
//         {
//             gna = true;
//         }
//         if(!it3.getFirstApplicant().equals(cs7))
//         {
//             gfa = true;
//         }
//         if(gna)
//         {   
//             System.out.println("getNumApplicants in Company is Wrong");
//             done = false;
//         }
//         if(gfa)
//         {
//             System.out.println("getFirstApplicant in Company is Wrong");
//             done = false;
//         }
//         it3.addToHired(cs2);
//         Collection<Student> it3Collection2 = it3.getHiredStudents();
//         if(it3Collection2.size() != 1 || !it3Collection2.contains(cs2))
//         {
//             System.out.println("getHiredStudents or addToHired in Company is Wrong");
//             done = false;
//         }
//         it3.addToHired(ps2);
//         if(!it3.isHired(cs2) || !it3.isHired(ps2) || it3.isHired(cs1))
//         {
//             System.out.println("isHired in Company is Wrong");
//             done = false;
//         }
//         PhoenixStudent ps7 = new PhoenixStudent("ps7", 0 , 0, 0, 0, 0, 0);
//         PhoenixStudent ps8 = new PhoenixStudent("ps8", 0, 0, 0, 0, 0, 0);
//         CSStudent cs8 = new CSStudent("cs8", 10, 0, 0, 0, 0, 0, 0);
//         ITCompany itCompany3 = new ITCompany("itCompany3", 0, 0, 2, 0, 0, 0, 0, 0, 0, 0);
//         CoreCompany cc4 = new CoreCompany("cc4", 0, 0, 0, 0, 0, 0, 0, 0);
//         ps7.apply(itCompany3);
//         boolean apply = false;
//         if(!itCompany3.hasApplied(ps7) || itCompany3.getAppliedStudents().size() != 1 || !itCompany3.getAppliedStudents().contains(ps7) || !itCompany3.getFirstApplicant().equals(ps7) || itCompany3.getNumApplicants() != 1)
//         {
//             apply = true;
//         }
//         cs8.apply(itCompany3);
//         if(!itCompany3.hasApplied(cs8) || itCompany3.getAppliedStudents().size() != 2 || !itCompany3.getAppliedStudents().contains(cs8) || !itCompany3.getFirstApplicant().equals(cs8) || itCompany3.getNumApplicants() != 2)
//         {
//             apply = true;
//         }
//         ps8.apply(itCompany3);
//         if(!itCompany3.hasApplied(ps8) || itCompany3.getAppliedStudents().size() != 3 || !itCompany3.getAppliedStudents().contains(ps8) || !itCompany3.getFirstApplicant().equals(cs8) || itCompany3.getNumApplicants() != 3)
//         {
//             apply = true;
//         }
//         ps7.apply(cc4);
//         if(!cc4.hasApplied(ps7) || cc4.getAppliedStudents().size() != 1 || !cc4.getAppliedStudents().contains(ps7) || !cc4.getFirstApplicant().equals(ps7) || cc4.getNumApplicants() != 1)
//         {
//             apply = true;
//         }
//         ps8.apply(cc4);
//         if(!cc4.hasApplied(ps8) || cc4.getAppliedStudents().size() != 2 || !cc4.getAppliedStudents().contains(ps8) || cc4.getNumApplicants() != 2)
//         {
//             apply = true;
//         }
//         if(apply)
//         {
//             System.out.println("apply in Student is Wrong");
//             done = false;
//         }
//         ITCompany itc3 = new ITCompany("itc3", 8, 2025, 50, 1000, 1, 3, 200, 100, 500, 1000);
//         CSStudent cs9 = new CSStudent("cs9", 8.1, 0, 0, 2, 210, 110, 500);
//         CSStudent cs10 = new CSStudent("cs10", 8.5, 0, 0, 3, 0, 0, 0);
//         CSStudent cs11 = new CSStudent("cs11", 8.7, 0, 0, 0, 510, 0, 0);
//         CSStudent cs12 = new CSStudent("cs12", 8.2, 0, 0, 0, 0, 1500, 0);
//         CSStudent cs13 = new CSStudent("cs13", 8.6, 0, 0, 0, 150, 50, 0);
//         CSStudent cs14 = new CSStudent("cs14", 8.15, 0, 0, 5, 1000, 2000, 0);
//         PhoenixStudent ps11 = new PhoenixStudent("ps11", 8.4, 0, 0, 2, 0, 0);
//         PhoenixStudent ps12 = new PhoenixStudent("ps12", 8.8, 0, 0, 4, 0, 0);
//         itc3.receiveApplication(ps11);
//         itc3.receiveApplication(ps12);
//         itc3.receiveApplication(cs9);
//         itc3.receiveApplication(cs10);
//         itc3.receiveApplication(cs11);
//         itc3.receiveApplication(cs12);
//         itc3.receiveApplication(cs13);
//         itc3.receiveApplication(cs14);
//         boolean ti = false;
//         boolean hire = false;
//         if(!itc3.takeInterview())
//         {
//             ti = true;
//         }
//         itc3.hire();
//         if(itc3.hasApplied(ps12) || itc3.getStudentsRem() != 49 || !itc3.isHired(ps12) || !ps12.isHired() || !ps12.getCompany().equals("itc3"))
//         {
//             hire = true;
//         }
//         if(!itc3.takeInterview())
//         {
//             ti = true;
//         }
//         itc3.hire();
//         if(itc3.hasApplied(cs11) || itc3.getStudentsRem() != 48 || !itc3.isHired(cs11) || !cs11.isHired() || !cs11.getCompany().equals("itc3"))
//         {
//             hire = true;
//         }
//         if(itc3.takeInterview())
//         {
//             ti = true;
//         }
//         if(!itc3.getFirstApplicant().equals(cs10))
//         {
//             ti = true;
//         }
//         if(!itc3.takeInterview())
//         {
//             ti = true;
//         }
//         itc3.hire();
//         cs14.congrats("Sehaj");
//         if(itc3.hasApplied(cs10) || itc3.getStudentsRem() != 47 || !itc3.isHired(cs10) || !cs10.isHired() || !cs10.getCompany().equals("itc3"))
//         {
//             hire = true;
//         }
//         if(itc3.takeInterview())
//         {
//             ti = true;
//         }
//         if(!itc3.getFirstApplicant().equals(cs12))
//         {
//             ti = true;
//         }
//         if(!itc3.takeInterview())
//         {
//             ti = true;
//         }
//         itc3.hire();
//         if(itc3.hasApplied(cs12) || itc3.getStudentsRem() != 46 || !itc3.isHired(cs12) || !cs12.isHired() || !cs12.getCompany().equals("itc3"))
//         {
//             hire = true;
//         }
//         if(itc3.takeInterview())
//         {
//             ti = true;
//         }
//         if(!itc3.getFirstApplicant().equals(cs9))
//         {
//             ti = true;
//         }
//         if(!itc3.takeInterview())
//         {
//             ti = true;
//         }
//         itc3.hire();
//         if(itc3.hasApplied(cs9) || itc3.getStudentsRem() != 45 || !itc3.isHired(cs9) || !cs9.isHired() || !cs9.getCompany().equals("itc3") || itc3.getAppliedStudents().size() != 0)
//         {
//             hire = true;
//         }
//         if(ti)
//         {
//             System.out.println("takeInterview in ITCompany is Wrong");
//             done = false;
//         }
//         if(hire)
//         {
//             System.out.println("hire in ITCompany is Wrong");
//             done = false;
//         }
//         CoreCompany cc14 = new CoreCompany("cc14", 7, 2025, 10, 20, 2, 4, 60, 100);
//         PhoenixStudent ps15 = new PhoenixStudent("ps15", 8, 0, 0, 3, 65, 0);
//         PhoenixStudent ps16 = new PhoenixStudent("ps16", 7.9, 0, 0, 5, 0, 0);
//         PhoenixStudent ps17 = new PhoenixStudent("ps17", 8.1, 0, 0, 0, 120, 0);
//         PhoenixStudent ps18 = new PhoenixStudent("ps18", 8.05, 0, 0, 10, 200, 0);
//         PhoenixStudent ps19 = new PhoenixStudent("ps19", 7.95, 0, 0, 1, 0, 0);
//         cc14.receiveApplication(ps15);
//         cc14.receiveApplication(ps16);
//         cc14.receiveApplication(ps17);
//         cc14.receiveApplication(ps18);
//         cc14.receiveApplication(ps19);
//         boolean ccti = false;
//         boolean cchire = false;
//         if(!cc14.takeInterview())
//         {
//             ccti = true;
//         }
//         cc14.hire();
//         ps18.congrats("Sehaj");
//         if(cc14.hasApplied(ps17) || cc14.getStudentsRem() != 9 || !cc14.isHired(ps17) || !ps17.isHired() || !ps17.getCompany().equals("cc14") || !cc14.getFirstApplicant().equals(ps18))
//         {
//             cchire = true;
//         }
//         if(cc14.takeInterview())
//         {
//             ccti = true;
//         }
//         if(!cc14.getFirstApplicant().equals(ps15))
//         {
//             ccti = true;
//         }
//         if(!cc14.takeInterview())
//         {
//             ccti = true;
//         }
//         cc14.hire();
//         if(cc14.hasApplied(ps15) || cc14.getStudentsRem() != 8 || !cc14.isHired(ps15) || !ps15.isHired() || !ps15.getCompany().equals("cc14") || !cc14.getFirstApplicant().equals(ps19))
//         {
//             cchire = true;
//         }
//         if(cc14.takeInterview())
//         {
//             ccti = true;
//         }
//         if(!cc14.getFirstApplicant().equals(ps16))
//         {
//             ccti = true;
//         }
//         if(!cc14.takeInterview())
//         {
//             ccti = true;
//         }
//         cc14.hire();
//         if(cc14.hasApplied(ps16) || cc14.getStudentsRem() != 7 || !cc14.isHired(ps16) || !ps16.isHired() || !ps16.getCompany().equals("cc14") || cc14.getAppliedStudents().size() != 0)
//         {
//             cchire = true;
//         }
//         if(ccti)
//         {
//             System.out.println("takeInterview in CoreCompany is Wrong");
//             done = false;
//         }
//         if(cchire)
//         {
//             System.out.println("hire in CoreCompany is Wrong");
//             done = false;
//         }

// ////--------------------------------------------------------------------------------------------    

//         //// Uncomment the following after completing the PlacementUnit class

//         PlacementUnit pu = new PlacementUnit();
//         ITCompany Google = new ITCompany("Google", 7, 2022, 3, 150000, 1, 10000, 1000, 5000, 10000000, 100000);
//         ITCompany Microsoft = new ITCompany("MicroSoft", 6, 2025, 1, 125000, 2, 5, 500, 500, 100000, 100000);
//         ITCompany Sprinklr = new ITCompany("Sprinklr", 8, 2025, 2, 200000, 1, 5, 2000, 500, 5000, 10000);
//         ITCompany DevRev = new ITCompany("DevRev", 8.5, 2025, 1, 225000, 1 , 5, 500, 250, 2500, 5000);
//         CoreCompany Nvidia = new CoreCompany("Nvidia", 8, 2026, 1, 100000, 4, 10, 1000, 5000);
//         CoreCompany TexasInstruments = new CoreCompany("TI", 6, 2026, 1, 75000, 2, 4, 500, 1000);
//         CoreCompany HoneyWell = new CoreCompany("HoneyWell", 9, 2025, 1, 10000, 0, 0, 0, 0);

//         CSStudent css1 = new CSStudent("css1", 10, 2025, 0, 10, 10000, 100000, 50000);
//         CSStudent css2 = new CSStudent("css2", 6, 2025, 0, 5, 5000, 2500, 100000);
//         CSStudent css3 = new CSStudent("css3", 9, 2025, 0, 0, 0, 0, 150000);
//         CSStudent css4 = new CSStudent("css4", 8.5, 2025, 0, 2, 1000, 1000, 80000);
//         CSStudent css5 = new CSStudent("css5", 8, 2025, 0, 1, 500, 500, 50000);
//         CSStudent css6 = new CSStudent("css6", 9.5, 2025, 0, 5, 10000, 10000, 50000);

//         PhoenixStudent pss1 = new PhoenixStudent("pss1", 9, 2025, 0, 100, 1000, 50000);
//         PhoenixStudent pss2 = new PhoenixStudent("pss2", 7, 2025, 0, 5, 1000, 25000);
//         PhoenixStudent pss3 = new PhoenixStudent("pss3", 8, 2025, 0, 100, 10000, 100000);
//         PhoenixStudent pss4 = new PhoenixStudent("pss4", 6, 2025, 0, 3, 500, 15000);

//         boolean enroll = false;
//         pu.enrollStudent(pss1);
//         if(pu.getRemStudents().size() != 1 || !pu.getRemStudents().contains(pss1))
//         {
//             enroll = true;
//         }
//         pu.enrollStudent(pss2);
//         pu.enrollStudent(pss3);
//         if(pu.getRemStudents().size() != 3 || !pu.getRemStudents().contains(pss1) || !pu.getRemStudents().contains(pss2) || !pu.getRemStudents().contains(pss3))
//         {
//             enroll = true;
//         }
//         pu.enrollStudent(pss4);
//         pu.enrollStudent(css1);
//         pu.enrollStudent(css2);
//         pu.enrollStudent(css3);
//         pu.enrollStudent(css4);
//         pu.enrollStudent(css5);
//         pu.enrollStudent(css6);
//         if(pu.getRemStudents().size() != 10 || !pu.getRemStudents().contains(pss1) || !pu.getRemStudents().contains(css2) || !pu.getRemStudents().contains(css6))
//         {
//             enroll = true;
//         }
//         if(enroll)
//         {
//             System.out.println("getRemStudents or enrollStudent in PlacementUnit is Wrong");
//             done = false;
//         }
//         boolean addcomp = false;
//         pu.addCompany(Microsoft);
//         if(pu.getCompanies().size() != 1 || !pu.getCompanies().contains(Microsoft))
//         {
//             addcomp = true;
//         }
//         pu.addCompany(Google);
//         pu.addCompany(Sprinklr);
//         pu.addCompany(Nvidia);
//         if(pu.getCompanies().size() != 4 || !pu.getCompanies().contains(Microsoft) || !pu.getCompanies().contains(Sprinklr) || !pu.getCompanies().contains(Sprinklr) || !pu.getCompanies().contains(Nvidia))
//         {
//             addcomp = true;
//         }
//         pu.addCompany(HoneyWell);
//         pu.addCompany(TexasInstruments);
//         pu.addCompany(DevRev);
//         if(pu.getCompanies().size() != 7 || !pu.getCompanies().contains(Microsoft) || !pu.getCompanies().contains(Sprinklr) || !pu.getCompanies().contains(Sprinklr) || !pu.getCompanies().contains(Nvidia) || !pu.getCompanies().contains(TexasInstruments) || !pu.getCompanies().contains(DevRev) || !pu.getCompanies().contains(HoneyWell))
//         {
//             addcomp = true;
//         }
//         if(addcomp)
//         {
//             System.out.println("getCompanies or addCompany in PlacementUnit is Wrong");
//             done = false;
//         }
//         pu.applyCompanies();
//         boolean applycomp = false;
        
//         if(pu.getCompanies().contains(Google) || pu.getCompanies().contains(HoneyWell))
//         {
//             applycomp = true;
//         }
//         if(Microsoft.getAppliedStudents().size() != 9 || Microsoft.getAppliedStudents().contains(css3) || !Microsoft.getAppliedStudents().contains(pss3) || !Microsoft.getAppliedStudents().contains(css6))
//         {
//             applycomp = true;
//         }
//         if(Nvidia.getAppliedStudents().size() != 2 || !Nvidia.getAppliedStudents().contains(pss1) || !Nvidia.getAppliedStudents().contains(pss3))
//         {
//             applycomp = true;
//         }
//         if(DevRev.getAppliedStudents().size() != 5 || DevRev.getAppliedStudents().contains(css2) || !DevRev.getAppliedStudents().contains(css4))
//         {
//             applycomp = true;
//         }
//         if(Sprinklr.getAppliedStudents().size() != 7 || Sprinklr.getAppliedStudents().contains(css2) || !Sprinklr.getAppliedStudents().contains(pss1) || !Sprinklr.getAppliedStudents().contains(css4))
//         {
//             applycomp = true;
//         }
//         if(applycomp)
//         {
//             System.out.println("applyCompanies in PlacementUnit is Wrong");
//             done = false;
//         }
//         boolean tipu = false;
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 4 || pu.getCompanies().contains(DevRev) || pu.getRemStudents().contains(css1) || !DevRev.isHired(css1) || !css1.isHired() || !css1.getCompany().equals("DevRev"))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 4 || !pu.getCompanies().contains(Sprinklr))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 4 || !pu.getCompanies().contains(Sprinklr) || pu.getRemStudents().contains(css6) || !Sprinklr.isHired(css6) || !css6.isHired() || !css6.getCompany().equals("Sprinklr"))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 4 || !pu.getCompanies().contains(Sprinklr) || !pu.getRemStudents().contains(css3) || Sprinklr.isHired(css3) || css3.isHired())
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 3 || pu.getCompanies().contains(Sprinklr) || pu.getRemStudents().contains(pss1) || !Sprinklr.isHired(pss1) || !pss1.isHired() || !pss1.getCompany().equals("Sprinklr"))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(!Microsoft.getAppliedStudents().contains(css6))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(Microsoft.getAppliedStudents().contains(css6))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 2 || pu.getCompanies().contains(Microsoft) || pu.getRemStudents().contains(css4) || !Microsoft.isHired(css4) || !css4.isHired() || !css4.getCompany().equals("MicroSoft"))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(Nvidia.getHiredStudents().size() != 0)
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 1 || pu.getCompanies().contains(Nvidia) || pu.getRemStudents().contains(pss3) || !Nvidia.isHired(pss3) || !pss3.isHired() || !pss3.getCompany().equals("Nvidia"))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         pu.takeInterview();
//         if(pu.getCompanies().size() != 0 || pu.getCompanies().contains(TexasInstruments) || pu.getRemStudents().contains(pss2) || !TexasInstruments.isHired(pss2) || !pss2.isHired() || !pss2.getCompany().equals("TI"))
//         {
//             tipu = true;
//         }
//         pu.takeInterview();
//         if(tipu)
//         {
//             System.out.println("takeInterview in PlacementUnit is Wrong");
//             done = false;
//         }
//         ITCompany test1 = new ITCompany("test1", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//         ITCompany test2 = new ITCompany("test2", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//         pu.addCompany(test1);
//         pu.addCompany(test2);
//         if(done && pu.getCompanies().size() != 2)
//         {
//             System.out.println("\nUh Oh! Almost there....\n");
//             done = false;
//         }
//         if(done)
//         {
//             System.out.println("\nCongratulations on finishing the lab!!\nVery Good!\nHope You Had Fun!\nPlease submit on time and make sure you have submitted the correct files.\n");
//         }
    }
}
