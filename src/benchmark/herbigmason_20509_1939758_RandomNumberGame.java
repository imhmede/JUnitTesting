import java.util.Random;
import java.util.Scanner;
/**
 * This class simulates a game in which the user is prompted to guess a randomly generated number.
 * Author : Mason Herbig
 * Date : 11/09/2023
 * Assignment Name : PS06
 */
public class RandomNumberGame {
    /**
     * This is the main method of the program. It initiates the game, and repeats it if the user decides to do so.
     * This method does not return any values.
     */
    public static void main(String[] args) {
        while (playGame());
    }
    /**
     * This method generates a random number from 1 - 100 when called.
     * @return int random number.
     */
    public static int generateRandomNumber() {
        Random rand = new Random();
        return (rand.nextInt(100) + 1);
    }
    /**
     * This method handles all of the logic in the game, as well as prompting the user to input their guesses.
     * @return boolean playAgain. Returns true if the player wants to play again; false if the user does not.
     */
    public static boolean playGame() {
        int hiddenNumber = generateRandomNumber();
        System.out.println("The computer has generated a random number from 1-100. Guess the number within 5 attempts to win.");
        int numberOfGuesses = 5;
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Please enter a number");
        for (int i = numberOfGuesses - 1; i >= 0; i--) {
            int playerGuess = inputNum.nextInt();
            if (playerGuess == hiddenNumber) {
                System.out.println("YOU WIN");
            } else if (i != 0) {
                System.out.println("Please try again. (" + i + " guesses remaining)");
            } else {
                System.out.println("YOU LOSE");
            }
        }
        System.out.println("Enter 1 to play again.");
        boolean playAgain;
        if (inputNum.nextInt() == 1) {
            playAgain = true;
        } else {
            playAgain = false;
        }
        return playAgain;
    }
}