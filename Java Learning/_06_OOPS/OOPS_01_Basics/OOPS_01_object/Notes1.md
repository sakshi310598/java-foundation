# ☕ Java OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects – Complete Notes

---

# 📖 OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS01_Introduction

An **object** is an **instance of a class**. It represents a real-world entity that contains:

- **State (Properties/Data)** – Describes the object.
- **Behavior (Methods/Functions)** – Defines what the object can do.
- **Identity** – Makes each object unique.

> **Object = Instance of a Class**

---

# ⭐ Characteristics of an Object

Every object has three important characteristics.

## 1. State (Properties)

Stores information about the object.

**Example**
- Product ID
- Product Name
- Price
- Quantity

---

## 2. Behavior (Methods)

Defines what an object can do.

**Example**
- displayProduct()
- calculateTotal()
- updateQuantity()

---

## 3. Identity

Every object has a unique memory location, which differentiates it from other objects.

---

# 🚀 Object Creation

OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects are created using the **`new`** keyword.

### Syntax

```java
ClassName referenceVariable = new ClassName();
```

### Example

```java
Product product1 = new Product(101, "Laptop", 55000.0, 2);
```

### Breakdown

| Part | Description |
|------|-------------|
| Product | Class Name |
| product1 | Reference Variable |
| new | Allocates memory in Heap |
| Product(...) | Constructor |

---

# 🧠 Memory Representation

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

# 🔄 Object Lifecycle

## 1. Declaration

Only the reference variable is created.

```java
Product product3;
```

> No object is created during declaration.

---

## 2. Instantiation

Memory is allocated in the heap.

```java
new Product();
```

---

## 3. Initialization

The reference variable points to the newly created object.

```java
Product product3 = new Product();
```

---

## 4. Object Usage

The object is used to:

- Access variables
- Call methods
- Modify data

Example

```java
product3.displayProduct();
```

---

## 5. Destruction

Java automatically removes unused objects using the **Garbage Collector (GC)**.

---

# 📦 Types of OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects

## 1. Named Object

An object assigned to a reference variable.

```java
Product product = new Product();
```

---

## 2. Anonymous Object

Created without storing its reference.

Used only once.

```java
new Product(102, "Mobile", 5000.0, 5).displayProduct();
```

---

## 3. Immutable Object

Cannot be modified after creation.

**Example**

```java
String name = "Java";
```

---

## 4. Mutable Object

Can be modified after creation.

**Example**

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programming");
```

---

## 5. Singleton Object

Only one instance of the class exists throughout the application.

Example:
- Database Connection
- Logger

---

## 6. Wrapper Object

Represents primitive values as objects.

Example

```java
Integer number = 100;
```

---

## 7. Array Object

Arrays are also objects in Java.

```java
int[] arr = new int[5];
```

---

## 8. String Object

Can be created using:

### String Literal

```java
String name = "Java";
```

### new Keyword

```java
String name = new String("Java");
```

---

## 9. Exception Object

Exceptions are objects created when an error occurs during program execution.

---

## 10. Thread Object

Represents a thread of execution.

```java
Thread t = new Thread();
t.start();
```

---

# 🏗 Ways to Create OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects

Java provides multiple ways to create objects.

## 1. Using `new` Keyword

```java
Product product = new Product();
```

---

## 2. Using Reflection

```java
Product product =
Product.class.getDeclaredConstructor().newInstance();
```

---

## 3. Using `clone()` Method

```java
Product copy = (Product) original.clone();
```

---

## 4. Using Deserialization

```java
ObjectInputStream in =
new ObjectInputStream(new FileInputStream("product.ser"));

Product product = (Product) in.readObject();
```

---

# 🔗 Object Reference

Multiple reference variables can point to the same object.

```java
Product p1 = new Product(109, "Washing Machine", 21000.0, 1);

Product p2 = p1;
```

```text
p1  ----\
          \
           -----> Product Object
          /
p2  -----/
```

Both references point to the same object.

---

# ❌ Null Object Reference

A reference variable can store `null`.

```java
Product p1 = null;
```

Attempting to access it results in:

```java
p1.displayProduct();
```

**Output**

```
NullPointerException
```

---

# ⚖ Comparing OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects

## Using `==`

Compares **memory references**.

```java
Product p1 = new Product();
Product p2 = new Product();

System.out.println(p1 == p2);
```

**Output**

```
false
```

---

## Using `equals()`

Compares **object contents** (when properly overridden).

```java
System.out.println(p1.equals(p2));
```

---

# 📌 Quick Summary

| Topic | Description |
|--------|-------------|
| Object | Instance of a Class |
| State | Properties/Data |
| Behavior | Methods |
| Identity | Unique Memory Location |
| Memory | Stack → Reference, Heap → Object |
| Object Creation | `new` Keyword |
| Object Types | Named, Anonymous, Immutable, Mutable, Singleton, Wrapper, Array, String, Exception, Thread |
| Object Lifecycle | Declaration → Instantiation → Initialization → Usage → Garbage Collection |
| Object Comparison | `==` compares references, `equals()` compares contents |
| Null Reference | Accessing a `null` reference throws `NullPointerException` |

---

# 🎯 Interview Questions

### What is an object?

An object is an instance of a class that contains state, behavior, and identity.

### Where are objects stored?

OOPS_01_Basics.OOPS_04_Advanced.OOPS_02_Interface.OOPS02_Objects are stored in **Heap Memory**.

### Where are reference variables stored?

Reference variables are stored in **Stack Memory** (for local variables).

### What is an Anonymous Object?

An object created without assigning it to a reference variable.

### What is the difference between `==` and `equals()`?

- `==` → Compares memory references.
- `equals()` → Compares object contents.

### What happens when a reference becomes `null`?

Accessing it throws a **NullPointerException**.

### Who removes unused objects?

The **Garbage Collector (GC)** automatically removes unused objects.