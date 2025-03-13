/**
 * This program checks wether two arrays have the same elements in the same order
 * @ Schiller Douyon
 * @ 04/24/2023
 */
 import java.util.Scanner;
 import java.util.Random;
public class  CompareArrays
{
	/** 
	 * This the main method
	 * @param args a list of command-line arguments
	 */
	public static void main(String[] args) 
    {
		int[] a = { 2, 5,  2, 5,  4,  1, 8, 0, 3, 1 };
		int[] b = { 7, 8,  9, 8,  9,  7, 2,2, 2, 7  };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(" The two do not have the same elements in the same order"+equals(a, b));
	}

	public static boolean equals(int[] a, int[] b) {
		// checking if both array size are same
		if (a.length != b.length)
			return false;

		// checking if the content of both array are same
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				// return false when array contents are different
				return false;
		}

		// return true when both array are same
		return true;
	}

}