import java.util.Random;

/**
 * COP2250_Week13_Picker.java
 * Week 13 - Exception Handling
 */
public class COP2250_Week13_Picker {

    static String[] students = {
        "Diego", "Kayde", "Artem", "Edgar", "Duffy",
        "Ayan", "Maria", "Draden", "Michael", "Vel",
        "Jayden", "Christina", "Ryan", "Thanh", "Veronica"
    };

    static String[] questions = {
        // Terminal
        "What command do you use to compile multiple Java files at once?",
        "How do you check the exit code of the last command in bash?",

        // Exception basics
        "What is the difference between a checked and an unchecked exception?",
        "Name three unchecked exceptions in Java.",
        "What happens if you do not catch a checked exception?",
        "What is the parent class of all exceptions in Java?",
        "Can you catch Error? Should you?",

        // try-catch-finally
        "What does the finally block guarantee?",
        "Does finally run if an exception is not thrown?",
        "Does finally run if an exception IS thrown and caught?",
        "Does finally run if an exception is thrown and NOT caught?",
        "What is the order of execution in a try-catch-finally block?",

        // throw
        "What is the difference between throw and throws?",
        "Write the syntax for throwing an IllegalArgumentException.",
        "When would you throw an exception manually instead of letting Java throw it?",

        // Multiple catch
        "Can you have more than one catch block for a single try?",
        "If you have two catch blocks, which one runs?",
        "What happens if you put a broader exception before a narrower one in catch blocks?",

        // Assignment specific
        "In ArrayBounds, why does getElement() not catch the exception itself?",
        "What is the difference between NumberFormatException and ArrayIndexOutOfBoundsException?",
        "Walk me through what happens when a user enters 'abc' in your ArrayBounds program.",

        // Game project
        "Where in your game code do you need exception handling?",
        "What happens in your game if the user enters invalid input?",
        "Show me your Sprint 1 code compiling and running right now."
    };

    public static void main(String[] args) {
        Random rand = new Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("  COP 2250 - Week 13 Picker");
        System.out.println("  Exception Handling");
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
