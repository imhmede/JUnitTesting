//Jacob Rogers
//PA_04
//March 6, 2023


import java.util.Scanner;

public class CompareStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2))
		    System.out.println("All the same");
		else
		    System.out.println("Neither");
	}
}