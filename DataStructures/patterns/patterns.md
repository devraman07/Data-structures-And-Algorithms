# Pattern Printing Notes (Interview Revision)

> Goal: Never memorize patterns. Learn to derive them.

---

# Mental Framework (MOST IMPORTANT)

Whenever you see a new pattern:

Step 1
Count total rows.

Step 2
For every row ask:

- How many spaces?
- How many symbols?
- Which symbol?
- Is anything increasing?
- Is anything decreasing?

Step 3

Separate the pattern into independent loops.

Example:

Spaces
Stars
Numbers

Every section should have its own loop.

Never try printing everything in one loop.

---

# Universal Template

for(each row){

    // Leading spaces

    // Left part

    // Middle

    // Right part

    println();

}

---

# Outer Loop

Outer loop always represents

Rows

Example

for(row = 1; row <= n; row++)

One iteration == One complete row

---

# Inner Loop

Inner loops represent

- spaces
- stars
- numbers
- alphabets

There may be multiple inner loops.

Example

Spaces

Stars

Numbers

---

# Pattern Recognition

## Fixed Rectangle

Observation

Every row has

same columns

Formula

rows = n

cols = m

Loop

for(col=1;col<=m;col++)

Examples

Solid Rectangle

Solid Square

---

## Boundary Pattern

Observation

Only boundary prints.

Everything else is space.

Condition

row==1

row==n

col==1

col==m

Examples

Hollow Rectangle

Hollow Square

Hollow Triangle

---

## Increasing Pattern

Observation

Printing increases every row.

Formula

symbols = row

Examples

Right Triangle

Number Triangle

Character Triangle

---

## Decreasing Pattern

Observation

Printing decreases every row.

Formula

symbols = n-row+1

Examples

Reverse Triangle

Reverse Number Triangle

---

## Pyramid Pattern

Always divide into

Part 1

Spaces

Formula

n-row

Part 2

Symbols

Formula

2*row-1

Examples

Solid Pyramid

Number Pyramid

Alphabet Pyramid

---

## Reverse Pyramid

Spaces

2*(row-1)

Symbols

2*n-row-(row-1)

or

2*(n-row)+1

---

## Diamond Pattern

Think

Upper Pyramid

+

Lower Pyramid

Never solve as one pattern.

Solve

Pyramid

then

Reverse Pyramid

---

## Butterfly Pattern

Divide into four parts

Stars

Spaces

Spaces

Stars

Formula

Left Stars = row

Middle Spaces = 2*(n-row)

Right Stars = row

Bottom half is reverse.

---

# Common Formulas

Increasing

row

Decreasing

n-row+1

Leading Spaces

n-row

Pyramid Stars

2*row-1

Diamond

Upper + Lower

Middle Spaces

2*(n-row)

Reverse Pyramid Stars

2*(n-row)+1

---

# Interview Thinking

Never start coding immediately.

First write

Row 1

Row 2

Row 3

Observe

What changed?

If you know

Spaces

Symbols

Formula

The code becomes easy.

---

# Common Mistakes

❌ Trying to print the whole pattern at once

✔ Break into sections

---

❌ Forgetting println()

✔ Every row ends with println()

---

❌ Mixing rows and columns

✔ Outer = Rows

✔ Inner = Columns

---

❌ Memorizing formulas

✔ Derive formulas

---

# Patterns Completed

✅ Solid Rectangle

✅ Solid Triangle

✅ Reverse Rhombus

✅ Reverse Right Triangle

✅ Solid Pyramid

✅ Reverse Pyramid

✅ Hollow Rectangle

✅ Hollow Right Triangle

✅ Hollow Pyramid

✅ Solid Diamond

✅ Hollow Diamond

✅ Butterfly

✅ Number Triangle

✅ Continuous Number Triangle

✅ Character Triangle

✅ Continuous Character Triangle

✅ Number Pyramid

✅ Number Palindrome Pyramid

✅ Number Solid Pyramid

✅ Character Pyramid

---

# One Minute Revision

Outer Loop

↓

Rows

Inner Loop

↓

Printing

Pattern

↓

Rows

↓

Spaces

↓

Symbols

↓

Formula

↓

Code

Never memorize patterns.

Always derive them.