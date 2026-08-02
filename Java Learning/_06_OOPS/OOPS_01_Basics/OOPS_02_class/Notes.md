# Introductions

    Definition: Class is a blueprint or template used to create objects. 
        It defines the properties (variables) and behaviors (methods) that an object will have.

    A class itself does not occupy memory for object data. 
    Memory is allocated only when an object of the class is created.

# Components

        Variables: Variables store the data of an object.
        Methods: Methods define the behavior of an object.
        Constructors: A constructor initializes an object when it is created.
        Blocks: Java supports two types of blocks:Static Block and Instance Block
        Nested OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS03_Classes: A class can be declared inside another class.

# Memory Allocation

    When a class is written No memory is allocated for object data.
    Memory is allocated only when an object is created.

# Types of OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS03_Classes

    Java provides different types of classes depending on their purpose.
    1. Concrete Class
        A normal class with complete implementation.
        OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects can be created directly.

    2. OOPS_02_Pillars.OOPS_01_Encapsulation.OOPS07_Abstract Class
        Declared using the abstract keyword.
        Can have both abstract and concrete methods.
        Cannot be instantiated(Object create).

    3. Final Class
        Declared using the final keyword.
        Cannot be inherited.

    4. Static Class
       A class declared as static inside another class.
       Can be created without an object of the outer class.

    5. Nested Class
        Defined inside another class.
        Requires an object of the outer class.

    6. Local Inner Class
        Declared inside a method.
        Accessible only within that method.

    7. Anonymous Inner Class
       A class without a name.
       Used for one-time implementation.