import java.util.ArrayList;
import java.util.List;

public class College {

    private String name;
    private List<Branch> branchList=new ArrayList<>();
    private List <Faculty>facultyList=new ArrayList<>() ;
    static int facultyId=100;

    public College(String name,University university) {
        this.name = name;
        university.getCollegeList().add(this);
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

    public List<Branch> getBranchList() {
        return branchList;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void branchList()
    {
        System.out.println("Branch List : ");
        for (Branch branch:branchList) {
            System.out.println(branch);
        }
        System.out.println();
    }


    public void facultyList()
    {
        System.out.println("Faculty List of "+this.name +":");
        for (Faculty faculty:facultyList)
        {
            System.out.println(faculty);
        }
        System.out.println();
    }


}
