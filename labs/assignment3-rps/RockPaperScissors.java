/**
 * Assignment 4: Rock-Paper-Scissors Game
 * 
 * COP2250 Java Programming
 * Kevin Pyatt, Ph.D. | Pyatt Labs
 * 
 * Rules:
 * - Scissor (0) cuts Paper (2)
 * - Rock (1) smashes Scissor (0)
 * - Paper (2) wraps Rock (1)
 * 
 * This file is instructor-authored intellectual property.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // ============================================
        // ACT 1: SET THE STAGE
        // ============================================
        
        // TODO 1: Create a String array called "choices" containing 
        //         "Scissor", "Rock", "Paper" (in that order)
        
        
        // TODO 2: Create a Scanner object called "input"
        
        
        // TODO 3: Create a Random object called "rand"
        
        
        // ============================================
        // ACT 2: GENERATE COMPUTER'S CHOICE
        // ============================================
        
        // TODO 4: Generate a random integer 0, 1, or 2
        //         Store it in a variable called "computer"
        //         Hint: rand.nextInt(3)
        
        
        // ============================================
        // ACT 3: GET USER'S CHOICE
        // ============================================
        
        // TODO 5: Print the prompt (no newline):
        //         "scissor (0), rock (1), paper (2): "
        
        
        // TODO 6: Read the user's integer choice into a variable called "user"
        
        
        // ============================================
        // ACT 4: DISPLAY CHOICES
        // ============================================
        
        // TODO 7: Print what the computer chose
        //         Use the choices array with the computer index
        //         Format: "The computer is [choice]. "
        //         Hint: Don't add newline yet - use print(), not println()
        
        
        // TODO 8: Print what the user chose
        //         Use the choices array with the user index
        //         Format: "You are [choice]. " (or "You are [choice] too. " for draws)
        
        
        // ============================================
        // ACT 5: DETERMINE THE WINNER
        // ============================================
        
        // TODO 9: Check if it's a draw (user == computer)
        //         If draw, print: "It is a draw!"
        
        
        // TODO 10: Check if user wins
        //          User wins if:
        //          - user is 0 (Scissor) AND computer is 2 (Paper)
        //          - user is 1 (Rock) AND computer is 0 (Scissor)
        //          - user is 2 (Paper) AND computer is 1 (Rock)
        //          If user wins, print: "You won!"
        
        
        // TODO 11: Otherwise, computer wins
        //          Print: "Computer wins!"
        
        
    }
}
