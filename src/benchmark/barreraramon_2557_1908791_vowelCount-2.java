/**
 * This program counts the number of vowels from user input
 * @author Ramon Barrera    
 * Oct 30, 2023
 */

 import java.util.Scanner;

public class vowelCount {

    /**
     * This is the entry point of the program
     * @param   args    a list of arguments passed on by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" Enter a word:");
        String list =  in.nextLine();
        list = list.toLowerCase();
        int vowelcount = 0; 

        for (int counter = 0; counter < list.length(); counter++) {
            char letter = list.charAt(counter);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'u' || letter == 'o' || letter == 'y') {
                vowelcount++;
            }

        }
        System.out.println("The number of vowels in " + list + " is " + vowelcount);

        

        
    }
    
}
