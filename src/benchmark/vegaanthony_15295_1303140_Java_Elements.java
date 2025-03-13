import java.util.Random;
public class Java_Elements {
    public static void main(String[] args){

        // object of class Random to geretating random numbers 
        Random rand = new Random();

        // array to store numbers
        int[] arr = new int[10];
            int n = arr.length;
            
           // Initialisation of array with random int
            for(int i=0; i<n; i++) arr[i] = rand.nextInt(2000);

            //printing element at even index
            System.out.println("Array With Random Numbers:");
            for (int i=1; i<n; i += 2)
            
            {
                System.out.print(arr[i] + "    ");
            }
            System.out.println();

            // printing even elements
            System.out.println("Element At An Even Index:");
            for (int i=0; i<n; i++)
            {
                if (arr[i]%2 == 0)
                System.out.print(arr[i] + "    ");
            }
            System.out.println();

            // printing element in reverse order
            System.out.println("All Elements In Reverse Order:");
            for (int i=n=1; i>0; i--)
            {
                System.out.print(arr[i] + "    ");
            }
            System.out.println();

            //printing first to last
            System.out.println("First Element, Last Element:");
            System.out.print(arr[0] + "    " + arr[n-1]);

            



    }
}