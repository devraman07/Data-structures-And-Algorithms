# 📘 Java Collections Framework - Queue & Set

> A complete guide to Queue, Deque, PriorityQueue, and Set implementations in Java Collections Framework.

---

# 📖 Table of Contents

- What is Queue?
- Queue Hierarchy
- Queue Methods
- PriorityQueue
- Deque
- ArrayDeque
- Queue Comparison
- What is Set?
- Set Hierarchy
- HashSet
- LinkedHashSet
- TreeSet
- Set Comparison
- Internal Working
- Time Complexity
- Best Practices
- Common Mistakes
- Interview Questions
- Practice Questions

---

# Queue Interface

A **Queue** follows the **FIFO (First In First Out)** principle.

The first element inserted is the first element removed.

Real-life examples

- Printer Queue
- Ticket Counter
- CPU Scheduling
- BFS (Breadth First Search)

---

# Queue Hierarchy

```text
Iterable
    │
Collection
    │
 Queue
 ┌──┴─────────────┐
 │                │
PriorityQueue   Deque
                   │
              ArrayDeque
              LinkedList
```

---

# Queue Operations

| Method | Description |
|---------|-------------|
| offer() | Insert element |
| poll() | Remove front element |
| peek() | View front element |
| element() | Returns front (throws exception if empty) |
| remove() | Removes front (throws exception if empty) |

Example

```java
Queue<Integer> queue = new LinkedList<>();

queue.offer(10);
queue.offer(20);
queue.offer(30);

System.out.println(queue.poll());

System.out.println(queue.peek());
```

Output

```
10

20
```

---

# Queue Characteristics

✅ FIFO

✅ Dynamic Size

✅ Allows Duplicates

✅ Generic

---

# PriorityQueue

## What is PriorityQueue?

PriorityQueue stores elements according to their **priority** instead of insertion order.

Internally it uses a

```
Binary Heap
```

By default

```
Min Heap
```

---

## Example

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.offer(20);
pq.offer(5);
pq.offer(10);

System.out.println(pq.poll());
```

Output

```
5
```

Smallest element always comes first.

---

## Max Heap

```java
PriorityQueue<Integer> pq =
new PriorityQueue<>(Collections.reverseOrder());
```

---

## Internal Working

```
          5
        /   \
      10     20
```

Every insertion maintains the heap property.

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| offer() | O(log n) |
| poll() | O(log n) |
| peek() | O(1) |
| Search | O(n) |

---

## Applications

- Dijkstra Algorithm
- Prim's Algorithm
- CPU Scheduling
- Job Scheduling
- K Largest Elements
- Top K Problems

---

# Deque

Deque means

```
Double Ended Queue
```

Insertion and deletion can happen from both ends.

---

## Methods

```java
addFirst()

addLast()

removeFirst()

removeLast()

peekFirst()

peekLast()
```

---

## Example

```java
Deque<Integer> deque = new ArrayDeque<>();

deque.addFirst(10);

deque.addLast(20);

deque.removeFirst();
```

---

## Applications

- Sliding Window
- BFS
- Undo/Redo
- Browser History

---

# ArrayDeque

ArrayDeque is the recommended implementation of Deque.

Internally

```
Resizable Circular Array
```

Advantages

- Faster than Stack
- Faster than LinkedList
- No Synchronization Overhead

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| addFirst() | O(1) |
| addLast() | O(1) |
| removeFirst() | O(1) |
| removeLast() | O(1) |
| peek() | O(1) |

---

# Queue Comparison

| Feature | Queue | PriorityQueue | Deque |
|----------|-------|---------------|-------|
| Order | FIFO | Priority | Both Ends |
| Random Access | No | No | No |
| Internal Structure | Depends | Binary Heap | Circular Array / LinkedList |

---

# Set Interface

A **Set** stores **unique elements**.

Duplicate values are not allowed.

Example

```java
Set<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);

System.out.println(set);
```

Output

```
10 20
```

---

# Set Characteristics

✅ No Duplicates

✅ Dynamic Size

✅ Generic

❌ No Index

---

# Set Hierarchy

```text
Iterable
    │
Collection
    │
   Set
 ┌──┼──────────────┐
 │  │              │
HashSet LinkedHashSet TreeSet
```

---

# HashSet

## What is HashSet?

HashSet stores unique elements using

```
HashMap
```

Internally every element becomes

```
Key

↓

Dummy Object
```

Example

```java
HashSet<String> set = new HashSet<>();
```

---

## Internal Working

```
Hash Function

↓

Bucket

↓

Store Element
```

If collision occurs

```
Bucket

↓

Linked List

↓

(Java 8)

↓

Red Black Tree
```

---

## Characteristics

- No Duplicate Elements
- Unordered
- One null allowed
- Fastest Set

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add | O(1) |
| Remove | O(1) |
| Search | O(1) |

---

## Applications

- Remove Duplicates
- Membership Check
- Fast Lookup

---

# LinkedHashSet

LinkedHashSet maintains

```
Insertion Order
```

Internally

```
Hash Table

