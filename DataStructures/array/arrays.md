# 📘 Arrays (Lecture 1 - Basics)

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is an Array?

An array is a collection of elements of the **same data type** stored in **contiguous memory locations**.

Example

```java
int[] arr = {2,4,5,6,7};
```

Memory Representation

```
Index : 0 1 2 3 4

Value : 2 4 5 6 7
```

---

# Why Arrays?

Arrays help us

- Store multiple values
- Process data efficiently
- Access elements using index
- Build the foundation for DSA

---

# 1D Arrays

## Declaration

```java
int[] arr;
```

## Initialization

```java
int[] arr = new int[5];
```

or

```java
int[] arr = {1,2,3,4,5};
```

---

# Traversing an Array

```java
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
```

## Mental Model

```
Index

↓

Visit Element

↓

Process

↓

Next Index
```

---

# Problems Covered Today

## Maximum Element

Idea

Keep track of the largest element seen so far.

```
max = Integer.MIN_VALUE

↓

Visit every element

↓

Update max
```

Complexity

Time : O(n)

Space : O(1)

---

## Minimum Element

Idea

Keep track of the smallest element seen so far.

```
min = Integer.MAX_VALUE

↓

Visit every element

↓

Update min
```

Complexity

Time : O(n)

Space : O(1)

---

# 2D Arrays

A 2D Array is simply an array of arrays.

Example

```
1 2 3

4 5 6

7 8 9
```

Access

```
matrix[row][column]
```

Example

```java
matrix[1][2]
```

Output

```
6
```

---

# Traversing a Matrix

Always remember

Outer Loop

↓

Rows

Inner Loop

↓

Columns

```java
for(row){

    for(column){

    }

}
```

---

# Problems Covered Today

## Total Sum

Visit every cell.

Add each value to the answer.

Complexity

Time : O(rows × cols)

Space : O(1)

---

## Total Product

Visit every cell.

Multiply every value.

Complexity

Time : O(rows × cols)

Space : O(1)

---

## Maximum Element

Same idea as 1D Array.

Only difference is using nested loops.

---

## Minimum Element

Again,

Same logic as 1D Array.

---

# Mental Framework

Whenever you see an array

↓

Traverse it.

Need largest?

↓

Running Maximum

Need smallest?

↓

Running Minimum

Need total?

↓

Running Sum

Need every element?

↓

Traversal

For Matrix

↓

Nested Loops

---

# Complexity Summary

| Operation        | Time     | Space |
| ---------------- | -------- | ----- |
| Traversal        | O(n)     | O(1)  |
| Maximum          | O(n)     | O(1)  |
| Minimum          | O(n)     | O(1)  |
| Matrix Traversal | O(r × c) | O(1)  |
| Matrix Sum       | O(r × c) | O(1)  |
| Matrix Product   | O(r × c) | O(1)  |

---

# Common Mistakes

❌ Using

```java
i <= arr.length
```

Correct

```java
i < arr.length
```

---

❌ Forgetting nested loops in 2D Arrays

---

❌ Mixing rows and columns

Remember

```
matrix[row][column]
```

---

❌ Initializing

```java
max = 0
```

Instead use

```java
Integer.MIN_VALUE
```

---

# Revision Questions

1. What is an array?

2. Why are arrays stored in contiguous memory?

3. Why is array indexing O(1)?

4. Difference between 1D and 2D Arrays?

5. Why do we initialize maximum with Integer.MIN_VALUE?

6. Why do we initialize minimum with Integer.MAX_VALUE?

7. Why does a matrix require nested loops?

8. Explain row and column traversal.

---

# Covered Today ✅

- Arrays Introduction
- 1D Arrays
- Array Traversal
- Maximum Element
- Minimum Element
- 2D Arrays
- Matrix Traversal
- Matrix Sum
- Matrix Product
- Matrix Maximum
- Matrix Minimum

---

# Next Lecture

➡️ Array Searching

- Linear Search
- Reverse Array
- Binary Search (if covered)
- More Array Problems
