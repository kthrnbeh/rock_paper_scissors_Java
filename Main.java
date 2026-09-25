import java.util.Random;
//Rock paper scissors game
public class Main {
  //Ask player if they want a computer or another player
  //Play 3 rounds of rock paper scissors and declare winner
  //Get choice from player 1
  // Then player 2 or computer
   // If playing against computer:
            // Generate computer's random choice

        // If playing against another player:
            // Get choice from player 2

        // Check for a tie

        // Check win conditions and decide who won

        // Add 1 point to the winner's score

        // Show scoreboard after each round

    // After 3 rounds, show final scoreboard

    // Show who won the whole game

    // Ask if they want to play another 3 rounds


   /
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(3);
        System.out.println(number);
    }
    
}