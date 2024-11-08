import java.util.ArrayList;
import java.util.List;

public class College {

    String name;
    List<Branch> branchList=new ArrayList<>();
    List <Faculty>facultyList=new ArrayList<>() ;
    static int facultyId=100;

    public College(String name,University university) {
        this.name = name;
        university.collegeList.add(this);
    }

    @Override
    public String toString() {
        return
                "Name : " + name  ;
    }

    public static String generateFacultyId() {
        facultyId++;
        return "CF"+facultyId;
    }


    public void getStudentsInfo(Branch branch)
    {
        System.out.println("Student info");
        branch.getStudentDetails();
    }

    public void getBranchList()
    {
        System.out.println("Branch List : ");
        for (Branch branch:branchList) {
            System.out.println(branch);
        }
        System.out.println();
    }

    public void getFacultyList()
    {
        System.out.println("Faculty List of "+this.name +":");
        for (Faculty faculty:facultyList)
        {
            System.out.println(faculty);
        }
        System.out.println();
    }


}
