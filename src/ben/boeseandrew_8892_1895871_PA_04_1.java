/**
 PA 04
 Andrew Boese
 CS 123
 Essa Imhmed
 10/25/23
 */
import java.util.Objects;
import java.util.Scanner;
/**
 this code asks for two strings and then compares to see if they are the same then prints the results
 */
public class PA_04_1 {
    public static void main(String[] args) {
        //asks for the first string from the user
        System.out.println("Enter the first string:");
        Scanner s1 = new Scanner(System.in);
        String string_one = s1.nextLine();

        //asks for the second string from the user
        System.out.println("Enter the second string:");
        Scanner s2 = new Scanner(System.in);
        String string_two = s2.nextLine();

        // compares the two stings to see if they are the same
        if (Objects.equals(string_one, string_two)) {
            System.out.println("All the same");
        }

        else{
            System.out.println("Neither");
        }


    }
}