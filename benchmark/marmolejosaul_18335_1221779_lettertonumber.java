import java.util.*;

//Saul Marmolejo
//3-10-2023
//Programming Assignment 05

public class lettertonumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String input = scanner.next();
        if (input.toLowerCase().equals("a")){
            System.out.println("The numeric value of the letter grade A is 4");
        } else if (input.toLowerCase().equals("b")){
            System.out.println("The numeric value of the letter grade B is 3");
        } else if (input.toLowerCase().equals("c")){
            System.out.println("The numeric value of the letter grade C is 2");
        } else if (input.toLowerCase().equals("d")){
            System.out.println("The numberic value of the letter grade D is 1");
        } else if (input.toLowerCase().equals("f")){
            System.out.println("The numberic value of the letter grade F is 0");
        } else {
            System.out.println("Invalid letter grade. Program is terminated.");
        }
    }
}
