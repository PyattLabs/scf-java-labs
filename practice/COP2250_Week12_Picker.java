import java.util.Random;

/**
 * COP2250_Week12_Picker.java
 * Week 12 - Inheritance and Polymorphism
 */
public class COP2250_Week12_Picker {

    static String[] students = {
        "Diego", "Kayde", "Artem", "Edgar", "Duffy",
        "Ayan", "Maria", "Draden", "Michael", "Vel",
        "Jayden", "Christina", "Ryan", "Thanh", "Veronica"
    };

    static String[] questions = {
        // Terminal
        "What command compiles multiple Java files at once?",
        "How do you run a program that depends on multiple compiled classes?",
        "What does git status show you?",

        // Inheritance basics
        "What keyword do you use to inherit from another class in Java?",
        "What does super() do inside a constructor?",
        "Can a subclass access private fields of its superclass directly?",
        "What is the difference between overriding and overloading?",
        "If Triangle extends GeometricObject, what does Triangle automatically have?",
        "What does @Override do and why should you use it?",
        "Can you instantiate an abstract class directly?",

        // Method lookup
        "If both the parent and child have a toString() method, which one gets called on a child object?",
        "How do you call the parent's toString() from inside the child's toString()?",
        "What happens if you forget to call super() in a subclass constructor?",

        // Heron's formula
        "Walk me through Heron's formula for triangle area.",
        "What is the perimeter of a triangle with sides 3, 4, and 5?",
        "What is the area of a triangle with sides 3, 4, and 5?",

        // Polymorphism
        "What is polymorphism? Give an example using Shape and Triangle.",
        "Can you store a Triangle object in a GeometricObject variable?",
        "If you have a GeometricObject reference pointing to a Triangle, which getArea() gets called?",

        // Game project
        "What is your team's game called and what is the one-sentence pitch?",
        "Name one abstract class in your game architecture and explain why it is abstract.",
        "What is the difference between composition and inheritance? Give an example from your game.",
        "Which class in your game owns the game loop?",
        "What is your game's end condition?"
    };

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("  COP 2250 - Week 12 Picker");
        System.out.println("  Inheritance + Polymorphism");
        System.out.println("===========================================");
        System.out.println("Press ENTER to pick. Type 'q' to quit.\n");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) break;

            String student = students[rand.nextInt(students.length)];
            String question = questions[rand.nextInt(questions.length)];

            System.out.println("\n-------------------------------------------");
            System.out.println("  STUDENT : " + student);
            System.out.println("-------------------------------------------");
            System.out.println("  QUESTION: " + question);
            System.out.println("-------------------------------------------\n");
            System.out.println("Press ENTER for next. Type 'q' to quit.");
        }

        System.out.println("\nClass dismissed.");
        scanner.close();
    }
}
