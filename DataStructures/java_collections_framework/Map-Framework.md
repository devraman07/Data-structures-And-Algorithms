# 📘 Java Collections Framework - Map & Advanced Collections

> A complete guide to the Map interface and advanced Java Collections topics. This chapter covers everything from basic HashMap usage to concurrent collections, sorting, iterators, streams, and interview concepts.

---

# 📖 Table of Contents

- What is Map?
- Map Hierarchy
- Common Map Methods
- HashMap
- LinkedHashMap
- TreeMap
- Hashtable
- ConcurrentHashMap
- WeakHashMap
- IdentityHashMap
- EnumMap
- Comparable vs Comparator
- Iterator & ListIterator
- Collections Utility Class
- Streams with Collections
- Fail-Fast vs Fail-Safe
- Immutable Collections
- Thread-Safe Collections
- Time Complexity
- Best Practices
- Common Mistakes
- Interview Questions
- Practice Questions

---

# What is Map?

A **Map** stores data in the form of **Key → Value** pairs.

Every key must be unique.

Values can be duplicated.

Example

```java
Map<Integer, String> students = new HashMap<>();

students.put(101, "Raman");
students.put(102, "Sujal");
students.put(103, "Debangshu");
```

---

# Features of Map

✅ Key-Value Pair

✅ Unique Keys

✅ Duplicate Values Allowed

✅ Generic

❌ Not a part of Collection Interface

---

# Map Hierarchy

```text
                 Map
                  │
    ┌─────────────┼──────────────────────────┐
    │             │                          │
 HashMap    LinkedHashMap                TreeMap
    │
 Hashtable
    │
ConcurrentHashMap

Other Implementations

WeakHashMap
IdentityHashMap
EnumMap
```

---

# Common Map Methods

```java
put()

putIfAbsent()

get()

getOrDefault()

containsKey()

containsValue()

replace()

remove()

keySet()

values()

entrySet()

size()

clear()

isEmpty()
```

---

# HashMap

## What is HashMap?

HashMap is the most commonly used implementation of the Map interface.

It stores data using

```
Hashing
```

---

## Internal Working

```
Key

↓

hashCode()

↓

Hash Function

↓

Bucket Index

↓

Store Entry
```

If two keys generate the same bucket

```
Collision

↓

Linked List

↓

(Java 8)

↓

Red Black Tree
```

---

## Load Factor

Default

```
0.75
```

When the threshold is reached

```
Resize

↓

Rehash
```

---

## Characteristics

- Fast Lookup
- Unordered
- One null key
- Multiple null values

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| containsKey() | O(1) |

Worst Case

```
O(n)
```

---

## Applications

- Caching
- Database Indexing
- Configuration Storage
- Frequency Counting

---

# LinkedHashMap

LinkedHashMap maintains

```
Insertion Order
```

Internally

```
Hash Table

+

Doubly Linked List
```

---

## Characteristics

- Ordered
- Slightly slower than HashMap
- Can maintain access order

Applications

- LRU Cache
- Ordered Data

---

# TreeMap

TreeMap stores keys in

```
Sorted Order
```

Internally

```
Red Black Tree
```

---

## Characteristics

- Sorted Keys
- No Null Keys
- Logarithmic Operations

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |

---

# Hashtable

Hashtable is the legacy synchronized implementation of Map.

Characteristics

- Thread Safe
- No null keys
- No null values
- Slower than HashMap

---

# ConcurrentHashMap

Designed for multi-threaded applications.

Advantages

- Thread Safe
- High Performance
- Concurrent Reads
- Better than Hashtable

Applications

- Web Servers
- Spring Boot
- Concurrent Caches

---

# WeakHashMap

Stores keys using

```
Weak References
```

Unused keys are automatically removed by the Garbage Collector.

Applications

- Caching
- Memory-sensitive applications

---

# IdentityHashMap

Compares keys using

```java
==
```

instead of

```java
equals()
```

Used only in special situations.

---

# EnumMap

Optimized implementation for Enum keys.

Advantages

- Fast
- Memory Efficient
- Ordered according to Enum declaration

---

# Comparable vs Comparator

## Comparable

Used when a class has **one natural ordering**.

Method

```java
compareTo()
```

Example

```java
class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student s){

        return this.id - s.id;

    }

}
```

---

## Comparator

Used for **custom sorting**.

Method

```java
compare()
```

Example

```java
Collections.sort(list,
(a,b)->a.getAge()-b.getAge());
```

---

## Comparable vs Comparator

| Comparable | Comparator |
|-------------|------------|
| compareTo() | compare() |
| Natural Order | Custom Order |
| Inside Class | Separate Class/Lambda |

---

# Iterator

Iterator is used to traverse collections safely.

Methods

```java
hasNext()

next()

remove()
```

Example

```java
Iterator<String> it = list.iterator();

while(it.hasNext()){

    System.out.println(it.next());

}
```

---

# ListIterator

Extra methods

```java
previous()

hasPrevious()

set()

add()
```

Supports forward and backward traversal.

---

# Collections Utility Class

Common Methods

```java
Collections.sort()

Collections.reverse()

Collections.shuffle()

Collections.max()

Collections.min()

Collections.binarySearch()

Collections.frequency()

Collections.swap()
```

---

# Streams with Collections

Common Operations

