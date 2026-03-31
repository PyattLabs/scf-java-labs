# Game Design Concepts
**COP 2250 — Terminal Game Project** | Pyatt Labs @ SCF

This page covers key game design and software architecture concepts you will need for your project. Use it as a reference when writing your Stage 1 GDD and Stage 2 Architecture Document.

---

## Core Game Design Terms

### Game Design Document (GDD)
A written description of your game at a high level — before any code is written. Answers: what is this game, who plays it, what do they do, and how does it end. Your Stage 1 deliverable is a GDD.

### Core Mechanic
The primary action the player takes repeatedly. In Blackjack: draw or stand. In an RPG: move and fight. In a quiz engine: answer questions. If you can't state your core mechanic in one sentence, your design is not ready.

### Win Condition / End State
The event that terminates the game in a defined outcome. A game without an end state is not a game — it is a loop. Every game in this project must have one.

### Entities
The things that exist in your game world. A player, an enemy, a room, a card, a question, an item. Each entity is a candidate for a class. If you find yourself writing the same fields in two places, those two things probably share a superclass.

### Game Loop
The repeating cycle that drives the game forward:
```
while (game is running) {
    display current state
    get player input
    process input
    update state
    check end condition
}
```
Your `GameEngine` (or equivalent) owns the game loop.

### State
The current condition of the game at any point in time. Includes player health, score, position, inventory, turn count — anything that changes during play. One class should be responsible for managing and updating state.

---

## Architecture Terms

### Class Hierarchy
The tree of classes in your program and how they relate through inheritance. Drawn before code is written. If your hierarchy changes significantly after you start coding, your Stage 2 document was not finished.

### Abstract Class
A class that cannot be instantiated directly. It defines shared behavior and fields for its subclasses. Use when two or more concrete classes share structure but the parent version alone makes no sense.

```java
abstract class Character {
    protected String name;
    protected int health;
    public abstract void attack(); // subclasses must implement
}
```

### Concrete Subclass
A class that extends an abstract class and provides implementations for all abstract methods. `Player` and `NPC` are concrete subclasses of `Character`.

### Composition
One class holds a reference to another class as a field. `GameEngine` does not extend `World` — it contains a `World`. Use composition when the relationship is "has-a" not "is-a".

```java
public class GameEngine {
    private World world;   // composition
    private Player player; // composition
}
```

### Interface
A contract. Defines method signatures without implementation. A class that implements an interface promises to provide those methods. Use when unrelated classes need to share behavior.

```java
interface Attackable {
    void takeDamage(int amount);
}
```

### Responsibility
What one class is in charge of. A class with too many responsibilities is hard to debug and extend. Ask: *"If I describe this class in one sentence, does it have more than one job?"* If yes, split it.

---

## Replayability

Replayability is the degree to which a player's second run differs meaningfully from their first.

### Design Decision: Who Owns the Randomness?

Two valid approaches:

**Option A — World builds itself**
`World` uses `Random` internally to build the map on startup. Simple. Harder to test.

```java
public class World {
    private Random rand = new Random();
    public void buildWorld() {
        // world generates its own random rooms
    }
}
```

**Option B — MapGenerator hands World a finished map**
A separate `MapGenerator` class handles all randomness and passes a complete room structure to `World`. `World` just stores and connects rooms. Easier to test and swap out.

```java
public class MapGenerator {
    public Map<String, Room> generate(int seed) { ... }
}

public class World {
    private Map<String, Room> rooms;
    public World(Map<String, Room> rooms) {
        this.rooms = rooms; // receives finished map
    }
}
```

**The architecture question:** If you want replayability, your Stage 2 document must identify which class owns the randomness and justify the choice. A design disagreement that lives only in conversation is not a design decision — it needs to be on paper.

### Sources of Replayability
- **Procedural generation** — rooms, enemies, or items created randomly each run
- **Randomized stats** — enemy health, damage, or loot varies per run
- **Branching paths** — player choices lead to different outcomes
- **Random event pools** — draw from a set of possible events rather than a fixed sequence

---

## Common Architecture Mistakes

| Mistake | Problem | Fix |
|---|---|---|
| Everything in `main` | Untestable, unextendable | Split into classes with single responsibilities |
| `Player` manages the game loop | Player should not know about the game engine | Move loop to `GameEngine` |
| Hardcoded room descriptions | No replayability, hard to expand | Store in data structure or generate procedurally |
| Abstract class with no abstract methods | Not actually abstract | Add at least one method subclasses must implement |
| Composition replaced with inheritance | `GameEngine extends World` makes no sense | Use "is-a" vs "has-a" test |

---

## Is-A vs Has-A Test

Before deciding whether to use inheritance or composition, ask:

- **Is-A:** A `Player` is a `Character`. Use `extends`.
- **Has-A:** A `GameEngine` has a `World`. Use a field.

If you get this backwards your hierarchy will fight you for the rest of the project.

---

## Questions Your Stage 2 Document Must Answer

1. What are your classes? List every one.
2. What does each class own and what does each class do?
3. Which class is abstract and why?
4. Which class owns the game loop?
5. Which class manages player state?
6. If your game has replayability — which class owns the randomness?
7. Where does input come from and which class processes it?
8. What is your end condition and which class checks for it?

---

*Reference document — update as your design evolves.*
