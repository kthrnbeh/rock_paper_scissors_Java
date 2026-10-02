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
        
        // Repeats the game while the user chooses to play again.
        while (playAgain.equals("yes")) {
            // Resets the round and current-game scores for a new game.
            round = 1;
            // Sets Player 1's score back to zero at the start of a new match.
            player1Score = 0;
            // Sets the selected opponent's score back to zero at the start of a new match.
            opponentScore = 0;

            // Asks whether Player 1 will play against the computer or Player 2.
            // The user must type either "computer" or "player2".
            System.out.println("Choose your opponent: computer or player2");
            // Reads, trims, and standardizes the opponent choice.
            String opponent = scanner.nextLine().trim().toLowerCase();

            // Repeats until the user enters one of the two valid opponents.
            while (!opponent.equals("computer") && !opponent.equals("player2")) {
                // Explains that the opponent choice was not accepted.
                System.out.println("Invalid input. Choose computer or player2.");
                // Reads the opponent choice again after the invalid-input message.
                opponent = scanner.nextLine().trim().toLowerCase();
            }

            // Plays rounds until either side wins two rounds, which wins the match.
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
                    // Tells Player 1 that the entered choice is not valid.
                    System.out.println("Invalid input. Choose rock, paper, or scissors.");
                    // Reads Player 1's choice again.
                    player1 = scanner.nextLine().trim().toLowerCase();
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
                        // Announces that neither side earns a point for a tied round.
                        System.out.println("It's a Tie");

                    // Checks the three combinations in which Player 1 wins.
                    } else if ((player1.equals("rock") && computer.equals("scissors"))
                            || (player1.equals("scissors") && computer.equals("paper"))
                            || (player1.equals("paper") && computer.equals("rock"))) {
                        // Announces that Player 1 won this round.
                        System.out.println("Player 1 wins!");
                        // Adds one point to Player 1's current-game score.
                        player1Score++;

                    // If it was not a tie and Player 1 did not win, the computer wins.
                    } else {
                        // Announces that the computer won this round.
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
                        // Tells Player 2 that the entered choice is not valid.
                        System.out.println("Invalid input. Choose rock, paper, or scissors.");
                        // Reads Player 2's choice again.
                        player2 = scanner.nextLine().trim().toLowerCase();
                    }

                    // Displays Player 2's choice.
                    System.out.println("player2: " + player2);

                    // Checks whether both players made the same choice.
                    if (player1.equals(player2)) {
                        // Announces that neither side earns a point for a tied round.
                        System.out.println("It's a Tie");
                    // Checks the three combinations in which Player 1 wins.
                    } else if ((player1.equals("rock") && player2.equals("scissors"))
                            || (player1.equals("scissors") && player2.equals("paper"))
                            || (player1.equals("paper") && player2.equals("rock"))) {
                        // Announces that Player 1 won this round.
                        System.out.println("Player 1 wins!");
                        // Adds one point to Player 1's current-game score.
                        player1Score++;
                    } else {
                        // If Player 1 did not win or tie, Player 2 wins the round.
                        // Announces that Player 2 won this round.
                        System.out.println("Player 2 wins!");
                        // Adds one point to Player 2's current-game score.
                        opponentScore++;
                    }
                }

                // Displays the scores after the current round.
                // Prints the heading for the scoreboard.
                System.out.println("\nCurrent Round Score:");
                // Prints Player 1's current number of round wins.
                System.out.println("player1: " + player1Score);
                // Prints the current number of round wins for the selected opponent.
                System.out.println(opponent + ": " + opponentScore);
                // Increases the round number so the next round can begin.
                round++;
            }

            // Displays the final score after someone wins the best-of-three match.
            // Prints the heading for the final scoreboard.
            System.out.println("\nFinal Scoreboard");
            // Prints Player 1's final match score.
            System.out.println("Player 1: " + player1Score);

            // Chooses the correct opponent name for the final scoreboard.
            if (opponent.equals("computer")) {
                // Prints the computer's final match score.
                System.out.println("Computer: " + opponentScore);
            } else {
                // Prints Player 2's final match score.
                System.out.println("Player 2: " + opponentScore);
            }

            // Checks whether Player 1 reached two round wins first.
            if(player1Score ==2) {
                // Announces that Player 1 won the complete match.
                System.out.println("Player 1 wins the game!");
                // Adds one to Player 1's lifetime match-win history.
                player1GamesWon++;
            // If Player 1 did not win, checks whether the opponent was the computer.
            } else if (opponent.equals("computer")) {
                // Announces that the computer won the complete match.
                System.out.println("Computer wins the game!");
                // Adds one to the computer's lifetime match-win history.
                computerGamesWon++;
            } else {
                // If Player 1 and the computer did not win, Player 2 won the match.
                System.out.println("Player 2 wins the game!");
                // Adds one to Player 2's lifetime match-win history.
                player2GamesWon++;
            }
               
            
            // Displays the running history of complete games won by each opponent.
            // Prints the heading for the win-history section.
            System.out.println("\nHistory of Wins");
            // Prints Player 1's total number of match wins.
            System.out.println("Player 1 Games Won: " + player1GamesWon);
            // Prints Player 2's total number of match wins.
            System.out.println("Player 2 Games Won: " + player2GamesWon);
            // Prints the computer's total number of match wins.
            System.out.println("Computer Games Won: " + computerGamesWon);

            // Asks whether the user wants to erase the running win history.
            // The user must answer yes or no.
            System.out.println("Reset game history? yes/no");
            // Reads the user's reset choice.
            String reset = scanner.nextLine().trim().toLowerCase();

            // Repeats until the user enters yes or no.
            while (!reset.equals("yes") && !reset.equals("no")) {
                // Explains that the reset answer was invalid.
                System.out.println("Invalid input. Enter yes or no.");
                // Reads the reset answer again.
                reset = scanner.nextLine().trim().toLowerCase();
            }

            // Clears the complete-game win totals when the user chooses yes.
            if (reset.equals("yes")) {
                // Erases Player 1's match-win history.
                player1GamesWon = 0;
                // Erases Player 2's match-win history.
                player2GamesWon = 0;
                // Erases the computer's match-win history.
                computerGamesWon = 0;
                // Confirms that the history was erased.
                System.out.println("History reset!");
            }

            // Asks whether the user wants to play another best-of-three game.
            // The user must answer yes or no.
            System.out.println("Play again? yes/no");
            // Reads the user's decision about starting another match.
            playAgain = scanner.nextLine().trim().toLowerCase();

            // Repeats until the user enters yes or no.
            while (!playAgain.equals("yes") && !playAgain.equals("no")) {
                // Explains that the play-again answer was invalid.
                System.out.println("Invalid input. Enter yes or no.");
                // Reads the play-again answer again.
                playAgain = scanner.nextLine().trim().toLowerCase();
            }
        }

        // Closes the Scanner and releases the input resource when the program ends.
        scanner.close();
    }
}
