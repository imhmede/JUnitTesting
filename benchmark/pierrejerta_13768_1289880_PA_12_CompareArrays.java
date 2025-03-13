/**
 *
 * @author Jerta Pierre
 */
public class PA_12_CompareArrays {
    public static void main(String[] args){
        //declare array with size 10
        // Initialize the two arrays using the InitializeArray method
        int[] array1=initializeArray();
        int[] array2=initializeArray();
        
        // Call method to print array elements
        System.out.println("First Array:");
        printArrayElements(array1);
        System.out.println("Second Array:");
        printArrayElements(array2);
        
        if(equals(array1,array2)){
            System.out.println("The two arrays have the same elements in the same order.");
        }else{
            System.out.println("The two arrays do not have the same elements in the same order.");
        }
    }
    
    /**
    * <p>Initialize an array with 10 random integers</p>
    * @return an array initialized with 10 random integers
    */
    public static int[] initializeArray(){
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
    static void printArrayElements(int arr[]){
        // Print array elements using for-each loop
        for(int number: arr){
            // Print elements separated by space
            System.out.print(number+" ");
        }
        System.out.println();
    }
    
    /**
    * <p>Check whether two arrays have the same elements in the same order</p>
    * @param a[], b[] - arrays of numbers to be compared
    * @return true or false depending on whether the two arrays have the same elements in the same order
    */
    public static boolean equals(int[] a, int[] b){
        //  check if the two arrays' length is same.
        if(a.length!=b.length){
            return false;
        }
        //  check if corresponding elements for the two arrays are the same.
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
