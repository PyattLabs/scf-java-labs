# Assignment 6: Sort Three Numbers — The Players

## 🎭 The Cast

### `displaySortedNumbers(double num1, double num2, double num3)`
- **Role:** The star of the show. Takes three numbers and displays them smallest to largest.
- **Type:** `void` — it prints, it doesn't return.
- **Signature:** `public static void displaySortedNumbers(double num1, double num2, double num3)`

### `main(String[] args)`
- **Role:** The director. Prompts the user for input, then calls `displaySortedNumbers`.
- **Owns:** The Scanner, the three input variables.

### `Scanner`
- **Role:** Reads user input from the keyboard.
- **Import:** `java.util.Scanner`
- **Lives in:** `main` only.

---

## 📖 Key Terms

| Term | Meaning |
|------|---------|
| **Method** | A named block of code that performs a task |
| **Parameter** | Variable in the method signature (placeholder) |
| **Argument** | Actual value passed when calling the method |
| **void** | Method that does not return a value |
| **return type** | What a method gives back (`int`, `double`, `void`, etc.) |
| **scope** | Where a variable can be accessed (local to its method) |
| **overloading** | Multiple methods with the same name but different parameters |

---

## 🔧 Operations You'll Use

| Operation | Example |
|-----------|---------|
| Define a method | `public static void greet(String name) { ... }` |
| Call a method | `greet("Alice");` |
| Compare doubles | `if (num1 > num2)` |
| Swap values | Use a temp variable: `temp = a; a = b; b = temp;` |
| Print inline | `System.out.print(num1 + " ");` |
| Print with newline | `System.out.println(num3);` |
| Read double | `double x = input.nextDouble();` |

---

## 🎯 The Goal

Prompt the user for three numbers. Pass them to `displaySortedNumbers()`. That method figures out the order and prints them smallest → largest on one line.

**Sample Run:**
```
Enter three numbers: 5.5 2.3 8.1
The sorted numbers are: 2.3 5.5 8.1
```

**Another run:**
```
Enter three numbers: 10 10 5
The sorted numbers are: 5.0 10.0 10.0
```

---

## ⚠️ Watch Out For

1. **Sorting logic** — You need to handle ALL possible orderings (there are 6)
2. **Don't return from a void method** — `displaySortedNumbers` prints, it doesn't return
3. **Pass by value** — The method gets copies of the values, not the originals
4. **Double comparison** — Works fine with `<`, `>` for this assignment
