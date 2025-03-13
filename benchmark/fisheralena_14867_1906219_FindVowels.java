/**
 * PA 05
 * This program finds the vowels in a given string provided by the user
 * @author  Alena Fisher
 * 10/25/2023
 */

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        /**
         * This is the main entry point of the program
         * @param   args    a list of possible arguments passed by the user
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string1 = in.nextLine();
        int index = 0;
        int vowelCount = 0;
        
        
        for(index = 0; index < string1.length(); index++)
        {
            char vowel = string1.charAt(index);
            char a = 'A', e = 'E', i = 'I', o = 'O', u = 'U', y = 'Y';
            
            String Vowel = Character.toString(vowel);
            String A = Character.toString(a);
            String E = Character.toString(e);
            String I = Character.toString(i);
            String O = Character.toString(o);
            String U = Character.toString(u);
            String Y = Character.toString(y);
            
            
            if (Vowel.equalsIgnoreCase(A)) {
                vowelCount++;
                
            }
            
            if (Vowel.equalsIgnoreCase(E)) {
                vowelCount++;
                
            }
            
            if (Vowel.equalsIgnoreCase(I)) {
                vowelCount++;
                
            }
            
            if (Vowel.equalsIgnoreCase(O)) {
                vowelCount++;
                
            }
            
            if (Vowel.equalsIgnoreCase(U)) {
                vowelCount++;
                
            }

            if (Vowel.equalsIgnoreCase(Y)) {
                vowelCount++;
            }
        }
        System.out.print("The number of vowels in " + string1 + " is: " + vowelCount);
    }
}