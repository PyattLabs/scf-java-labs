# Assignment 4: The Players

**Rock-Paper-Scissors Game**  
**COP2250 Java Programming | Pyatt Labs**

---

## 🎭 Cast of Characters

| Player | Role | Example |
|--------|------|---------|
| `String[]` | Array holding the choices | `{"Scissor", "Rock", "Paper"}` |
| `Random` | Generates computer's choice | `rand.nextInt(3)` → 0, 1, or 2 |
| `Scanner` | Gets user's choice | `input.nextInt()` |
| `if/else` | Determines winner | Compares user vs computer |

---

## 📦 The Array Setup

```java
String[] choices = {"Scissor", "Rock", "Paper"};
//                     0          1        2
```

**Index mapping:**
- `0` = Scissor
- `1` = Rock  
- `2` = Paper

---

## 🎲 Random Number Generation

```java
import java.util.Random;

Random rand = new Random();
int computer = rand.nextInt(3);  // Returns 0, 1, or 2
```

| `nextInt(3)` returns | Meaning |
|---------------------|---------|
| `0` | Scissor |
| `1` | Rock |
| `2` | Paper |

---

## ⌨️ Getting User Input

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("scissor (0), rock (1), paper (2): ");
int user = input.nextInt();
```

---

## 🏆 Game Logic

| User | Computer | Result |
|------|----------|--------|
| Scissor (0) | Paper (2) | User wins — scissor cuts paper |
| Scissor (0) | Rock (1) | Computer wins — rock smashes scissor |
| Rock (1) | Scissor (0) | User wins — rock smashes scissor |
| Rock (1) | Paper (2) | Computer wins — paper wraps rock |
| Paper (2) | Rock (1) | User wins — paper wraps rock |
| Paper (2) | Scissor (0) | Computer wins — scissor cuts paper |
| Same | Same | Draw |

### Pattern Recognition

**Scissor (0) beats Paper (2)**  
**Rock (1) beats Scissor (0)**  
**Paper (2) beats Rock (1)**

Notice: Each choice beats the one that comes before it (wrapping around):
- 0 beats 2
- 1 beats 0
- 2 beats 1

---

## 🔧 Conditional Structure

```java
if (user == computer) {
    // It's a draw
} else if ( /* user wins condition */ ) {
    // User wins
} else {
    // Computer wins
}
```

**User wins when:**
- User is Scissor (0) AND Computer is Paper (2)
- User is Rock (1) AND Computer is Scissor (0)
- User is Paper (2) AND Computer is Rock (1)

---

## 📋 Sample Output

```
scissor (0), rock (1), paper (2): 1
The computer is paper. You are rock. Computer wins!
```

```
scissor (0), rock (1), paper (2): 2
The computer is rock. You are paper. You won!
```

```
scissor (0), rock (1), paper (2): 0
The computer is scissor. You are scissor too. It is a draw!
```

---

## ⚠️ Common Mistakes

| Mistake | Fix |
|---------|-----|
| Forgetting to import Random | `import java.util.Random;` |
| Forgetting to import Scanner | `import java.util.Scanner;` |
| Using `nextInt()` wrong | `nextInt(3)` gives 0, 1, or 2 |
| Wrong win conditions | Check the logic table above |
| Off-by-one index errors | Arrays start at index 0 |

---

## 🎯 Your Mission

1. Generate random computer choice (0-2)
2. Prompt user for their choice (0-2)
3. Display what each player chose (use the array!)
4. Determine and display the winner

---

*This assignment is instructor-authored intellectual property.*
