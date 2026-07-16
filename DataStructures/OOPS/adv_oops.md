# 📘 OOP - Object Creation & Constructors (Lecture 2)

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is an Object?

An **Object** is an instance of a class.

Think of it as a real-world entity created from a blueprint.

```
Blueprint

↓

Class

↓

Object

↓

Real Entity
```

Example

```
Class

↓

Car

↓

Objects

Toyota
Ford
BMW
Tesla
```

Every object has

- Its own data (State)
- Its own behavior (Methods)

---

# Creating an Object

Objects are created using the **new** keyword.

Syntax

```java
ClassName objectName = new ClassName();
```

Example

```java
Car car = new Car();
```

Breakdown

```
Car

↓

Class Name

car

↓

Reference Variable

new Car()

↓

Creates Object
```

---

# Accessing Object Members

After creating an object, we can access its variables and methods using the **dot (.) operator**.

Example

```java
car.brand = "Toyota";

car.year = 2020;

car.display();
```

---

# Multiple Objects

A class can create many objects.

Each object has its own copy of instance variables.

Example

```java
Car car1 = new Car();

Car car2 = new Car();
```

Changing

```java
car1.brand
```

does **not** affect

```java
car2.brand
```

---

# Memory Allocation

When an object is created,

```java
new Car()
```

Java allocates memory in the **Heap Memory**.

The reference variable stores the address of the object.

```
Stack

↓

Reference Variable

↓

Heap

↓

Actual Object
```

Java automatically removes unused objects using the **Garbage Collector (GC).**

No need to manually free memory.

---

# Constructors

A **Constructor** is a special method used to initialize an object.

Characteristics

- Same name as the class
- No return type
- Called automatically when an object is created

---

# Default Constructor

If we don't create any constructor,

Java automatically provides a default constructor.

Example

```java
Car car = new Car();
```

---

# User Defined Default Constructor

```java
class Car{

    Car(){

        System.out.println("Constructor Called");

    }

}
```

Runs automatically whenever an object is created.

---

# Parameterized Constructor

Used to initialize objects with values during creation.

Example

```java
Car car = new Car("Toyota",2020);
```

Constructor

```java
Car(String brand,int year){

    this.brand = brand;
    this.year = year;

}
```

Benefits

- Cleaner Code
- Fewer Errors
- Easy Initialization

---

# this Keyword

Inside a constructor,

```java
this.variable
```

refers to the current object's instance variable.

Example

```java
this.brand = brand;
```

Meaning

```
Object Variable

=

Parameter
```

---

# Why Constructors?

Without Constructor

```java
Car car = new Car();

car.brand = "Toyota";

car.year = 2020;
```

With Constructor

```java
Car car = new Car("Toyota",2020);
```

Constructor initialization is

- Cleaner
- Safer
- Easier to Read

---

# Mental Framework

Whenever an object is created

```
Class

↓

new Keyword

↓

Constructor Called

↓

Memory Allocated

↓

Object Ready
```

---

# Interview Cheat Sheet

| Concept | One Line Definition |
|----------|--------------------|
| Object | Instance of a class |
| new | Allocates memory and creates an object |
| Reference Variable | Stores the address of an object |
| Constructor | Initializes an object |
| Default Constructor | No parameters |
| Parameterized Constructor | Accepts values while creating the object |
| this | Refers to the current object |

---

# Common Mistakes

❌ Forgetting the `new` keyword.

Wrong

```java
Car car;
```

Correct

```java
Car car = new Car();
```

---

❌ Thinking constructor is a normal method.

Constructor

- No return type
- Same name as the class

---

❌ Forgetting `this` when parameter names and instance variable names are the same.

Correct

```java
this.brand = brand;
```

---

❌ Initializing every variable manually instead of using constructors.

Prefer

```java
new Car("BMW",2024);
```

---

# Today's Homework

## Easy

- [ ] Create a `Student` class and create three different objects.
- [ ] Create a `Laptop` class and initialize values manually.
- [ ] Create a `Book` class with a default constructor that prints a message.
- [ ] Create a `Mobile` class and print all object details using a method.

---

## Medium

- [ ] Create a `Car` class with a parameterized constructor.
- [ ] Create an `Employee` class with `name`, `id`, and `salary` initialized using a constructor.
- [ ] Create two objects using different constructor values and print their details.
- [ ] Create a `Rectangle` class with `length` and `width`, then calculate the area.

---

# Revision Questions

1. What is the difference between a class and an object?
2. Why do we use the `new` keyword?
3. Where are objects stored in memory?
4. What is a reference variable?
5. What is a constructor?
6. Why doesn't a constructor have a return type?
7. What is the difference between a default constructor and a parameterized constructor?
8. Why is the `this` keyword required?
9. What happens when an object is created?
10. Why are constructors preferred over manual initialization?

---

# Covered Today ✅

- Object Creation
- new Keyword
- Reference Variables
- Heap Memory
- Constructors
- Default Constructor
- Parameterized Constructor
- this Keyword
- Object Initialization

---

# Next Lecture

➡️ Constructors in Detail

- Constructor Overloading
- Copy Constructor
- Constructor Chaining
- `this()` Constructor Calls
- Object Lifecycle