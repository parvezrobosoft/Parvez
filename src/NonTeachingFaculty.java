public class NonTeachingFaculty extends Faculty{
    NonTeachingFaculty(String name,College college)
    {
        college.facultyList.add(this);
        this.name=name;
    }
    public static void getWorkInfo()
        {
            System.out.println("College Non Teaching Faculty : Handling office related work");
        }
}