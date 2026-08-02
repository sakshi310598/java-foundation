package OOPS_02_Pillars.OOPS_03_Inheritance.Introduction;

class Animal {

    int age;
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Rabbit extends Animal{

}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.age); // Inherited variable
        dog.eat();   // Inherited method

        dog.bark();  // Own method
    }
}


