//Aric J. Munoz
//PA11
//19April2023

import java.util.Random;
class RandomIntegers{
    public static void main(String[] args) {
        Random rand = new Random(); // object of class Random for generation of random numbers.
        
        int[] arr = new int[10];    // array to store the numbers
        int n = arr.length;
        for(int i=0; i < n; i++)    arr[i] = rand.nextInt(100);    // initialisation of array with random integers.
        
        // printing element at even index
        for (int i=1; i<n; i += 2)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
         // printing even elements
        for (int i=0; i<n; i++)
        {
            if(arr[i]%2 == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // printing element in reverse order
        for (int i=n-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // printing only first and last element
        System.out.print(arr[0] + " " + arr[n-1]);
        
        
    }
}