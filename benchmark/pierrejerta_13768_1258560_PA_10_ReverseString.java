import java.util.Scanner;
public class PA_10_ReverseString {
    public static String reverse(String str) {
        // If string is empty
        if(str.isEmpty())
            return str;
        // reverse substring starting from 2nd char and add first char at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args) {
        // Variable declaration
        String input_str;
        // Create a scanner object
        Scanner sc = new Scanner(System.in);
        // Get the user input
        System.out.println("Enter a word:");
        input_str = sc.next();
        System.out.println(reverse(input_str));
    }
}
