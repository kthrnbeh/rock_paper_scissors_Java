// Imports Random so the computer can make random choices.
import java.util.Random;
// Imports Scanner so the program can read keyboard input.
import java.util.Scanner;

// Defines the class that contains the rock-paper-scissors game.
public class Main {

    // The main method is where the program begins running.
    public static void main(String[] args) {
        // Stores every choice that the computer can make.
        String[] choices = {"rock", "paper", "scissors"};
        // Stores the choices made by Player 1, Player 2, and the computer.
        String player1;
        String player2;
        String computer;

        // Keeps track of the current round number.
        int round = 1;
        // Controls whether another three-round game should begin.
        String playAgain = "yes";

        // Creates a random-number generator for the computer.
        Random random = new Random();
        // Creates a Scanner to read input from the keyboard.
        Scanner scanner = new Scanner(System.in);

        // Stores the points earned during the current game.
        int player1Score = 0;
        int opponentScore = 0;
       

        // Stores the number of complete games won by each opponent.
        int player1GamesWon = 0;
        int player2GamesWon = 0;
        int computerGamesWon = 0;
        // Counts how many times each choice is made during the session.
        int rockCount = 0;
        int paperCount = 0;
        int scissorsCount = 0;

        // Repeats the game while the user chooses to play again.
        while (playAgain.equals("yes")) {
            // Resets the round and current-game scores for a new game.
            round = 1;
            playerScore = 0;
            opponentScore = 0;

            // Asks whether Player 1 will play against the computer or Player 2.
            System.out.println("Choose your opponent: computer or player2");
            // Reads, trims, and standardizes the opponent choice.
            String opponent = scanner.nextLine().trim().toLowerCase();

            // Repeats until the user enters one of the two valid opponents.
            while (!opponent.equals("computer") && !opponent.equals("player2")) {
                System.out.println("Invalid input. Choose computer or player2.");
                opponent = scanner.nextLine().trim().toLowerCase();
            }

            // Plays exactly three rounds in the current game.
            while (player1Score <2 && opponentScore <2) {
                // Displays the number of the round being played.
                System.out.println("Round number: " + round);

                // Prompts Player 1 to choose rock, paper, or scissors.
                System.out.println("Rock, Paper, Scissors?");
                // Reads and standardizes Player 1's choice.
                player1 = scanner.nextLine().trim().toLowerCase();

                // Repeats until Player 1 enters a valid choice.
                while (!player1.equals("rock")
                        && !player1.equals("paper")
                        && !player1.equals("scissors")) {
                    System.out.println("Invalid input. Choose rock, paper, or scissors.");
                    player1 = scanner.nextLine().trim().toLowerCase();
                }
                // Updates the total count for Player 1's selected choice.
                if (player1.equals("rock")) {
                    rockCount++;
                } else if (player1.equals("paper")) {
                    paperCount++;
                } else if (player1.equals("scissors")) {
                    scissorsCount++;
                }

                // Displays Player 1's choice.
                System.out.println("player1: " + player1);

                // Uses this branch when Player 1 is playing against the computer.
                if (opponent.equals("computer")) {
                    // Generates a random number from 0 through 2.
                    int number = random.nextInt(3);
                    // Uses the random number to select the computer's choice.
                    computer = choices[number];
                    // Displays the computer's choice.
                    System.out.println("computer: " + computer);

                    // Checks whether both players made the same choice.
                    if (player1.equals(computer)) {
                        System.out.println("It's a Tie");

                    // Checks the three combinations in which Player 1 wins.
                    } else if ((player1.equals("rock") && computer.equals("scissors"))
                            || (player1.equals("scissors") && computer.equals("paper"))
                            || (player1.equals("paper") && computer.equals("rock"))) {
                        System.out.println("Player 1 wins!");
                        // Adds one point to Player 1's current-game score.
                        player1Score++;

                    // If it was not a tie and Player 1 did not win, the computer wins.
                    } else {
                        System.out.println("Computer wins!");
                        // Adds one point to the computer's current-game score.
                        opponentScore++;
                    }
                } else {
                    // Uses this branch when Player 1 is playing against Player 2.
                    System.out.println("Rock, Paper, Scissors?");
                    // Reads and standardizes Player 2's choice.
                    player2 = scanner.nextLine().trim().toLowerCase();

                    // Repeats until Player 2 enters a valid choice.
                    while (!player2.equals("rock")
                            && !player2.equals("paper")
                            && !player2.equals("scissors")) {
                        System.out.println("Invalid input. Choose rock, paper, or scissors.");
                        player2 = scanner.nextLine().trim().toLowerCase();
                    }

                    // Displays Player 2's choice.
                    System.out.println("player2: " + player2);

                    // Checks whether both players made the same choice.
                    if (player1.equals(player2)) {
                        System.out.println("It's a Tie");
                    // Checks the three combinations in which Player 1 wins.
                    } else if ((player1.equals("rock") && player2.equals("scissors"))
                            || (player1.equals("scissors") && player2.equals("paper"))
                            || (player1.equals("paper") && player2.equals("rock"))) {
                        System.out.println("Player 1 wins!");
                        // Adds one point to Player 1's current-game score.
                        player1Score++;
                    } else {
                        // If Player 1 did not win or tie, Player 2 wins the round.
                        System.out.println("Player 2 wins!");
                        // Adds one point to Player 2's current-game score.
                        opponentScore++;
                    }
                }

                // Displays the scores after the current round.
                System.out.println("\nCurrent Round Score:");
                System.out.println("player1: " + player1Score);
                System.out.println(opponent + ": " + opponentScore);
                // Increases the round number so the next round can begin.
                round++;
            }

            // Displays the scores after all three rounds are complete.
            System.out.println("\nFinal Scoreboard");
            System.out.println("Player 1: " + player1Score);
            if (opponent.equals("computer")) {
                System.out.println("Computer: " + opponentScore);
            } else {
                System.out.println("Player 2: " + opponentScore);
            }
            if(player1Score ==2) {
                System.out.println("Player 1 wins the game!");
                player1GamesWon++;
            } else if (opponent.equals('computer')) {
                System.out.println("Computer wins the game!");
                computerGamesWon++;
            } else {
                System.out.println("Player 2 wins the game!");
                player2GamesWon++;
            }
               
            // Displays the total number of rock, paper, and scissors choices made.
            System.out.println("\nTotal Choices Made:");
            System.out.println("Rock: " + rockCount);
            System.out.println("Paper: " + paperCount);
            System.out.println("Scissors: " + scissorsCount);
            // Displays the running history of complete games won by each opponent.
            System.out.println("\nHistory of Wins");
            System.out.println("Player 1 Games Won: " + player1GamesWon);
            System.out.println("Player 2 Games Won: " + player2GamesWon);
            System.out.println("Computer Games Won: " + computerGamesWon);

            // Asks whether the user wants to erase the running win history.
            System.out.println("Reset game history? yes/no");
            String reset = scanner.nextLine().trim().toLowerCase();

            // Repeats until the user enters yes or no.
            while (!reset.equals("yes") && !reset.equals("no")) {
                System.out.println("Invalid input. Enter yes or no.");
                reset = scanner.nextLine().trim().toLowerCase();
            }

            // Clears the complete-game win totals when the user chooses yes.
            if (reset.equals("yes")) {
                player1GamesWon = 0;
                player2GamesWon = 0;
                computerGamesWon = 0;
                System.out.println("History reset!");
            }

            // Asks whether the user wants to play another three-round game.
            System.out.println("Play again? yes/no");
            playAgain = scanner.nextLine().trim().toLowerCase();

            // Repeats until the user enters yes or no.
            while (!playAgain.equals("yes") && !playAgain.equals("no")) {
                System.out.println("Invalid input. Enter yes or no.");
                playAgain = scanner.nextLine().trim().toLowerCase();
            }
        }

        // Closes the Scanner and releases the input resource when the program ends.
        scanner.close();
    }
}
