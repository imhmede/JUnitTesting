/*
Maxwell Whitaker
4/20/2023
PA 11 
*/

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        System.out.println("Array with random numbers:");

        // Initialize array with 10 random integers
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100); // Generate random integer between 0 and 99
            System.out.print(arr[i] + " "); // Print the randomly generated number
        }
        System.out.println(); // Print a new line after the array

        // Print four lines of output
        System.out.println("Elements at an even index:");
        printEvenIndex(arr);
        
        System.out.println("Even elements:");
        printEvenElements(arr);
        
        System.out.println("All elements in reverse order:");
        printReverseOrder(arr);
        
        System.out.println("First element, Last Element");
        printFirstAndLast(arr);
    }

    // Method to print every element at an even index
    public static void printEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to print every even element
    public static void printEvenElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // Method to print all elements in reverse order
    public static void printReverseOrder(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to print only the first and last element
    public static void printFirstAndLast(int[] arr) {
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
