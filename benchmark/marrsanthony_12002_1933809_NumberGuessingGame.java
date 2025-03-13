/**
* This program is a number guessing game
* @author CS123 Anthony Marrs
* November 7, 2023
*/
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int target = generateRandomNumber();
            int attempts = 5;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. You have 5 attempts to guess it.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == target) {
                    System.out.println("Congratulations! You've guessed the correct number: " + target);
                    break;
                } else if (guess < target) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                attempts--;
                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempts left.");
                } else {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + target);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}