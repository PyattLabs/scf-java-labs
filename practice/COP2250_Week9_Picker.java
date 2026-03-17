/**
 * COP2250_Week9_Picker.java
 * Weighted random picker for Week 9: Multi-Dimensional Arrays
 *
 * 8 Week 9 questions (2D arrays) + 7 review questions (1D arrays, methods)
 * UPDATE STUDENT ROSTER BEFORE FIRST USE
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class COP2250_Week9_Picker {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);

        // ====== UPDATE ROSTER HERE ======
        String[] students = {
            "Diego Bischoff",
            "Kayde Blaylock",
            "Artem Brattsev",
            "Edgar Cebollero",
            "Duffy Duffy",
            "Ayan Echemendia-Carranza",
            "Maria Galante",
            "Draden Johnson",
            "Michael Mahadeo",
            "Vel McCracken",
            "Jayden Odige",
            "Christina Oros",
            "Ryan Phan",
            "Thanh Phan",
            "Veronica Van Cleave"
        };

        // Week 9 questions (weight: 2x)
        String[] w9 = {
            "How do you declare a 2D array of doubles with 3 rows and 4 columns?",
            "What does m.length give you for a 2D array?",
            "What does m[0].length give you for a 2D array?",
            "How do you access the element in row 2, column 3 of a matrix called m?",
            "In sumColumn, which index stays FIXED and which one loops?",
            "What is the difference between traversing a row vs traversing a column?",
            "Why do you use a NESTED loop to fill a 2D array?",
            "What would happen if you wrote m.length for columns instead of m[0].length?"
        };

        // Review questions (weight: 1x)
        String[] review = {
            "What index is the FIRST element of a 1D array?",
            "If an array has 10 elements, what is the LAST valid index?",
            "What does array.length give you for a 1D array?",
            "What exception do you get if you access an index out of bounds?",
            "Why should you initialize max to arr[0] instead of 0?",
            "What is the difference between a PARAMETER and an ARGUMENT?",
            "What does the RETURN keyword do?"
        };

        // Build weighted pool
        ArrayList<String> pool = new ArrayList<>();
        for (String q : w9)     { pool.add(q); pool.add(q); }
        for (String q : review) { pool.add(q); }

        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║   COP2250 Week 9 Picker: 2D Arrays           ║");
        System.out.println("║   " + students.length + " students | " + (w9.length + review.length) + " questions              ║");
        System.out.println("╠═══════════════════════════════════════════════╣");
        System.out.println("║  Press ENTER to pick | 'q' to quit           ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();

        int round = 1;
        while (true) {
            System.out.print("Round " + round + " > ");
            String input = kb.nextLine().trim();
            if (input.equalsIgnoreCase("q")) break;

            String student = students[rand.nextInt(students.length)];
            String question = pool.get(rand.nextInt(pool.size()));

            System.out.println();
            System.out.println("  🎯 STUDENT: " + student);
            System.out.println("  ❓ QUESTION: " + question);
            System.out.println();
            round++;
        }

        System.out.println("Done. " + (round - 1) + " rounds played.");
        kb.close();
    }
}
