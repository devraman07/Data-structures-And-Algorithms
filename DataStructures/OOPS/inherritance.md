# 📘 OOP - Inheritance (Lecture 4)

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is Inheritance?

Inheritance allows one class to **reuse** the properties and methods of another class.

It creates an **IS-A Relationship**.

Example

```
Dog IS-A Animal

Car IS-A Vehicle

SavingsAccount IS-A BankAccount
```

---

# Why Inheritance?

- Code Reusability
- Less Duplicate Code
- Better Organization
- Supports Polymorphism
- Easier Maintenance

---

# Syntax

```java
class Child extends Parent{

}
```

---

# Parent Class

Also called

- Superclass
- Base Class

---

# Child Class

Also called

- Subclass
- Derived Class

---

# Types of Inheritance

## Single

```
Animal

↓

Dog
```

---

## Multilevel

```
Animal

↓

Dog

↓

Puppy
```

---

## Hierarchical

```
        Animal

      /       \

    Dog      Cat
```

---

## Multiple Inheritance

❌ Not supported using classes.

Reason

Diamond Problem

✅ Achieved using Interfaces.

---

# Access Modifiers

| Modifier | Child Class Access |
|-----------|-------------------|
| public | ✅ |
| protected | ✅ |
| default | Same Package Only |
| private | ❌ |

---

# super Keyword

Used to access Parent Class.

Call Parent Constructor

```java
super();
```

Call Parent Method

```java
super.display();
```

---

# Constructor Flow

```
Parent Constructor

↓

Child Constructor
```

Parent constructor always executes first.

---

# Mental Framework

```
Parent

↓

extends

↓

Child

↓

Reuse

↓

Add New Features
```

---

# Interview Cheat Sheet

| Concept | Definition |
|----------|------------|
| Inheritance | Acquire properties from another class |
| extends | Creates inheritance |
| Parent | Superclass |
| Child | Subclass |
| super | Access parent members |

---

# Common Mistakes

❌ Constructors are inherited.

✔ Constructors are **NOT inherited**.

---

❌ Multiple inheritance with classes.

✔ Java uses Interfaces instead.

---

❌ Forgetting Parent Constructor executes first.

---

# Homework

- [ ] Create Vehicle → Car
- [ ] Create Animal → Dog
- [ ] Create Animal → Dog → Puppy
- [ ] Create Shape → Circle & Rectangle
- [ ] Call parent method using `super`

---

# Revision Questions

1. What is Inheritance?
2. Why do we use `extends`?
3. Difference between Parent and Child?
4. Why doesn't Java support multiple inheritance?
5. What does `super()` do?
6. Are constructors inherited?
7. Which constructor executes first?
8. What is an IS-A relationship?

---

# Covered Today ✅

- Inheritance
- Types of Inheritance
- extends Keyword
- super Keyword
- Constructor Flow
- Access in Inheritance