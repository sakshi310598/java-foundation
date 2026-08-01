# Java Inheritance

Inheritance is one of the fundamental concepts of **Object-Oriented Programming (OOP)** that allows one class to inherit the properties and behaviors of another class.

---

# 1. Introduction

## Definition

**Inheritance** is an OOP concept that allows one class to acquire the properties (fields) and behaviors (methods) of another class.

> It promotes **Code Reusability**, **Maintainability**, and **Runtime Polymorphism**.

---

## Why Do We Need Inheritance?

Inheritance is used to:

- Reuse existing code
- Reduce code duplication
- Improve code maintainability
- Support Method Overriding (Runtime Polymorphism)
- Represent real-world **IS-A** relationships
- Make applications easier to extend

---

## Terminology

| Term | Description |
|------|-------------|
| Parent Class | Existing class whose members are inherited |
| Child Class | New class that inherits from the parent class |
| Super Class | Another name for Parent Class |
| Sub Class | Another name for Child Class |
| Base Class | Parent Class |
| Derived Class | Child Class |

---

## Relationship

Inheritance always represents an **IS-A Relationship**.

### Examples

```
Dog IS-A Animal

Car IS-A Vehicle

Student IS-A Person
```

---

## extends Keyword

The `extends` keyword is used to inherit one class from another.

### Syntax

```java
class Parent {

}

class Child extends Parent {

}
```

---

# 2. Types of Inheritance

Java supports the following inheritance types using classes:

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance

Java does **not** support Multiple Inheritance using classes.

---

## 2.1 Single Inheritance

One child class inherits one parent class.

```
Animal
   │
   ▼
 Dog
```

---

## 2.2 Multilevel Inheritance

One child class becomes the parent of another class.

```
Animal
   │
   ▼
 Dog
   │
   ▼
 Puppy
```

---

## 2.3 Hierarchical Inheritance

Multiple child classes inherit from one parent class.

```
       Animal
      /      \
    Dog      Cat
```

---

## 2.4 Multiple Inheritance

A class inherits from more than one parent class.

```
      A
     / \
    B   C
```

### Java Support

- ❌ Not supported using classes
- ✅ Supported using Interfaces

### Reason

Java avoids the **Diamond Problem**, where two parent classes contain the same method, creating ambiguity.

---

# 3. Inheritance Rules

## Members Inherited

A child class inherits:

- Public variables
- Protected variables
- Default (package-private) variables *(same package only)*
- Public methods
- Protected methods
- Default methods *(same package only)*

---

## Members Not Inherited

The following members are **not inherited**:

- Constructors
- Private variables
- Private methods
- Static initialization blocks

---

## Constructor Rule

Constructors are **not inherited**.

However, when a child object is created, the **parent constructor executes first**, followed by the child constructor.

---

## super Keyword

The `super` keyword refers to the immediate parent class.

### Uses of `super`

- Call parent constructor → `super()`
- Call parent method → `super.method()`
- Access parent variable → `super.variable`

---

# 4. Method Overriding

Method Overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

---

## Rules for Method Overriding

- Method name must be the same
- Parameters must be the same
- Return type must be the same (or covariant)
- Access level cannot be reduced
- `final` methods cannot be overridden
- `static` methods cannot be overridden
- `private` methods cannot be overridden

---

## Method Overloading vs Method Overriding

| Method Overloading | Method Overriding |
|--------------------|-------------------|
| Same class | Parent & Child class |
| Same method name | Same method name |
| Different parameters | Same parameters |
| Compile-time Polymorphism | Runtime Polymorphism |

---

# 5. Important Rules

- Java supports **Single Inheritance** using classes.
- A class can extend only **one** class.
- Constructors are **not inherited**.
- Private members are **not directly accessible** in child classes.
- Use the `extends` keyword to inherit a class.
- Use the `super` keyword to access parent members.
- Inheritance always represents an **IS-A** relationship.
- Method Overriding enables **Runtime Polymorphism**.

---

# 6. Advantages of Inheritance

- Code Reusability
- Reduces Code Duplication
- Easy Maintenance
- Improves Readability
- Supports Runtime Polymorphism
- Easy to Extend Existing Code

---

# 7. Disadvantages of Inheritance

- Tight Coupling
- Parent changes may affect child classes
- Deep inheritance hierarchy is difficult to maintain
- Improper use can reduce code flexibility

---

# 8. Interview Questions

### Basic

- What is Inheritance?
- Why is Inheritance used?
- What is the `extends` keyword?
- What is an IS-A Relationship?
- What are the advantages of Inheritance?

### Intermediate

- What members are inherited?
- What members are not inherited?
- Are constructors inherited?
- What is the `super` keyword?
- What is Method Overriding?

### Advanced

- Why doesn't Java support Multiple Inheritance?
- What is the Diamond Problem?
- Can a final method be overridden?
- Can static methods be overridden?
- Difference between Inheritance and Composition?

---

# Quick Revision

- Inheritance allows one class to inherit another class.
- Use the `extends` keyword.
- Represents an **IS-A** relationship.
- Promotes Code Reusability.
- Java supports **Single**, **Multilevel**, and **Hierarchical** inheritance.
- Java does **not** support Multiple Inheritance using classes.
- Constructors are not inherited.
- Use `super` to access parent members.
- Method Overriding enables Runtime Polymorphism.