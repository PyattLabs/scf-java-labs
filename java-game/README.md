# Terminal Game Project
**COP 2250 — Java Programming** | Pyatt Labs @ SCF
**Format:** Team Project (2–3 students) | **Delivery:** Terminal-based Java application

---

## Overview

This project is your chance to build something real.

Over the next several weeks your team will design and develop an original interactive game entirely in Java — from concept to playable product. You will not be handed a template. You will not be filling in blanks. You are the designer, the architect, and the developer.

**You choose the type of game.** A text-based RPG with rooms and characters. A card game like Blackjack. A quiz engine. A dungeon crawler. A strategy simulation. The subject is yours — the engineering requirements are not.

This project is structured the same way software is built in the real world: you start with an idea, document your thinking, design your system, and build it incrementally. Each stage feeds the next. If you skip a stage or treat it as a checkbox, the next stage will show it.

The game runs in the terminal. No GUI is required. But by the end, you should be able to answer the question: *"How would this work with a GUI?"* That question is part of your final evaluation.

**Simple to start. Hard to fake. Depth is always rewarded.**

> See [Stage Examples](java-game/examples.md) for concrete examples of each deliverable across different game types.

---

## Teams

| Team | HedgeDoc Workspace |
|---|---|
| RPG | http://68.183.107.172:3003/XALzzW0rRUiEYsJAqIlxXQ |
| Maria & Vel | http://68.183.107.172:3003/b3EmZSt0Q7mrQCX7i9lDMw |
| Jayden & Draden | http://68.183.107.172:3003/2tTSOxfPSk2r81jqpswF0Q |
| Kayde, Diego, Ryan & Edgar | http://68.183.107.172:3003/Rzsv3GxhQbCCVpiKOf2mHA |

- Teams of **2–3 students**, confirmed with instructor
- Edit history on HedgeDoc is visible to the instructor — contribution is tracked
- If a team member is not contributing, that will be reflected in their individual grade

---

## Project Timeline

![Project Timeline](java-game/project-timeline.svg)

---

## Stages

### Stage 1 — Game Design Document

**What it is:** A 1–3 page written document describing your game at a high level. No code. No class names. Just the concept.

**What to include:**

- Game title and one-sentence pitch
- Game type and genre
- Core mechanics — how does the player interact with the program?
- Win condition, lose condition, or end state
- The main entities in your game
- What actions can the player take?

**Deliverable:** PDF or Markdown posted to your team HedgeDoc and submitted via Canvas.

---

### Stage 2 — Architecture Document

**What it is:** A written technical document that translates your GDD into a class design.

**What to include:**

- A class hierarchy diagram — hand-drawn, diagramming tool, or ASCII
- A written description of each class: responsibility, fields, methods, relationships
- Which classes are abstract and why
- Which interfaces you plan to implement and why

**Deliverable:** PDF or Markdown posted to your team HedgeDoc and submitted via Canvas.

---

### Stage 3 — Team Charter and HedgeDoc Setup

**What to include:**

- Who is responsible for which classes
- How your team will communicate outside of class
- How you will handle disagreements
- A signed acknowledgment from all members

**Deliverable:** Posted to your team HedgeDoc before Sprint 1.

---

### Stage 4 — Sprint Builds

#### Sprint 1 — Core Classes Running
*Week 13 | Chapter 12: Exception Handling*

- At least 3 distinct classes defined with fields and constructors
- A `main` method launches the program and produces output
- At least one class manages state
- Basic player input is handled

#### Sprint 2 — Inheritance and Object Relationships
*Week 14 | Chapter 13: Interfaces*

- At least one abstract class with 2+ concrete subclasses
- Subclasses override at least one method
- At least one composition relationship
- Core game loop functional

#### Sprint 3 — Feature Complete
*Week 15 | Chapter 14/15*

- All invalid input handled gracefully
- At least one interface implemented
- Win/lose/end condition functional
- Code organized, commented, readable

---

### Stage 5 — Playtest
*Week 15*

Teams swap games during class. Write 3–5 sentences of feedback per team.

---

### Stage 6 — Final Demo and Defense
*Week 16*

Live demo + individual technical questioning. Every team member must be able to explain any part of the codebase.

**GUI Reflection** (written, one paragraph per person):
> *"If you were to add a graphical user interface to this game, what Java framework would you use, how would the architecture need to change, and what would be the first three UI components you would build?"*

---

## Core OOP Requirements

| Requirement | Minimum |
|---|---|
| Distinct classes | 4 or more |
| Abstract class | 1 or more, with 2+ concrete subclasses |
| Method override | At least 1 |
| Composition | At least 1 |
| Interface | At least 1 |
| Exception handling | Required — no crashes on bad input |
| Game loop | Required |
| End condition | Required |
| GUI reflection | Required from every team member |

---

## Grading

| Stage | Weight |
|---|---|
| Stage 1 — Game Design Document | 10% |
| Stage 2 — Architecture Document | 15% |
| Stage 3 — Team Charter | 5% |
| Stage 4 — Sprint Checkpoints (3 × 10%) | 30% |
| Stage 5 — Playtest Feedback | 5% |
| Stage 6 — Final Demo (group) | 20% |
| Stage 6 — Individual Defense + GUI Reflection | 15% |

---

## A Note on Confidence

Many of you said you were unsure whether you could do this.

That is the right feeling to have before starting something real. Uncertainty means the stakes are real. It means you are actually learning something new.

You have everything you need. Start simple. Get it running. Then make it better.

That is how software is built.

— Professor Pyatt
