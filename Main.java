import java.util.Random;
import java.util.Scanner;

/// Rock paper scissors game
public class Main {

    public static void main(String[] args) {
        // Create players
        String[] choices = {"rock", "paper", "scissors"}; // Array of choices for the game
        String player1; // Variable to store player 1's choice
        String player2; // Variable to store player 2's choice
        String computer; // Variable to store the computer's choice

        // Need to see what round we're on, so we can keep track of the score
        int round = 1; // Variable to track the current round
        String playAgain = "yes"; // Variable to track if players want to play again

        // Create a random number generator for the computer's choice
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int player1Score = 0; // Variable to track player 1's score
        int player2Score = 0; // Variable to track player 2's score
        int computerScore = 0; // Variable to track computer's score

        // Ask player if they want to play against computer or another player
        System.out.println("Computer or Player2");
        String opponent = scanner.nextLine().toLowerCase();

        while (round <= 3) {
            // Ask player for rock, paper or scissors
            System.out.println("Rock, Paper, Scissors?");
            player1 = scanner.nextLine().toLowerCase();
            System.out.println("player1: " + player1);

            if (opponent.equals("computer")) {
                int number = random.nextInt(3);
                computer = choices[number];

                System.out.println("computer: " + computer);

                // Check for a tie
                if (player1.equals(computer)) {
                    System.out.println("It's a Tie");

                // Check if Player 1 wins
                } else if ((player1.equals("rock") && computer.equals("scissors"))
                        || (player1.equals("scissors") && computer.equals("paper"))
                        || (player1.equals("paper") && computer.equals("rock"))) {
                    System.out.println("Player 1 wins!");
                    player1Score++;

                // If it wasn't a tie and Player 1 didn't win, computer wins
                } else {
                    System.out.println("Computer wins!");
                    computerScore++;
                }
            } else {
                // Player 2
                System.out.println("Rock, Paper, Scissors?");
                player2 = scanner.nextLine().toLowerCase();
                System.out.println("player2: " + player2);

                if (player1.equals(player2)) {
                    System.out.println("It's a Tie");
                }
                else if((player1.equals("rock") && player2.equals("scissors"))
                        || (player1.equals("scissors") && player2.equals("paper"))
                        || (player1.equals("paper") && player2.equals("rock"))){
                    System.out.println("player 1 wins!");
                    player1Score++;
                }
                else{
                    System.out.println("player 2 wins!");
                    player2Score++;
                }
            }

            
        }
        // Show scoreboard after each round
        scanner.close();
    }

   

    

    // After 3 rounds, show final scoreboard

    // Show who won the whole game

    // Ask if they want to play another 3 rounds
}
