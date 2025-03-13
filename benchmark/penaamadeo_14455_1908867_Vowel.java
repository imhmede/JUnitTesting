/**
 * PS 04
 * This program print the number of vowels in a word
 * @author Amadeo Pena
 * 10/29/2023
 */
import java.util.Scanner;

public class Vowel {
     /**
     * This method computes how many vowels are in the given word
     * @return total vowels
     */
    public static void main(String[]args){

        Scanner in= new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = in.nextLine().toLowerCase();
        char []vowels = {'a','e','i','o','u','y'};
        int sum = 0;

        for (int a = 0;a< word.length(); a ++){
            char position = word.charAt(a);
            for (char vowel: vowels){
                if (position == vowel){
                    sum++;
                    break;
                }
            }
        
        }
        System.out.println("The number of vowels in " + word + " is " + sum);
    }
        
}
   


