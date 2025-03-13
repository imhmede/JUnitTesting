/**This program allows the user 5 attempts to guess the correct randomly generated number. 
 * The program will display whether the user wins or loses and allows the to retry after the 5 limits is reached.  
 * @author Danielle Sanchez
 * Date: 11/6/2023
 */

 import java.util.Scanner;
 import java.util.Random;

public class GuessGame{
    /**
     * This is the main entry of the program
     * @param args a list of possible arguments passed by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        playgame();
    }
    
    /*The main method to the game*/
    public static int playgame(){
        Scanner in = new Scanner(System.in);
        int user_guess, i;
        int num_trials =5;
        
        /**This loop allows the user to enter a number and displays if they guess right, given 5 tries and allows them to try again after thier limit and regenerates a new number if they restart the loop*/
        outer: while (true){
            generateRandomNumber();
            int rand_num = generateRandomNumber();
            for (i = 0; i<num_trials;i++){

                /*Asks for user input */
                System.out.println("Enter a number between 1 and 100: ");
                user_guess = in.nextInt();

                /*Determines if the number is valid */
                if(user_guess<1 || user_guess>100){
                    System.out.println("Please enter a valid number between 1 and 100");
                }

                /*If no problems, the loop begins */
                else if(rand_num == user_guess){
                System.out.println("You guess right!");
                break outer;
            }
            else if(rand_num < user_guess && i != num_trials -1){
                System.out.println("The number is less than " + user_guess);
            }
            else if(rand_num > user_guess && i != num_trials -1){
                System.out.println("The number is greater than "+ user_guess);
            }
        }
     /*Restarts the loop if user wants*/
            if (i == num_trials){
                System.out.println("You have reached the limit to the amount of guesses allowed. The number was " + rand_num);
                System.out.println("Would you to like play again? Enter yes or no");
                String answer = in.next();
                if(answer.equals("yes")){
                continue;
            }
            else{
                System.out.println("Thank you for playing");
                break;
            }
      }
        }
          return 0;
    }
        /*This method returns the random number generated*/
    public static int generateRandomNumber(){
        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}