    public class Student {
        public String name;
        public int age;
        public String course;
        public char grade;

        public Student() {
        }
        
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public Student(String name, int age, String course, char grade) {
            this.name = name;
            this.age = age;
            this.course = course;
            this.grade = grade;
        }
        
        public void displayStudentInfo() {
            System.out.println(" Name :"+name+" Age :"+age+" Course : " +course+" Grade:"+grade);
            
        }
    }