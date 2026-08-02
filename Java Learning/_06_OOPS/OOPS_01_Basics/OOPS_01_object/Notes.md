### 📖 01.OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS01_Introduction
An **object** is an **instance of a class**. It represents a real-world entity that contains:
- **State (Properties/Data)** – Describes the object.
- **Behavior (Methods/Functions)** – Defines what the object can do.
- **Identity** – Makes each object unique.
---

### ⭐ 02.Characteristics
Every object has some important characteristics.

- **State (Properties):** Stores information about the object.
    - **Example:** Product ID, Product Name, Price, Quantity

- **Behavior (Methods):** Defines what an object can do.
    - **Example:** displayProduct(), calculateTotal(), updateQuantity()

- **Identity:** Every object has a unique memory location, which differentiates it from other objects.
  - **Product product1 = new Product(102, "Mobile", 5000.0, 5);**
  - **Product product2 = new Product(101, "Laptop", 55000.0, 2);**
---

### 🚀 03.Object Creation
OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects are created using the **`new`** keyword.
- **Example:** Product product = new Product(101, "Laptop", 55000.0, 2);**

    | Part         | Description              |
    |--------------|--------------------------|
    | Product      | Class Name               |
    | product      | Reference Variable       |
    | new          | Allocates memory in Heap |
    | Product(...) | Constructor              |

---

### 🧠 04.Memory Representation

When an object is created:
- **Reference Variable** → Stored in **Stack Memory**
- **Actual Object** → Stored in **Heap Memory**
```text
           STACK MEMORY                     HEAP MEMORY
        -----------------             -------------------------
        product1  ----------------->   Product Object
                                       -----------------------
                                       id       = 101
                                       name     = Laptop
                                       price    = 55000
                                       quantity = 2
                                       -----------------------
```
---

### 🔄 05.Object Lifecycle

- **Declaration:** No object created for during declaration.
    - **Example:** Product product3;

- **Instantiation:** Object created in heap.
    - **Example:** new Product();

- **Initialization:** Reference points to object.
    - **Example:** Product product3 = new Product();

- **Object Usage:** Used for getting variable values, calling methods etc.

- **Destruction:** Java automatically destroys unused objects using the Garbage Collector.
---

### 📦 06.Types of OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects
The java provides different types of object for different purpose.

- **Named Object:** Object assigned to a reference variable.
  - **Example:** Product product3 = new Product();
- **Anonymous Object:** Object created without storing its reference to use only one times.
  - **Example:** new Product(102, "Mobile", 5000.0, 5).displayProduct();
- **Immutable Object:** Cannot change after creation because it's immutable.
- **Mutable Object:** Can be modified after creation.
- **Singleton Object:** Only one object exists throughout the application.
- **Wrapper OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects:** Represent primitive values as objects.
- **Array OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects:** Arrays are also objects.
  - **Example:** int[] arr = new int[5];
- **String Object:** Created using literals or the new keyword.
- **Exception Object:** 
- **Thread Object:**
  - **Example:** Thread t = new Thread(); t.start();
---

### 🏗 07.Ways to Create OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects

    Using new Keyword:
    Using Reflection:
    Using clone() Method:
    Deserialization: 

---

### 🔗 08.Object Reference

    Product p1 = new Product(109, "Washing Machine", 21000.0, 1);
    Product p2 = p1;(Both references point to the same object)

---

### ❌ 09.Null Object Reference

    When we assing object reference is null and trying access using reference then Throws NullPointerException
    Product p1 = null;
    p1.displayProduct(); //Throws NullPointerException


---

### ⚖ 10.Comparing OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects
    Using == to compares references.
    Using equals() to compares contents.
