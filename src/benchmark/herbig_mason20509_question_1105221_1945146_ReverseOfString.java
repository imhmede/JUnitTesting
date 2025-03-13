import java.util.Scanner;

public class ReverseOfString 
{

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scanner.nextLine();
        
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }

    private static String reverseString(String string) 
    {
        if (string.length() <= 1) 
        {
            return string;
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }
}