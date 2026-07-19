# 📘 Linked List

> A complete beginner-to-intermediate guide to Linked Lists in Java for DSA and coding interviews.

---

# 📖 Table of Contents

- Introduction
- Why Linked List?
- Node Structure
- Memory Representation
- Types of Linked Lists
- Basic Operations
- Creating a Linked List
- Traversal
- Insertion
- Deletion
- Searching
- Reverse Linked List
- Java LinkedList Collection
- Internal Working
- Time Complexity
- ArrayList vs LinkedList
- Best Practices
- Common Mistakes
- Interview Questions
- Practice Questions

---

# What is a Linked List?

A **Linked List** is a linear data structure where elements are stored in **nodes** instead of contiguous memory locations.

Each node contains:

- Data
- Reference (Pointer) to the next node

Unlike arrays, Linked Lists can grow and shrink dynamically.

---

# Why Linked List?

Arrays have limitations:

- Fixed size
- Expensive insertion
- Expensive deletion

Linked Lists solve these problems by connecting nodes together.

Advantages

- Dynamic Size
- Fast Insertions
- Fast Deletions
- Efficient Memory Allocation

Disadvantages

- Slow Random Access
- Extra Memory for References
- Cannot access elements by index directly

---

# Node Structure

A node consists of two parts.

```text
+---------+---------+
|  Data   |  Next   |
+---------+---------+
```

Java Implementation

```java
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
```

---

# Memory Representation

Example

```text
Head
 │
 ▼
+----+------+     +----+------+     +----+------+
| 10 |  ●───┼──►  | 20 |  ●───┼──►  | 30 | NULL |
+----+------+     +----+------+     +----+------+
```

Each node is stored separately in memory and connected using references.

---

# Types of Linked Lists

## Singly Linked List

Each node points to the next node.

```text
10 → 20 → 30 → NULL
```

---

## Doubly Linked List

Each node stores previous and next references.

```text
NULL ← 10 ⇄ 20 ⇄ 30 → NULL
```

---

## Circular Linked List

The last node points back to the first node.

```text
10 → 20 → 30
↑          │
└──────────┘
```

---

## Circular Doubly Linked List

Both previous and next pointers form a circle.

---

# Basic Operations

- Create
- Traverse
- Insert
- Delete
- Search
- Reverse
- Update

---

# Creating a Linked List

```java
Node head = new Node(10);

head.next = new Node(20);

head.next.next = new Node(30);
```

Result

```text
10 → 20 → 30 → NULL
```

---

# Traversing a Linked List

```java
Node current = head;

while(current != null){

    System.out.print(current.data + " ");

    current = current.next;

}
```

Output

```
10 20 30
```

Time Complexity

```
O(n)
```

---

# Insertion Operations

## Insert at Beginning

```
New Node

↓

Head

↓

Remaining List
```

Complexity

```
O(1)
```

---

## Insert at End

Traverse to last node.

Attach new node.

Complexity

```
O(n)
```

---

## Insert at Position

Traverse to required position.

Update links.

Complexity

```
O(n)
```

---

# Deletion Operations

## Delete First Node

Move head to next node.

```
head = head.next;
```

Complexity

```
O(1)
```

---

## Delete Last Node

Traverse to second-last node.

Remove last reference.

Complexity

```
O(n)
```

---

## Delete by Position

Traverse to previous node.

Reconnect links.

Complexity

```
O(n)
```

---

# Searching

Traverse node by node.

```java
Node current = head;

while(current != null){

    if(current.data == key)
        return true;

    current = current.next;
}
```

Time Complexity

```
O(n)
```

---

# Reverse Linked List

Approach

```text
Previous ← Current → Next
```

Algorithm

- Store next node
- Reverse current pointer
- Move forward

Time Complexity

```
O(n)
```

Space Complexity

```
O(1)
```

---

# Java LinkedList Collection

Java provides a built-in implementation of a Doubly Linked List.

```java
LinkedList<String> list = new LinkedList<>();
```

---

## Common Methods

