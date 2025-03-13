/**
 * PA 06
 * This program allows the user to play a guess the random number game
 * @author  Alena Fisher
 * 11/9/2023
 */

import java.util.Scanner;
import java.util.Random;

public class GenerateNumber
{ 
        // A method to generate a random number
        private static int randomInt;
        public static void generateRandomNumber() 
        {
            Random rand = new Random();
            int upperbound = 100;
            randomInt = rand.nextInt(upperbound);
        }
    
        // A method that serves as the game engine
        public static void playGame() 
        {
            generateRandomNumber();
            Scanner in = new Scanner(System.in);
            int N = 5;
            String guess;
        
            for (int i = 1; i <= N; i++)
            {
                System.out.println("Guess " + i + ": ");
                guess = in.next();

                try {
                    int guess1 = Integer.parseInt(guess);
                    if (guess1 < 1 || guess1 > 100)
                    {
                        System.out.println("That is not a valid input. Please enter a number between 1 and 100.");
                        guess = in.next();

                    }
                
                    if (guess1 == randomInt)
                        {
                            System.out.println("Congratulations");
                            break;
                        }
        
                        else if (guess1 > randomInt)
                        {
                            System.out.println("Your guess is greater than the number");
                        }
        
                        else if (guess1 < randomInt)
                        {
                            System.out.println("Your guess is less than the number");
                        }

                        if (i == N)
                        {
                         System.out.println("You have used all of your tries.");
                            System.out.println("The number was " + randomInt);
                        }
                        } catch (NumberFormatException e) {
                            System.out.println("Exception: " + e.getMessage());
                            System.out.println("That is not a valid input. Please try again.");
                            guess = in.next();
                                                      
                            int guess1 = Integer.parseInt(guess);
                            if (guess1 < 1 || guess1 > 100)
                            {
                                System.out.println("That is not a valid input. Please enter a number between 1 and 100.");
                                guess = in.next();
                            }
                
                            if (guess1 == randomInt)
                            {
                                System.out.println("Congratulations");
                                break;
                            }
        
                            else if (guess1 > randomInt)
                            {
                                System.out.println("Your guess is greater than the number");
                            }
        
                            else if (guess1 < randomInt)
                            {
                                System.out.println("Your guess is less than the number");
                            }

                            if (i == N)
                            {
                                System.out.println("You have used all of your tries.");
                                System.out.println("The number was " + randomInt);
                            }

                        }   
            }
           
        }

        public static void main(String[] args) {
            /**
             * This is the main entry point of the program
             * @param   args   a list of possible arguments passed by the user
             */
            System.out.println("You have five tries to guess the random number between 1 and 100.");
            playGame();
        
            System.out.println("Would you like to play again?\t1. Yes\t2. No ");
            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();
            
            if (answer == 1)
            {
                 playGame();
            }

            else
            {
                System.out.println("Thanks for playing!");
            }
        }
    }
