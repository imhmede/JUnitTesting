/**
 * This program is a guessing game where the user may attempt to guess a random integer, getting feedback about whether the integer is larger or smaller than the correct answer.
 * @author Kyle Dean
 * 08 November 2023
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    
    /**
     * This method, generateRandomNumber, generates a random number for use in the game.
     * There are no parameters to declare for this method.
     */
    
    public static int generateRandomNumber()
    {
        Random rand = new Random(); 
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        int_random++; // This line makes sure that int_random is in the range 1-100, inclusive.
        return int_random;
    }
    
    
    static int integer_guess; // This variable serves to take the user's input in the following playGame method, and must be declared in this scope for the program to function.
    
        
    /**
     * This method, playGame, handles the playing of the game itself, taking inputs from the user and checking them against the randomly generated integer int_random.
     * @param int_random The randomly generated integer which was generated in the generateRandomNumber method.
     */
    
    public static void playGame(int int_random)
    {
        Scanner in = new Scanner(System.in);
        
        int guess_counter;
        
        for (guess_counter = 1; guess_counter < 6; guess_counter++)
        {
            System.out.println("Please input the integer for guess #" + guess_counter + " of 5:\n");
            String input_guess = in.next();
            
            try
            {
                integer_guess = Integer.parseInt(input_guess);
            }
            
            catch (NumberFormatException e)
            {
                System.out.println("Please try again, inputting only an integer value.\n");
                guess_counter--;
            }
            
            if (integer_guess != int_random && guess_counter == 5)
            {
                System.out.print("You ran out of attempts. Play again? Please enter 'yes' or 'no' without the apostrophes.\n");
                afterGame();
            }
            
            if (integer_guess == int_random)
            {
                System.out.print("You won! Play again? Please enter 'yes' or 'no' without the apostrophes.\n");
                afterGame();
            }
            
            else if (integer_guess > int_random)
            {
                System.out.print("The number you guessed is larger than the correct number.\n");
            }
            
            else
            {
                System.out.print("The number you guessed is smaller than the correct number.\n");
            }
            
        }
            
        }
    
    
    /**
     * This method, afterGame, checks if the user wants to restart the game or quit after finishing.
     * There are no parameters to declare for this method.
     */
    
     public static void afterGame()
        {
            Scanner in = new Scanner(System.in);
            String repeat_quit_command = in.next();
            
            if (repeat_quit_command.equals("yes"))
            {
                generateRandomNumber();
                playGame(generateRandomNumber());
            }
            
            else if (repeat_quit_command.equals("no"))
            {
                System.out.print("Goodbye.");
                System.exit(0);
            }
            
            else
            {
                System.out.print("Please enter only 'yes' or 'no' without the apostrophes.\n");
                afterGame(); // If the user does not input a proper response, this line recursively restarts the after_Game method to allow for another input.
            }
            
        }
    
    
    /**
     * This is the main method and entry point to the program. 
     * @param args a list of command line arguments which may be passed by the user.
     */
    
    public static void main(String[] args)
    {
        System.out.print("This game generates a number from 1 to 100, which may be guessed in up to 5 attempts. Good luck!\n");
        generateRandomNumber();
        playGame(generateRandomNumber());
    }
}