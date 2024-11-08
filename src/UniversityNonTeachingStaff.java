public class UniversityNonTeachingStaff {
    String name;
    String facultyId;
    UniversityNonTeachingStaff(String name,University university)
    {
        this.name=name;
        university.nonTeachingStaffList.add(this);
        facultyId= university.generateStaffId();
    }

    public static void getWorkInfo()
    {
        System.out.println("University Non Teaching Faculty : Handling the logistics and administration related tasks of the university.");
    }

}
