# Project Stage Examples
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

Two game types are shown throughout: a text RPG and a Blackjack game. Both are valid. Both must meet the same OOP requirements.

---

## Stage 1 — Game Design Document

### Example A: Text RPG — "The Forgotten Lab"

**Pitch:** A lone scientist wakes up in an abandoned research facility and must find a way out.

**Game type:** Text-based adventure

**Core mechanics:** Navigate rooms with directional commands, pick up items, unlock areas, talk to NPCs.

**Win condition:** Reach the exit with the keycard.

**Lose condition:** Health reaches zero.

**Entities:** Player, Room, Exit, Item (Keycard, Medkit), NPC

**Actions:** go [direction], pick up [item], use [item], talk [npc], look

---

### Example B: Card Game — "Terminal Blackjack"

**Pitch:** A fully playable Blackjack game for one human player against a simulated dealer.

**Game type:** Card game simulation

**Core mechanics:** Player hits or stands. Dealer draws to 17. Closest to 21 wins.

**Win condition:** Beat dealer without busting.

**Lose condition:** Bust or dealer wins.

**Entities:** Card, Deck, Hand, HumanPlayer, Dealer, Game

**Actions:** hit, stand, new game

---

## Stage 2 — Architecture Document

### Example A: RPG Hierarchy
```
Character (abstract)
├── Player
└── NPC

Item (abstract)
├── Keycard
└── Medkit

Room
Exit
World
GameEngine

Interface: Interactable → NPC, Item
```

### Example B: Blackjack Hierarchy
```
Player (abstract)
├── HumanPlayer
└── Dealer

Card
Deck
Hand
Game

Interface: Scoreable → Hand
```

---

## Stage 4 — Sprint Output Examples

### Sprint 1 — Terminal output

**RPG:**
```
Welcome to The Forgotten Lab.
You are in the Server Room.
Exits: north

> go north
You move into the Corridor.
Exits: south, east
```

**Blackjack:**
```
Your hand: [7 of Hearts, King of Spades]  Value: 17
Dealer shows: [Ace of Diamonds, face down]

Hit or stand? > stand
Dealer reveals: [Ace of Diamonds, 6 of Clubs]
Dealer draws: 4 of Spades — Dealer wins.
```

---

### Sprint 2 — Inheritance in code

**RPG:**
```java
public abstract class Character {
    protected String name;
    protected int health;
    public abstract void interact();
}

public class NPC extends Character {
    private String[] dialogue;
    private int index = 0;

    @Override
    public void interact() {
        System.out.println(name + ": " + dialogue[index++ % dialogue.length]);
    }
}
```

**Blackjack:**
```java
public abstract class Player {
    protected String name;
    protected Hand hand;
    public abstract void takeTurn(Deck deck);
}

public class Dealer extends Player {
    @Override
    public void takeTurn(Deck deck) {
        while (hand.getValue() < 17) {
            hand.addCard(deck.deal());
        }
    }
}
```

---

### Sprint 3 — Exception handling

**RPG:**
```java
public void processCommand(String input) {
    if (input == null || input.isBlank())
        throw new InvalidCommandException("Please enter a command.");
    String[] parts = input.trim().toLowerCase().split(" ", 2);
    switch (parts[0]) {
        case "go"   -> handleMove(parts.length > 1 ? parts[1] : "");
        case "pick" -> handlePickup(parts.length > 1 ? parts[1] : "");
        default     -> System.out.println("Unknown command: " + parts[0]);
    }
}
```

**Blackjack:**
```java
public Card deal() {
    if (cards.isEmpty())
        throw new EmptyDeckException("The deck is out of cards.");
    return cards.remove(cards.size() - 1);
}
```

---

## Stage 6 — GUI Reflection Examples

**RPG:** I would use Java Swing. The main change would be routing `System.out.println()` calls to a `JTextArea`. I'd also replace the Scanner with a `JTextField` for input. First three components: room description panel, inventory sidebar, input bar.

**Blackjack:** I would use JavaFX. The `Game` logic stays the same but output routes to UI nodes. First three components: card display tiles, player and dealer hand panels, Hit/Stand buttons wired to `takeTurn()`.

---

> Return to [Project Overview](java-game/README.md)
