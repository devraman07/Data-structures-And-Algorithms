# 📘 Bitwise Operators in Java

> A complete beginner-to-intermediate guide to Bitwise Operators in Java for DSA, Competitive Programming, and Coding Interviews.

---

# 📖 Table of Contents

- Introduction
- Why Learn Bitwise Operators?
- Binary Basics
- Decimal to Binary Conversion
- Binary Place Values
- Bitwise Operators Overview
- Bitwise AND (`&`)
- Bitwise OR (`|`)
- Bitwise XOR (`^`)
- Bitwise NOT (`~`)
- Left Shift (`<<`)
- Right Shift (`>>`)
- Unsigned Right Shift (`>>>`)
- Common Bitwise Tricks
- Java Examples
- Time Complexity
- Operator Precedence
- Best Practices
- Common Mistakes
- Interview Questions
- Practice Problems
- Revision Checklist

---

# What are Bitwise Operators?

Bitwise operators perform operations **directly on the binary (bits)** representation of numbers.

Unlike arithmetic operators (`+`, `-`, `*`, `/`), bitwise operators work **bit by bit**.

Every integer inside a computer is stored as **0s and 1s (Binary)**.

Example

```text
Decimal  Binary

5        00000101
3        00000011
10       00001010
```

Instead of comparing decimal numbers, Java first converts them into binary and then performs the operation.

---

# Why Learn Bitwise Operators?

Bitwise operators are extremely useful in:

- Competitive Programming
- Data Structures & Algorithms
- Coding Interviews
- Cryptography
- Networking
- Operating Systems
- Embedded Systems
- Game Development
- Database Engines
- Performance Optimization

They allow us to solve many problems with **less code and better performance**.

---

# Binary Basics

A binary number contains only two digits.

```text
0
1
```

Every position has a power of 2.

| Binary | Decimal Value |
|---------|--------------:|
| 1 | 2⁰ = 1 |
| 10 | 2¹ = 2 |
| 100 | 2² = 4 |
| 1000 | 2³ = 8 |
| 10000 | 2⁴ = 16 |

Example

```text
Binary

10110
```

Calculation

```text
1 × 16

0 × 8

1 × 4

1 × 2

0 × 1

=

22
```

---

# Decimal to Binary Conversion

| Decimal | Binary |
|---------:|:------|
| 0 | 0000 |
| 1 | 0001 |
| 2 | 0010 |
| 3 | 0011 |
| 4 | 0100 |
| 5 | 0101 |
| 6 | 0110 |
| 7 | 0111 |
| 8 | 1000 |
| 9 | 1001 |
| 10 | 1010 |
| 15 | 1111 |
| 16 | 10000 |

---

# Binary Place Values

```text
Bit Position

128 64 32 16 8 4 2 1
```

Example

```text
22

↓

00010110
```

Calculation

```text
16 + 4 + 2

= 22
```

---

# Types of Bitwise Operators

| Operator | Name |
|-----------|------|
| `&` | Bitwise AND |
| `|` | Bitwise OR |
| `^` | Bitwise XOR |
| `~` | Bitwise NOT |
| `<<` | Left Shift |
| `>>` | Right Shift |
| `>>>` | Unsigned Right Shift |

---

# Bitwise AND (`&`)

Returns **1 only when both bits are 1**.

Truth Table

| A | B | A & B |
|---|---|:-----:|
| 0 | 0 | 0 |
| 0 | 1 | 0 |
| 1 | 0 | 0 |
| 1 | 1 | 1 |

Example

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

Binary

```text
   0101   (5)

&  0011   (3)

------------

   0001   (1)
```

Output

```text
1
```

### Common Uses

- Check Even/Odd
- Bit Masking
- Power of Two
- Clear Bits

---

# Bitwise OR (`|`)

Returns **1 if at least one bit is 1**.

Truth Table

| A | B | A \| B |
|---|---|:------:|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 1 |

Example

```java
int a = 5;
int b = 3;

System.out.println(a | b);
```

Binary

```text
   0101

|  0011

------------

   0111
```

Output

```text
7
```

### Common Uses

- Set Bits
- Combine Bit Masks
- Enable Flags

---

# Bitwise XOR (`^`)

Returns **1 only when bits are different**.

Truth Table

| A | B | A ^ B |
|---|---|:-----:|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |

Example

```java
int a = 5;
int b = 3;

System.out.println(a ^ b);
```

Binary

```text
   0101

^  0011

------------

   0110
```

Output

```text
6
```

---

## Important XOR Properties

```text
a ^ a = 0
```

```text
a ^ 0 = a
```

```text
a ^ b ^ a = b
```

These properties make XOR one of the most powerful operators in DSA.

### Example: Swap Without Temporary Variable

```java
int a = 5;
int b = 3;

a = a ^ b;
b = a ^ b;
a = a ^ b;
```

---

# Bitwise NOT (`~`)

Flips every bit.

```text
0 → 1

1 → 0
```

Example

```java
System.out.println(~5);
```

Binary

```text
5

00000101

↓

11111010
```

Output

```text
-6
```

### Why is the Answer Negative?

Java stores integers using **2's Complement Representation**.

Because of this,

```text
~n = -(n + 1)
```

Examples

