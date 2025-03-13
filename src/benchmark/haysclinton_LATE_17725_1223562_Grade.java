import java.util.Scanner;
public class Grade {
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a Grade (A,B,C,D, or F) ");
        String grade = in.nextLine();

        /**
         * These if statements check to see if grade is equal to A,B,C,D,F or a,b,c,d,f and if so will print the numeric value
         *
         */

        if (grade.equals("A")|| grade.equals("a")) {
            System.out.println("The numberic value of the letter grade A is 4");}

        if (grade.equals("B")|| grade.equals("b")) {
            System.out.println("The numberic value of the letter grade B is 3");}
        
        if (grade.equals("C")|| grade.equals("c")) {
            System.out.println("The numberic value of the letter grade C is 2");}
            
        if (grade.equals("D")|| grade.equals("d")) {
            System.out.println("The numberic value of the letter grade D is 1");}

        if (grade.equals("F")|| grade.equals("f")) {
            System.out.println("The numberic value of the letter grade F is 0");}
            
            
}
}