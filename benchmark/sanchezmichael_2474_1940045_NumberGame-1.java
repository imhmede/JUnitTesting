/**
 * Game to guess a randomly generated number between 0 -100.
 * @author Michael Sanchez
 * November 9, 2023
 */

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        /**
         * A list of arguments contained withing the main method.
         */

        int playAgain = 1; //starts at 1 to enter while loop.
        Scanner in = new Scanner(System.in);
        while (playAgain == 1) {
            playGame(); //Calls playGame method.
            System.out.println(); //Adds a space before prompting to play again for asthetics.
            System.out.println("Play again?");
            System.out.println("Enter 1 for yes or 2 for no.");
            int decision = in.nextInt(); //prompts user to enter 1 to play again, 2 to exit.
            playAgain = decision;
        }
        
        }
    public static void playGame() {
        /**
         * List of arguments for the playGame method.
         */
        Scanner in = new Scanner(System.in);
        int targetNumber = randomNumberGenerator(); //Calls the randomNumberGenerator
        System.out.println("Enter a number between 0 - 100 to guess the randomly generated number.");

        for (int i = 0; i <= 4; i++) { //Runs throught the loop 5 times (5 chances)
            int unum = 0; //initializes unum (user number).
            try {
            unum = in.nextInt(); //Checks that unum is an integer.
            }
            catch(Exception e) { //Arguments in the event unum is not an integer.
            System.out.println("Please enter an integer and begin again.");
            playGame(); //Recursive method to start again if unum is not an integer.
            }
            if (unum <= 100 && unum >= 0) { //If unum is between 0-100 continue with rest of if statements.
                if (unum == targetNumber) {
                    System.out.println("Correct, You Win!");
                    break; //If guess is correct, break.
                }
                if (unum > targetNumber) {
                    System.out.println ("Too high.");
                }
                if (unum < targetNumber) {
                    System.out.println ("Too low.");
                }
                if (i == 4) {
                    System.out.println("You lost");
                    break;
                }
            }
            else {
                System.out.println("Enter an integer BETWEEN 0 - 100.");
                i--; //If integer is outside of requirements, reduce i by 1 to allow user to have
                     //5 valid guesses.
            }
        }
    }
    public static int randomNumberGenerator() {
        /**
         * List of arguements for randomNumberGenerator method.
         */
        int rnum = (int) (Math.random() * 100) + 1; // Generates a randome number between 0 - 100.
        return rnum;
    }
}