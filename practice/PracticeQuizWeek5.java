import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * COP2250 Practice Quiz - Weeks 1-5
 * Topics: Terminal, Ch1-4 (Intro, Elementary, Selections, Math/Chars/Strings)
 * 
 * Use this to practice for picker quizzes!
 * 
 * Compile: javac PracticeQuizWeek5.java
 * Run: java PracticeQuizWeek5
 */
public class PracticeQuizWeek5 {

    // Format: {category, topic, question, answer}
    private static final String[][] QUESTIONS = {
        // === TERMINAL (5) ===
        {"TERMINAL", "pwd",           
         "What does 'pwd' stand for and what does it show?",
         "Print Working Directory. Shows the full path of your current location."},
        
        {"TERMINAL", "ls vs ls -la",  
         "What's the difference between 'ls' and 'ls -la'?",
         "ls shows files/folders. ls -la shows ALL files (including hidden) with details (permissions, size, date)."},
        
        {"TERMINAL", "cd",            
         "How do you go up one directory? How do you go to home?",
         "cd ..  (up one level) | cd ~  (home directory)"},
        
        {"TERMINAL", "compile & run", 
         "What two commands compile and run a Java file called Hello.java?",
         "javac Hello.java  (compile) | java Hello  (run, no .java extension)"},
        
        {"TERMINAL", "mkdir & touch", 
         "How do you create a folder called 'lab5' and a file called 'Test.java' inside it?",
         "mkdir lab5 | cd lab5 | touch Test.java  (or: mkdir lab5 && touch lab5/Test.java)"},

        // === CHAPTER 1 - INTRO (3) ===
        {"CH1", "main method",     
         "T/F: Every Java program must have a method named 'main'.",
         "TRUE. The main method is the entry point: public static void main(String[] args)"},
        
        {"CH1", "println",         
         "What's the difference between print() and println()?",
         "print() stays on same line. println() adds a newline after printing."},
        
        {"CH1", "syntax",          
         "DEMO: Write a complete Hello World program from memory.",
         "public class Hello {\n    public static void main(String[] args) {\n        System.out.println(\"Hello World\");\n    }\n}"},

        // === CHAPTER 2 - ELEMENTARY (4) ===
        {"CH2", "data types",      
         "Name three primitive data types in Java.",
         "int, double, boolean, char, byte, short, long, float (any 3)"},
        
        {"CH2", "Scanner",         
         "DEMO: Show how to create a Scanner and read an integer from the user.",
         "Scanner input = new Scanner(System.in);\nint num = input.nextInt();"},
        
        {"CH2", "operators",       
         "What's the difference between / and % for integers?",
         "/ gives quotient (5/2 = 2). % gives remainder (5%2 = 1)."},
        
        {"CH2", "assignment",      
         "T/F: The statement 'x = x + 5;' can be written as 'x += 5;'",
         "TRUE. Compound assignment operators: +=, -=, *=, /=, %="},

        // === CHAPTER 3 - SELECTIONS (4) ===
        {"CH3", "if-else",         
         "DEMO: Write an if-else that prints 'adult' if age >= 18, else 'minor'.",
         "if (age >= 18) {\n    System.out.println(\"adult\");\n} else {\n    System.out.println(\"minor\");\n}"},
        
        {"CH3", "boolean",         
         "What are the two possible values of a boolean variable?",
         "true and false (lowercase, no quotes)"},
        
        {"CH3", "comparison",      
         "What operator checks if two values are equal? What's the mistake beginners make?",
         "== checks equality. Mistake: using = (assignment) instead of == (comparison)."},
        
        {"CH3", "switch",          
         "T/F: A switch statement can be used with String values in Java.",
         "TRUE. Since Java 7, switch works with String, int, char, and enums."},

        // === CHAPTER 4 - MATH/CHARS/STRINGS (4) ===
        {"CH4", "Math.random",     
         "What range of values does Math.random() return?",
         "0.0 (inclusive) to 1.0 (exclusive). Example: 0.0 <= value < 1.0"},
        
        {"CH4", "char",            
         "DEMO: Declare a char variable and assign it the letter 'A'.",
         "char letter = 'A';  (single quotes for char, double quotes for String)"},
        
        {"CH4", "String methods",  
         "Name two methods you can call on a String.",
         "length(), charAt(), toUpperCase(), toLowerCase(), substring(), equals(), contains(), indexOf() (any 2)"},
        
        {"CH4", "Character class", 
         "T/F: Character.isDigit('5') returns true.",
         "TRUE. Character class methods: isDigit(), isLetter(), isUpperCase(), isLowerCase(), toUpperCase()"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Shuffle questions
        ArrayList<String[]> questionList = new ArrayList<>();
        for (String[] q : QUESTIONS) questionList.add(q);
        Collections.shuffle(questionList);

        int questionIndex = 0;
        int correct = 0;
        int total = 0;
        boolean showingQuestion = true;

        System.out.println("\n========================================");
        System.out.println("  COP2250 PRACTICE QUIZ - Weeks 1-5");
        System.out.println("  " + QUESTIONS.length + " questions");
        System.out.println("========================================");
        System.out.println("  ENTER = reveal answer / next");
        System.out.println("  Y = got it right | N = got it wrong");
        System.out.println("  R = reshuffle | Q = quit");
        System.out.println("========================================\n");

        while (questionIndex < questionList.size()) {
            String[] question = questionList.get(questionIndex);
            
            String category = question[0];
            String topic = question[1];
            String prompt = question[2];
            String answer = question[3];

            if (showingQuestion) {
                // Display question
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("  Question " + (questionIndex + 1) + " of " + questionList.size());
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("  [" + category + "] " + topic);
                System.out.println();
                System.out.println("  " + prompt);
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.print("\n  [ENTER to reveal answer] > ");
                
                String input = scanner.nextLine().trim().toLowerCase();
                
                if (input.equals("q")) {
                    break;
                } else if (input.equals("r")) {
                    Collections.shuffle(questionList);
                    questionIndex = 0;
                    correct = 0;
                    total = 0;
                    System.out.println("\n*** RESHUFFLED ***\n");
                    continue;
                } else {
                    showingQuestion = false;
                }
            } else {
                // Display answer
                System.out.println();
                System.out.println("  ✓ ANSWER:");
                System.out.println("  ─────────");
                for (String line : answer.split("\n")) {
                    System.out.println("  " + line);
                }
                System.out.println();
                System.out.print("  Did you get it right? (Y/N or ENTER to skip) > ");
                
                String input = scanner.nextLine().trim().toLowerCase();
                
                if (input.equals("q")) {
                    break;
                } else if (input.equals("r")) {
                    Collections.shuffle(questionList);
                    questionIndex = 0;
                    correct = 0;
                    total = 0;
                    showingQuestion = true;
                    System.out.println("\n*** RESHUFFLED ***\n");
                    continue;
                } else if (input.equals("y")) {
                    correct++;
                    total++;
                    System.out.println("  ✓ Nice!\n");
                } else if (input.equals("n")) {
                    total++;
                    System.out.println("  ✗ Review this one.\n");
                }
                
                questionIndex++;
                showingQuestion = true;
            }
        }

        // Final score
        System.out.println("\n========================================");
        System.out.println("  SESSION COMPLETE");
        System.out.println("========================================");
        if (total > 0) {
            int percent = (correct * 100) / total;
            System.out.println("  Score: " + correct + "/" + total + " (" + percent + "%)");
        }
        System.out.println("  Keep practicing!");
        System.out.println("========================================\n");

        scanner.close();
    }
}
