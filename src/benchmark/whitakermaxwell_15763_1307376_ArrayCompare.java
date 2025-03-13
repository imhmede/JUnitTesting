/* 
Maxwell Whitaker
April 24, 2023
PA 12
*/

import java.util.Arrays;
import java.util.Random;

public class ArrayCompare {
    public static void main(String[] args) {
        int length = 10;
        int[] a = new int[length];
        int[] b = new int[length];

        // Creates array(s) with random numbers
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            a[i] = random.nextInt(100);
            b[i] = random.nextInt(100);
        }

        // Print arrays
        System.out.println("First Array: " + Arrays.toString(a));
        System.out.println("Second Array: " + Arrays.toString(b));

       // Check if arrays are equal and print result
        if (equals(a, b)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }

    public static boolean equals(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
