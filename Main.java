import java.util.Random;
import java.util.Scanner;
/// Rock paper scissors game
public class Main {
  
    public static void main(String[] args) {
       //create players 
        String[] choices = {"rock", "paper", "scissors"};  // Array of choices for the game
        String player1;// Variable to store player 1's choice
        String player2; // Variable to store player 2's choice
        String computer;// Variable to store the computer's choice
        //need to see what round were on, so we can keep track of the score
        int round = 1;// Variable to track the current round
        String playAgain="yes";// Variable to track if players want to play again
        // Create a random number generator for the computer's choice

        Random random = new Random();
        
        //System.out.println(number);
        Scanner scanner = new Scanner(System.in); 
        int player1Score = 0; // Variable to track player 1's score
        int player2Score = 0; // Variable to track player 2's score
        int computerScore = 0; // Variable to track computer's score
        // Ask player if they want to play against computer or another player
        System.out.println("Computer or Player2");
        String opponent = scanner.nextLine().toLowerCase(); // Get the opponent choice from the user and convert it to lowercase
        while (round <= 3) {
            //Ask player for rock, paper or scissors
            System.out.println("Rock, Paper, Scissors?");
            player1=scanner.nextLine().toLowerCase();
            System.out.println (player1);
            
            // Ask player if they want to play against computer or another player
            
            if (opponent.equals("computer")){
                int number =random.nextInt(3);// to make only random number 0-2
                computer=choices[number];

                
            } else{ 
                //player 2
                System.out.println("Rock, Paper, Scissors?");
                player2=scanner.nextLine().toLowerCase();
                System.out.println( player2);
            }
            // Display what each player chose
         }
        

        scanner.close();
    }
    
   


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