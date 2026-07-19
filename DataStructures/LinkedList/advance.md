# 📘 Advanced Linked List

> Advanced Linked List concepts, interview patterns, optimized algorithms, and real-world applications for coding interviews and backend development.

---

# 📖 Table of Contents

- Two Pointer Technique
- Fast & Slow Pointer
- Floyd's Cycle Detection
- Detect Cycle
- Find Starting Node of Cycle
- Remove Cycle
- Reverse Linked List
- Reverse Between Positions
- Reverse in K Groups
- Merge Two Sorted Lists
- Merge K Sorted Lists
- Sort Linked List
- Palindrome Linked List
- Reorder Linked List
- Rotate Linked List
- Remove Nth Node From End
- Intersection of Two Linked Lists
- Clone Linked List with Random Pointer
- LRU Cache
- Skip List
- Interview Patterns
- Time Complexity Cheat Sheet
- Best Practices
- Interview Questions
- LeetCode Problems

---

# Two Pointer Technique

The Two Pointer technique uses two pointers to solve Linked List problems efficiently.

Types

- Slow & Fast Pointer
- Left & Right Pointer
- Previous & Current Pointer

Applications

- Find Middle
- Detect Cycle
- Reverse List
- Remove Nth Node
- Palindrome

---

# Fast & Slow Pointer

One pointer moves one step.

Another moves two steps.

```text
Slow

↓

1 → 2 → 3 → 4 → 5

↓

Fast

↓↓
```

Applications

- Middle Node
- Cycle Detection
- Palindrome
- Happy Number

Complexity

```
Time : O(n)

Space : O(1)
```

---

# Floyd's Cycle Detection Algorithm

Also called

```
Tortoise and Hare Algorithm
```

Algorithm

1. Move slow by one.
2. Move fast by two.
3. If they meet → Cycle Exists.

Visualization

```text
Slow → →

Fast → → → →
```

Complexity

```
Time : O(n)

Space : O(1)
```

---

# Detect Cycle

LeetCode

```
141. Linked List Cycle
```

Approach

- Fast Pointer
- Slow Pointer

If both pointers meet

```
Cycle Found
```

---

# Find Starting Node of Cycle

LeetCode

```
142. Linked List Cycle II
```

Algorithm

After slow and fast meet

Move one pointer to head.

Move both one step.

Meeting point becomes

```
Cycle Starting Node
```

---

# Remove Cycle

Steps

- Detect cycle.
- Find start.
- Traverse till last node.
- Set last.next = null.

---

# Reverse Linked List

## Iterative

Pointers

```text
Previous

Current

Next
```

Steps

- Save next
- Reverse pointer
- Move forward

Complexity

```
O(n)

O(1)
```

---

## Recursive

Reverse using recursion stack.

Complexity

```
O(n)

O(n)
```

---

# Reverse Between Positions

LeetCode

```
92. Reverse Linked List II
```

Reverse nodes between

```
left

↓

right
```

Applications

- Partial Reversal
- Segment Operations

---

# Reverse in K Groups

LeetCode

```
25. Reverse Nodes in K Group
```

Reverse every

```
K Nodes
```

Applications

- Batch Processing
- Data Compression

---

# Merge Two Sorted Lists

LeetCode

```
21. Merge Two Sorted Lists
```

Pattern

```
Two Pointer
```

Complexity

```
O(n+m)
```

---

# Merge K Sorted Lists

LeetCode

```
23. Merge K Sorted Lists
```

Approaches

- Brute Force
- Divide and Conquer
- Priority Queue

Best

```
Priority Queue

↓

O(N log K)
```

---

# Sort Linked List

LeetCode

```
148. Sort List
```

Use

```
Merge Sort
```

Reason

Random Access isn't available.

Complexity

```
O(n log n)
```

---

# Palindrome Linked List

LeetCode

```
234. Palindrome Linked List
```

Algorithm

- Find Middle
- Reverse Second Half
- Compare
- Restore

Complexity

```
O(n)

O(1)
```

---

# Reorder Linked List

LeetCode

```
143. Reorder List
```

Example

```text
1 2 3 4 5

↓

1 5 2 4 3
```

Pattern

- Middle
- Reverse
- Merge

---

# Rotate Linked List

LeetCode

```
61. Rotate List
```

Applications

- Circular Buffer
- Scheduling

---

# Remove Nth Node From End

LeetCode

```
19. Remove Nth Node From End
```

Pattern

```
Two Pointer Gap
```

---

# Intersection of Two Linked Lists

LeetCode

```
160. Intersection of Two Linked Lists
```

Best Approach

Two Pointer

Complexity

```
O(n)

O(1)
```

---

# Clone Linked List with Random Pointer

LeetCode

```
138. Copy List with Random Pointer
```

Approaches

- HashMap
- O(1) Space Interleaving

Interview Favorite ⭐

---

# LRU Cache

LeetCode

```
146. LRU Cache
```

Uses

```
HashMap

+

Doubly Linked List
```

Operations

```
get()

put()
```

Both

```
O(1)
```

Applications

