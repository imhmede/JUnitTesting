import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = generateRandomNumber();
        int maxAttempts = 5;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 100. Try to guess it!");

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                return;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Sorry, you're out of attempts. The correct number was " + randomNumber + ".");
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
