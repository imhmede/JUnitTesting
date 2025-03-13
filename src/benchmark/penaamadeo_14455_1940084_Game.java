/**
 * PS 06
 * This program is a game of guessing a number.
 * @author Amadeo Pena
 * 11/08/2023
 */
import java.util.Random;
import java.util.Scanner;

public class Game{
    /**
     * The main method runs the play game function
     * @return Game
     */
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 5;
        int randomNumber = generateRandomNumber(random);

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess a number between 1 and 100.");

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt " + i + ": Enter your guess (1-100): ");
            int userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("You've guessed the correct number: " + randomNumber);
                break;
            }

            if (i == attempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber);
            }
        }

        System.out.println("Do you want to play again? yes or no: ");
        String playAgain = scanner.next();
        if (playAgain.equalsIgnoreCase("yes")) {
            playGame();
        } else {
            System.out.println("Thanks for playing");
        }
    }

    public static int generateRandomNumber(Random random) {
        return random.nextInt(100) + 1; 
    }
}