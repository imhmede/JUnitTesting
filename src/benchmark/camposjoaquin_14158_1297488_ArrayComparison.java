import java.lang.Math;
public class ArrayComparison {
    
    public static boolean equals(int[] a, int[] b) { // Initializes equals()
        
        boolean similarityValue = true; // Initial value of similarityValue set to true
        
        for (int i = 0; i < a.length; i++) { // Starts at the first number, increases index by 1
            
            if (a[i] != b[i]) { // Check if the elements at index i are the same for both arrays
                
                similarityValue = false; // If the elements are different, set similarityValue to false
            }
        }
        
        return similarityValue; // Return similarityValue
    }
    
	public static void main(String[] args) {
	    
		int arraySize = 10; // New variable used for the general case, starting with an array of arbitrary size
		int[] a = new int[arraySize]; // Initializes int[] a
		int[] b = new int[arraySize]; // Initializes int[] b
		
		for (int i = 0; i < arraySize; i++) { // Starts at the first number, increases index by 1
		    
		    double temporaryA = Math.random() * 10; // Generates first random number from 1 to 10
		    double temporaryB = Math.random() * 10; // Generates second random number from 1 to 10
		    a[i] = (int) temporaryA; // Adds first random number to a, typecasts from double to int
		    b[i] = (int) temporaryB; // Adds second random number to b, typecasts from double to int
		}
		
		System.out.println("First Array:");
		for (int i = 0; i < arraySize; i++) { // Starts at the first number, increases index by 1
		    System.out.printf("%3d", a[i]); // Prints the number at index i
		}
		
		System.out.println();
		System.out.println("Second Array:");
		for (int i = 0; i < arraySize; i++) { // Starts at the first number, increases index by 1
		    System.out.printf("%3d", b[i]); // Prints the number at index i
		}
		
		System.out.println();
		if (equals(a, b)) { // Checks if equals(a, b) is true or false
		    System.out.print("The two arrays have the same elements in the same order."); // If true, print the equality message
		}
		
		else { // Otherwise, print the inequality message
		    System.out.print("The two arrays do not have the same elements in the same order.");
		}
	}
}
