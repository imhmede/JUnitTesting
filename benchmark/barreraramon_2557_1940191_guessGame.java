/**
 * This program is a guess the random number game in 5 guesses
 * @author Ramon Barrera    
 * Nov 7, 2023
 */

import java.util.Random;
import java.util.Scanner;

public class guessGame {

    /**
     * This is the entry point of the program
     * @param args starts the list of possibilities passed on by the user
     */

    public static void main(String[] args) {
        playGame();
    }

    /**
     * Serves as the entry point of the game
     */
    public static void playGame(){
        Scanner in = new Scanner(System.in);
        Random random = new Random();



        do{
            int randomNumber = generateRandomNumber();
            int counter = 0;
            //int max = 5;
            

            System.out.println("Lets play a game. Guess the random number between 1 and 100.");
            //System.out.println(randomNumber);

            while (counter < 5) {
            System.out.print("Enter your guess : ");
            int userGuess = in.nextInt();

                
             
               counter++;


                if (userGuess == randomNumber) {
                    
                    break;
                 } else if (userGuess < randomNumber) {
                    System.out.println("Guess higer number");
             } else {
                    System.out.println("Guess lower number");
               }
                
                
            }
            if (counter == 6) {
                    System.out.println("You lost the game");
                 } else {
                    System.out.println("You won the game");
                }

            System.out.print("Do you wnat to try again? yes / no :  ");
       } while (in.next().equalsIgnoreCase("yes"));

        System.out.println("Goodbye");
        in.close();
        }

    /**
     * This method generates the random number for the game
     * @return the generated random integer
     */
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
        }
    
}


