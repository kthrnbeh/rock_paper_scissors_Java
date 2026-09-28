import java.util.Random;
import java.util.Scanner;

/// Rock paper scissors game
public class Main {

    public static void main(String[] args) {
        // Create players
        String[] choices = {"rock", "paper", "scissors"};
        String player1;
        String player2;
        String computer;

        int round = 1;
        String playAgain = "yes";

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Score during the game
        int player1Score = 0;
        int player2Score = 0;
        int computerScore = 0;

        // Overall score at the end of the game
        int player1GamesWon = 0;
        int player2GamesWon = 0;
        int computerGamesWon = 0;

        while (playAgain.equals("yes")) {
            round = 1;
            player1Score = 0;
            player2Score = 0;
            computerScore = 0;
           

            // Ask player if they want to play against the computer or another player.
            System.out.println("Choose your opponent: computer or player2");
            String opponent = scanner.nextLine().toLowerCase();
            //need to make a system where only the words player2 and computer are used.
            while (!opponent.equals("computer") && !opponent.equals("player2")) {
                 System.out.println("Invalid input. Choose computer or player2.");
                 opponent = scanner.nextLine().toLowerCase();
            }
            
            while (round <= 3) {
                // Name the round.
                System.out.println("Round number: " + round);

                // Ask player for rock, paper, or scissors.
                System.out.println("Rock, Paper, Scissors?");
                player1 = scanner.nextLine().trim().toLowerCase();
                System.out.println("player1: " + player1);

                if (opponent.equals("computer")) {
                    int number = random.nextInt(3);
                    computer = choices[number];

                    System.out.println("computer: " + computer);

                    // Check for a tie.
                    if (player1.equals(computer)) {
                        System.out.println("It's a Tie");

                    // Check if Player 1 wins.
                    } else if ((player1.equals("rock") && computer.equals("scissors"))
                            || (player1.equals("scissors") && computer.equals("paper"))
                            || (player1.equals("paper") && computer.equals("rock"))) {
                        System.out.println("Player 1 wins!");
                        player1Score++;

                    // If it wasn't a tie and Player 1 didn't win, the computer wins.
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
                    } else if ((player1.equals("rock") && player2.equals("scissors"))
                            || (player1.equals("scissors") && player2.equals("paper"))
                            || (player1.equals("paper") && player2.equals("rock"))) {
                        System.out.println("Player 1 wins!");
                        player1Score++;
                    } else {
                        System.out.println("Player 2 wins!");
                        player2Score++;
                    }
                }

                // Show scoreboard after each round.
                System.out.println("\nCurrent Round Score:");
                System.out.println("player1: " + player1Score);
                if (opponent.equals("computer")) {
                    System.out.println("computer: " + computerScore);
                } else {
                    System.out.println("player2: " + player2Score);
                }

                // Move to the next round.
                round++;
            }

            // Show final scoreboard.
            System.out.println("\nFinal Scoreboard");
            System.out.println("Player 1: " + player1Score);

            if (opponent.equals("computer")) {
                System.out.println("Computer: " + computerScore);

                if (player1Score > computerScore) {
                    System.out.println("Player 1 won the game!");
                    player1GamesWon++;
                } else if (player1Score < computerScore) {
                    System.out.println("Computer wins... try again.");
                    computerGamesWon++;
                } else {
                    System.out.println("It's a tie!");
                }
            } else {
                System.out.println("Player 2: " + player2Score);

                if (player1Score > player2Score) {
                    System.out.println("Player 1 wins!");
                    player1GamesWon++;
                } else if (player1Score < player2Score) {
                    System.out.println("Player 2 wins!");
                    player2GamesWon++;
                } else {
                    System.out.println("You tied!");
                }
            }

            // Historic wins
            System.out.println("\nHistory of Wins");
            System.out.println("Player 1 Games Won: " + player1GamesWon);

            if (opponent.equals("computer")) {
                System.out.println("Computer Games Won: " + computerGamesWon);
            } else {
                System.out.println("Player 2 Games Won: " + player2GamesWon);
            }

            System.out.println("Reset game history? yes/no");
            String reset = scanner.nextLine().toLowerCase();

            if (reset.equals("yes")) {
                player1GamesWon = 0;
                player2GamesWon = 0;
                computerGamesWon = 0;
                System.out.println("History reset!");
            }

            // Ask if they want to play another three rounds.
            System.out.println("Play again? yes/no");
            playAgain = scanner.nextLine().toLowerCase();
        }

        scanner.close();
    }
}
