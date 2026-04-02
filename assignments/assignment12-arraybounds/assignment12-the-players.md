# Assignment 12 — Array Bounds
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## The Problem

Write a program that prompts the user to enter an integer index, then accesses that index in a fixed array (Liang 12.3).

The program must handle all invalid input gracefully --- no crashes.

---

## The Players

### `ArrayBounds`

| Member | Type | Description |
|---|---|---|
| `data` | `static int[]` | Fixed array: `{1, 2, 3, 4, 5}` |
| `main(String[] args)` | `static void` | Program entry point |
| `getElement(int index)` | `static int` | Returns element at index, throws on bad index |

---

## The Rules

- `data` is a fixed array of 5 integers: `{1, 2, 3, 4, 5}`
- Prompt the user to enter an index in a loop until they enter `-1` to quit
- Use `try-catch` to handle `ArrayIndexOutOfBoundsException`
- Use `try-catch` to handle `NumberFormatException` for non-integer input
- Use a `finally` block that prints `"Attempt complete."` after every try
- `getElement(int index)` must throw `ArrayIndexOutOfBoundsException` if index is out of range --- do not suppress it there
- Program must never crash regardless of input

---

## Sample Run
```
Enter an index (or -1 to quit): 2
Element at index 2: 3
Attempt complete.

Enter an index (or -1 to quit): 9
Error: Index 9 out of bounds for length 5
Attempt complete.

Enter an index (or -1 to quit): abc
Error: Invalid input -- not an integer
Attempt complete.

Enter an index (or -1 to quit): -1
Goodbye.
```

---

## Demo Requirement

You must screen-share and:
1. Open `ArrayBounds.java` in your editor
2. Compile and run live
3. Demonstrate all three cases: valid index, out of bounds, non-integer
4. Explain what `finally` guarantees regardless of what happens in `try`

---

## Submission

Submit `ArrayBounds.java` via Canvas by the due date.

---

## Starter Code

**Download:** [ArrayBounds.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/assignments/assignment12-arraybounds/ArrayBounds.java)
