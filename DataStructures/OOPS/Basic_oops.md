# 📘 Object-Oriented Programming (OOP) - Basics

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm that organizes code using **objects** and **classes**.

Instead of writing everything in one place, OOP models real-world entities.

Examples

- Car
- Student
- Bank Account
- Employee
- Product

---

# Why OOP?

OOP helps us write code that is

- Reusable
- Scalable
- Maintainable
- Easy to Understand
- Easy to Extend

Almost every Java Backend Framework (Spring Boot, Hibernate, etc.) is built using OOP.

---

# Class

A **Class** is a blueprint or template used to create objects.

A class defines

- State (Variables / Fields)
- Behaviour (Methods)

Example

```java
class Car {

    String brand;
    String model;
    int year;

}
```

Remember

> A class is only a blueprint.

It does **not** occupy memory until an object is created.

---

# Object

An **Object** is an instance of a class.

Creating an object

```java
Car car = new Car();
```

Accessing members

```java
car.brand = "Toyota";
car.model = "Corolla";
```

Remember

```
Class

↓

Blueprint

↓

Object

↓

Real Entity
```

---

# Encapsulation

Encapsulation means

> Wrapping data and methods inside a single class while restricting direct access.

Usually achieved using

```
private

+

Getter

+

Setter
```

Example

```java
class Student{

    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}
```

Benefits

- Data Protection
- Controlled Access
- Better Maintainability

---

# Inheritance

Inheritance allows one class to inherit properties and methods from another class.

```
Vehicle

↓

Car
```

Example

```java
class Vehicle{

    void start(){}

}

class Car extends Vehicle{

}
```

Benefits

- Code Reuse
- Less Duplicate Code
- Parent → Child Relationship

---

# Polymorphism

Polymorphism means

> One interface, many forms.

Two Types

### Compile Time

Method Overloading

```java
add(int,int)

add(double,double)
```

---

### Run Time

Method Overriding

```java
Animal

↓

Dog
```

Dog provides its own implementation of the parent's method.

---

# Abstraction

Abstraction means

> Show only the necessary details and hide the implementation.

Implemented using

- Abstract Classes
- Interfaces

Example

```java
abstract class Animal{

    abstract void sound();

}
```

Benefits

- Less Complexity
- Cleaner Code
- Better Security

---

# Modularity

Modularity means

Breaking a large program into smaller independent modules.

Java achieves this using

- Classes
- Methods
- Packages

Benefits

- Easier Testing
- Easier Debugging
- Team Collaboration
- Better Code Organization

---

# Four Pillars of OOP

```
Encapsulation

↓

Inheritance

↓

Polymorphism

↓

Abstraction
```

Remember this order.

---

# Real World Example

Car Manufacturing

Blueprint

↓

Class

---

Car Produced

↓

Object

---

Different Car Models

↓

Inheritance

---

Same Function

↓

Polymorphism

---

Engine Hidden

↓

Abstraction

---

Different Departments

↓

Modularity

---

# Mental Framework

Whenever someone asks

"What is OOP?"

Think

```
Real World Entity

↓

Class

↓

Object

↓

Protect Data

↓

Reuse Code

↓

Different Behaviour

↓

Hide Complexity
```

---

# Interview Cheat Sheet

| Concept | One Line Definition |
|----------|--------------------|
| Class | Blueprint for creating objects |
| Object | Instance of a class |
| Encapsulation | Wrap data and methods together |
| Inheritance | Acquire properties from another class |
| Polymorphism | One interface, many implementations |
| Abstraction | Hide implementation details |
| Modularity | Divide application into smaller modules |

---

# Common Mistakes

❌ Thinking Class and Object are the same.

✔ Class = Blueprint

✔ Object = Real Instance

---

❌ Accessing private variables directly.

✔ Use Getters and Setters.

---

❌ Confusing Overloading and Overriding.

Overloading

↓

Same class

Different Parameters

---

Overriding

↓

Parent & Child

Same Method

Different Implementation

---

# Today's Homework

## Easy

- [ ] Create a `Student` class with `name`, `age`, and `rollNumber`.
- [ ] Create two `Student` objects and print their details.
- [ ] Create a `Book` class with `title`, `author`, and `price`.
- [ ] Create three `Book` objects.
- [ ] Create a `Mobile` class and initialize its fields.

---

## Medium

- [ ] Create an `Employee` class using private variables and getters/setters.
- [ ] Create a `BankAccount` class with `deposit()` and `withdraw()` methods.
- [ ] Create a `Vehicle` class and a `Bike` class using inheritance.
- [ ] Demonstrate method overloading using a `Calculator` class.
- [ ] Demonstrate method overriding using `Animal` and `Cat` classes.

---

# Revision Questions

1. What is OOP?
2. What is the difference between a Class and an Object?
3. Why do we create objects?
4. Why is Encapsulation important?
5. Why are variables declared `private`?
6. What is the difference between Inheritance and Composition?
7. What is Method Overloading?
8. What is Method Overriding?
9. What is the difference between Abstraction and Encapsulation?
10. Why is OOP widely used in Backend Development?

---

# Covered Today ✅

- OOP Introduction
- Class
- Object
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Modularity

---

# Next Lecture

➡️ Constructors

- Default Constructor
- Parameterized Constructor
- Constructor Overloading
- `this` Keyword
- Static Members