```java
filter()

map()

sorted()

distinct()

collect()

reduce()

count()

forEach()
```

Example

```java
list.stream()

.filter(x -> x > 10)

.sorted()

.collect(Collectors.toList());
```

---

# Fail-Fast vs Fail-Safe

## Fail-Fast

Throws

```
ConcurrentModificationException
```

Examples

- ArrayList
- HashMap
- HashSet

---

## Fail-Safe

Works on a copy.

Examples

- CopyOnWriteArrayList
- ConcurrentHashMap

---

# Immutable Collections

Java 9+

```java
List.of()

Set.of()

Map.of()
```

Cannot be modified after creation.

---

# Thread-Safe Collections

- Vector
- Hashtable
- ConcurrentHashMap
- CopyOnWriteArrayList
- BlockingQueue

---

# Time Complexity Summary

| Collection | Search | Insert | Delete |
|------------|--------|--------|--------|
| HashMap | O(1) | O(1) | O(1) |
| LinkedHashMap | O(1) | O(1) | O(1) |
| TreeMap | O(log n) | O(log n) | O(log n) |
| Hashtable | O(1) | O(1) | O(1) |
| ConcurrentHashMap | O(1) | O(1) | O(1) |

---

# Internal Working Summary

## HashMap

```
hashCode()

↓

Bucket

↓

Collision

↓

Linked List

↓

Red Black Tree
```

---

## LinkedHashMap

```
HashMap

+

Doubly Linked List
```

---

## TreeMap

```
Red Black Tree
```

---

## ConcurrentHashMap

```
Bucket

↓

Fine-Grained Locking

↓

Concurrent Access
```

---

# Which Collection Should I Use?

| Situation | Collection |
|------------|------------|
| Fast Lookup | HashMap |
| Ordered Map | LinkedHashMap |
| Sorted Map | TreeMap |
| Thread Safe | ConcurrentHashMap |
| Enum Keys | EnumMap |
| Cache | WeakHashMap |

---

# Best Practices

✅ Use HashMap by default.

---

✅ Use TreeMap only when sorting is required.

---

✅ Prefer ConcurrentHashMap over Hashtable.

---

✅ Use Comparable for natural ordering.

---

✅ Use Comparator for custom sorting.

---

✅ Prefer Streams for data processing.

---

# Common Mistakes

❌ Assuming HashMap preserves insertion order.

---

❌ Modifying a collection while iterating using a for-each loop.

---

❌ Using Hashtable in modern applications.

---

❌ Forgetting to override equals() and hashCode() for custom objects used as keys.

---

❌ Using TreeMap with objects that don't implement Comparable (or without providing a Comparator).

---

# Interview Questions

## Beginner

- What is Map?
- Difference between HashMap and HashSet?
- Difference between Map and Collection?
- Difference between HashMap and TreeMap?
- Difference between HashMap and LinkedHashMap?

---

## Intermediate

- How does HashMap work internally?
- What is hashing?
- What is collision?
- What is load factor?
- What is rehashing?
- What is Comparable?
- What is Comparator?
- Difference between Iterator and ListIterator?

---

## Advanced

- HashMap before Java 8 vs Java 8+
- Treeification in HashMap
- Red-Black Tree properties
- ConcurrentHashMap internals
- Fail-Fast vs Fail-Safe
- WeakHashMap internals
- IdentityHashMap use cases
- CopyOnWriteArrayList internals
- Why ConcurrentHashMap is faster than Hashtable?
- How hashCode() and equals() work together?

---

# Practice Questions

## Easy

- [ ] Store employee records using HashMap.
- [ ] Count the frequency of characters in a string.
- [ ] Find duplicate elements using HashMap.
- [ ] Sort a list of students using Comparable.
- [ ] Sort employees by salary using Comparator.

---

## Medium

- [ ] Implement an LRU Cache using LinkedHashMap.
- [ ] Find the first non-repeating character.
- [ ] Group students by department using Streams.
- [ ] Merge two HashMaps.
- [ ] Sort a map by values.

---

## Hard

- [ ] Build your own HashMap.
- [ ] Implement a Phone Directory.
- [ ] Design a URL Shortener using HashMap.
- [ ] Build an Inventory Management System.
- [ ] Create an Employee Management System using Collections and Streams.

---

# Revision Checklist

- [ ] Map Interface
- [ ] HashMap
- [ ] LinkedHashMap
- [ ] TreeMap
- [ ] Hashtable
- [ ] ConcurrentHashMap
- [ ] WeakHashMap
- [ ] IdentityHashMap
- [ ] EnumMap
- [ ] Comparable
- [ ] Comparator
- [ ] Iterator
- [ ] Collections Utility
- [ ] Streams
- [ ] Fail-Fast vs Fail-Safe
- [ ] Immutable Collections
- [ ] Thread-Safe Collections
- [ ] Time Complexity
- [ ] Best Practices
- [ ] Interview Questions
- [ ] Practice Problems

---

# 🎉 Congratulations!

You have now covered the complete **Java Collections Framework**.

By completing these three modules, you should be able to:

- ✅ Choose the right collection for any problem.
- ✅ Explain the internal working of Java collections.
- ✅ Analyze time and space complexity.
- ✅ Solve DSA problems using collections.
- ✅ Answer Java backend interview questions confidently.
- ✅ Build efficient backend applications using the Java Collections Framework.