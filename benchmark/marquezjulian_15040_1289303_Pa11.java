import java.util.Random;

public class Pa11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
        }
        
        System.out.print("Elements at even indices: ");
        printEvenIndices(arr);
        
        System.out.print("Even elements: ");
        printEvenElements(arr);
        
        System.out.print("Elements in reverse order: ");
        printReverseOrder(arr);
        
        System.out.print("First and last element: ");
        printFirstAndLast(arr);
    }
    
    public static void printEvenIndices(int[] arr) {
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

        