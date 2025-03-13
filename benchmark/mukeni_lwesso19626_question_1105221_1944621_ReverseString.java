import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String prompt){

        if(prompt.length() == 0 || prompt.length() == 1){
            return prompt;
        } else{
            return reverseString(prompt.substring(1)) + prompt.charAt(0);

        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = in.nextLine();

        String reverseString = reverseString(userInput);
        
        System.out.println("The reverse string is "+ reverseString);
    }
}
