import java.util.Random;

/**
 * COP2250_Week14_Picker.java
 * Week 14 - Abstract Classes and Interfaces
 */
public class COP2250_Week14_Picker {

    static String[] students = {
        "Diego", "Kayde", "Artem", "Edgar", "Duffy",
        "Ayan", "Maria", "Draden", "Michael", "Vel",
        "Jayden", "Christina", "Ryan", "Thanh", "Veronica"
    };

    static String[] questions = {
        // Terminal
        "What command compiles all Java files in the current directory?",
        "How do you run a Java program that has multiple class files?",

        // Abstract classes
        "What is an abstract class? Can you instantiate one directly?",
        "What is the difference between an abstract method and a concrete method?",
        "If a subclass does not implement all abstract methods, what happens?",
        "Can an abstract class have a constructor? Why would you need one?",
        "Can an abstract class have concrete methods?",
        "What keyword do you use to declare an abstract method?",

        // Interfaces
        "What is an interface? How is it different from an abstract class?",
        "What keyword does a class use to implement an interface?",
        "Can a class implement more than one interface?",
        "Can a class extend one class AND implement an interface at the same time?",
        "What happens if a class implements an interface but does not provide all methods?",
        "Can an interface have fields? What type are they by default?",

        // Abstract vs Interface
        "When would you use an abstract class instead of an interface?",
        "When would you use an interface instead of an abstract class?",
        "A class can extend only one class but implement many interfaces -- why does this matter?",

        // Polymorphism
        "Can you store a Circle object in a GeometricObject variable?",
        "Can you call howToColor() on a GeometricObject reference? What do you need to do first?",
        "What is a cast? Show me the syntax for casting a GeometricObject to a Colorable.",

        // Game project
        "Show me your abstract class. What abstract methods does it declare?",
        "Show me a concrete subclass. Which abstract methods does it implement?",
        "Does your game implement any interfaces? Which ones and why?",
        "Show me Sprint 2 compiling and running right now.",
        "Walk me through your game loop."
    };

    public static void main(String[] args) {
        Random rand = new Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("  COP 2250 - Week 14 Picker");
        System.out.println("  Abstract Classes and Interfaces");
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
