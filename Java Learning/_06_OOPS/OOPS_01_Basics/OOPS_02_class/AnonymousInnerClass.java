package OOPS_01_Basics.OOPS_02_class;

public class AnonymousInnerClass {

    void work() {
        System.out.println("Employee is working.");
    }
}

class InnerClass {

    public static void main(String[] args) {

        //AnonymousInnerClass
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass(){

        };

    }
}
