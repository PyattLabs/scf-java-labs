# Assignment 3: The Players

**Rock-Paper-Scissors Game**  
**COP2250 Java Programming | Pyatt Labs**

---

## Cast of Characters

| Player | Role | Example |
|--------|------|---------|
| `String[]` | Array holding the choices | `{"Scissor", "Rock", "Paper"}` |
| `Random` | Generates computer's choice | `rand.nextInt(3)` returns 0, 1, or 2 |
| `Scanner` | Gets user's choice | `input.nextInt()` |
| `if/else` | Determines winner | Compares user vs computer |

---

## The Array Setup

```java
String[] choices = {"Scissor", "Rock", "Paper"};
//                     0          1        2
```

**Index mapping:**
- 0 = Scissor
- 1 = Rock  
- 2 = Paper

---

## Random Number Generation

```java
import java.util.Random;

Random rand = new Random();
int computer = rand.nextInt(3);  // Returns 0, 1, or 2
```

---

## Getting User Input

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("scissor (0), rock (1), paper (2): ");
int user = input.nextInt();
```

---

## Game Logic

| User | Computer | Result |
|------|----------|--------|
| Scissor (0) | Paper (2) | User wins |
| Scissor (0) | Rock (1) | Computer wins |
| Rock (1) | Scissor (0) | User wins |
| Rock (1) | Paper (2) | Computer wins |
| Paper (2) | Rock (1) | User wins |
| Paper (2) | Scissor (0) | Computer wins |
| Same | Same | Draw |

---

## User Wins Condition

```java
(user == 0 && computer == 2) ||  // scissor cuts paper
(user == 1 && computer == 0) ||  // rock smashes scissor
(user == 2 && computer == 1)     // paper wraps rock
```

---

## Sample Output

```
scissor (0), rock (1), paper (2): 1
The computer is paper. You are rock. Computer wins!
```

```
scissor (0), rock (1), paper (2): 2
The computer is rock. You are paper. You won!
```

---

## Common Mistakes

| Mistake | Fix |
|---------|-----|
| Forgetting imports | `import java.util.Random;` and `import java.util.Scanner;` |
| Wrong nextInt | `nextInt(3)` gives 0, 1, or 2 |
| Array index confusion | Index 0 = Scissor, 1 = Rock, 2 = Paper |

---

*This assignment is instructor-authored intellectual property.*
