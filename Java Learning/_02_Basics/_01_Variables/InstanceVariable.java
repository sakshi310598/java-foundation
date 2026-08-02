package Variables;

public class InstanceVariable {

    String name = "Rahul";
    int age;
    static void main(String[] args) {

        System.out.println("Instance Variable");
        /*
        1. Definition: An instance variable is declared inside a class but outside all methods and constructors.
        2. Characteristics:
            ✔ Each object has its own copy.
            ✔ Gets default values.
            ✔ Accessed using objects.
        */
    }

    void printName(){
        System.out.println(name);
        System.out.println(age);
    }

    InstanceVariable obj1 = new InstanceVariable();
    InstanceVariable obj2 = new InstanceVariable();
}
