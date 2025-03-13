import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str) {
        // If the string is empty or has only one character, it is already reversed
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        // Reverse the substring starting at the second character, then add the first character at the end
        String reversedSubstr = reverse(str.substring(1));
        char firstChar = str.charAt(0);
        return reversedSubstr + firstChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to reverse: ");
        String str = scanner.nextLine();
        scanner.close();

        String reversedStr = reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
