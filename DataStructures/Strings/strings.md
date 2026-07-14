# 📘 Strings (Lecture 1 - Basics)

> Status: ✅ Completed
>
> Revision Count: 0

---

# What is a String?

A **String** is a sequence of characters enclosed inside double quotes.

```java
String name = "Raman";
```

Examples

```
"Java"

"DSA"

"Backend"

"OpenAI"
```

---

# Why Strings?

Strings are used to store text data.

Examples

- User Names
- Passwords
- Emails
- Chat Messages
- Search Queries
- File Names

Almost every real-world application works with strings.

---

# Creating Strings

## String Literal (Recommended)

```java
String str = "Hello";
```

---

## Using new Keyword

```java
String str = new String("Hello");
```

For beginners, always use **String Literals**.

---

# String is an Object

Unlike

```
int

double

char
```

String is a class.

That's why we can call methods like

```
length()

charAt()

equals()
```

---

# String Basics

## Length

```java
str.length()
```

Returns the total number of characters.

---

## Access Character

```java
str.charAt(index)
```

Example

```java
String str = "JAVA";

str.charAt(0)

↓

J
```

---

# Indexing

Index always starts from **0**.

```
J  A  V  A

0  1  2  3
```

---

# String Traversal

Exactly the same as Array Traversal.

```java
for(int i=0;i<str.length();i++){

    System.out.println(str.charAt(i));

}
```

---

# Strings are Immutable

Once created,

Strings cannot be modified.

Example

```java
String str = "Hello";

str.concat(" World");
```

Output

```
Hello
```

Correct

```java
str = str.concat(" World");
```

---

# Comparing Strings

Wrong

```java
str1 == str2
```

Correct

```java
str1.equals(str2)
```

Remember

```
==

↓

Memory Address

equals()

↓

Actual Content
```

---

# Input

Single Word

```java
next()
```

Full Sentence

```java
nextLine()
```

---

# Problems Covered Today

## Print Every Character

Idea

Traverse the string.

Print one character at a time.

Complexity

Time : O(n)

Space : O(1)

---

## Count Vowels

Idea

Visit every character.

Check if it is

```
A

E

I

O

U
```

Increase count.

Complexity

Time : O(n)

Space : O(1)

---

## Reverse String

Idea

Traverse from the last index to the first.

```
length()-1

↓

0
```

Complexity

Time : O(n)

Space : O(1) *(if only printing)*

---

## Palindrome Check

Idea

Use two pointers.

```
Left

↓

← →

↑

Right
```

Compare both ends.

Move inward.

Stop if characters don't match.

Complexity

Time : O(n)

Space : O(1)

---

# Mental Framework

Whenever a String problem appears

↓

Need every character?

↓

Traversal

---

Need vowels?

↓

Traversal + Condition

---

Need reverse?

↓

Reverse Traversal

---

Need palindrome?

↓

Two Pointers

---

# Complexity Summary

| Operation | Time | Space |
|-----------|------|-------|
| Traversal | O(n) | O(1) |
| Print Characters | O(n) | O(1) |
| Count Vowels | O(n) | O(1) |
| Reverse (Print) | O(n) | O(1) |
| Palindrome Check | O(n) | O(1) |

---

# Common Mistakes

❌ Using

```java
==
```

for comparison.

Use

```java
equals()
```

---

❌ Accessing

```java
str.charAt(str.length())
```

Index Out Of Bounds

---

❌ Forgetting

Strings are immutable.

---

❌ Confusing

```
next()

nextLine()
```

---

# Today's Homework

## Easy

- [ ] Count consonants in a string.
- [ ] Count uppercase letters.
- [ ] Count lowercase letters.
- [ ] Count digits in a string.
- [ ] Count special characters.
- [ ] Print characters in reverse order (without creating a new string).
- [ ] Check whether a string starts and ends with the same character.
- [ ] Count how many times a given character appears.
- [ ] Find the ASCII value of every character.
- [ ] Print only the vowels in a string.

---

## Thinking Questions

1. Why is String immutable in Java?
2. What is the difference between `==` and `equals()`?
3. Why does indexing start from 0?
4. Why is `charAt(str.length())` invalid?
5. When should you use `next()` and when should you use `nextLine()`?
6. Why does the palindrome solution use two pointers instead of creating a reversed string?

---

# Covered Today ✅

- String Introduction
- Creating Strings
- String Objects
- String Length
- Character Access
- String Traversal
- String Immutability
- String Comparison
- String Input
- Print Characters
- Count Vowels
- Reverse String
- Palindrome Check

---

# Next Lecture

➡️ String Methods & Intermediate Problems

- Substring
- compareTo()
- startsWith()
- endsWith()
- contains()
- replace()
- StringBuilder