# 📘 OOP - Polymorphism (Lecture 5)

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is Polymorphism?

**Polymorphism** means

> **One Interface, Many Forms**

The same method behaves differently depending on the object.

---

# Types

## Compile-Time Polymorphism

Method Overloading

↓

Compiler decides.

---

## Run-Time Polymorphism

Method Overriding

↓

JVM decides during execution.

---

# Method Overloading

Same Method Name

Different Parameters

```
add(int,int)

add(double,double)

add(int,int,int)
```

Occurs

✔ Same Class

---

# Method Overriding

Same Method

Same Parameters

Different Implementation

```
Animal

↓

Dog
```

Occurs

✔ Parent + Child

---

# @Override

Always use

```java
@Override
```

Benefits

- Compiler Checks
- Fewer Bugs
- Better Readability

---

# Dynamic Method Dispatch

```
Animal a;

↓

Dog Object

↓

Dog Method Executes
```

Java checks the actual object at runtime.

---

# Overloading vs Overriding

| Overloading | Overriding |
|-------------|------------|
| Same Class | Parent + Child |
| Different Parameters | Same Parameters |
| Compile Time | Run Time |

---

# Mental Framework

Need Same Name?

↓

Different Parameters

↓

Overloading

---

Need Same Method

↓

Different Behaviour

↓

Overriding

---

# Interview Cheat Sheet

| Concept | Meaning |
|----------|---------|
| Polymorphism | Many Forms |
| Overloading | Compile-Time |
| Overriding | Run-Time |
| @Override | Checks overriding |

---

# Common Mistakes

❌ Thinking Overloading requires inheritance.

❌ Changing parameters in overriding.

❌ Forgetting @Override.

---

# Homework

- [ ] Overload area() method.
- [ ] Overload add() method.
- [ ] Override sound() using Animal, Dog, Cat.
- [ ] Override start() using Vehicle and Car.
- [ ] Create Employee → Developer → Manager example.

---

# Revision Questions

1. What is Polymorphism?
2. Difference between Overloading and Overriding?
3. Compile Time vs Run Time?
4. Why use @Override?
5. What is Dynamic Method Dispatch?
6. Which polymorphism needs inheritance?
7. Can constructors be overloaded?
8. Can constructors be overridden?

---

# Covered Today ✅

- Polymorphism
- Method Overloading
- Method Overriding
- Dynamic Method Dispatch
- @Override