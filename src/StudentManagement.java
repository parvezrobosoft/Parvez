public class StudentManagement

{
    public static void main(String[] args) {


        University vtu =new University("VTU");


        College sahyadri =new College("SAHYADRI",vtu);
        College canara =new College("CANARA",vtu);
        College mit =new College("MIT",vtu);


        Branch ec=new Branch("Electronics and Communication",sahyadri);
        Branch mech = new Branch("MECHANICAL ENGINEERING",sahyadri);


        vtu.collegeList();
        sahyadri.branchList();

        Student student1 =new Student("Rose",sahyadri,ec,"Data structure");
        Student student2 =new Student("Lily",sahyadri,ec,"Digital System");
        Student student3=new Student("vinay",sahyadri,ec,"Network Theory");


        TeachingFaculty teacher1 =new TeachingFaculty("Adarsh",sahyadri);
        TeachingFaculty teacher2=new TeachingFaculty("Sohan",sahyadri);
        TeachingFaculty teacher3=new TeachingFaculty("Rohan",sahyadri);

        NonTeachingFaculty helper=new NonTeachingFaculty("Nitya",sahyadri);
        NonTeachingFaculty office=new NonTeachingFaculty("Satya",sahyadri);

        sahyadri.facultyList();

        teacher1.allocateAssignment(student1,"Digital");
        teacher1.allocateAssignment(student2,"Digital");
        teacher1.allocateAssignment(student3,"Digital");

        student1.submitAssignment();
        student3.submitAssignment();

        teacher1.giveMark(student1,30);
        teacher2.giveMark(student2,40);
        teacher2.giveMark(student3,20);

        teacher1.assessAssignment(student1);

        teacher3.giveAttendance(student1,35,45);
        teacher3.giveAttendance(student2,29,45);
        teacher3.giveAttendance(student3,40,45);

        vtu.hallTicketIssue();

        sahyadri.getStudentsInfo(ec);

        ec.getTopScorers();

        student1.myMarks();
        student2.myAttendance();
        System.out.println();


        NonTeachingFaculty.getWorkInfo();

        UniversityNonTeachingStaff.getWorkInfo();

        TeachingFaculty.getWorkInfo();

    }


}
