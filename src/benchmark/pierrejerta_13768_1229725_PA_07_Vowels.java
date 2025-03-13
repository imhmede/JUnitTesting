import static java.lang.Math.abs;
import java.util.Scanner;

public class PA_07_Vowels {
    public static void main(String[] args) {
        // Variable declarations
        String word;
        int vowel_count = 0;
        
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Get the user inputs
        System.out.println("Enter a word:");
        word = sc.nextLine();
        
        for (int i=0 ; i<word.length(); i++){
         char ch = word.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            vowel_count ++;
         }
        }
      System.out.println("The number of vowels in " + word + " is " + vowel_count);
    }
}
