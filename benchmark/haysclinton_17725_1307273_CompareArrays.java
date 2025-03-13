import java.util.Arrays;
import java.util.Random;
//*This Method compares two arrays for size and then to compare each element value. */
public class CompareArrays {
    public static boolean equals( int [] a, int [] b) {

        // check if the parameter is null
        if (a == null) {
            return false;
        }
    
        // check if the lengths are the same
        if (a.length != b.length) {
            return false;
        }
    
        // check the elements in the arrays
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            } 
        }
    
        // if true then the arrays are the same size and contain the same elements
        return true;
    }
    public static int [] fillWithRandomNumbers(int[] values) 
    {
        int[] numbers = new int[values.length];
        for(int I = 0; I < values.length; I++) 
        {
            Random randNum = new Random();
            numbers[I] = randNum.nextInt(9);
            /**System.out.print(numbers[I]+"   ");*/
        }
    return numbers;
    }

        public static void main(String[] args)
        //*Declaring variables. Array a and Array b are the original. values1 is a snap shot of Array a and values2 is a snap shot of Array b. */
        //* Need the snap shot Array because if the fillWithRandomNumbers method is called again the Array a will change again. */ 
    {
        int [] a = new int [10];
        int [] b = new int [10];
        int [] values1 = new int [10];
        int [] values2 = new int [10];
        values1 = fillWithRandomNumbers(a);
        values2 = fillWithRandomNumbers(b);
        //*Printing the first and second Array. Notice the snapshot Array's being used for this. If we didn't do this the */
        //* Array would change everytime we called it. */
        System.out.println("First Array:");
        System.out.print("        ");
        System.out.println(values1[0]+"   "+values1[1]+"   "+values1[2]+"   "+values1[3]+"   "+values1[4]+"   "+values1[5]+"   "+values1[6]+"   "+values1[7]+"   "+values1[8]+"   "+values1[9]);
         //*Printing the first and second Array. Notice the snapshot Array's being used for this. If we didn't do this the */
        //* Array would change everytime we called it. */
        System.out.println();
        System.out.println("Second Array:");
        System.out.print("        ");
        System.out.println(values2[0]+"   "+values2[1]+"   "+values2[2]+"   "+values2[3]+"   "+values2[4]+"   "+values2[5]+"   "+values2[6]+"   "+values2[7]+"   "+values2[8]+"   "+values2[9]);
        
        //*This compares the 2 Arrays by calling the equals method. If it is true then will print the two arrays are the same and if it returns a false will */
        //* print the two arrays are not the same. */
        System.out.println();
        if(equals(values1,values2) == true)

        {
            System.out.print("The two arrays have the same elements in the same order.");
        }else System.out.print("The two arrays do not have the same elements in the same order.");
        
      
    }

}
  

