package Constructer;
public class Student {
    public String name;
    public String rollNo;
    public Address address;

    public Student(String name){
        this(name,new Address("4310","phb","hyd"));
       // Address address1 = new Address("4310", "kphb", "hyd");
      // this.address=address1;
    }
    public Student(String name, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", address=" + address +
                '}';
    }
}