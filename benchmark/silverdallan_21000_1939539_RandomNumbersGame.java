/** This is a program that runs a small game asking a user for an input,
then compares that input to a randomly generated number.
@DallanSilver
CS123 HW6
11/7/2023 */

import java.util.Scanner;
import java.util.Random;
public class RandomNumbersGame {
    
    // This is the main entry point to code
    public static void main(String[] args) {

    // This is the method that the game engine falls under

    public static void playGame()
    {
        Scanner input = new Scanner(System.in);

        // Generating the numbers
        public static int generateRandomNumbers() {  
            Math.floor(Math.random() *(100 - 1 +1) -1);

        // Setting how many tries
        int tries = 5;

        int i, guess;

        System.out.println("There is a number between 1 and 100. Try to guess the number!");

        for (i = 0; i <= tries; i++) {
            System.out.println( "Guess the number: ");

            //Take input for guessing
            guess = input.nextInt();

            // if the number is guessed
            if (number ==  guess) {
                System.out.println("Your guess was correct!");
                break;
            }
            else if (number > guess 
            && i != tries - 1) {
                System.out.println("The number is bigger than " + guess);
            }
            else if (number < guess
            && i != tries -1) {
                System.out.println("The number is smaller than " + guess);
            }
            }

            if (i >= tries) {
                System.out.println("you have run out of attempts");

                System.out.println("the number was " + number);
            }
        
        }

}
}
}