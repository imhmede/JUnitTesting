/**
 * This program is designed to generate a random number and 
 * allow the user 5 guesses to get the number right.
 * @author Jordan Arguello
 * 11/9/23
 */
import java.util.Scanner;

public class Game {
    /**
     * This method is used to generate a random number using the math.random method.
     * A minimum and maximum value are set and from those a random 
     * number is assigned within that interval.
     */
    public static int generateRandomNumber {
        int min = 1;
        int max = 100;
        System.out.println("Random value in int from "+ min + " to " + max +":");
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Random number has been generated.");
    }
/**
 * This method is desgined to recieve a user input as their guess.
 */
     public static int playGame {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first guess");
        int number = in.nextInt();
     }  
     /**
      * This is the main method, it will compare the user input
      to the random number.
      It will return whether the random number is higher or lower 
      than the input, when applicable.
      @param args a list of all possible arguments for the program.
      */
    public static void main(String[] args) {
        int Counter = 0;
        if (number < random_int);
        System.out.println("The random number is higher than " + number);
        if (number > random_int);
        System.out.println("The random number is lower than " + number);
        if (number = random_int);
        System.out.println("You guessed the number right!");
        Counter = Counter ++;
        if (Counter == 5);
        System.out.println("You failed to guess the number in 5 attemps.");
        
    }
    
}