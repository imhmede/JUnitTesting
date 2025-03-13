/**
 *
 * @author Jerta Pierre
 */

public class PA_11_Elements{
    public static void main(String[] args){
        //declare array with size 10
        // Initialize the array using the InitializeArray method
        int[] numbers=initializeArray();
        
        // Call method to print array elements
        System.out.println("Array with random number");
        printElements(numbers);
        
        // Call method to print elements whose index is even
        System.out.println("Elements at an even index");
        printEvenIndexElements(numbers);
        
        // Call method to print even elements
        System.out.println("Even elements");
        printEvenElements(numbers);
        
        // Call method to print elements in reverse order
        System.out.println("All elements in reverse order");
        printArrayReversed(numbers);
        
        // Call method to print the first and last elements
        System.out.println("[First Element, Last Element]");
        printFirstandLastElements(numbers);
    }
    
    /**
    * <p>Initialize an array with 10 random integers</p>
    * @return an array initialized with 10 random integers
    */
    static int[] initializeArray(){
        //declare array with size 10
        int[] arr=new int[10];
        //fill array with 10 random values
        for(int i=0;i<10;++i){
            // Use Math.Random to generate random integers 
            // (multiply by 10 since Math.Random returns values between 0 and 1)
            arr[i]=(int)(Math.random() * 10);
        }
        return arr;
    }
    
    /**
    * <p>Print all array elements using for-each loop</p>
    * @param arr[] an array of numbers to be printed
    */
    static void printElements(int arr[]){
        // Print array elements using for-each loop
        for(int number: arr){
            // Print elements separated by space
            System.out.print(number+" ");
        }
        System.out.println();
    }
    
    /**
    * <p>Print even-index elements using for-loop</p>
    * @param arr[] an array of numbers to be printed
    */
    static void printEvenIndexElements(int arr[]){
        // Increment the loop step by 2 starting from zero; this gives even indices 
        for(int i=0;i<arr.length;i+=2){
            // Print elements separated by space
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    /**
    * <p>Print even elements using for-each loop</p>
    * @param arr[] an array of numbers to be printed
    */
    static void printEvenElements(int arr[]){
        for(int num: arr){
            // Use modulus operator to check if element is divisible by 2
            if(num % 2==0){
                // Print elements separated by space
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    /**
    * <p>Print array elements in reverse order</p>
    * @param arr[] an array of numbers to be printed
    */
    static void printArrayReversed(int arr[]){
        // Start with the last array index and decrement to zero
        for(int i=arr.length-1;i>=0;i--){
            // Print elements separated by space
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    /**
    * <p>Print first and last array elements</p>
    * @param arr[] an array of numbers to be printed
    */
    static void printFirstandLastElements(int arr[]){
        System.out.println("[" + arr[0] + ", " + arr[arr.length-1] + "]");
    }
    
}