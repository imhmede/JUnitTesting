/**
 * This program creates a random generator number game 
 * @author: Ramon Oropesa
 * November 11, 2023
 */
import java.util.Scanner;

import java.util.Random; 

public class RandomNumber {

    public static void main(String [] args) {
      playGame ();

    }

    public static void playGame() {
      Scanner in = new Scanner(System.in); 
      Random rand = new Random(); 

      int upperbound = 101; 
      int int_random = rand.nextInt(upperbound); 
      int attempts = 0; 

      boolean correctGuess = false; 

      System.out.println("The game begins!");
      System.out.println("You must guess the secret number I have chosen between 1-100"); 

      while (attempts < 5) {
        System.out.println("Enter a guess: "); 
        int guess = scanner.nextInt(); 
        attempts ++; 

        if (guess == int_random) {
          correctGuess = true; 
          break;}
          else if (guess < int_random){
            System.out.println("Your guess is too low. Try again");
          }
          else if {
            System.out.println("Your guess is too high. Try again."); 
          }

        }
         if (correctGuess) {
              System.out.println("Congratulations! You guess the correct number" );
            }
            else {
              System.out.println("Sorry, you've run out of attempts. The correct number was" + int_random);
            }

      }
    }
  
}
