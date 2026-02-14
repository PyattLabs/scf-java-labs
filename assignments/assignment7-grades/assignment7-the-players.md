# Assignment 7: Grade by Curve — The Players

## 🎭 The Cast

### `double[] scores`
- **Role:** Holds all student scores. Size determined at runtime.
- **Created by:** Reading count from user, then `new double[n]`

### `best` (double)
- **Role:** The highest score in the array. Determines the curve.
- **Found by:** Looping through the array, tracking the maximum.

### `Scanner`
- **Role:** Reads user input — first the count, then each score.
- **Import:** `java.util.Scanner`

---

## 📖 Key Terms

| Term | Meaning |
|------|---------|
| **Array** | A collection of values of the same type, accessed by index |
| **Index** | Position in the array, starting at 0 |
| **length** | Property that gives the number of elements (NOT last index) |
| **Element** | A single value stored in the array |
| **Traversal** | Visiting every element with a loop |
| **Curve** | Grading relative to the best score instead of absolute cutoffs |

---

## 🔧 Operations You'll Use

| Operation | Example |
|-----------|---------|
| Create array | `double[] scores = new double[n];` |
| Access element | `scores[i]` |
| Array length | `scores.length` |
| Fill from input | `scores[i] = input.nextDouble();` |
| Find max | Loop comparing each element to current max |
| If-else chain | Grade assignment based on `best - 10`, `best - 20`, etc. |
| Print with index | `System.out.println("Student " + i + " score " + scores[i] + " grade " + grade);` |

---

## 🎯 The Goal

1. Ask user how many students
2. Read that many scores into an array
3. Find the best (highest) score
4. Loop through again — assign each student a grade based on the curve
5. Display each student's score and grade

**Curve rules:**
```
score >= best - 10  →  A
score >= best - 20  →  B
score >= best - 30  →  C
score >= best - 40  →  D
otherwise           →  F
```

**Sample Run:**
```
Enter the number of students: 4
Enter 4 scores: 40 55 70 58

Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
```

**Explanation:** Best = 70. So A >= 60, B >= 50, C >= 40, D >= 30, F < 30.

---

## ⚠️ Watch Out For

1. **Two passes through the array** — first to find the best, second to assign grades
2. **Off-by-one** — use `<` not `<=` in your loop condition
3. **Initialize max to `scores[0]`** — not to 0 (what if all scores are negative?)
4. **If-else ORDER matters** — check A first, then B, then C, then D, then F
5. **`int` scores are fine** — but the textbook uses `int`, so follow that
