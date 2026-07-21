# 📘 Bit Manipulation Patterns

> Advanced Bit Manipulation techniques, interview patterns, optimization tricks, and frequently asked coding interview problems in Java.

---

# 📖 Table of Contents

- Introduction
- Why Learn Bit Manipulation?
- Bit Masking
- Set, Clear, Toggle & Check ith Bit
- Count Set Bits
- Brian Kernighan's Algorithm
- Power of Two
- Power of Four
- XOR Patterns
- Missing Number
- Single Number I
- Single Number II
- Single Number III
- Find Two Missing Numbers
- Subset Generation (Bit Masking)
- Gray Code
- Binary Exponentiation
- Common Bit Tricks
- Time Complexity Cheat Sheet
- Best Practices
- Common Mistakes
- Interview Questions
- Top LeetCode Problems
- Revision Checklist

---

# Introduction

Bit Manipulation is one of the most powerful optimization techniques in DSA.

Instead of solving problems using loops or extra memory, we directly manipulate individual bits of a number.

Advantages

- Faster execution
- Constant time operations
- Less memory usage
- Frequently asked in coding interviews

---

# Bit Masking

A **Bit Mask** is a binary number used to manipulate specific bits of another number.

Example

```text
Number : 13

1101

Mask

0010
```

Bit masking is mainly used for

- Setting bits
- Clearing bits
- Checking bits
- Toggling bits
- State compression

---

# Check ith Bit

Formula

```java
(n & (1 << i)) != 0
```

Example

```java
int n = 10;

int i = 1;

boolean isSet = (n & (1 << i)) != 0;
```

Complexity

```
O(1)
```

---

# Set ith Bit

Formula

```java
n | (1 << i)
```

Example

```java
int n = 8;

n = n | (1 << 1);
```

Before

```text
1000
```

After

```text
1010
```

---

# Clear ith Bit

Formula

```java
n & ~(1 << i)
```

Example

```java
int n = 10;

n = n & ~(1 << 1);
```

---

# Toggle ith Bit

Formula

```java
n ^ (1 << i)
```

Example

```text
1010

↓

1000
```

---

# Count Set Bits

Set bits are the number of **1s** present in a binary number.

Example

```text
13

1101

Set Bits = 3
```

Brute Force

```java
int count = 0;

while(n > 0){

    count += (n & 1);

    n >>= 1;

}
```

Complexity

```
O(number of bits)
```

---

# Brian Kernighan's Algorithm

One of the most important interview algorithms.

Idea

```java
n = n & (n - 1);
```

Every iteration removes the **last set bit**.

Example

```text
101100

↓

101000

↓

100000

↓

000000
```

Code

```java
int count = 0;

while(n != 0){

    n = n & (n - 1);

    count++;

}
```

Complexity

```
O(Number of Set Bits)
```

Better than checking every bit.

---

# Check Power of Two

Formula

```java
(n & (n - 1)) == 0
```

Example

```text
16

10000

15

01111

↓

00000
```

Code

```java
boolean ans = n > 0 && (n & (n - 1)) == 0;
```

Complexity

```
O(1)
```

---

# Check Power of Four

Conditions

- Power of Two
- Set bit is at even position

Code

```java
n > 0 &&
(n & (n - 1)) == 0 &&
(n & 0x55555555) != 0
```

---

# XOR Pattern

XOR is one of the most useful interview concepts.

Important Properties

```text
a ^ a = 0

a ^ 0 = a

a ^ b = b ^ a

(a ^ b) ^ c = a ^ (b ^ c)
```

Applications

- Missing Number
- Unique Number
- Swap Numbers
- Find Two Unique Numbers

---

# Missing Number

Array

```text
0 1 3 4
```

Missing

```text
2
```

Approach

```java
int xor = 0;

for(int i = 0; i <= n; i++)
    xor ^= i;

for(int num : nums)
    xor ^= num;
```

Complexity

```
O(n)

O(1)
```

---

# Single Number

LeetCode

```
136
```

Problem

Every element appears twice except one.

Solution

```java
int ans = 0;

for(int num : nums)
    ans ^= num;
```

Example

```text
2 2 1

↓

1
```

Complexity

```
O(n)

O(1)
```

---

# Single Number II

LeetCode

```
137
```

Every element appears three times except one.

Approaches

- Bit Counting
- Finite State Machine

Complexity

```
O(n)
```

---

# Single Number III

LeetCode

```
260
```

Two unique numbers.

Approach

- XOR all numbers
- Find rightmost set bit
- Divide into two groups
- XOR each group

---

# Find Two Missing Numbers

Uses

- XOR
- Bit Masking
- Partition

Interview Favorite ⭐

---

# Subset Generation using Bit Masking

Suppose

```text
A B C
```

Binary Representation

```text
000

001

010

011

100

101

110

111
```

Generated Subsets

```text
{}

{A}

{B}

{A,B}

{C}

{A,C}

{B,C}

{A,B,C}
```

Algorithm

```java
for(int mask = 0; mask < (1 << n); mask++){

    for(int i = 0; i < n; i++){

        if((mask & (1 << i)) != 0){

            // Include element

        }

    }

}
```

Complexity

```
O(n × 2ⁿ)
```

---

# Gray Code

Gray Code ensures consecutive numbers differ by only **one bit**.

