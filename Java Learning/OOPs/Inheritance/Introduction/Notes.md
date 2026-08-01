# Inheritance Introduction
    Definition
        Inheritance is an OOP (Object-Oriented Programming) concept that allows one class to acquire the 
        properties (fields) and behaviors (methods) of another class.
    
    Need Inheritance
        Reuse existing code
        Reduce duplicate code
        Improve maintainability
        Support method overriding (Runtime Polymorphism)
        Represent real-world relationships

    Terminology
        Existing class -> Parent class/Super class/ Base Class
        New Class -> Child/Subclass/Dervied class
        Inheritance represents an IS-A relationship.
        The extends keyword Used to inherit one class from another.


# Inheritance Types 

    1.Single Inheritance
    2.Multilevel Inheritance
    3.Hierarchical Inheritance
    4.Multiple Inheritance

    1.Single Inheritance
    One child inherits one parent.



    2.Multilevel Inheritance
    One class inherits another inherited class.


    3.Hierarchical Inheritance
    Multiple child classes inherit one parent.
    
    4.Multiple Inheritance
        Java does not support Multiple Inheritance (with classes) but supported through Interfaces.
        Reason: Diamond Problem (ambiguity when both parents define the same method).

# Inheritance rules 
    Members Inherited
        The child class inherits:
            Public variables
            Protected variables
            Default members (same package)
            Public methods
            Protected methods
            Default methods (same package)

    Members Not Inherited
        Constructors
        Private variables
        Private methods
        Static initialization blocks

    Constructors are not inherited, but the parent constructor is called before the child constructor.
    The super Keyword refers to the immediate parent class.
      Uses: Call parent constructor, call parent method and Access parent variable


# Method Overriding
    A child class provides its own implementation of a parent method.
    Rules:
        Same method name
        Same parameters
        Same return type (or covariant return type)
        Cannot reduce access level
        final, static, and private methods cannot be overridden

    Method Overloading vs Method Overriding

# Important Rules
    Java supports single inheritance with classes.
    A class can extend only one class.
    Constructors are not inherited.
    Private members are not directly accessible in child classes.
    Use extends to inherit.
    Use super to access parent members.
    Inheritance represents an IS-A relationship.
    Method overriding enables runtime polymorphism.