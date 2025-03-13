/**
 PA 06
 Andrew Boese
 CS 123
 Essa Imhmed
*/
//functions
import java.util.Scanner;
public class main{
        public static void playGame() {
            //loop for replaying the game
            int Game = 0;
            while (Game <= 0) {

                Scanner num_guess = new Scanner(System.in);
                Scanner obj_game = new Scanner(System.in);

                // Generates the random number
                int number = 1 + (int) (100
                        * Math.random());

                // sets the attempt limit
                int attempts = 5;
                int i, guess;

                System.out.println("you have 5 attempts to guess the number");
                for (i = 0; i < attempts; i++) {

                    System.out.println("Guess the number:");

                    //Take input for guessing
                    guess = num_guess.nextInt();

                    //If the number is guessed
                    if (number == guess) {
                        System.out.println("Congratulations you guessed the number.");
                        //Restart
                        System.out.println("if you want to restart enter 0 if you want to quit enter 1");
                        Game = obj_game.nextInt();
                    //Number is greater
                    } else if (number > guess
                            && i != attempts - 1) {
                        System.out.println("The number is greater than " + guess);
                    //Number is less
                    } else if (number < guess
                            && i != attempts - 1) {
                        System.out.println("The number is less than " + guess);
                    }
                }
                //Attempts exhausted
                if (i == attempts) {
                    System.out.println("You have exhausted your attempts");
                    System.out.println("The number was " + number);
                }
                //Restart
                System.out.println("if you want to restart enter 0 if you want to quit enter 1");
                Game = obj_game.nextInt();
            }

        }
    //Driver Code
    public static void
    main(String arg[])
    {
        playGame();
    }
}