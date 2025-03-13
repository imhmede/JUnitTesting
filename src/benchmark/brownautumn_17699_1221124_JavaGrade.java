import java.util.Scanner;

public class JavaGrade 
{
 public static void main(String[] args)
 {

    Scanner in = new Scanner(System.in);

    int numgrade; 

    System.out.print("Enter a letter grade: ");
    String grade = in.nextLine();

    in.close();

    if(grade.equals("A"))
    {
        numgrade = 4;
        System.out.printf("The numeric value of the letter A is " + numgrade + "\n"); 
    }
        else if(grade.equals("B"))
        {
            numgrade = 3;
            System.out.printf("The numeric value of the letter B is " + numgrade + "\n");
        }
            else if(grade.equals("C"))
            {
                numgrade = 2;
                System.out.printf("The numeric value of the letter C is " + numgrade + "\n");
            }
                else if(grade.equals("D"))
                {
                    numgrade = 1;
                    System.out.printf("The numeric value of the letter D is " + numgrade + "\n");
                }
                    else if(grade.equals("F"))
                    {
                        numgrade = 0;
                        System.out.printf("The numeric value of the letter F is " + numgrade + "\n");
                    }  
else
    {
        System.out.println("Invalid entry. Program terminated.");
    }
 }
}