public class TeachingFaculty extends Faculty {


    TeachingFaculty(String name,College college)
    {
        college.getFacultyList().add(this);
        this.name=name;
    }
    public void allocateAssignment(Student student,String name)
    {
       student.assignment = new Assignment(name);

    }
    public void giveMark(Student student,int mark)
    {
        student.addMarks(mark);

    }
    public  void assessAssignment(Student student)
    {
        if (student.assignment.submission==1)
        {
            student.addMarks(20);
        }
    }

    public void giveAttendance(Student student,int present,int total)
    {
        student.setAttendance(present*100/total);
    }

    public static void getWorkInfo()
    {
        System.out.println("Handling all the responsibilities assigned by the branch");
    }

}