```text
~5  = -6

~8  = -9

~0  = -1

~-1 = 0
```

---

# Left Shift (`<<`)

Moves all bits to the left.

New positions are filled with **0**.

Example

```java
int a = 5;

System.out.println(a << 1);
```

Binary

```text
00000101

↓

00001010
```

Output

```text
10
```

### Shortcut

```text
n << 1 = n × 2

n << 2 = n × 4

n << 3 = n × 8
```

---

# Right Shift (`>>`)

Moves bits to the right.

Example

```java
int a = 16;

System.out.println(a >> 2);
```

Binary

```text
00010000

↓

00000100
```

Output

```text
4
```

### Shortcut

```text
n >> 1 = n ÷ 2

n >> 2 = n ÷ 4
```

---

# Unsigned Right Shift (`>>>`)

Works like `>>` but always fills the leftmost bits with **0**.

Mostly used for

- Hash Functions
- Cryptography
- Network Programming
- Low-Level Programming

Example

```java
int x = -8;

System.out.println(x >>> 1);
```

---

# Common Bitwise Tricks

## Check Even or Odd

```java
if ((n & 1) == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

Reason

```text
Even → Last Bit = 0

Odd → Last Bit = 1
```

---

## Multiply by 2

```java
n << 1
```

---

## Divide by 2

```java
n >> 1
```

---

## Check Power of Two

```java
(n & (n - 1)) == 0
```

Example

```text
8

1000

7

0111

↓

0000
```

---

## Check ith Bit

```java
(n & (1 << i)) != 0
```

---

## Set ith Bit

```java
n | (1 << i)
```

---

## Clear ith Bit

```java
n & ~(1 << i)
```

---

## Toggle ith Bit

```java
n ^ (1 << i)
```

---

## Remove Last Set Bit

```java
n & (n - 1)
```

Example

```text
101100

↓

101000
```

---

## Get Last Set Bit

```java
n & (-n)
```

---

# Time Complexity

All bitwise operations work directly on CPU registers.

| Operation | Complexity |
|-----------|-----------:|
| AND | O(1) |
| OR | O(1) |
| XOR | O(1) |
| NOT | O(1) |
| Left Shift | O(1) |
| Right Shift | O(1) |

---

# Operator Precedence

Higher precedence operators are evaluated first.

| Operator | Precedence |
|-----------|-----------:|
| `~` | Highest |
| `<< >> >>>` | High |
| `&` | Medium |
| `^` | Low |
| `|` | Lowest |

Use parentheses when combining multiple operators.

---

# Best Practices

✅ Always convert numbers to binary while learning.

✅ Use XOR for unique element problems.

✅ Use `n & (n - 1)` to remove the last set bit.

✅ Use shifts for powers of two.

✅ Prefer bit manipulation only when it improves readability or performance.

---

# Common Mistakes

❌ Confusing `&` with `&&`

```java
&  → Bitwise AND

&& → Logical AND
```

---

❌ Confusing `|` with `||`

```java
|  → Bitwise OR

|| → Logical OR
```

---

❌ Forgetting that `~` returns a negative number for positive integers.

---

❌ Using bit shifts with negative numbers without understanding sign extension.

---

# Frequently Asked Interview Questions

## Beginner

- What are Bitwise Operators?
- Difference between `&` and `&&`?
- Difference between `|` and `||`?
- Why does `5 ^ 5` become 0?
- Why does `~5` return -6?

---

## Intermediate

- Check whether a number is even using bitwise operators.
- Swap two numbers without a temporary variable.
- Find the unique element using XOR.
- Count the number of set bits.
- Check if a number is a power of two.

---

## Advanced

- Explain Two's Complement.
- Difference between `>>` and `>>>`.
- Implement fast exponentiation using bit manipulation.
- Generate all subsets using bit masking.
- Explain how XOR is used in cryptography.

---

# Practice Problems

## Easy

- [ ] Print `5 & 6`
- [ ] Print `5 | 6`
- [ ] Print `5 ^ 6`
- [ ] Print `~5`
- [ ] Print `3 << 2`
- [ ] Print `16 >> 2`

---

## Medium

- [ ] Check Even/Odd
- [ ] Swap Two Numbers
- [ ] Count Set Bits
- [ ] Find Unique Element
- [ ] Check Power of Two

---

## Challenge

- [ ] Find Missing Number using XOR
- [ ] Find Two Unique Numbers
- [ ] Fast Exponentiation
- [ ] Power of Four
- [ ] Decimal to Binary Converter

---

# Revision Checklist

- [ ] Binary Basics
- [ ] Decimal to Binary
- [ ] AND Operator
- [ ] OR Operator
- [ ] XOR Operator
- [ ] NOT Operator
- [ ] Left Shift
- [ ] Right Shift
- [ ] Unsigned Right Shift
- [ ] Common Bitwise Tricks
- [ ] Time Complexity
- [ ] Interview Questions

---

# Next Chapter

➡️ **02-bit-manipulation-patterns.md**

Topics Covered Next

- XOR Interview Patterns
- Bit Masking
- Brian Kernighan's Algorithm
- Subset Generation
- Gray Code
- Binary Exponentiation
- Single Number Problems
- Advanced Bit Tricks
- Top Interview Questions