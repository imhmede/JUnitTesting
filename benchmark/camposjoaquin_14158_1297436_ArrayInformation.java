import java.lang.Math;
import java.util.ArrayList;
public class ArrayInformation
{
    public static ArrayList<Integer> evenIndexMethod(int[] mainArray) { // Initialize evenIndexMethod()
        
        ArrayList<Integer> output = new ArrayList<>(); // Initialize ArrayList output
        
        for (int i = 1; i < mainArray.length; i += 2) { // Starts at the second number, increases index by 2
            
            output.add(mainArray[i]); // Add number at index i to the ArrayList
        }
        
        return output; // Return the ArrayList
    }
    
    public static ArrayList<Integer> evenNumberMethod(int[] mainArray) { // Initialize evenNumberMethod()
        
        ArrayList<Integer> output = new ArrayList<>(); // Initialize ArrayList output
        
        for (int i = 0; i < mainArray.length; i++) { // Starts at the first number, increases index by 1
            
            double temporary = mainArray[i]; // Initialize double temporary, automatic type casting for ceiling and floor function calculations
            if (Math.floor(temporary / 2) == Math.ceil(temporary / 2)) { // Checks if temporary / 2 is a whole number
                output.add(mainArray[i]); // Add number at index i to the ArrayList
            }
        }
        
        return output; // Return the ArrayList
    }
    
    public static int[] reverseArrayMethod(int[] mainArray) { // Initialize reverseArrayMethod()
        
        int[] output = new int[mainArray.length]; // Initialize int[] output, regular array used because the size of the array is already known
        
        for (int i = 0; i < mainArray.length; i++) { // Starts at the first number, increases index by 1
            
            output[i] = mainArray[mainArray.length - i - 1]; // Add number at the ith-last index to the array
        }
        
        return output; // Return the array
    }
    
    public static int[] endpointsArrayMethod(int[] mainArray) { // Initialize endpointsArrayMethod()
        
        int[] output = new int[2]; // Initialize int[] output
        output[0] = mainArray[0]; // First element in output is first element in mainArray
        output[1] = mainArray[mainArray.length - 1]; // Last element in output is last element in mainArray
        
        return output; // Return the array
    }
    
	public static void main(String[] args) {
	    
	    int arraySize = 10; // New variable used for the general case, starting with an array of arbitrary size
		int[] mainArray = new int[arraySize]; // Initialize int[] mainArray
		
		for (int i = 0; i < mainArray.length; i++) { // Starts at the first number, increases index by 1
		    
		    double temporary = Math.random() * 100; // Generates a random number from 1 to 100
		    mainArray[i] = (int) temporary; // Adds random number to mainArray, typecasts from double to int
		}
		
		ArrayList<Integer> evenIndex = evenIndexMethod(mainArray); // Initialize ArrayList evenIndex using evenIndexMethod(mainArray)
		ArrayList<Integer> evenNumber = evenNumberMethod(mainArray); // Initialize ArrayList evenNumber using evenNumberMethod(mainArray)
		int[] reverseArray = reverseArrayMethod(mainArray); // Initialize int[] reverseArray using reverseArrayMethod(mainArray)
		int[] endpointsArray = endpointsArrayMethod(mainArray); // Initialize int[] endpointsArray using endpointsArrayMethod(mainArray)
		
		System.out.println("Array with random numbers:");
		for (int i = 0; i < mainArray.length; i++) { // Starts at the first number, increases index by 1
		    System.out.printf("%3d", mainArray[i]); // Prints the number at index i
		}
		
		System.out.println();
		System.out.println("Elements at an even index:");
		for (int i = 0; i < evenIndex.size(); i++) { // Starts at the first number, increases index by 1
		    System.out.printf("%3d", evenIndex.get(i)); // Prints the number at index i
		}
		
		System.out.println();
		System.out.println("Even-valued elements:");
		for (int i = 0; i < evenNumber.size(); i++) { // Starts at the first number, increases index by 1
		    System.out.printf("%3d", evenNumber.get(i)); // Prints the number at index i
		}
		
		System.out.println();
		System.out.println("All elements in reverse order:");
		for (int i = 0; i < reverseArray.length; i++) { // Starts at the first number, increases index by 1
		    System.out.printf("%3d", reverseArray[i]); // Prints the number at index i
		}
		
		System.out.println();
		System.out.println("[First Element, Last Element]");
		System.out.printf("[%d, %d]", endpointsArray[0], endpointsArray[1]); // Prints the numbers at indices 0 and 1
	}
}