- Browser Cache
- Database Cache
- API Cache

---

# Skip List

Probabilistic Data Structure.

Complexity

```
Search

O(log n)

Insert

O(log n)

Delete

O(log n)
```

Used in

- Redis
- Databases

---

# Common Interview Patterns

## Pattern 1

Fast Slow Pointer

Problems

- Middle Node
- Detect Cycle
- Palindrome

---

## Pattern 2

Reverse

Problems

- Reverse List
- Reverse K Groups
- Reverse Between

---

## Pattern 3

Merge

Problems

- Merge Lists
- Merge K Lists

---

## Pattern 4

Dummy Node

Problems

- Remove Node
- Merge
- Partition

---

## Pattern 5

Hashing

Problems

- Clone List
- Intersection
- Cycle Detection

---

# Time Complexity Cheat Sheet

| Problem | Time | Space |
|----------|------|--------|
| Traverse | O(n) | O(1) |
| Reverse | O(n) | O(1) |
| Middle Node | O(n) | O(1) |
| Detect Cycle | O(n) | O(1) |
| Merge Lists | O(n+m) | O(1) |
| Merge K Lists | O(N log K) | O(K) |
| Sort List | O(n log n) | O(log n) |
| Palindrome | O(n) | O(1) |
| Rotate List | O(n) | O(1) |
| Clone List | O(n) | O(n) |

---

# Real-World Applications

- Browser History
- Music Playlist
- Undo / Redo
- Navigation Systems
- LRU Cache
- Operating System Scheduling
- Railway Reservation
- Hospital Queue
- Media Player
- Blockchain Transaction Chain

---

# Best Practices

✅ Use Dummy Nodes to simplify insertion/deletion.

✅ Use Fast & Slow pointers whenever possible.

✅ Prefer Merge Sort over Quick Sort for Linked Lists.

✅ Draw the list before coding.

✅ Track Previous, Current and Next carefully.

---

# Common Mistakes

❌ Forgetting to update next pointer.

❌ Losing head reference.

❌ Null Pointer Exception while traversing.

❌ Forgetting edge cases

- Empty List
- One Node
- Two Nodes

❌ Infinite loop in Circular Linked List.

---

# Frequently Asked Interview Questions

## Beginner

- Why Linked List over Array?
- Difference between Singly and Doubly Linked List?
- Why is random access O(n)?

---

## Intermediate

- Explain Floyd's Cycle Detection.
- Why Merge Sort instead of Quick Sort?
- Difference between Reverse Iterative and Recursive?
- How to find the middle node?

---

## Advanced

- Design an LRU Cache.
- Clone Linked List with Random Pointer.
- Merge K Sorted Lists.
- Why Java LinkedList uses Doubly Linked List?
- Explain Skip List.
- Explain Cycle Detection mathematically.

---

# Top LeetCode Problems

## Easy

- 206 Reverse Linked List
- 21 Merge Two Sorted Lists
- 83 Remove Duplicates from Sorted List
- 141 Linked List Cycle
- 160 Intersection of Two Linked Lists
- 203 Remove Linked List Elements
- 234 Palindrome Linked List
- 876 Middle of the Linked List

---

## Medium

- 19 Remove Nth Node From End
- 24 Swap Nodes in Pairs
- 61 Rotate List
- 82 Remove Duplicates II
- 92 Reverse Linked List II
- 138 Copy List with Random Pointer
- 142 Linked List Cycle II
- 143 Reorder List
- 148 Sort List
- 328 Odd Even Linked List
- 430 Flatten a Multilevel Doubly Linked List
- 445 Add Two Numbers II

---

## Hard

- 23 Merge K Sorted Lists
- 25 Reverse Nodes in K Group
- 460 LFU Cache
- 432 All O(1) Data Structure

---

# Mini Projects

- Contact Book
- Browser History
- Music Playlist
- Undo/Redo Manager
- LRU Cache
- Text Editor
- Railway Reservation Waiting List
- Hospital Patient Queue
- Navigation History
- Task Scheduler

---

# Revision Checklist

- [ ] Fast & Slow Pointer
- [ ] Floyd's Algorithm
- [ ] Reverse Linked List
- [ ] Reverse K Groups
- [ ] Merge Lists
- [ ] Merge K Lists
- [ ] Merge Sort
- [ ] Palindrome Linked List
- [ ] Rotate Linked List
- [ ] Remove Nth Node
- [ ] Clone Random Pointer
- [ ] LRU Cache
- [ ] Skip List
- [ ] Interview Patterns
- [ ] LeetCode Problems

---

# 🎯 Final Goal

After mastering both Linked List notes, you should be able to:

- ✅ Solve almost every Linked List problem on LeetCode and coding platforms.
- ✅ Recognize common Linked List patterns in interviews.
- ✅ Implement optimized solutions with the correct time and space complexity.
- ✅ Explain advanced concepts like Floyd's Cycle Detection, Merge Sort on Linked Lists, LRU Cache, and Skip Lists.
- ✅ Confidently answer Linked List questions in Java backend and software engineering interviews.