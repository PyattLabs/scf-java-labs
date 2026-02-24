# Assignment 6: The Players — Sort Three Numbers

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## The Cast

### Method Definition
A named block of code that performs a task. Defined once, called anywhere.

```java
public static void displaySortedNumbers(double num1, double num2, double num3) {
    // your sorting logic here
}
```

| Part | Meaning |
|------|---------|
| `public static` | Modifiers — accessible, no object needed |
| `void` | Returns nothing — just prints |
| `displaySortedNumbers` | Method name |
| `(double num1, double num2, double num3)` | Three parameters |

### Calling a Method
From `main`, pass three values:

```java
displaySortedNumbers(5.5, 2.3, 8.1);
```

Arguments match parameters by **position**: `5.5 -> num1`, `2.3 -> num2`, `8.1 -> num3`.

### Sorting Three Numbers
Find the smallest, middle, and largest.

**Approach — Math.min / Math.max:**
```java
double min = Math.min(num1, Math.min(num2, num3));
double max = Math.max(num1, Math.max(num2, num3));
double mid = (num1 + num2 + num3) - min - max;
```

### The `main` Method
Your custom method is defined **outside** of `main` but **inside** the class.

```java
public class SortThreeNumbers {

    // Custom method — OUTSIDE main
    public static void displaySortedNumbers(...) { ... }

    // Entry point
    public static void main(String[] args) {
        // prompt, read, call displaySortedNumbers
    }
}
```

---

## Key Patterns

| Pattern | Code | Purpose |
|---------|------|---------|
| Void method | `public static void name(...)` | Performs action, no return |
| Parameter passing | `displaySortedNumbers(a, b, c)` | Send values to method |
| Find min of three | `Math.min(a, Math.min(b, c))` | Smallest value |
| Find max of three | `Math.max(a, Math.max(b, c))` | Largest value |
| Find middle | `(a + b + c) - min - max` | The remaining value |

---

## Common Mistakes

| Mistake | What Happens | Fix |
|---------|-------------|-----|
| Defining method inside `main` | Compile error | Define at class level |
| Forgetting `static` | Cannot call from `main` | Use `public static` |
| Wrong parameter types | `int` when you need `double` | Match the header exactly |
| Not handling equal values | `5, 5, 3` breaks some logic | Use `<=` not `<` |
| Returning instead of printing | Assignment says display | Use `System.out.println` |

---

## Starter Code (The Script)

**[Download SortThreeNumbers.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/assignments/assignment6-sorted/SortThreeNumbers.java)**

Right-click -> Save Link As

---

*This assignment is instructor-authored intellectual property.*
