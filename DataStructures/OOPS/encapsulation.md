# 📘 OOP - Encapsulation (Lecture 3)

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is Encapsulation?

**Encapsulation** is the process of **binding data (variables) and methods together into a single class** while restricting direct access to the data.

Instead of allowing anyone to modify variables directly, we provide controlled access through **Getter** and **Setter** methods.

---

# Definition

> Encapsulation = **Data Hiding + Controlled Access**

---

# Why Encapsulation?

Encapsulation helps us:

- Protect data from invalid modifications.
- Hide implementation details.
- Validate data before updating it.
- Improve maintainability.
- Improve code security.

---

# How is Encapsulation Achieved?

Three simple steps:

### 1. Make variables `private`

```java
private double balance;
```

---

### 2. Create a Getter

Used to read data.

```java
public double getBalance() {
    return balance;
}
```

---

### 3. Create a Setter

Used to update data after validation.

```java
public void setBalance(double balance) {

    if(balance >= 0){
        this.balance = balance;
    }

}
```

---

# Complete Example

```java
class Account {

    private double balance;

    public void setBalance(double balance){

        if(balance >= 0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid Balance");
        }

    }

    public double getBalance(){

        return balance;

    }

}
```

---

# Getter

Purpose

```
Read Data
```

Syntax

```java
public DataType getVariableName(){

    return variable;

}
```

Example

```java
public String getName(){

    return name;

}
```

---

# Setter

Purpose

```
Update Data
```

Syntax

```java
public void setVariableName(DataType value){

    this.variable = value;

}
```

Example

```java
public void setAge(int age){

    this.age = age;

}
```

---

# Why Private Variables?

Wrong

```java
account.balance = -5000;
```

Anyone can modify the value.

---

Correct

```java
account.setBalance(-5000);
```

Validation decides whether the value should be accepted.

---

# Validation Example

```java
if(balance >= 0){

    this.balance = balance;

}
```

This prevents invalid data from entering the object.

---

# Real World Analogy

## 🏦 Bank Account

```
Customer

↓

Deposit()

Withdraw()

↓

Bank System

↓

Balance
```

The customer **cannot directly modify** the balance.

They must use

- Deposit
- Withdraw

This is Encapsulation.

---

## 📺 Remote Control

```
User

↓

Buttons

↓

TV Circuit
```

You press buttons.

You never touch the internal circuit.

The internal implementation is hidden.

---

# Benefits of Encapsulation

✅ Data Hiding

Protects internal data.

---

✅ Validation

Allows only valid values.

---

✅ Security

Prevents accidental modification.

---

✅ Maintainability

Internal implementation can change without affecting other classes.

---

✅ Better Design

Separates internal logic from external usage.

---

# Mental Framework

Whenever you hear

**Encapsulation**

Think

```
Private Variables

↓

Getter

↓

Setter

↓

Validation

↓

Safe Object
```

---

# Interview Cheat Sheet

| Concept | One Line Definition |
|----------|--------------------|
| Encapsulation | Wrapping data and methods together while hiding internal data. |
| private | Accessible only inside the class. |
| Getter | Reads private data. |
| Setter | Updates private data after validation. |
| Validation | Prevents invalid data from being stored. |

---

# Common Mistakes

❌ Declaring variables as `public`.

Correct

```java
private int age;
```

---

❌ Updating variables directly.

Wrong

```java
student.age = -5;
```

Correct

```java
student.setAge(-5);
```

---

❌ Creating setters without validation.

Always validate when required.

---

❌ Getter modifying data.

Getter should **only return data**, not change it.

---

# Today's Homework

## Easy

- [ ] Create a `Student` class with private `name` and `age`.
- [ ] Create getters and setters for both variables.
- [ ] Prevent negative age values.
- [ ] Print student details using getters.

---

## Medium

- [ ] Create a `BankAccount` class with a private `balance`.
- [ ] Allow deposits only if the amount is positive.
- [ ] Prevent withdrawals larger than the current balance.
- [ ] Display the updated balance using a getter.

---

## Challenge

- [ ] Create an `Employee` class with private `salary`.
- [ ] Allow salary updates only if the new salary is greater than zero.
- [ ] Create a `Product` class where the price cannot be negative.
- [ ] Create a `Password` class where the password must contain at least 8 characters before being accepted.

---

# Revision Questions

1. What is Encapsulation?
2. Why do we make variables `private`?
3. What is the purpose of a Getter?
4. What is the purpose of a Setter?
5. Why is validation important?
6. Can Encapsulation exist without Getters and Setters?
7. What happens if variables are declared `public`?
8. How does Encapsulation improve security?
9. What is the difference between Data Hiding and Encapsulation?
10. Give a real-world example of Encapsulation.

---

# Covered Today ✅

- Encapsulation
- Data Hiding
- private Keyword
- Getter Methods
- Setter Methods
- Validation
- Controlled Access
- Real-World Examples

---

# Next Lecture

➡️ Access Modifiers

- public
- private
- protected
- default
- Visibility Rules
- Package Access