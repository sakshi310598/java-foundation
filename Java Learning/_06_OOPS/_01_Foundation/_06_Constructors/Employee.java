package _06_OOPS._01_Foundation._06_Constructors;

public class Employee extends Address{

    // Instance Variables
    int employeeId;
    String employeeName;
    String department;
    double salary;

     /* 01. Introduction
        1. Constructor is a special method used to initialize objects when a class is created.
        2.
     */



    /*2: Characteristics
    * Constructor name as the same as class name.
    * Constructor does not have return type.
    * Constructor will execute automatically during object creation.
    *
    */



    /* 3. Types of Constructors
          ├── Default Constructor
          ├── No-Argument Constructor
          ├── Parameterized Constructor
          └── Copy Constructor
        */

    /*Default Constructor
       Definition: A constructor automatically provided by the compiler when no constructor is written.
       Characteristics:
            Compiler generated
            No parameters
            Initializes default values
     */

    /*No-Argument Constructor
        Definition: A constructor written by the programmer that does not take any parameters.
     */
    public Employee() {
        this(12031);
        System.out.println("Calling Parent class constructor....");
    }

    /*Parameterized Constructor
        Definition: A constructor that accepts values as parameters.
     */
    public Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    /*Copy Constructor
    *Java does not provide a built-in copy constructor but create a manually.
    */
    public Employee(Employee employee) {
        this.employeeId = employee.employeeId;
        this.employeeName = employee.employeeName;
        this.department = employee.department;
        this.salary = employee.salary;
    }

    /*Constructor Overloading
        Definition: Multiple constructors with the same name but different parameter lists.
     */
    public Employee(int employeeId) {
        this(employeeId,"Amandeep");
        this.employeeId = employeeId;
    }
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    /*Constructor Chaining

    Constructor chaining means calling one constructor from another.
    There are two ways:
        01. this() method is used to call one constructor to another constructor in the same class.
            this() must always be the first statement.
        02. super() Method is used to Calls the parent class constructor from child class.
     */


    public Employee(int employeeId, String employeeName, String city, String state) {
        super(city, state);     // Calls Address constructor
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        System.out.println("Employee Constructor Called");
    }


    public void display() {

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);

        // Parent class method
        super.display();
    }


    public static void main() {
        Employee employee1 = new Employee();
        System.out.println(employee1.employeeId);
        System.out.println(employee1.employeeName);

        Employee employee2 = new Employee(1208,"Sakshi","HR", 45000);
        System.out.println(employee2.employeeId);

        Employee employee3 = new Employee(1109,"Saurabh","Developer", 145000);
        System.out.println(employee3.employeeName);

        Employee employee4 = new Employee(employee3);
        System.out.println(employee4.employeeName);

        Employee employee5 = new Employee(1001,"Kunal");
        System.out.println(employee5.employeeId);
        System.out.println(employee5.employeeName);

        Employee employee6 = new Employee(9000,"Khushi","Patna","Bihar");
        employee6.display();
    }
}
