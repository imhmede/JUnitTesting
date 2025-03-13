 /**
  **Every element at an even index. 
*Every even element.
*All elements in reverse order. 
*Only the first and last element. 
  *@Kiari Roberts
  *@4-21-2023
* */
import java.util.Scanner;

public class order
{
    
    public static void main(String[] args) 
    {
        Random r = new Random(); 
        // creating an object for Random class
        int a[] = new int[10];
        for(int i=0;i<10;i++)
        a[i] = r.nextInt(10); 
        // getting 10 random elements in the range [0-9]
        System.out.println("array with random number");
        for(int i=0;i<10;i++)
         // array with random number
        System.out.println(a[i]);
        System.out.println("Elements at an even index");
        for(int i=0;i<10;i++){ 
            // to print the elements at an even index
        if(i%2==0)
        System.out.println(a[i]);
        }
        System.out.println("even elements");
        for(int i=0;i<10;i++){ 
            // to print even elements
        if(a[i]%2==0)
        System.out.println(a[i]);
        }
        System.out.println("Elements in reverse order");
        for(int i=9;i>0;i--) 
        // to print elements in reverse order
        System.out.println(a[i]);
        System.out.println("first element: "+a[0]+"\nlast element: "+a[9]); 
        // printing first and last array elements
        }
        }
        

    
        
    
    