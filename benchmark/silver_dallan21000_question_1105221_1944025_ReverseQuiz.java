import java.util.Scanner;
/** This is a code that takes a user input and reverses it
 * @DallanSilver
 * CS123 ReverseQuiz
 * 11/12/23
 */
public class ReverseQuiz {
    
    /** This is the entry point to my code, which argues an input and gives a string output
     * @param   args   uses a for loop 
     */
    public static void main(String[] args) {

//Taking the user input
        Scanner in = new Scanner(System.in());
        System.out.println("Please enter a string: ");
        String str = scanner.nextLine();

       String r = reverse(str);
       System.out.println(r);
    }

//This is my method that contains the logic for reversing the input, so it can be called later
        public static String reverse(String s) {
            char[] letters = new char[s.length()];
            int letterIndex = 0;

// Creating a for loop
            for(int i = s.length() - 1; i >= 0; i--) {
                letters[letterIndex] = s.charAt(i);
                letterIndex++;
            }
//starting from the end of the string and working backwards to rearrange letters
            String reverse = "";
            for(int i = 0; i < s.length(); i++) {
                reverse = reverse + letters[i];
            }
            return reverse;
        }
    }

