# 📘 Java Collections Framework - List

> A complete guide to the List interface in Java Collections Framework.

---

# 📖 Table of Contents

- What is List?
- Features of List
- List Hierarchy
- ArrayList
- LinkedList
- Vector
- Stack
- ArrayList vs LinkedList
- Vector vs ArrayList
- Stack vs ArrayDeque
- Time Complexity
- Internal Working
- Best Practices
- Interview Questions
- Practice Questions

---

# What is List?

A **List** is an ordered collection that stores elements in the order they are inserted.

A List:

- Maintains insertion order
- Allows duplicate elements
- Supports indexing
- Allows null values (implementation dependent)

Example

```java
List<String> names = new ArrayList<>();

names.add("Raman");
names.add("Sujal");
names.add("Raman");
```

Output

```
Raman
Sujal
Raman
```

---

# Characteristics of List

✅ Ordered

✅ Duplicate Elements Allowed

✅ Index Based

✅ Dynamic Size

✅ Generic Support

---

# List Hierarchy

```text
Iterable
    │
Collection
    │
   List
 ┌──┼─────────────┐
 │  │             │
ArrayList   LinkedList   Vector
                              │
                           Stack
```

---

# Common List Methods

```java
add(E element)

add(int index,E element)

get(int index)

set(int index,E element)

remove(int index)

remove(Object obj)

contains(Object obj)

indexOf(Object obj)

lastIndexOf(Object obj)

size()

isEmpty()

clear()

iterator()
```

---

# ArrayList

## What is ArrayList?

ArrayList is a **dynamic array** implementation of the List interface.

Unlike arrays, it automatically resizes itself.

```java
ArrayList<String> list = new ArrayList<>();
```

---

## Internal Working

Internally,

ArrayList uses

```
Dynamic Array
```

When capacity becomes full,

Java creates

```
New Array

↓

Copies Old Elements

↓

Deletes Old Array

↓

Adds New Element
```

---

## Default Capacity

Java 8+

```
0

↓

First Element Added

↓

Capacity = 10
```

When full,

Capacity grows approximately by

```
Old Capacity + (Old Capacity / 2)
```

Example

```
10

↓

15

↓

22

↓

33

↓

49
```

---

## Advantages

- Fast Random Access
- Less Memory
- Easy Traversal
- Cache Friendly

---

## Disadvantages

- Slow Insertion in Middle
- Slow Deletion in Middle
- Array Copy Required

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Access | O(1) |
| Search | O(n) |
| Insert End | O(1)* |
| Insert Middle | O(n) |
| Delete | O(n) |

---

## When to Use

Choose ArrayList when

- Frequent Reading
- Random Access
- Less Insertion
- Less Deletion

---

# LinkedList

## What is LinkedList?

LinkedList is implemented using a

```
Doubly Linked List
```

Each node stores

```
Data

↓

Previous Pointer

↓

Next Pointer
```

---

## Internal Structure

```
NULL

↓

[A]

↔

[B]

↔

[C]

↓

NULL
```

---

## Advantages

- Fast Insertion
- Fast Deletion
- No Array Copy

---

## Disadvantages

- Slow Random Access
- More Memory
- Pointer Traversal

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Access | O(n) |
| Search | O(n) |
| Insert Beginning | O(1) |
| Insert End | O(1) |
| Delete | O(1)* |

---

## When to Use

Choose LinkedList when

- Frequent Insertions
- Frequent Deletions
- Queue Implementation

---

# Vector

## What is Vector?

Vector is the legacy version of ArrayList.

Characteristics

- Dynamic Array
- Thread Safe
- Synchronized

Example

```java
Vector<Integer> vector = new Vector<>();
```

---

## Advantages

- Thread Safe

---

## Disadvantages

- Slower than ArrayList
- Legacy Collection

---

## Time Complexity

Same as ArrayList.

---

# Stack

Stack extends Vector.

It follows

```
LIFO

↓

Last In

↓

First Out
```

