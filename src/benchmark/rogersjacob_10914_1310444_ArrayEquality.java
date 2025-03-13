//Jacob Rogers
//CS_123P
//April 24, 2023

import java.util.Random;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = generateArray();
        int[] b = generateArray();
        
        System.out.println("First Array:");
        printArray(a);
        System.out.println("Second Array:");
        printArray(b);
        
        if (equals(a, b)) {
            System.out.println("The two arrays have the same elements in the same order");
        } else {
            System.out.println("The two arrays do not have the same elements in the same order");
        }
    }
    
    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] generateArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
    public static void printArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]);
        if (i < a.length - 1) {
            System.out.print(" ");
        }
    }
    System.out.print("\n");

}
}