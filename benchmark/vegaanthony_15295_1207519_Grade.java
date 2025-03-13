import java.util.Scanner;

public class Grade {
    public static double getNumericGrade(String grade){
        final double A_VALUE = 4.0;
        final double B_VALUE = 3.0;
        final double C_VALUE = 2.0;
        final double D_VALUE = 1.0;
        final double F_VALUE = 0.0;
        double numericValue = F_VALUE;

        if (grade.charAt(0)== 'A')
        {
            numericValue = A_VALUE;
        }
        if (grade.charAt(0)== 'B')
        {
            numericValue = B_VALUE;
        }
        if (grade.charAt(0)== 'C')
        {
            numericValue = C_VALUE;
        }
        if (grade.charAt(0)== 'D')
        {
            numericValue = D_VALUE;
        }
        if (grade.charAt(0)== 'F')
        {
            numericValue = F_VALUE;
        }
        
         else if (numericValue == F_VALUE) System.out.println("Invalid letter grade. Program is terminated");
        {
            
        }
    
    return numericValue;
       
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String grade = in.next();
        System.out.println("The numeric value of the garde is: " +Grade.getNumericGrade(grade));
    
    }
    
}


