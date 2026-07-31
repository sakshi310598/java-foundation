package Methods;

public class Methods {

    /************* 01. Definition ************************
        1. A method is a block of code that performs a specific task.
        2. A method is executed only when it is called (invoked).
        3. Benefits of Methods:
            ✔ Code Reusability
            ✔ Reduces Code Duplication
            ✔ Easy to Read
            ✔ Easy to Maintain
            ✔ Improves Program Structure
    */


    /********** 02. Method Syntax **************************
       accessModifier returnType methodName(parameters) {
            // Method body
       }
    */
    public int sumOfNumber(int x, int y) {
        return (x + y);
    }
    int result = sumOfNumber(10, 20);


    /**************** 03. TYPES OF METHODS *********************
         01. Predefined (Built-in) Methods
         02. User-Defined Methods
         03. Non-parametrized Method
         04. Parametrized Method
         05. void Method
         06. Static Methods
         07. Instance(Non-static) Methods
         08. Abstract Methods
         09. Final Methods
         10. Overload method
    */
     public void display(){
         System.out.println("Sakshi");
     }
     public void displays(String name){
         System.out.println(name);
     }
     public String displays(String firstName, String lastName){
        return firstName+" "+lastName;
     }
     public String displays(){
        return "Displaying value";
     }
}
