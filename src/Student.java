import java.util.Arrays;

public class Student implements Comparable<Student>{


    private String name;
    private String studentId;
    private String studentBranch;
    private int attendance;
    private int marks;
    Assignment assignment;
    String electiveSubject;
    String[] subjects;
    private boolean hallTicket =false;



    Student(String name,College college, Branch branch,String subject)
    {
        this.name=name;
        studentId=University.generateStudentId();
        this.studentBranch= branch.getName();
        electiveSubject=subject;
        subjects= new String[]{Arrays.toString(branch.mandatorySubjects),subject};
        college.getBranchList().get(college.getBranchList().indexOf(branch)).getStudentList().add(this);

    }

    public void submitAssignment()
    {
        assignment.submit();
    }
    public void myAttendance()
    {
        System.out.println("Your attendance is "+ attendance+ " % ");
    }
    public void   myMarks()
    {
        System.out.println("Your mark is "+marks);
    }
    public void addMarks(int marks)
    {
        this.marks+=marks;
    }

    public void setHallTicket(boolean hallTicket) {
        this.hallTicket = hallTicket;
    }

    public boolean isHallTicket() {
        return hallTicket;
    }

    public int getMarks() {
        return marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }


    @Override
    public String toString() {
        return         '\n'+ " Name : " + name + '\n' +
                        " StudentId : " + studentId + '\n' +
                        " StudentBranch : " + studentBranch + '\n' +
                        " Attendance : " + attendance +'\n' +
                        " Marks : " + marks +
                '\n'+  "Subjects : "+ Arrays.toString(subjects)  +'\n';


    }

    @Override
    public int compareTo(Student o) {
        return o.getMarks()-this.getMarks();
    }
}
