package cj.day10;

public class Student {

        private Long regno;
        private String name;
        private String qualification;
        private String email;
        private String mobile;

        public Student(Long regno,String name){
                this(regno,name,"N/A");
        }
        public Student(Long regno,String name,String qualification){
                this(regno,name,qualification,"N/A");

        }
        public Student(Long regno,String name,String qualification,String email){
                this(regno,name,qualification,email,"N/A");
        }
        public Student(Long regno,String name,String qualification,String email,String mobile){
                this.regno = regno;
                this.name = name;
                this.qualification = qualification;
                this.email = email;
                this.mobile= mobile;
        }


}
