import java.util.Random;
public class range
{
 public static void main(String[] args)
 {
    Random rand = new Random();

    //constant sets the maximum random val that can be generated
    final int MAX_RAND_VAL = 100;

    int[] randVals = new int[10];

    //filling array with random values 
    for(int i = 0; i < randVals.length; i++)
    {
        randVals[i] = rand.nextInt(MAX_RAND_VAL);
    }

    //printing array elements 
    System.out.println("\nArray with random numbers: ");
    for(int i = 0; i < randVals.length; i++)
    {
        System.out.println(randVals[i]);
    }

    printEvenIndexes(randVals);
    printEvenElements(randVals);
    printReverse(randVals);
    printFirstLast(randVals);


 }   

  public static void printEvenIndexes(int[] array)
  {
    System.out.println("\nElements at an even index:");
    for(int i = 0; i < array.length; i++)
    {
        //Printing the elements at even indexes to match instructors output
        //(technically odd indexes if we count from 0)
        if(i % 2 != 0)
        {
            System.out.printf("\t%d", array[i]);
        }
     }
  }

    public static void printEvenElements(int[] array)
    {
        System.out.println("\nEven elements:");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                System.out.printf("\t%d", array[i]);
            }
        }
    }

  public static void printReverse(int[] array)
  {
    System.out.println("\nAll elements in reverse order:");
    for(int i = array.length - 1; i >= 0; i--)
    {
        System.out.printf("\t%d", array[i]);
    }
  }

  public static void printFirstLast(int[] array)
  {
    System.out.println("\n[First Element, Last Element]");
    System.out.printf("\t[%d, %d]", array[0], array[array.length - 1]);
  }
}