| Method | Description |
|---------|-------------|
| add() | Add element |
| addFirst() | Add at beginning |
| addLast() | Add at end |
| get() | Get by index |
| getFirst() | First element |
| getLast() | Last element |
| set() | Update element |
| remove() | Remove element |
| removeFirst() | Remove first |
| removeLast() | Remove last |
| contains() | Search element |
| indexOf() | First occurrence |
| lastIndexOf() | Last occurrence |
| push() | Push to front |
| pop() | Remove first element |
| offer() | Insert into queue |
| poll() | Remove from queue |
| peek() | View first element |
| clear() | Remove all elements |
| size() | Total elements |
| isEmpty() | Check empty |
| iterator() | Forward traversal |
| descendingIterator() | Reverse traversal |

---

# Internal Working

Java's `LinkedList` is implemented as a **Doubly Linked List**.

Each node contains:

```text
Previous

↓

Data

↓

Next
```

Both head and tail references are maintained for efficient insertion at both ends.

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Access | O(n) |
| Search | O(n) |
| Insert Beginning | O(1) |
| Insert End | O(1)* |
| Insert Middle | O(n) |
| Delete Beginning | O(1) |
| Delete End | O(1)* |
| Delete Middle | O(n) |
| Traverse | O(n) |
| Reverse | O(n) |

> *Java's `LinkedList` maintains both head and tail, making insertion/deletion at the end O(1).

---

# ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| Internal Structure | Dynamic Array | Doubly Linked List |
| Random Access | O(1) | O(n) |
| Insert Beginning | O(n) | O(1) |
| Insert End | O(1)* | O(1) |
| Delete Beginning | O(n) | O(1) |
| Memory Usage | Less | More |
| Best For | Frequent Reads | Frequent Insert/Delete |

---

# Real-World Applications

- Browser History
- Music Playlist
- Undo/Redo
- Image Viewer
- LRU Cache
- Navigation Systems
- Task Scheduling

---

# Best Practices

✅ Use `LinkedList` when insertions and deletions are frequent.

✅ Use `ArrayList` when random access is required.

✅ Prefer the `List` interface for declarations.

```java
List<Integer> list = new LinkedList<>();
```

✅ Use `ArrayDeque` instead of `LinkedList` when only queue or stack operations are needed.

---

# Common Mistakes

❌ Using LinkedList for frequent index-based access.

❌ Assuming LinkedList uses contiguous memory.

❌ Forgetting null checks during traversal.

❌ Using LinkedList where ArrayList is more efficient.

---

# Interview Questions

## Beginner

- What is a Linked List?
- Why is LinkedList dynamic?
- Difference between Array and LinkedList?
- Types of Linked Lists?
- Why is random access slow?

---

## Intermediate

- Explain LinkedList internal implementation.
- Why is insertion at the beginning O(1)?
- Difference between Singly and Doubly Linked List?
- Why does Java use Doubly Linked List?
- Difference between ArrayList and LinkedList?

---

## Advanced

- How does Java's LinkedList maintain O(1) insertion at both ends?
- Why isn't LinkedList cache-friendly?
- Why is LinkedList slower for traversal than ArrayList?
- Explain iterator() and descendingIterator().
- Why is LinkedList rarely used in competitive programming?

---

# Practice Questions

## Easy

- [ ] Create a Linked List.
- [ ] Traverse a Linked List.
- [ ] Insert at Beginning.
- [ ] Insert at End.
- [ ] Delete First Node.
- [ ] Delete Last Node.
- [ ] Search an Element.
- [ ] Count Nodes.

---

## Medium

- [ ] Reverse a Linked List.
- [ ] Find Middle Node.
- [ ] Remove Duplicates.
- [ ] Merge Two Sorted Lists.
- [ ] Delete Nth Node.

---

## Challenge

- [ ] Implement your own LinkedList class.
- [ ] Browser History using LinkedList.
- [ ] Music Playlist Manager.
- [ ] Undo/Redo System.
- [ ] LRU Cache (Preparation).

---

# Revision Checklist

- [ ] Linked List Basics
- [ ] Node Structure
- [ ] Memory Representation
- [ ] Types of Linked Lists
- [ ] CRUD Operations
- [ ] Java LinkedList Methods
- [ ] Internal Working
- [ ] Time Complexity
- [ ] ArrayList vs LinkedList
- [ ] Interview Questions

---

# Next Chapter

➡️ **02-linkedlist-advanced.md**

Topics Covered Next

- Fast & Slow Pointer
- Cycle Detection (Floyd's Algorithm)
- Reverse in K Groups
- Merge Sort on Linked List
- Palindrome Linked List
- LRU Cache
- Clone Linked List with Random Pointer
- Top Linked List Interview Patterns