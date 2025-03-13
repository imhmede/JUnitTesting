/**
 * This program is a random number generater game that allows a user five attempts to guess the number correctly and 
 * then asks them if they want to play again.
 * @author Vivian Iracheta
 * Nov. 9, 2023
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    /**
     * This is the method where a random number is generated between 1 and 100.
     * @return integer number
     */

    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
    /**
     * This is the method that allows the user to play the number guessing game
     * @param in   reads from the main method
     */

    public static void playGame(Scanner in) {
            Scanner scanner = new Scanner(System.in);
            int randomNumber = generateRandomNumber();
            int maxAttempts = 5;
            int attempts = 0;

            System.out.println("Do you want to play a game?");
            System.out.println("I am thinking of a number. Do you think you can guess the correct number in 5 attempts?");

            while(attempts < maxAttempts) {
                System.out.println("Please enter a number between 1 and 100: ");
                int playerGuess = scanner.nextInt();
                attempts++;

                if(playerGuess < 1 || playerGuess > 100) {
                    System.out.println("ERROR: You entered an invaild guess. Try again.");
                    break;
                }
                if(playerGuess == randomNumber) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + attempts + " out of 5 attempts.");
                break;
                }
                else if(randomNumber > playerGuess) {
                System.out.println("Your number is to low. Try a higher number.");
                }
                else {
                System.out.println("Your number is to high. Try a lower number.");
                }
                 
                if(attempts == maxAttempts) {
                    System.out.println("You Lose. The correct number was " + randomNumber);
                }   
            }
        }

    /**
     * This is the main method
     * @param args  a list of command-line arguments 
     */
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;
        
        do {
            playGame(in);

            System.out.println("Would you like to play again? Yes or No?");
            playAgain = in.next().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}