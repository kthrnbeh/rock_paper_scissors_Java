import java.util.Random;
import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(3);
        System.out.println(number);
       Scanner scanner = new Scanner(System.in); 

       scanner.close();
    }
    
   /// Rock paper scissors game

// Ask player if they want to play against computer or another player

// Create score for player 1 and opponent

// Play 3 rounds of rock paper scissors

    // Get choice from player 1

    // Then player 2 or computer

        // If playing against computer:
            // Generate computer's random choice

        // If playing against another player:
            // Get choice from player 2

    // Display what each player chose

    // Check for a tie

    // Check win conditions and decide who won

    // Add 1 point to the winner's score

    // Show scoreboard after each round

// After 3 rounds, show final scoreboard

// Show who won the whole game

// Ask if they want to play another 3 rounds
}