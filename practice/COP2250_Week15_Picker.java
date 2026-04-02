import java.util.Random;

/**
 * COP2250_Week15_Picker.java
 * Week 15 - Sprint 3 + Playtest
 * Game project questions only
 */
public class COP2250_Week15_Picker {

    static String[] students = {
        "Diego", "Kayde", "Artem", "Edgar", "Duffy",
        "Ayan", "Maria", "Draden", "Michael", "Vel",
        "Jayden", "Christina", "Ryan", "Thanh", "Veronica"
    };

    static String[] questions = {
        // Sprint 3 status
        "Compile and run your game right now.",
        "Demonstrate your end condition.",
        "Show me invalid input being handled without a crash.",
        "Show me your interface. Which class implements it?",
        "Walk me through one full game loop from start to end condition.",

        // OOP requirements
        "Which class is abstract in your game? What abstract methods does it declare?",
        "Show me two concrete subclasses of your abstract class.",
        "Where is method overriding happening in your game?",
        "Where is composition used in your game?",
        "Which class owns the game loop? Show me that class.",

        // Code ownership
        "Which classes did you personally write?",
        "Explain the responsibility of one class you wrote.",
        "Walk me through the constructor of your most complex class.",
        "What is the hardest bug you fixed this sprint?",
        "What would you do differently if you started over?",

        // Defense prep
        "Explain what your game does in one sentence.",
        "What is the win condition of your game?",
        "What happens when the player loses?",
        "How does your game handle player input?",
        "What Java concepts from this semester appear in your game?"
    };

    public static void main(String[] args) {
        Random rand = new Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("  COP 2250 - Week 15 Picker");
        System.out.println("  Sprint 3 + Playtest Prep");
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
