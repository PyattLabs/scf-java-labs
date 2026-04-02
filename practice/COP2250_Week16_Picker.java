import java.util.Random;

/**
 * COP2250_Week16_Picker.java
 * Week 16 - Final Defense
 */
public class COP2250_Week16_Picker {

    static String[] students = {
        "Diego", "Kayde", "Artem", "Edgar", "Duffy",
        "Ayan", "Maria", "Draden", "Michael", "Vel",
        "Jayden", "Christina", "Ryan", "Thanh", "Veronica"
    };

    static String[] questions = {
        // Code ownership
        "Which classes did you personally write? Name them.",
        "Open the class you are most proud of and walk me through it.",
        "What is the most complex method you wrote? Explain it line by line.",
        "What was the hardest problem you solved in this project?",

        // OOP defense
        "Why did you use an abstract class instead of a regular class?",
        "What abstract methods does your abstract class declare?",
        "Show me two subclasses. What do they override?",
        "Where is composition in your game? Show me the field.",
        "Where is your interface? Which classes implement it?",
        "What would break if you removed your abstract class?",

        // Game mechanics
        "Walk me through your game loop from start to end condition.",
        "What happens when the player wins?",
        "What happens when the player loses?",
        "Show me how invalid input is handled.",
        "What exception types does your game catch?",

        // Architecture
        "Which class owns the game loop?",
        "Which class manages player state?",
        "If you added a second player, what would you change?",
        "What was the biggest architectural decision your team made?",

        // GUI reflection
        "What Java GUI framework would you use and why?",
        "What would need to change in your architecture to support a GUI?",
        "What are the first three UI components you would build?"
    };

    public static void main(String[] args) {
        Random rand = new Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("  COP 2250 - Week 16 Final Defense");
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

        System.out.println("\nGood luck.");
        scanner.close();
    }
}
