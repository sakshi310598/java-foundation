package OOPS_01_Basics.OOPS_02_class;

abstract class AbstractClass {

    //Abstract methods
    abstract void sound();

    //Concrete method
    void sleep() {
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {

        //Object will not create for abstract class.
        //AbstractClass abstractClass = new AbstractClass();
    }

}
