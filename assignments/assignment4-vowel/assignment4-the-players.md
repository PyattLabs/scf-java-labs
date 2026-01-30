# Assignment 4: The Players

**Vowel or Consonant Checker**  
**COP2250 Java Programming | Pyatt Labs**

---

## Cast of Characters

| Player | Role | Example |
|--------|------|---------|
| `char` | Stores single character | `char ch = 'A';` |
| `Scanner` | Gets user input | `input.nextLine()` |
| `Character.isLetter()` | Checks if letter | Returns `true` or `false` |
| `Character.toLowerCase()` | Converts to lowercase | `'A'` → `'a'` |

---

## Reading a Character

Scanner doesn't have `nextChar()`. Use this pattern:

```java
Scanner input = new Scanner(System.in);
System.out.print("Enter a letter: ");
String s = input.nextLine();
char ch = s.charAt(0);
```

---

## Checking if Letter

```java
if (Character.isLetter(ch)) {
    // It's a letter (a-z or A-Z)
} else {
    // Not a letter - invalid input
}
```

---

## Checking for Vowels

**Vowels:** a, e, i, o, u (and uppercase versions)

```java
char lower = Character.toLowerCase(ch);

if (lower == 'a' || lower == 'e' || lower == 'i' 
    || lower == 'o' || lower == 'u') {
    // It's a vowel
} else {
    // It's a consonant
}
```

**Why convert to lowercase?**
- Only check 5 letters instead of 10
- Works for both 'A' and 'a'

---

## Program Logic

```
1. Prompt for input
2. Read character
3. Is it a letter?
   - NO  → Print "invalid input"
   - YES → Is it a vowel?
           - YES → Print "X is a vowel"
           - NO  → Print "X is a consonant"
```

---

## Sample Output

```
Enter a letter: a
a is a vowel
```

```
Enter a letter: B
B is a consonant
```

```
Enter a letter: 5
5 is invalid input
```

---

## Common Mistakes

| Mistake | Fix |
|---------|-----|
| Forgetting to import Scanner | `import java.util.Scanner;` |
| Using `nextChar()` | Use `nextLine().charAt(0)` |
| Not handling uppercase | Convert to lowercase first |
| Checking 10 vowels | Convert to lowercase, check 5 |
| Forgetting the invalid case | Check `isLetter()` first |

---

## Starter Code

**[Download VowelConsonant.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/assignments/assignment4-vowel/VowelConsonant.java)**

Right-click → Save Link As

---

*This assignment is instructor-authored intellectual property.*
