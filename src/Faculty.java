public class Faculty {

       protected String facultyId;
        protected String name;

        Faculty()
        {
            this.facultyId=College.generateFacultyId();
        }

        @Override
        public String toString() {
                return
                        facultyId +" : "+ name ;
        }

        public String getName() {
                return name;
        }
}
