import java.util.ArrayList;
import java.util.List;

public class University {

    String name;
    static int staffId=200;
    List<UniversityNonTeachingStaff> nonTeachingStaffList=new ArrayList<>();
    List <College> collegeList =new ArrayList<>();
     static int studentId=100;

    public static String generateStudentId()
    {
        studentId++;
        return "SI"+studentId;
    }
    public static String generateStaffId()
    {
        staffId++;
        return "UF"+staffId;
    }


    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getCollegeList()
    {
        System.out.println("College List:");
        collegeList.forEach(System.out::println);
        System.out.println();
    }
    public void hallTicketIssue()
    {
        System.out.println("Hall Ticket Issued : ");
        for(College college:collegeList)
            for (Branch branch: college.branchList){
                for (Student student: branch.studentList)
                {
                    if(student.attendance>=75)
                    {
                        student.hallTicket =true;
                    }
                }
                branch.getHallTicketInfo();
            }

        System.out.println();


    }



}
