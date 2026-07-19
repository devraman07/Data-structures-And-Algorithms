# ☕ Java Collections Framework (JCF)

> A complete roadmap to mastering the Java Collections Framework—from beginner to advanced. This repository is designed for Java developers, backend engineers, and interview preparation.

---

# 📖 Table of Contents

- Introduction
- Why Collections?
- What is the Java Collections Framework?
- Collection vs Collections
- Why Not Arrays?
- Collection Hierarchy
- Iterable Interface
- Collection Interface
- Map Interface
- Generics
- How to Choose the Right Collection
- Time Complexity Overview
- Learning Roadmap
- Interview Preparation Checklist
- Resources

---

# 📌 Introduction

The **Java Collections Framework (JCF)** is a unified architecture that provides ready-made data structures and algorithms to efficiently store, manipulate, search, sort, and process groups of objects.

Instead of implementing data structures from scratch, Java provides optimized implementations such as:

- ArrayList
- LinkedList
- HashSet
- TreeSet
- HashMap
- TreeMap
- PriorityQueue
- ArrayDeque

The Collections Framework makes Java applications cleaner, faster, and easier to maintain.

---

# ❓ Why Collections?

Imagine storing 10,000 students.

Without Collections you would have to:

- Create arrays manually
- Handle resizing
- Write searching logic
- Write sorting algorithms
- Handle duplicate removal

Collections solve all these problems.

## Advantages

- Dynamic Size
- Built-in Data Structures
- Built-in Algorithms
- Better Performance
- Generic Programming
- Reusable Code
- Cleaner Code
- Easy Maintenance

---

# 🚫 Why Not Arrays?

Arrays have several limitations.

| Arrays | Collections |
|---------|-------------|
| Fixed Size | Dynamic Size |
| Stores elements only | Stores objects efficiently |
| Manual resizing | Automatic resizing |
| Limited methods | Rich API |
| Less flexible | Highly flexible |

Arrays are still useful, but Collections are preferred for most real-world applications.

---

# 📚 What is the Java Collections Framework?

The Java Collections Framework consists of

- Interfaces
- Implementations
- Utility Classes
- Algorithms

It provides a standard way to work with groups of objects.

---

# 🏗 Collection Hierarchy

```text
                           Iterable
                               │
                         Collection
         ┌──────────────┬──────────────┬──────────────┐
         │              │              │
        List           Queue           Set
         │              │              │
 ┌───────┼───────┐      │      ┌───────────────┐
 │       │       │      │      │       │       │
ArrayList LinkedList Vector PriorityQueue HashSet LinkedHashSet TreeSet
                     │
                   Stack


Map (Separate Hierarchy)

Map
│
├── HashMap
├── LinkedHashMap
├── TreeMap
├── Hashtable
├── WeakHashMap
├── IdentityHashMap
├── EnumMap
└── ConcurrentHashMap
```

---

# 📦 Collection Interface

The `Collection` interface is the root interface of most collections.

Common methods

```java
add()

remove()

contains()

size()

clear()

isEmpty()

iterator()
```

Everything except **Map** extends the Collection interface.

---

# 🗺 Map Interface

The `Map` interface stores data as **Key → Value** pairs.

Example

```java
HashMap<Integer, String> students = new HashMap<>();
```

Characteristics

- Unique Keys
- Duplicate Values Allowed
- Fast Lookup

Map **does not extend Collection**.

It is a completely separate hierarchy.

---

# 🔄 Iterable Interface

`Iterable` is the top-most interface.

It allows collections to work with the enhanced for-loop.

Example

```java
for(String name : list){

    System.out.println(name);

}
```

Methods

```java
iterator()
```

---

# 🧬 Generics

Collections use Generics for type safety.

Without Generics

```java
ArrayList list = new ArrayList();
```

Problem

Anything can be stored.

With Generics

```java
ArrayList<String> list = new ArrayList<>();
```

Only String objects are allowed.

Benefits

- Type Safety
- No Explicit Casting
- Compile-Time Checking
- Cleaner Code

---

# 🎯 Which Collection Should I Use?

