import java.util.Scanner;

/*Lwesso Mukeni
 * October 24, 2023
 * PA 04
 *
 * first input: enter the first string
 * second input: enter the second string
 * checks if the input are the same or not
 */

public class CompareStrings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String first = in.next();

        System.out.print("Enter the second String: ");
        String second = in.next();

        if( first.equals(second)){
            System.out.println("all the same");
        }
        else{
            System.out.println("neither");
        }

    }
    
}
