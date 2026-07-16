# 📘 Basic Mathematics for DSA (Lecture 1)

> Status: ✅ Completed
>
> Revision Count: 0

---

# Why Learn Basic Mathematics?

Basic Mathematics in DSA is **not school mathematics**.

It teaches us how to:

- Process numbers
- Extract digits
- Build logic using loops
- Use conditions effectively
- Solve beginner DSA problems

This chapter is the foundation for many number-based interview questions.

---

# Basic Arithmetic Operators

| Operator | Meaning |
|----------|---------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulo (Remainder) |

---

# Integer Division

When both operands are integers,

```java
10 / 3
```

Output

```
3
```

The decimal part is discarded.

---

# Modulo Operator

```java
n % m
```

Returns the remainder.

Example

```
10 % 3 = 1
```

Most commonly used for

- Even / Odd
- Digit Extraction
- Number Problems

---

# The Most Important Pattern

Almost every number problem is built using these two operations.

## Extract Last Digit

```java
digit = n % 10;
```

Example

```
1234

↓

4
```

---

## Remove Last Digit

```java
n = n / 10;
```

Example

```
1234

↓

123
```

Remember this pair forever.

```
Extract

↓

Process

↓

Remove
```

---

# Problems Covered Today

## Count Digits

Idea

Keep removing the last digit until the number becomes 0.

```
Count++

↓

n = n / 10
```

Time : O(Number of Digits)

---

## Sum of Digits

Idea

Extract every digit.

Add it to the running sum.

```
digit = n % 10

↓

sum += digit

↓

n /= 10
```

---

## Reverse Number

Idea

Extract one digit at a time.

Build a new number.

Formula

```java
rev = rev * 10 + digit;
```

Time : O(Number of Digits)

---

## Even / Odd

Rule

```java
n % 2 == 0
```

Even

Otherwise

Odd

---

## Palindrome Number

Idea

Reverse the number.

Compare it with the original.

```
Original

↓

Reverse

↓

Compare
```

---

## Prime Number

Definition

A prime number has exactly two factors.

```
1

and

itself
```

Basic approach

Try dividing from

```
2

↓

n-1
```

Better approach

```
2

↓

√n
```

---

## Factorial

Formula

```
n!

=

n × (n-1) × ... × 1
```

Build the answer using multiplication.

---

## GCD

Meaning

Greatest Common Divisor

Best Method

Euclidean Algorithm

Formula

```java
GCD(a,b)

=

GCD(b,a%b)
```

---

## LCM

Meaning

Least Common Multiple

Formula

```java
LCM = (a*b)/GCD
```

---

## Armstrong Number

Idea

Find the sum of the cube of each digit.

If

```
Sum == Original Number
```

It is an Armstrong Number.

---

## Power of a Number

```
a^b
```

Multiply

```
a

↓

b times
```

---

## Perfect Number

Definition

A number is perfect if

```
Sum of Proper Divisors

=

Number
```

Example

```
6

↓

1+2+3

↓

6
```

---

## Count Even Digits

Process every digit.

Check

```java
digit % 2 == 0
```

Increase the count.

---

# Mental Framework

Whenever a Number Problem Appears

Ask yourself

### Need every digit?

↓

```
digit = n % 10

n = n / 10
```

---

Need reverse?

↓

```
rev = rev * 10 + digit;
```

---

Need divisibility?

↓

Use

```
%
```

---

Need factors?

↓

Loop from

```
1 → n

or

2 → √n
```

---

Need multiplication?

↓

Running Product

---

# Complexity Summary

| Problem | Time |
|----------|------|
| Count Digits | O(d) |
| Sum of Digits | O(d) |
| Reverse Number | O(d) |
| Palindrome | O(d) |
| Even/Odd | O(1) |
| Prime (Basic) | O(n) |
| Prime (Optimized) | O(√n) |
| Factorial | O(n) |
| GCD | O(log n) |
| LCM | O(log n) |

---

# Formula Cheat Sheet

## Last Digit

```java
n % 10
```

---

## Remove Last Digit

```java
n / 10
```

---

## Even

```java
n % 2 == 0
```

---

## Reverse Number

```java
rev = rev * 10 + digit;
```

---

## GCD

```java
GCD(a,b)

=

GCD(b,a%b)
```

---

## LCM

```java
LCM = (a*b)/GCD
```

---

# Common Mistakes

❌ Forgetting

```java
n = n / 10;
```

inside the loop.

---

❌ Losing the original number.

Store it first.

```java
int original = n;
```

---

❌ Assuming

```java
5/2 = 2.5
```

Wrong.

Integer division returns

```
2
```

---

❌ Confusing

```
/

and

%
```

---

# Today's Homework

## Easy

- [ ] Print all digits of a number.
- [ ] Count odd digits in a number.
- [ ] Find the product of all digits.
- [ ] Find the largest digit in a number.
- [ ] Find the smallest digit in a number.
- [ ] Check whether a number is divisible by both 3 and 5.
- [ ] Count how many digits are greater than 5.
- [ ] Print the multiplication table of a given number.
- [ ] Find the sum of all even numbers from 1 to n.
- [ ] Find the sum of all odd numbers from 1 to n.

---

## Medium

- [ ] Count the frequency of a specific digit in a number.
- [ ] Check whether every digit of a number is even.
- [ ] Find the first digit of a number.
- [ ] Find the largest among three numbers.
- [ ] Check whether a number is a strong number.

---

# Revision Questions

1. Why is `%` one of the most important operators in DSA?
2. Explain the difference between `/` and `%`.
3. Why does `n / 10` remove the last digit?
4. Why do we store the original number before reversing it?
5. Why is `rev = rev * 10 + digit` used while reversing?
6. Why is checking up to `√n` sufficient for prime numbers?
7. How does the Euclidean Algorithm work?
8. Why is `LCM = (a × b) / GCD` valid?

---

# Covered Today ✅

- Arithmetic Operators
- Integer Division
- Modulo Operator
- Digit Extraction
- Count Digits
- Sum of Digits
- Reverse Number
- Even / Odd
- Palindrome Number
- Prime Number
- Factorial
- GCD
- LCM
- Armstrong Number
- Power of a Number
- Perfect Number
- Count Even Digits

---

