import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch {

    private String name;
    String[] mandatorySubjects={"Chemistry","Physics","Maths"};
    private List<Student> studentList = new ArrayList<>();


    Branch(String name,College college)
    {
        this.name=name;
        college.getBranchList().add(this);

    }

    public void getStudentDetails()
    {
        for (Student student:studentList)
        {
            System.out.println(
                    "Student ID : "+student.getStudentId()+'\n'+
                    "Name : "+student.getName()+'\n'+
                    "Marks : "+student.getMarks()+'\n'+
                            "Attendance : "+student.getAttendance()+'\n'


            );
        }
    }
    public void getHallTicketInfo()
    {
        for (Student student:studentList)
        {
            if (student.isHallTicket())
            {
                System.out.print(student.getName());
                System.out.println(" : Issued");
            }
            else
            {
                System.out.print(student.getName());
                System.out.println(" : Not Issued");
            }
        }
    }

    public void getAllStudentList()
    {
        System.out.println(studentList);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return  "Name : " +name;

    }

    public void getTopScorers()
    {
        Collections.sort(studentList);

        System.out.println("Top scorers are :");
        for (int i=0;i<3&i<studentList.size();i++)
        {
            studentList.get(i).studentMarks();
        }
        System.out.println();
    }
}
