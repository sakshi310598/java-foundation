package Variables;

public class StaticVariable {

    String name = "Sakshi";        // Instance Variable
    static String college = "ABC"; // Static Variable

    static void main(String[] args) {

        int age = 22;              // Local Variable

        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        StaticVariable staticVariable3 = new StaticVariable();

        System.out.println(age);
        System.out.println(staticVariable1.name);
        System.out.println(StaticVariable.college);
        System.out.println(staticVariable1.college);


        System.out.println("Static Variable");
        /*Static Variable
        Definition: A static variable belongs to the class rather than objects.
        Characteristics:
            ✔ Shared among all objects.
            ✔ Only one copy exists.
            ✔ Declared using the static keyword.
        */
    }
}
