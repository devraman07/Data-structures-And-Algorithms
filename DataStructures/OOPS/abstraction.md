# 📘 OOP - Abstraction (Lecture 6)

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is Abstraction?

Abstraction means

> **Showing only the essential details while hiding the implementation.**

Users know **what** something does.

They don't need to know **how** it works.

---

# Why Abstraction?

- Hide Complexity
- Improve Security
- Better Code Design
- Loose Coupling
- Easier Maintenance

---

# Achieved Using

## Abstract Class

```java
abstract class Animal{

    abstract void sound();

}
```

---

## Interface

```java
interface Payment{

    void pay();

}
```

---

# Abstract Class

Can contain

✅ Abstract Methods

✅ Normal Methods

Cannot create objects.

---

# Abstract Method

A method without a body.

```java
abstract void draw();
```

Child class must implement it.

---

# Interface

Contains only the contract.

Example

```
UPI

↓

PhonePe

Google Pay

Paytm
```

Every app implements payment differently.

---

# Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Can have implementation | Contract only *(basic understanding)* |
| Uses `extends` | Uses `implements` |
| Constructor allowed | No constructor |

---

# Real Life Examples

ATM

```
Insert Card

↓

Withdraw Money

↓

Cash Comes Out
```

You don't know how the ATM works internally.

---

Car

```
Start()

↓

Engine Starts
```

You only use the functionality.

---

# Mental Framework

```
Hide

↓

Complexity

↓

Expose

↓

Essential Features
```

---

# Interview Cheat Sheet

| Concept | Definition |
|----------|------------|
| Abstraction | Hide implementation |
| Abstract Class | Partial abstraction |
| Interface | Complete contract |
| Abstract Method | No body |

---

# Common Mistakes

❌ Creating object of Abstract Class.

❌ Forgetting to implement abstract methods.

❌ Confusing Abstraction with Encapsulation.

---

# Homework

- [ ] Create Shape abstract class.
- [ ] Implement Circle.
- [ ] Implement Rectangle.
- [ ] Create Payment interface.
- [ ] Implement UPI and Credit Card.

---

# Revision Questions

1. What is Abstraction?
2. Why do we use it?
3. Difference between Abstraction and Encapsulation?
4. What is an Abstract Class?
5. Can we create an object of an Abstract Class?
6. What is an Interface?
7. Difference between Abstract Class and Interface?
8. Give one real-world example of Abstraction.

---

# Covered Today ✅

- Abstraction
- Abstract Class
- Abstract Method
- Interface
- Real-World Examples