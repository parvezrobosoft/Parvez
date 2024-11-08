import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch {

    String name;
    String[] mandatorySubjects={"Chemistry","Physics","Maths"};
    List<Student> studentList = new ArrayList<>();
    Branch(String name,College college)
    {
        this.name=name;
        college.branchList.add(this);

    }

    public void getStudentDetails()
    {
        for (Student student:studentList)
        {
            System.out.println(
                    "Student ID : "+student.studentId+'\n'+
                    "Name : "+student.name+'\n'+
                    "Marks : "+student.marks+'\n'+
                            "Attendance : "+student.attendance+'\n'


            );
        }
    }
    public void getHallTicketInfo()
    {
        for (Student student:studentList)
        {
            if (student.hallTicket)
            {
                System.out.print(student.name);
                System.out.println(" : Issued");
            }
            else
            {
                System.out.print(student.name);
                System.out.println(" : Not Issued");
            }
        }
    }

    public void getAllStudentList()
    {
        System.out.println(studentList);
    }

    @Override
    public String toString() {
        return  "Name : " +name;

    }

    public void getTopScorers()
    {
        Collections.sort(studentList);
        System.out.println("Top scorers are :\n"+
                studentList.get(0).getName()+":"+studentList.get(0).getMarks()+'\n'+
                studentList.get(1).getName()+":"+studentList.get(1).getMarks()+'\n'+
                studentList.get(2).getName()+":"+studentList.get(2).getMarks()+'\n'
        );
    }
}
