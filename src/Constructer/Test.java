package Constructer;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("dinesh");
        System.out.println(s1);


        Address address = new Address("5-96","GANDHI CENTER","AMALAPURAM");
        Student s2   = new Student("dinesh", address);
        System.out.println(s2);
    }
}
