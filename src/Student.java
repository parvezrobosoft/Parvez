import java.util.Arrays;

public class Student implements Comparable<Student>{


    String name;
    String studentId;
    String studentBranch;
    int attendance;
    int marks;
    Assignment assignment;
    String electiveSubject;
    String[] subjects;
    boolean hallTicket =false;



    Student(String name, Branch branch,String subject)
    {
        this.name=name;
        studentId=University.generateStudentId();
        this.studentBranch= branch.name;
        branch.studentList.add(this);
        electiveSubject=subject;
        subjects= new String[]{Arrays.toString(branch.mandatorySubjects),subject};
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

    public int getMarks() {
        return marks;
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
