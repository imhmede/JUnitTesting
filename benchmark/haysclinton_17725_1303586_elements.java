
import java.util.Random;

public class elements {
 //* Random Number generator method that fills array with random numbers but only uses numbers from 0 - 99 */
  
    public static int [] fillWithRandomNumbers(int[] values) 
    {
        int[] numbers = new int[values.length];
        for(int I = 0; I < values.length; I++) 
        {
            Random randNum = new Random(I);
            numbers[I] = randNum.nextInt(99);
        }
    return numbers;
    }
    //* Displays even numbers in an array */

    public static int[] numEven(int list[]){
        for(int i = 0;i < list.length; i++)
        {
    
        if (list[i] %2==0)
        {
            int evenNumber = i;
            System.out.print(" "+list[i] + " ");
        }

    }
    return list;
}
/** This Method Displays an Array in reverse order */
public static  void reverse(int list [])
{
    for(int i=list.length-1;i>=0;i--)
     System.out.print(list[i] + "  ");
}
//* This Method Displays values in an Array only at the Even Index's Example would print value for list[1],list[3],list[5] */
//* This displays the even values on the screen.  */

public static int[] IndxNumEven(int list[]){
    for(int t =0; t < list.length; t++)
{
    if (t % 2 == 1) {
        System.out.print(list[t] +"  ");
    }


}
return list;
}
public static int [] firstLastIndx(int list[])
{
    int j = 1;
    if(j >= 1){
        System.out.println("        [" + list[0] +", "+ list[9]+"]");
    
    }
    return list;
}

    
    public static void main(String[] args)
    {
        //* Declaring a new array values then running it in the random number generator and printing the results */
        int evenNumber = 0;
        int [] values = new int[10];
        System.out.println("Array with Random Numbers");
    
       int [] newarr = fillWithRandomNumbers(values);
      
       //* Printing the random number array, then the even Index values */

        System.out.println("        "+newarr[0] +"  "+ newarr[1]+"  "+newarr[2]+"  "+newarr[3]+"  "+newarr[4]+ "  "+newarr[5]+"  "+newarr[6]+"  "+newarr[7]+"  "+newarr[8]+"  "+newarr[9]);
        System.out.println("Elements at an Even Index:");
        System.out.print("        ");
        IndxNumEven(newarr);
        System.out.println();
        System.out.println("Even Elements: ");
        System.out.print("       ");

        //* This finds the even values in the array and prints them on screen */

        int [] evennewnum = numEven(newarr);
        System.out.println("");
        //* Prints the random number array in reverse */

        System.out.println("All Elements in Reverse Order:");
        System.out.print("        ");
        reverse(newarr);
        System.out.println();
       

        //* Prints the First value and the last value of the random number array */

        System.out.println("[First Element, Last Element]");
        firstLastIndx(newarr);
    
        

       
       
    }
}
