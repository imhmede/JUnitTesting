/**
 * This program generates a random number for the player to guess within five attempts.
 * @author Samuel Blaney
 * @since Nov 8, 2023
 */

import java.util.Random; // importing Random class 
import java.util.Scanner; // importing Scanner class

public class NumberGuessingGame {

  /**
   * This is the main entry point of the program.
   * @param args  list of possible command-line arguments.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean playAgain = true;
    
    // main game loop
    while (playAgain) {
      System.out.println("Welcome to Guess It, the number guessing game!");
      playGame();
      System.out.println("Do you want to Guess It again? (yes/no): ");
      String replay = in.nextLine();
      playAgain = replay.equalsIgnoreCase("yes");
    }

    System.out.println("Thanks for playing Guess It!");
    in.close(); 
  }

  /**
   * This method generates a random number between the range 1 and 100.
   * @return  A randomly generated number.
   */
  private static int generateRandomNumber() {
    Random rand = new Random();
    return rand.nextInt(100) + 1;
  }

  /**
   * This method acts as the game engine, managing the core logic of the game, player guesses, feedback, and outcome.
   */
  private static void playGame() {
    int guessItNumber = generateRandomNumber();
    int attempts = 5;
    Scanner in = new Scanner(System.in);

    System.out.println("I'm thinking of a number between 1 and 100, try to Guess It!");

    // main loop for player guesses
    while (attempts > 0) {
      System.out.println("Enter a guess: ");
      int playerGuess;

      // Validate user input to ensure it's a valid integer
      while (true) {
        try {
          playerGuess = Integer.parseInt(in.nextLine());
          break;
        } catch (NumberFormatException e) {
          System.out.println("Invalid Response. Enter a valid integer.");
        }
      }

      // checking if player guess is correct
      if (playerGuess == guessItNumber) {
        System.out.println("It's a match! You guessed it correctly.");
        return;
      } else if (playerGuess < guessItNumber) {
        System.out.println("Not quite, think higher and try again.");
      } else {
        System.out.println("Not quite, think lower and try again.");
      }

      // decrementing remaning attempts
      attempts--;
      System.out.println("Remaining Attempts: " + attempts);
    }

    // result for running out of attempts
    System.out.println("You failed to Guess It. Correct Number: " + guessItNumber);
  }
}

