# 📘 Time & Space Complexity

> Status: ✅ Completed
>
> Revision Count: 0

---

# Why Learn Time & Space Complexity?

Writing code is only the first step.

The real goal is to write **efficient code**.

Two programs can produce the same output, but one may run much faster and use less memory.

---

# What is Time Complexity?

Time Complexity measures **how the number of operations grows as the input size increases**.

> ❗ It does **NOT** measure actual execution time in seconds.

It measures the **growth rate** of an algorithm.

---

# What is Space Complexity?

Space Complexity measures **how much extra memory an algorithm uses**.

It does **not** include the input itself (unless specified); it mainly focuses on **auxiliary space**.

---

# Big-O Notation

Big-O describes the **upper bound (worst-case growth)** of an algorithm.

| Complexity | Name | Example |
|------------|------|---------|
| `O(1)` | Constant | Accessing an array element |
| `O(log n)` | Logarithmic | Binary Search |
| `O(n)` | Linear | Traversing an array |
| `O(n log n)` | Linearithmic | Merge Sort |
| `O(n²)` | Quadratic | Nested loops |
| `O(2ⁿ)` | Exponential | Recursive subsets |
| `O(n!)` | Factorial | Generating all permutations |

---

# Common Time Complexities

## 🟢 O(1) — Constant Time

The number of operations never changes.

```java
int x = arr[0];
```

Example

```
n = 10

↓

1 operation

n = 1,000,000

↓

Still 1 operation
```

---

## 🟢 O(log n) — Logarithmic Time

Input is reduced by half every step.

```java
while(n > 1){
    n /= 2;
}
```

Example

```
16

↓

8

↓

4

↓

2

↓

1
```

Binary Search is the classic example.

---

## 🟡 O(n) — Linear Time

Operations grow directly with input size.

```java
for(int i=0;i<n;i++)
```

Example

```
n = 100

↓

100 iterations
```

---

## 🟠 O(n log n)

Occurs in efficient sorting algorithms.

Examples

- Merge Sort
- Heap Sort
- Quick Sort (Average Case)

---

## 🔴 O(n²) — Quadratic Time

Usually caused by nested loops.

```java
for(...)
    for(...)
```

Example

```
3 × 3 = 9

100 × 100 = 10,000
```

---

# Rules to Calculate Time Complexity

## Rule 1 — Ignore Constants

```
O(2n)

↓

O(n)
```

```
O(100)

↓

O(1)
```

---

## Rule 2 — Ignore Lower Order Terms

```
O(n² + n)

↓

O(n²)
```

```
O(n³ + n² + n)

↓

O(n³)
```

---

## Rule 3 — Nested Loops Multiply

```java
for(...)
    for(...)
```

```
O(n × n)

↓

O(n²)
```

---

## Rule 4 — Separate Loops Add

```java
for(...)

for(...)
```

```
O(n + n)

↓

O(n)
```

---

## Rule 5 — Divide by Constant

```java
i *= 2
```

or

```java
n /= 2
```

```
↓

O(log n)
```

---

# Best, Average & Worst Case

Example: Linear Search

Best Case

Target is first element.

```
O(1)
```

Worst Case

Target is last element or absent.

```
O(n)
```

Average Case

```
O(n)
```

---

# Space Complexity

## O(1)

Constant extra memory.

```java
int sum = 0;
```

---

## O(n)

Memory grows with input.

```java
int[] arr = new int[n];
```

---

## O(n²)

Two-dimensional structures.

```java
int[][] matrix = new int[n][n];
```

---

# Auxiliary Space

Extra memory used **excluding the input**.

Example

```java
int sum = 0;
```

Auxiliary Space

```
O(1)
```

---

# Time vs Space Trade-Off

Sometimes faster algorithms use more memory.

```
More Memory

↓

Less Time
```

or

```
Less Memory

↓

More Time
```

Choose based on the problem constraints.

---

# Complexity Cheat Sheet

| Pattern | Complexity |
|---------|------------|
| Variable Assignment | O(1) |
| Single Loop | O(n) |
| Two Nested Loops | O(n²) |
| Three Nested Loops | O(n³) |
| Divide by 2 | O(log n) |
| Binary Search | O(log n) |
| Merge Sort | O(n log n) |
| Linear Search | O(n) |

---

# Mental Framework

Whenever you see code, ask yourself:

```
Loop?

↓

Single?

↓

O(n)

↓

Nested?

↓

Multiply

↓

O(n²)

↓

Halving?

↓

O(log n)
```

---

# Common Mistakes

❌ Thinking complexity means execution time.

✔ It measures **growth**, not seconds.

---

❌ Keeping constants.

Wrong

```
O(2n)
```

Correct

```
O(n)
```

---

❌ Adding nested loops.

Nested loops multiply.

```
n × n

↓

O(n²)
```

---

❌ Multiplying separate loops.

Separate loops add.

```
O(n + n)

↓

O(n)
```

---

# Interview Cheat Sheet

| Pattern | Complexity |
|---------|------------|
| Array Access | O(1) |
| Linear Search | O(n) |
| Binary Search | O(log n) |
| Nested Loop | O(n²) |
| Matrix Traversal | O(n²) |
| Merge Sort | O(n log n) |
| Bubble Sort | O(n²) |

---

# Today's Homework

## Easy

- [ ] Find the time complexity of a single `for` loop.
- [ ] Find the time complexity of two consecutive loops.
- [ ] Find the time complexity of a nested loop.
- [ ] Find the space complexity of an integer array.
- [ ] Find the space complexity of a 2D matrix.

---

## Medium

- [ ] Analyze a loop that increments by 2.
- [ ] Analyze a loop that doubles `i` each iteration.
- [ ] Compare Linear Search and Binary Search complexities.
- [ ] Find the complexity of two nested loops where the inner loop runs `i` times.
- [ ] Explain why Merge Sort is `O(n log n)`.

---

## Challenge

Determine both **Time** and **Space Complexity** for the following:

- [ ] Reverse an array using two pointers.
- [ ] Find the maximum element in an array.
- [ ] Count the frequency of elements using a HashMap.
- [ ] Traverse an `n × m` matrix.
- [ ] Compute the factorial of `n` using recursion.

---

# Revision Questions

1. What is Time Complexity?
2. What is Space Complexity?
3. Why do we use Big-O notation?
4. Difference between actual running time and Time Complexity?
5. Why do we ignore constants?
6. Why do we ignore lower-order terms?
7. Difference between nested and separate loops?
8. When does `O(log n)` occur?
9. What is Auxiliary Space?
10. Explain the Time vs Space Trade-Off.

---

# Covered Today ✅

- Time Complexity
- Space Complexity
- Big-O Notation
- Common Complexities
- Complexity Rules
- Best/Worst Case
- Auxiliary Space
- Time vs Space Trade-Off

---

# Next Lecture

➡️ Searching Algorithms

- Linear Search
- Binary Search
- Binary Search on Answer
- Lower Bound
- Upper Bound