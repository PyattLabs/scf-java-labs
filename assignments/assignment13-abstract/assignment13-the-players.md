# Assignment 13 — Abstract Classes and Interfaces
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## The Problem

Design an abstract class `GeometricObject` with two abstract subclasses and one interface (Liang Ch. 13).

---

## The Players

### `Colorable` (interface)
| Member | Description |
|---|---|
| `howToColor()` | Print instructions for coloring this shape |

### `GeometricObject` (abstract class)
| Member | Type | Description |
|---|---|---|
| `color` | `private String` | Color of the object |
| `GeometricObject(String color)` | constructor | Sets color |
| `getColor()` | `String` | Returns color |
| `getArea()` | `abstract double` | Subclass must implement |
| `getPerimeter()` | `abstract double` | Subclass must implement |
| `toString()` | `String` | Returns color, area, perimeter |

### `Circle extends GeometricObject implements Colorable`
| Member | Type | Description |
|---|---|---|
| `radius` | `private double` | Radius of circle |
| `Circle(double radius, String color)` | constructor | Sets radius and color |
| `getArea()` | `double` | Math.PI * radius * radius |
| `getPerimeter()` | `double` | 2 * Math.PI * radius |
| `howToColor()` | `void` | Print "Color the circle with radius [radius]" |

### `Rectangle extends GeometricObject implements Colorable`
| Member | Type | Description |
|---|---|---|
| `width` | `private double` | Width |
| `height` | `private double` | Height |
| `Rectangle(double width, double height, String color)` | constructor | Sets all fields |
| `getArea()` | `double` | width * height |
| `getPerimeter()` | `double` | 2 * (width + height) |
| `howToColor()` | `void` | Print "Color the rectangle with width [w] and height [h]" |

---

## Starter Code

**Download:** [Assignment13.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/assignments/assignment13-abstract/Assignment13.java)

---

## The Rules

- `GeometricObject` must be abstract
- `Circle` and `Rectangle` must both extend `GeometricObject` and implement `Colorable`
- `toString()` in `GeometricObject` must call `getArea()` and `getPerimeter()` — these are abstract so the subclass version runs
- `main` must create one Circle and one Rectangle, print `toString()` for each, and call `howToColor()` on each
- Store both objects in `GeometricObject` references to demonstrate polymorphism

---

## Demo Requirement

You must screen-share and:
1. Compile and run live
2. Explain why `GeometricObject` cannot be instantiated directly
3. Explain what `implements Colorable` requires your class to do
4. Show that a `GeometricObject` reference can point to a `Circle` object

---

## Submission

Submit `Assignment13.java` via Canvas by the due date.
