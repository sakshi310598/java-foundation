package Controctors;

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
