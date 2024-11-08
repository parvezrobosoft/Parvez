public class Faculty {

        String facultyId;
        String name;

        @Override
        public String toString() {
                return
                         facultyId +" : "+ name ;
        }

        Faculty()
        {
            this.facultyId=College.generateFacultyId();
        }

}
