public class App {
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student("Akou",20);
        Student student3= new Student("akou",20,"java",'A');
        System.out.println("objet 1");
        student1.displayStudentInfo();
        System.out.println("objet 2");
        student2.displayStudentInfo();
        System.out.println("objet 3");
        student3.displayStudentInfo();

    }
}
