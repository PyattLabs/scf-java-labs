// ============================================
// COP2250 Week 7 — Self-Assessment Quiz
// Methods
// Kevin Pyatt, Ph.D. | Pyatt Labs
// ============================================
// Run in class. Type your answer BEFORE seeing
// the correct one. Generates a report file.
// ============================================

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class COP2250_Week7_Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---- STUDENT INFO ----
        System.out.println("==========================================");
        System.out.println("  COP2250 Week 7 Quiz — Methods");
        System.out.println("==========================================");
        System.out.print("  Enter your full name: ");
        String studentName = scanner.nextLine().trim();
        System.out.println("==========================================\n");

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String fileTimestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        // ---- QUESTIONS: { question, answer } ----
        String[][] allQuestions = {
            {
                "What is the difference between a parameter and an argument?",
                "A parameter is the variable in the method definition (formal). An argument is the value passed when calling the method (actual)."
            },
            {
                "Why would a method be declared void?",
                "Because it performs an action (like printing) but doesn't need to return a value to the caller."
            },
            {
                "What does the return keyword do?",
                "It sends a value back to the caller and immediately exits the method."
            },
            {
                "What happens if you define a method inside main?",
                "Compile error. Java doesn't allow nested methods. Methods go inside the class but outside main."
            },
            {
                "Explain pass-by-value in Java.",
                "Java copies the value of a primitive argument into the parameter — changing the copy inside the method doesn't affect the original."
            },
            {
                "How does Math.min(Math.min(a,b), c) work?",
                "First Math.min(a,b) finds the smaller of a and b. Then Math.min(result, c) compares that with c to find the smallest of all three."
            },
            {
                "What is method overloading?",
                "Having multiple methods with the same name but different parameter types or counts. Java picks the right one based on the arguments."
            },
            {
                "Can you assign the result of a void method to a variable?",
                "No. Void means nothing is returned — there's no value to assign. Example: int x = printGrade(85); is a compile error."
            },
            {
                "What is a sentinel value? (Review)",
                "A special value that signals the end of input. It is not processed as data. Example: 0 in our Number Analyzer."
            },
            {
                "What does n % 10 give you? What about n / 10?",
                "n % 10 gives the last digit (remainder). n / 10 removes the last digit (integer division)."
            },
        };

        // Shuffle and pick 5 questions
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < allQuestions.length; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
        int numQuestions = 5;

        // ---- QUIZ ----
        ArrayList<String[]> results = new ArrayList<>();
        int selfScore = 0;

        for (int i = 0; i < numQuestions; i++) {
            int qIdx = indices.get(i);
            String question = allQuestions[qIdx][0];
            String correctAnswer = allQuestions[qIdx][1];

            System.out.println("------------------------------------------");
            System.out.println("  Question " + (i + 1) + " of " + numQuestions);
            System.out.println("------------------------------------------");
            System.out.println("  " + question);
            System.out.println();
            System.out.print("  YOUR ANSWER: ");
            String studentAnswer = scanner.nextLine().trim();

            System.out.println();
            System.out.println("  CORRECT ANSWER: " + correctAnswer);
            System.out.println();

            System.out.print("  Did you get it right? (y/n): ");
            String selfGrade = scanner.nextLine().trim().toLowerCase();
            boolean correct = selfGrade.startsWith("y");
            if (correct) selfScore++;

            results.add(new String[]{
                question,
                studentAnswer,
                correctAnswer,
                correct ? "YES" : "NO"
            });

            System.out.println();
        }

        // ---- RESULTS ----
        System.out.println("==========================================");
        System.out.println("  RESULTS: " + selfScore + " / " + numQuestions);
        System.out.println("==========================================\n");

        // ---- GENERATE REPORT FILE ----
        String fileName = "quiz_week7_" + studentName.replaceAll("\\s+", "_") + "_" + fileTimestamp + ".txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            out.println("==========================================");
            out.println("  COP2250 Week 7 Quiz Report");
            out.println("==========================================");
            out.println("  Student: " + studentName);
            out.println("  Date:    " + timestamp);
            out.println("  Score:   " + selfScore + " / " + numQuestions);
            out.println("==========================================\n");

            for (int i = 0; i < results.size(); i++) {
                String[] r = results.get(i);
                out.println("Question " + (i + 1) + ": " + r[0]);
                out.println("  Student answer:  " + r[1]);
                out.println("  Correct answer:  " + r[2]);
                out.println("  Self-assessed:   " + r[3]);
                out.println();
            }

            out.println("==========================================");
            out.println("  Generated: " + timestamp);
            out.println("  This report is auto-generated.");
            out.println("==========================================");

            System.out.println("  Report saved: " + fileName);
            System.out.println("  Submit this file to Dr. Pyatt.\n");

        } catch (IOException e) {
            System.out.println("  ERROR: Could not save report file.");
            System.out.println("  Screenshot your terminal instead.\n");
        }

        scanner.close();
    }
}
