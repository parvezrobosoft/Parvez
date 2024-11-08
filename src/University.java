import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    static int staffId=200;
    private List<UniversityNonTeachingStaff> nonTeachingStaffList=new ArrayList<>();
    private List <College> collegeList =new ArrayList<>();
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

    public List<UniversityNonTeachingStaff> getNonTeachingStaffList() {
        return nonTeachingStaffList;
    }

    public University(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public List<College> getCollegeList() {
        return collegeList;
    }

    public void collegeList()
    {
        System.out.println("College List:");
        collegeList.forEach(System.out::println);
        System.out.println();
    }
    public void hallTicketIssue()
    {
        System.out.println("Hall Ticket Issued : ");
        for(College college:collegeList)
            for (Branch branch: college.getBranchList()){
                for (Student student: branch.getStudentList())
                {
                    if(student.getAttendance()>=75)
                    {
                        student.setHallTicket(true);
                    }
                }
                branch.getHallTicketInfo();
            }

        System.out.println();


    }



}
