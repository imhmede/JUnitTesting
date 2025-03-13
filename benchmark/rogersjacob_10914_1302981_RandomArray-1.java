//Jacob Rogers
//CS 123P
//April 21, 2023

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        
        
        System.out.println("Array with random numbers:\n" + Arrays.toString(arr));
        
        
        System.out.print("\nElements at even indices:\n");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + "   ");
        }
        
        
        System.out.print("\n\nEven elements:\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "   ");
            }
        }
        
        
        System.out.print("\n\nArray in reverse order:\n");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "   ");
        }
        
        
        System.out.print("\n\n[First element, Last element]:\n");
        System.out.print("[" + arr[0] + ", " + arr[arr.length - 1] + "]");
    }
}
