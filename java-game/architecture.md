# Architecture Guide
**COP 2250 — Terminal Game Project** | Pyatt Labs @ SCF

This page shows a general architecture for a terminal-based Java game. Your team's architecture will differ based on your game type — use this as a reference, not a template.

---

## General Class Hierarchy

The diagram below shows a sample RPG architecture. A Blackjack game, quiz engine, or other game type will have different class names but must follow the same OOP principles: abstract classes, inheritance, composition, and interfaces.
```
GameEngine
├── World
│   └── Room
│       └── Exit
├── Character (abstract)
│   ├── Player
│   └── NPC
└── Item (abstract)
    ├── Weapon
    └── Key
```

---

## Class Responsibilities

### GameEngine
The main controller. Holds a reference to the active `Player` and the `World`. Contains the main game loop — reads input, routes commands, and updates state.
```java
public class GameEngine {
    private Player player;
    private World world;
    private boolean running;

    public void start() { ... }
    private void processCommand(String input) { ... }
}
```

---

### World
Owns and connects all `Room` objects. Responsible for bootstrapping the map on startup.
```java
public class World {
    private Map<String, Room> rooms;

    public Room getRoom(String id) { ... }
    public void buildWorld() { ... }
}
```

---

### Room
Holds a description, a map of exits, and a list of items present. Core navigation unit.
```java
public class Room {
    private String description;
    private Map<String, Exit> exits;
    private List<Item> items;

    public Exit getExit(String direction) { ... }
    public void describe() { ... }
}
```

---

### Exit
Connects two rooms. Can be locked — requires a matching key item to unlock.
```java
public class Exit {
    private String direction;
    private Room destination;
    private boolean locked;
    private String keyId;

    public boolean isLocked() { ... }
    public boolean unlock(String keyId) { ... }
    public Room getDestination() { ... }
}
```

---

### Character (abstract)
Base class for all living entities. Holds shared state — name, health, inventory.
```java
public abstract class Character {
    protected String name;
    protected int health;
    protected List<Item> inventory;

    public abstract void interact();
}
```

---

### Player extends Character
The human-controlled entity. Tracks current room and overrides `interact()` for player-specific behavior.
```java
public class Player extends Character {
    private Room currentRoom;

    @Override
    public void interact() { ... }

    public void move(String direction) { ... }
    public void pickUp(Item item) { ... }
}
```

---

### NPC extends Character
A non-player character. Cycles through dialogue on interaction.
```java
public class NPC extends Character {
    private String[] dialogue;
    private int index = 0;

    @Override
    public void interact() {
        System.out.println(name + ": " + dialogue[index++ % dialogue.length]);
    }
}
```

---

### Item (abstract)
Base class for all collectible objects. Subclasses define what `use()` does.
```java
public abstract class Item {
    protected String name;
    protected String description;

    public abstract void use(Player player);
}
```

---

### Weapon extends Item
Deals damage to a target character.
```java
public class Weapon extends Item {
    private int damage;

    @Override
    public void use(Player player) { ... }
}
```

---

### Key extends Item
Unlocks a matching exit when used.
```java
public class Key extends Item {
    private String targetExitId;

    @Override
    public void use(Player player) { ... }
}
```

---

## Interface Example

At least one interface is required. Here are two common candidates:
```java
public interface Interactable {
    void interact();
}

public interface Scoreable {
    int getScore();
}
```

`Interactable` works well on `NPC` and `Item`. `Scoreable` works well in card or quiz games where multiple objects need to report a numeric score.

---

## Relationship Types

| Relationship | Example | Meaning |
|---|---|---|
| Inheritance | `Player extends Character` | Player IS-A Character |
| Composition | `GameEngine` holds a `World` | GameEngine HAS-A World |
| Aggregation | `Room` holds a list of `Item` | Room contains Items |
| Interface | `NPC implements Interactable` | NPC fulfills a contract |

---

> Return to [Project Overview](java-game/README.md) | [Stage Examples](java-game/examples.md)
