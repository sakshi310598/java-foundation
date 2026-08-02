package _06_OOPS._01_Foundation._13_Access_Modifiers;

public class Modifires {

    /*
    Definition: Modifiers are keywords used to control the accessibility
                and behavior of classes, methods, variables, and constructors.
        Modifiers are divided into two categories:
        1. Access Modifiers
        2. Non-Access Modifiers
     */



    /* ACCESS MODIFIERS
        Definition: Access modifiers control the visibility (accessibility) of classes, methods, variables, and constructors.
        Java provides four access modifiers:
        1. public
        2. protected
        3. default (package-private)
        4. private
     */


    /*1. public
      Definition: Accessible from anywhere in the program.
      Scope:
        ✔ Same Class
        ✔ Same Package
        ✔ Subclass (Different Package)
        ✔ Different Package
     */

    /* protected
    *
    * Definition: Accessible within the same package and by subclasses in different packages.
    * Scope:
        ✔ Same Class
        ✔ Same Package
        ✔ Subclass (Different Package)
    *
    * */


    /* default (Package-Private)
        Definition: When no access modifier is specified, Java uses the default access modifier.
        Scope:
            ✔ Same Class
            ✔ Same Package
     */

    /* private
        Definition: Accessible only within the same class.
        Scope:
           ✔ Same Class
     */


    /* 2. NON-ACCESS MODIFIERS
        Definition: Non-access modifiers define the behavior of classes, methods, and variables.
        Java provides several non-access modifiers.
          1. static → Belongs to the class instead of an object.
          2. final → Used to prevent modification.
          3. abstract → Used to create abstract classes and abstract methods.
          4. synchronized → Allows only one thread to access a method or block at a time.
          5. transient → Prevents a variable from being serialized.
          6. volatile → Ensures the latest value of a variable is read from main memory by all threads.
          7. native → Declares a method implemented in another language, such as C or C++.
          8. strictfp → Ensures consistent floating-point calculations across different platforms.
     */


    /*1. static(Variable)
        Definition: Belongs to the class instead of an object.
        a.static variable  →  Directly access through class name.
        b.static class
        c.static method
        d.static block
     */

    /* 2. final(Variable)
       Definition: Used to prevent modification.
       final Variable → Value cannot be changed.
       final Method → Cannot be overridden.
       final Class → Cannot be inherited.
     */

    static void main(String[] args) {
        Employee employee1 = new Employee(12345, "Sakshi", 45000,20000);
        Employee employee2 = new Employee(67890, "Saurabh", 50000,25000);
        System.out.println(Employee.companyName);
        System.out.println(employee1.COMPANY_CODE);
    }
}

