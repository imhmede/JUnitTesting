//Autumn Brown CS_123 PA11

import java.util.Random;

public class ArrayElements 
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        int[] values = new int[10];

        System.out.print("Array with random numbers:\n");

        for(int i = 0; i < values.length; i++)
        {
            values[i] = rand.nextInt(50);
            if (i > 0)
            {
                System.out.print( " | ");
            }
            System.out.print(values[i] + " ");
        }
        System.out.print("\nElements at even index:\n");
        evenIndex(values);

        System.out.print("\nEven Elements:\n");
        evenNum(values);

        System.out.print("\nAll elements in reversed order:\n");
        reversed(values);

        System.out.print("\n[First Element, Last Element]\n");
        firstLast(values);
    }
    public static void evenIndex(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(" | ");
                System.out.print(values[i] + " ");
            }
        }
    }
    public static void evenNum(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                System.out.print(" | ");
                System.out.print(values[i] + " ");
            }
        }
    }
    public static void reversed(int[] values)
    {
        for (int i = values.length - 1; 1 >= 0; i--)
        {
            System.out.print(" | ");
            System.out.print(values[i] + " ");
        }
    }
    public static void firstLast(int[] values)
    {
            System.out.print("[" + values[0] + values[values.length-1] + "]");
    }   
}

