package _06_OOPS._01_Foundation._06_Constructors;

public class Address{

    String city;
    String state;

     public Address(){

     }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
        System.out.println("Address Constructor Called");
    }

    public void display() {
        System.out.println("City  : " + city);
        System.out.println("State : " + state);
    }
}
