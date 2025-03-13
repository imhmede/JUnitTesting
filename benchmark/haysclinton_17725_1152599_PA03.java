import java.util.Scanner;

public class PA03
{
    public static void main(String[] args)
{
    //* Read in 1st and Second Integers */


    Scanner in = new Scanner(System.in);
    System.out.println("Please enter first Integer:");
    System.out.println();
    int firstinteger = in.nextInt();
    System.out.println("Please enter second Integer");
    System.out.println();
    int secondinteger = in.nextInt();

    //*Calculate the Sum of the 2 integers */

    System.out.print("The Sum of the two numbers is ");
    System.out.println(firstinteger + secondinteger);

    //*Calculate the Differene between the two integers. */
    //*If the Difference is neg then program will take the abs value to produce a positive differntial number */

    int difFone; 
    int diff = firstinteger-secondinteger;
    if (diff <0) { 
        difFone = Math.abs(diff);
    
    System.out.print("The difference between the two numbers is ");
    System.out.println(difFone);
    } else {
        System.out.print("The difference between the two numbers is ");
        System.out.println(diff);
    }

    //* Calculate the product of the 2 integers */

    System.out.print("The product of the two numbers is ");
    System.out.println(firstinteger * secondinteger);

    //* Calculate the average of the 2 integers */
    //* This also uses the printformat to take one space after the : and then have 6 digits after the .  */

    double avnum = (firstinteger + secondinteger)/2;
    System.out.printf("The average is: %1.6f", avnum);
}
}

