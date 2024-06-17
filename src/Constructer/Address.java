package Constructer;

public class Address {
    public String flatno;
    public String area;
    public String city;

    public Address(String flatno, String area, String city) {
        this.flatno = flatno;
        this.area = area;
        this.city = city;

    }

    @Override
    public String toString() {
        return "Address{" +
                "flatno='" + flatno + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
