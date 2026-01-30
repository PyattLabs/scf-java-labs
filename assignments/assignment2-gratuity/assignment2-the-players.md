# Assignment 2: The Players

**Gratuity Calculator**

COP2250 Java Programming  
Kevin Pyatt, Ph.D. | Pyatt Labs

---

## The Cast

| Player | Role | Example |
|--------|------|---------|
| `Scanner` | Reads user input | `Scanner input = new Scanner(System.in);` |
| `double` | Stores decimal numbers | `double subtotal = 10.00;` |
| `System.out.print()` | Prompts without newline | `System.out.print("Enter value: ");` |
| `System.out.printf()` | Formatted output | `System.out.printf("Total: $%.2f%n", total);` |
| `nextDouble()` | Reads decimal from user | `double x = input.nextDouble();` |

---

## The Formula

```
gratuity = subtotal × (gratuityRate / 100)
total = subtotal + gratuity
```

**Example:**
- Subtotal: $10.00
- Gratuity Rate: 15%
- Gratuity: $10.00 × 0.15 = $1.50
- Total: $10.00 + $1.50 = $11.50

---

## Formatting Output

**Problem:** `System.out.println(1.50)` might print `1.4999999999999`

**Solution:** Use `printf` with format specifier

```java
System.out.printf("Gratuity: $%.2f%n", gratuity);
System.out.printf("Total: $%.2f%n", total);
```

| Specifier | Meaning |
|-----------|---------|
| `%f` | Floating point number |
| `%.2f` | Float with 2 decimal places |
| `%n` | Newline (cross-platform) |

---

## The Script (Pseudocode)

```
1. Import Scanner
2. Create Scanner object
3. Prompt → Read subtotal
4. Prompt → Read gratuity rate
5. Calculate gratuity
6. Calculate total
7. Display gratuity
8. Display total
9. Close Scanner
```

---

## Common Mistakes

| Mistake | Problem | Fix |
|---------|---------|-----|
| Forgot import | `cannot find symbol: Scanner` | Add `import java.util.Scanner;` |
| Used `15` not `0.15` | Gratuity is $150 instead of $1.50 | Divide rate by 100 |
| Used `print` for output | Results run together | Use `println` or `printf` |
| Forgot to close Scanner | Resource leak warning | Add `input.close();` |

---

© 2026 Kevin Pyatt, Ph.D. | Pyatt Labs
