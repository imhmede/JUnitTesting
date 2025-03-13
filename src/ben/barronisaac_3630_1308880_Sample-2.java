import java.util.Arrays;
import java.util.Random;
public class Sample {

public static void main(String[] args)
{
    Random rand = new Random();

    final int MAX_RAND_VAL = 10;
    
    int[] randVals = new int[10];
    int[] randVals2 = new int[10];
//Random Array for First Line
for(int i = 0; i < randVals.length; i++)
{
    randVals[i] = rand.nextInt(MAX_RAND_VAL);
}
  System.out.println("First Array:  ");
for(int i = 0; i < randVals.length; i++)
 {
    System.out.printf("\t%d",randVals[i]);
 }
//Random Array for Second line
for(int i = 0; i < randVals2.length; i++)
{
    randVals[i] = rand.nextInt(MAX_RAND_VAL);
}
  System.out.println("\nSecond Array: ");
for(int i = 0; i < randVals2.length; i++)
{
  System.out.printf("\t%d",randVals[i]);  
}

boolean result = Arrays.equals(randVals, randVals2);
if(result)
{
    System.out.println("\nThe two arrays do have the same elements in the same order.");
}
else
{
    System.out.println("\nThe two arrays do not have the same elements in the same order.");
}
}

}
 




