import java.util.Scanner;
public class sortedNumbers {
	public static void sort(int i1, int i2, int i3){
		/*
		 * Author: Derek White
		 * Date: 28 September 2022
		 */

		int input1 = i1;
		int input2 = i2;
		int input3 = i3;
		/*
		 * Literally just comparing numbers to see if equal or larger
		 * from one input to the next to ensure if it's in order whether
		 * the order is rising or falling from the user's input.
		 */
		if(input1 >= input2 && input2 >= input3){
			System.out.println("In order.");
		}
		else if(input1 <= input2 && input2 <= input3){
			System.out.println("In order.");
		}
		else{
			System.out.println("Not in order.");
		}
	}
	public static void main(String [] args){
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter three numbers to check\nto see if in order: ");
		int input1 = userinput.nextInt(10);
		int input2 = userinput.nextInt(10);
		int input3 = userinput.nextInt(10);
		sort(input1, input2, input3);
	}
}
