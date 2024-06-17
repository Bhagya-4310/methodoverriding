package mutable;
// immutable
public class StudentTest {
    public static void main(String[] args) {
      //  Student student=new Student(); // jvm creates the default constructer
       // student.name="A";
       //  student.name="B";
       // System.out.println(student.name);
         Student student=new Student("A");
        System.out.println(student.getName());
    }
}
