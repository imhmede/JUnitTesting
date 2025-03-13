import java.util.Random;
import java.util.Scanner;

/* Lwesso Mukeni
PA 06
Novermber 8th, 2023
 */


/*
 generateRandomNumber():
     Generates a random number between 1 and 100
 playGame()
    userAttempts sets to 0
    maxAttempts sets to 5
    display prompt for user to enter guessing number
    Try exception() check user's input validation 
    if statement to check user's input and the current status 
 */


public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;
        
         // resets the program and generates new random number if user enters yes

        while (playAgain) {
           
            int randomNumber = generateRandomNumber();
            playGame(randomNumber, in);

            System.out.print("Do you want to play again yes or no: ");
            String response = in.next();

            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game over.");
         
    }
    
    //method generates a random number between 1 and 100

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    // method sets the game in motion

    public static void playGame(int randomNumber, Scanner in) {
        int userAttempts = 0;
        int maxAttempts = 5;

        
        System.out.println("Guess a number between 1 and 100.");

        while (userAttempts < maxAttempts) {
            
            // checks for user's input validation
            try {
                System.out.print("Enter your number: ");
                int userGuess = in.nextInt();
                userAttempts++;

                if (userGuess < 1 || userGuess > 100) {
                    throw new IllegalArgumentException("Enter a number in range of 1 to 100.");
                }

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("You took " + userAttempts + " attempts.");
                    return;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                in.next(); 
            }
        }

        System.out.println(" Incorrect. The correct number is " + randomNumber);
    }
}