| Requirement | Collection |
|-------------|------------|
| Dynamic Array | ArrayList |
| Frequent Insert/Delete | LinkedList |
| LIFO | Stack / ArrayDeque |
| FIFO | Queue |
| Priority Based | PriorityQueue |
| No Duplicates | HashSet |
| Sorted Data | TreeSet |
| Fast Key Lookup | HashMap |
| Sorted Keys | TreeMap |
| Maintain Insertion Order | LinkedHashMap |
| Thread Safe Map | ConcurrentHashMap |

---

# ⏱ Time Complexity Overview

| Collection | Search | Insert | Delete | Access |
|------------|-------:|-------:|-------:|-------:|
| ArrayList | O(n) | O(1)* | O(n) | O(1) |
| LinkedList | O(n) | O(1) | O(1) | O(n) |
| HashSet | O(1) | O(1) | O(1) | - |
| TreeSet | O(log n) | O(log n) | O(log n) | - |
| HashMap | O(1) | O(1) | O(1) | O(1) |
| TreeMap | O(log n) | O(log n) | O(log n) | O(log n) |
| PriorityQueue | O(n) | O(log n) | O(log n) | O(1) (peek) |

> **Note:** Average-case complexities are shown. Worst-case performance may differ.

---

# 🛣 Learning Roadmap

## Phase 1 — Foundations

- [ ] Introduction
- [ ] Collection Hierarchy
- [ ] Iterable
- [ ] Collection Interface
- [ ] Generics

---

## Phase 2 — List

- [ ] List Interface
- [ ] ArrayList
- [ ] LinkedList
- [ ] Vector
- [ ] Stack

---

## Phase 3 — Queue

- [ ] Queue
- [ ] PriorityQueue
- [ ] Deque
- [ ] ArrayDeque

---

## Phase 4 — Set

- [ ] HashSet
- [ ] LinkedHashSet
- [ ] TreeSet

---

## Phase 5 — Map

- [ ] HashMap
- [ ] LinkedHashMap
- [ ] TreeMap
- [ ] Hashtable
- [ ] ConcurrentHashMap

---

## Phase 6 — Advanced

- [ ] Comparable
- [ ] Comparator
- [ ] Iterator
- [ ] Collections Utility Class
- [ ] Streams
- [ ] Internal Working
- [ ] Thread-Safe Collections
- [ ] Immutable Collections

---

# 📝 Interview Preparation Checklist

## Beginner

- [ ] What is Collection?
- [ ] Difference between Collection and Collections?
- [ ] Difference between List and Set?
- [ ] Difference between HashMap and HashSet?
- [ ] Difference between ArrayList and LinkedList?

---

## Intermediate

- [ ] Internal Working of ArrayList
- [ ] Internal Working of HashMap
- [ ] Hashing
- [ ] Collision
- [ ] Load Factor
- [ ] Treeification
- [ ] Comparable vs Comparator
- [ ] Iterator vs ListIterator

---

## Advanced

- [ ] ConcurrentHashMap
- [ ] Fail Fast vs Fail Safe
- [ ] WeakHashMap
- [ ] IdentityHashMap
- [ ] CopyOnWriteArrayList
- [ ] BlockingQueue
- [ ] Immutable Collections
- [ ] Streams with Collections

---

# 📂 Repository Structure

```text
Java Collections Framework
│
├── README.md
├── 01-List-Framework.md
├── 02-Queue-Set-Framework.md
└── 03-Map-Advanced-Framework.md
```

---

# 🎯 Goals

By the end of this repository, you should be able to:

- Choose the right collection for any problem.
- Explain the internal working of Java collections.
- Analyze time and space complexity.
- Solve DSA problems using collections.
- Answer Java backend interview questions confidently.
- Build scalable Java applications using the Collections Framework.

---

# 📚 Resources

- Oracle Java Documentation
- Effective Java by Joshua Bloch
- Java: The Complete Reference
- OpenJDK Source Code
- LeetCode
- HackerRank
- CodeChef
- GeeksforGeeks

---

# ⭐ Final Advice

> **Don't memorize Collections—understand their internals.**

A backend engineer isn't expected to just know **how** to use `HashMap`; they should also understand **why it's usually O(1)**, **how collisions occur**, **what treeification is**, and **when to choose a different collection**.

That's the difference between using Java and mastering it.