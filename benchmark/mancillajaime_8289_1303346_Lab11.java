import java.util.Random;

public class Lab11 {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Every element at an even index:");
        printEvenIndex(arr);
        System.out.println("\nEvery even element:");
        printEvenElements(arr);
        System.out.println("\nAll elements in reverse order:");
        printReverseOrder(arr);
        System.out.println("\nOnly the first and last element:");
        printFirstAndLast(arr);
    }
    
    public static void printEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void printEvenElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    
    public static void printReverseOrder(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void printFirstAndLast(int[] arr) {
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
