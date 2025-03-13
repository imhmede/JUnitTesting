import java.util.Scanner;
class GradeAvg 
{
    /**
     This program gives output for particular grade
     */
    public static void main(String[] args)
    {
        //Request grade input
        Scanner in = new Scanner(System.in);
        System.out.print("Input your avg: ");
        int grade = in.nextInt();
        
        // Output for grade avg using if and else if statments
        if(grade >= 90)
        {
            System.out.println("Your avg is: A");
        }
        else if(grade >= 80)
        {
            System.out.println("Your avg is: B");
        }
        else if (grade >=70)
        {
            System.out.println("Your avg is: C");
        }
        else if (grade >= 60) 
        {
            System.out.println("Your avg is: D");	
        }
        else
        {
            System.out.println("Your avg is: F");
        }
    }		
}	