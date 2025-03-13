
    
    /** 
     * This program is for a random number guessing game
     * @author Mwali Kuya
     * 10th November 2023
     */

public class vowel


    import java.util.Scanner;
/*
*this method implements the random number guessing game
*@param args a list of possible arguements passed by the user
*
 */


 import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = generateRandomNumber(1, 100); 
            int attempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have " + attempts + " attempts to guess the number.");

            while (attempts > 0) {
                System.out.print("Enter your guess (between 1 and 100): ");
                int playerGuess = scanner.nextInt();
                scanner.nextLine(); 

                if (playerGuess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    break;
                } else if (playerGuess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attempts--;
                System.out.println("Attempts remaining: " + attempts);
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        scanner.close();
    }

    public static int generateRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}

}

}