+

Linked List
```

---

## Characteristics

- Ordered
- Unique Elements
- Slightly Slower than HashSet

---

## Time Complexity

Same as HashSet.

---

# TreeSet

TreeSet stores elements in

```
Sorted Order
```

Internally

```
Red Black Tree
```

---

## Example

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(30);

set.add(10);

set.add(20);

System.out.println(set);
```

Output

```
10

20

30
```

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add | O(log n) |
| Remove | O(log n) |
| Search | O(log n) |

---

## Applications

- Leaderboard
- Rankings
- Sorted Data
- Range Queries

---

# HashSet vs LinkedHashSet vs TreeSet

| Feature | HashSet | LinkedHashSet | TreeSet |
|---------|----------|---------------|----------|
| Order | No | Insertion | Sorted |
| Duplicate | No | No | No |
| Null | One | One | Not Allowed |
| Search | O(1) | O(1) | O(log n) |
| Internal | HashMap | HashMap + Linked List | Red Black Tree |

---

# Queue vs Deque

| Queue | Deque |
|--------|-------|
| One End | Both Ends |
| FIFO | FIFO + LIFO |
| Less Flexible | More Flexible |

---

# Internal Working Summary

## PriorityQueue

```
Binary Heap

↓

Heapify

↓

Maintain Priority
```

---

## ArrayDeque

```
Resizable Circular Array
```

---

## HashSet

```
Hash Function

↓

Bucket

↓

HashMap
```

---

## LinkedHashSet

```
HashMap

+

Linked List
```

---

## TreeSet

```
Red Black Tree
```

---

# Which Collection Should I Use?

| Situation | Collection |
|------------|------------|
| FIFO | Queue |
| Priority Scheduling | PriorityQueue |
| Stack + Queue | ArrayDeque |
| Remove Duplicates | HashSet |
| Ordered Set | LinkedHashSet |
| Sorted Set | TreeSet |

---

# Best Practices

✅ Use PriorityQueue for priority-based problems.

---

✅ Use HashSet for fast lookup.

---

✅ Use TreeSet when sorted data is required.

---

✅ Prefer ArrayDeque over LinkedList for queue operations.

---

✅ Use LinkedHashSet when insertion order matters.

---

# Common Mistakes

❌ Expecting HashSet to preserve insertion order.

---

❌ Using TreeSet with non-comparable objects.

---

❌ Expecting PriorityQueue iteration to be sorted.

Only `poll()` guarantees priority order.

---

❌ Using LinkedList instead of ArrayDeque for stack/queue unless linked-node behavior is specifically required.

---

# Interview Questions

## Beginner

- What is Queue?
- Difference between Queue and Deque?
- Difference between Set and List?
- Why does Set not allow duplicates?
- Difference between HashSet and TreeSet?

---

## Intermediate

- How does HashSet work internally?
- How does PriorityQueue work?
- Why is TreeSet O(log n)?
- Difference between LinkedHashSet and HashSet?
- What is a Binary Heap?

---

## Advanced

- HashSet internal implementation using HashMap.
- Collision handling in HashSet.
- Treeification in Java 8.
- Red-Black Tree properties.
- Why doesn't PriorityQueue maintain sorted iteration?
- Difference between Heap and BST.
- How does ArrayDeque implement a circular array?

---

# Practice Questions

## Easy

- [ ] Remove duplicates from an array using HashSet.
- [ ] Store employee IDs using HashSet.
- [ ] Print elements of a TreeSet in sorted order.
- [ ] Implement a simple Queue.
- [ ] Reverse a Queue.

---

## Medium

- [ ] Sliding Window Maximum using Deque.
- [ ] Top K Largest Elements using PriorityQueue.
- [ ] Merge K Sorted Arrays.
- [ ] Check if two arrays contain the same unique elements.
- [ ] Design a Browser History using Deque.

---

## Hard

- [ ] Implement your own HashSet.
- [ ] Build an Event Scheduler using PriorityQueue.
- [ ] Design a Leaderboard using TreeSet.
- [ ] Implement BFS using Queue.
- [ ] Solve "Top K Frequent Elements" using PriorityQueue.

---

# Revision Checklist

- [ ] Queue
- [ ] PriorityQueue
- [ ] Deque
- [ ] ArrayDeque
- [ ] Set
- [ ] HashSet
- [ ] LinkedHashSet
- [ ] TreeSet
- [ ] Internal Working
- [ ] Time Complexity
- [ ] Comparisons
- [ ] Best Practices
- [ ] Interview Questions
- [ ] Practice Problems

---

# Next Chapter

➡️ **03-Map-Advanced-Framework.md**

Topics Covered Next

- Map Interface
- HashMap
- LinkedHashMap
- TreeMap
- Hashtable
- ConcurrentHashMap
- WeakHashMap
- IdentityHashMap
- EnumMap
- Comparable vs Comparator
- Collections Utility
- Iterator
- Streams
- Internal Working
- Thread Safety