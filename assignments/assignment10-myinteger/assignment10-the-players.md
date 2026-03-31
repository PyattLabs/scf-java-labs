# Assignment 10 — MyInteger
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## The Problem

Design a class named `MyInteger` (Liang 10.3).

The class wraps a single `int` value and exposes methods to inspect and compare it.

---

## The Players

### `MyInteger`

| Member | Type | Description |
|---|---|---|
| `value` | `private int` | The stored integer |
| `MyInteger(int value)` | constructor | Stores the value |
| `getValue()` | `int` | Returns the stored value |
| `isEven()` | `boolean` | Returns true if value is even |
| `isOdd()` | `boolean` | Returns true if value is odd |
| `isPrime()` | `boolean` | Returns true if value is prime |
| `isEven(int n)` | `static boolean` | Returns true if n is even |
| `isOdd(int n)` | `static boolean` | Returns true if n is odd |
| `isPrime(int n)` | `static boolean` | Returns true if n is prime |
| `isEven(MyInteger m)` | `static boolean` | Returns true if m's value is even |
| `isOdd(MyInteger m)` | `static boolean` | Returns true if m's value is odd |
| `isPrime(MyInteger m)` | `static boolean` | Returns true if m's value is prime |
| `equals(int n)` | `boolean` | Returns true if value == n |
| `equals(MyInteger m)` | `boolean` | Returns true if value == m's value |
| `parseInt(String s)` | `static int` | Converts String to int |
| `parseInt(char[] chars)` | `static int` | Converts char array to int |

---

## The Rules

- Do NOT use `Integer.parseInt()` in your own `parseInt` implementations
- Static methods must work without creating a `MyInteger` object
- Both `parseInt` methods must handle multi-digit numbers
- Your `main` method must demonstrate every method with printed output

---

## Demo Requirement

You must screen-share and:
1. Open `MyInteger.java` in `micro`
2. Compile and run live — no pre-compiled `.class` files
3. Be prepared to explain any method when asked
4. Explain the difference between instance and static methods in your own words

---

## Submission

Submit `MyInteger.java` via Canvas by the due date.
