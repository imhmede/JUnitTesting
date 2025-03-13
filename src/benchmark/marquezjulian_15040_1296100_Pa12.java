import java.util.Arrays;
import java.util.Random;

public class Pa12 {
    
    public static void main(String[] args) {
        int[] a = generateRandomArray(10);
        int[] b = generateRandomArray(10);
        
        System.out.println("First Array: " + Arrays.toString(a));
        System.out.println("Second Array: " + Arrays.toString(b));
        
        boolean areEqual = equals(a, b);
        
        if (areEqual) {
            System.out.println("The arrays have the same elements in the same order.");
        } else {
            System.out.println("The arrays do not have the same elements in the same order.");
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
    
    public static int[] generateRandomArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }
        
        return arr;
    }
}
