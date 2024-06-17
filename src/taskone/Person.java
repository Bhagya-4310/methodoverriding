package taskone;

public class Person {
    private String name;
    private String age;
    private String gender;
    private Dob Dob;
    public Person(){

    }
    public Person(String name){
        this.name=name;
        this.Dob=new Dob(8,"sat","jan");
    }
    public Person(String name,String age){
        this.name=name;
        this.age=age;
        this.Dob=new Dob(8,"sat","jan");
    }
    public Person(String name,String age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.Dob=new Dob(8,"sat","jan");
    }
    public Person(String name,String age,String gender,Dob dob){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.Dob=dob;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public taskone.Dob getDob() {
        return Dob;
    }
}
