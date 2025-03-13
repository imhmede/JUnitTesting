/**
*This program lists a user 3 favourite movies
*@author Mwali Kuya
*09\21\2023
*/

import java.util.Scanner;

public class Main {
/**
*this method lists a users three favourite movies
*@Param args
*/
    public static void main(String[] args) {
        // Define variables
        String f_movie, secondf_movie, thirdf_movie;

        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
/**
*This is where the user inputs their favourite movies
*/

        // Take the input from the user
        System.out.println("Enter the name of your favourite movie");
        f_movie = scanner.nextLine();

        System.out.println("Enter name of second favourite movie");
        secondf_movie = scanner.nextLine();

        System.out.println("Enter the name of your third favourite movie");
        thirdf_movie = scanner.nextLine();

        // Display
        System.out.println("Favourite movie: " + f_movie);
        System.out.println("Second favourite movie: " + secondf_movie);
        System.out.println("Third favourite movie: " + thirdf_movie);
    }
}