Example

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);

stack.pop();

stack.peek();
```

---

## Applications

- Undo Feature
- Browser History
- Expression Evaluation
- Parentheses Matching
- DFS

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |

---

# ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| Structure | Dynamic Array | Doubly Linked List |
| Random Access | Fast | Slow |
| Insert Middle | Slow | Fast |
| Delete Middle | Slow | Fast |
| Memory | Less | More |

---

# Vector vs ArrayList

| Vector | ArrayList |
|---------|-----------|
| Thread Safe | No |
| Slower | Faster |
| Legacy | Modern |

---

# Stack vs ArrayDeque

| Stack | ArrayDeque |
|--------|------------|
| Legacy | Modern |
| Synchronized | Faster |
| Uses Vector | Uses Resizable Array |

👉 Prefer **ArrayDeque** for stack operations in modern Java.

---

# Internal Working Summary

## ArrayList

```
Dynamic Array

↓

Resize

↓

Copy

↓

Continue
```

---

## LinkedList

```
Node

↓

Previous

↓

Data

↓

Next
```

---

## Stack

```
Top

↓

Push

↓

Pop
```

---

# Which One Should I Use?

| Situation | Collection |
|-----------|------------|
| Random Access | ArrayList |
| Frequent Insert/Delete | LinkedList |
| Thread Safe List | Vector |
| Stack Operations | ArrayDeque |

---

# Best Practices

✅ Use `List` as the reference type.

```java
List<String> list = new ArrayList<>();
```

---

✅ Use ArrayList by default.

---

✅ Use LinkedList only when insertions/deletions dominate.

---

✅ Avoid Vector in new applications.

---

✅ Prefer ArrayDeque instead of Stack.

---

# Common Mistakes

❌ Using LinkedList for random access.

---

❌ Using Stack instead of ArrayDeque.

---

❌ Declaring

```java
ArrayList<String> list;
```

instead of

```java
List<String> list;
```

---

❌ Forgetting Generics.

Wrong

```java
ArrayList list = new ArrayList();
```

Correct

```java
ArrayList<String> list = new ArrayList<>();
```

---

# Interview Questions

## Beginner

- What is List?
- Difference between List and Set?
- Why does List allow duplicates?
- Why is List ordered?
- Difference between ArrayList and Array?

---

## Intermediate

- Internal Working of ArrayList
- Why is ArrayList O(1)?
- Why is LinkedList O(n)?
- Why does ArrayList resize?
- Difference between Vector and ArrayList?

---

## Advanced

- Capacity vs Size
- Growth Factor of ArrayList
- Why ArrayDeque over Stack?
- Fail Fast Iterator
- CopyOnWriteArrayList
- RandomAccess Marker Interface

---

# Practice Questions

## Easy

- [ ] Store 10 student names using ArrayList.
- [ ] Print all elements.
- [ ] Remove duplicates manually.
- [ ] Find maximum element.
- [ ] Reverse an ArrayList.

---

## Medium

- [ ] Rotate a List by k positions.
- [ ] Merge two ArrayLists.
- [ ] Find the second largest element.
- [ ] Remove all even numbers.
- [ ] Frequency of each element.

---

## Hard

- [ ] Implement your own Dynamic Array.
- [ ] Build Browser History using LinkedList.
- [ ] Implement Undo Feature using Stack.
- [ ] Design Music Playlist using LinkedList.
- [ ] Implement LRU Cache (Preparation).

---

# Revision Checklist

- [ ] List Interface
- [ ] ArrayList
- [ ] LinkedList
- [ ] Vector
- [ ] Stack
- [ ] Time Complexity
- [ ] Internal Working
- [ ] Comparisons
- [ ] Best Practices
- [ ] Interview Questions
- [ ] Practice Problems

---

# Next Chapter

➡️ **02-Queue-Set-Framework.md**

- Queue
- PriorityQueue
- Deque
- ArrayDeque
- Set
- HashSet
- LinkedHashSet
- TreeSet