Formula

```java
gray = n ^ (n >> 1);
```

Applications

- Digital Electronics
- Error Detection
- Robotics
- Position Encoders

---

# Binary Exponentiation

Computes

```text
a^b
```

in

```
O(log b)
```

Algorithm

```java
while(b > 0){

    if((b & 1) == 1)

        ans *= a;

    a *= a;

    b >>= 1;

}
```

Applications

- Modular Arithmetic
- Cryptography
- Competitive Programming

---

# Common Bit Tricks

| Problem | Formula |
|----------|---------|
| Even/Odd | `n & 1` |
| Multiply by 2 | `n << 1` |
| Divide by 2 | `n >> 1` |
| Check ith Bit | `n & (1 << i)` |
| Set ith Bit | `n \| (1 << i)` |
| Clear ith Bit | `n & ~(1 << i)` |
| Toggle ith Bit | `n ^ (1 << i)` |
| Remove Last Set Bit | `n & (n - 1)` |
| Get Last Set Bit | `n & (-n)` |
| Power of Two | `(n & (n - 1)) == 0` |
| Swap Without Temp | XOR |

---

# Common Interview Patterns

## Pattern 1

XOR Cancellation

Problems

- Missing Number
- Single Number
- Two Unique Numbers

---

## Pattern 2

Bit Masking

Problems

- Set Bit
- Toggle Bit
- Check Bit
- State Compression

---

## Pattern 3

Brian Kernighan

Problems

- Count Set Bits
- Remove Last Set Bit

---

## Pattern 4

Binary Exponentiation

Problems

- Fast Power
- Modular Exponentiation

---

## Pattern 5

Subset Generation

Problems

- Power Set
- Combination Problems

---

# Time Complexity Cheat Sheet

| Operation | Time |
|-----------|------|
| Check Bit | O(1) |
| Set Bit | O(1) |
| Clear Bit | O(1) |
| Toggle Bit | O(1) |
| Remove Last Set Bit | O(1) |
| Count Set Bits | O(k) |
| Brian Kernighan | O(Set Bits) |
| Power of Two | O(1) |
| Missing Number | O(n) |
| Single Number | O(n) |
| Binary Exponentiation | O(log n) |
| Subset Generation | O(n × 2ⁿ) |

---

# Best Practices

✅ Convert numbers to binary while solving problems.

✅ Remember important XOR properties.

✅ Use Brian Kernighan's Algorithm for counting set bits.

✅ Use Binary Exponentiation instead of repeated multiplication.

✅ Practice visualizing bits before coding.

---

# Common Mistakes

❌ Confusing logical operators with bitwise operators.

❌ Forgetting operator precedence.

❌ Ignoring negative numbers while shifting.

❌ Using XOR without understanding its properties.

❌ Forgetting that subset generation requires `2ⁿ` combinations.

---

# Frequently Asked Interview Questions

## Beginner

- What is Bit Masking?
- Why is XOR useful?
- Difference between AND and XOR?
- Explain Left Shift and Right Shift.

---

## Intermediate

- Count Set Bits.
- Check Power of Two.
- Find Missing Number using XOR.
- Generate Subsets using Bit Masking.
- Explain Brian Kernighan's Algorithm.

---

## Advanced

- Design a BitSet.
- Explain State Compression DP.
- Binary Exponentiation.
- Gray Code Generation.
- Solve Single Number II.
- Find Maximum XOR Pair.

---

# Top LeetCode Problems

## Easy

- 136. Single Number
- 190. Reverse Bits
- 191. Number of 1 Bits
- 231. Power of Two
- 268. Missing Number
- 338. Counting Bits

---

## Medium

- 137. Single Number II
- 260. Single Number III
- 201. Bitwise AND of Numbers Range
- 89. Gray Code
- 78. Subsets
- 1310. XOR Queries of a Subarray

---

## Hard

- 421. Maximum XOR of Two Numbers in an Array
- 982. Triples with Bitwise AND Equal To Zero
- 1707. Maximum XOR With an Element From Array

---

# Mini Projects

- Binary Calculator
- Permission Management System
- Feature Flag System
- Sudoku Solver using Bit Masks
- Chess Bitboard Representation
- File Permission Simulator
- Binary Converter
- Fast Power Calculator

---

# Revision Checklist

- [ ] Bit Masking
- [ ] Set, Clear & Toggle Bit
- [ ] Check ith Bit
- [ ] Count Set Bits
- [ ] Brian Kernighan's Algorithm
- [ ] XOR Properties
- [ ] Missing Number
- [ ] Single Number Problems
- [ ] Power of Two
- [ ] Power of Four
- [ ] Binary Exponentiation
- [ ] Gray Code
- [ ] Subset Generation
- [ ] Common Bit Tricks
- [ ] Interview Patterns

---

# 🎯 Final Goal

After mastering Bit Manipulation, you should be able to:

- ✅ Solve most bit manipulation problems asked in coding interviews.
- ✅ Apply XOR patterns to optimize array problems.
- ✅ Use bit masking for state compression and subset generation.
- ✅ Implement Binary Exponentiation for fast power calculations.
- ✅ Recognize common interview patterns involving bits and optimize solutions from **O(n²)** to **O(n)** or **O(log n)** where applicable.