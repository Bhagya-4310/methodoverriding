package mutable;

public class Student {
    // public String name;
    // accessspecifier private it can access with in class only then how can you set the data?
     private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
