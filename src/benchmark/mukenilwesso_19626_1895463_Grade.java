import java.util.Scanner;
/*
 * LWESSO MUKENI
 * OCT 24, 2023
 * PA 04
 * 
 */

public class Grade {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a grade betrween 0-100: ");
        int score = in.nextInt();

        if(score >= 90 && score <= 100)
        {
            System.out.println("Score: " + score + " " + "Grade: A");
            
        }

        else if (score >= 80 && score <= 89)
        {
             System.out.println("Score: " + score + " " + "Grade: B");

        }
        else if (score >= 70 && score <= 79)
        {
            System.out.println("Score: " + score + " " + "Grade: C");


        }
        else if (score >= 60 && score <= 69)
        {
            System.out.println("Score: " + score + " " + "Grade: D");

        }
        else{
            System.out.println("Score: " + score + " " + "Grade: F");

        }
    }

    
}
