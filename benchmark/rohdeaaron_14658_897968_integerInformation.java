/* Aaron Rohde - CS123
 * Assignment:   Lab 4
 * Due:     10/16/2022
 */
import java.util.Scanner;
import java.util.ArrayList;
public class integerInformation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // ArrayList to dynamically resize to hold correct number of variables
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        // Results storage for Integers
        int smallestNum;
        int largestNum;
        int evenNumbers;
        int oddNumbers;
        // Results storage for ArrayLists
        ArrayList<Integer> cumulativeTotalList;
        ArrayList<Integer> sideBySideList;
        
        // Prompt for user input
        System.out.print("Please enter your number list to evaluate: ");
        // First capture all ints as a string
        String input;
        input = in.nextLine();
        // Next convert string into an array
        String[] strIntArray;
        strIntArray = input.split(" ");
        for (int i = 0; i < strIntArray.length; i++)
        {
            numbersList.add(Integer.parseInt(strIntArray[i]));
        }

        // Populate data for return
        smallestNum = smallestNumber(numbersList);
        largestNum = largestNumber(numbersList);
        evenNumbers = modulusNumberCount(numbersList, 0);
        oddNumbers = modulusNumberCount(numbersList, 1);
        cumulativeTotalList = cumulativeArrayListCounter(numbersList);
        sideBySideList = sideBySideNumbers(numbersList);

        System.out.printf("%nFor your input of: ");
        // Return all numbers input in order input
        for (int i = 0; i < numbersList.size(); i++)
        {
            System.out.print(numbersList.get(i));
            System.out.print(" ");
        } 
        // Return all of our results
        System.out.printf("%nThe smallest integer is: %d%n", smallestNum);
        System.out.printf("The largest integer is: %d%n", largestNum);
        System.out.printf
        ("There are %d even and %d odd numbers.%n", evenNumbers, oddNumbers);
        System.out.print("The cumulative totals are: ");
        for (int i = 0; i < cumulativeTotalList.size(); i++)
        {
            System.out.print(cumulativeTotalList.get(i));
            System.out.print(" ");
        }
        // Catch if there is no side by side and just state that
        if(sideBySideList.size() != 0 )
        {
            System.out.printf("%nThe adjacent duplicates are: ");
            for (int i = 0; i < sideBySideList.size(); i++)
            {
                System.out.print(sideBySideList.get(i));
                System.out.print(" ");
            }
        }
        else
        {
            System.out.printf("%nThere are no adjacent duplicates.");
        }
        // Trailing space to make it easier to see data
        System.out.printf("%n");
    } 

    private static int largestNumber(ArrayList<Integer> intsInList)
    {
        // Set to first value to allow testing
        int largestValue = intsInList.get(0);
        // start at second ArrayList value
        for( int i = 1; i < intsInList.size(); i++)
        {
            if (largestValue < intsInList.get(i))
            {
                largestValue = intsInList.get(i);
            }
        }
        return largestValue;
    }

    private static int smallestNumber(ArrayList<Integer> intsInList)
    {
        // Set to first value to allow testing
        int smallestValue = intsInList.get(0);
        // start at second ArrayList value
        for( int i = 1; i < intsInList.size(); i++)
        {
            if (intsInList.get(i) < smallestValue)
            {
                smallestValue = intsInList.get(i);
            }
        }
        return smallestValue;
    }

    private static int 
      modulusNumberCount(ArrayList<Integer> intsInList, int modulusValue)
    {
        // Modulus of 2 is 0 for even and 1 for odd
        // Set to first value to allow addition
        int modulusCount = 0;
        for( int i = 0; i < intsInList.size(); i++)
        {
            if (intsInList.get(i) % 2 == modulusValue)
            {
                modulusCount++;
            }
        }
        return modulusCount;
    }
    private static ArrayList<Integer> 
      cumulativeArrayListCounter(ArrayList<Integer> intsInList)
    {
        // Build ArrayList needed for return
        ArrayList<Integer> cumulativeListReturn = new ArrayList<Integer>();
        // Set to first value to allow addition
        cumulativeListReturn.add(intsInList.get(0));
        // start at second ArrayList value
        for( int i = 1; i < intsInList.size(); i++)
        {
            int tempTotal = intsInList.get(i) + cumulativeListReturn.get(i - 1);
            cumulativeListReturn.add(tempTotal);
        }
        return cumulativeListReturn;
    }

    private static ArrayList<Integer> 
      sideBySideNumbers(ArrayList<Integer> intsInList)
    {
        // Build ArrayList needed for return
        ArrayList<Integer> sidebySideListReturn = new ArrayList<Integer>();
        //start at second value to allow checking against i - 1
        for( int i = 1; i < intsInList.size(); i++)
        {
            if (intsInList.get(i) == intsInList.get(i - 1))
            {
                if (! sidebySideListReturn.contains(intsInList.get(i)))
                {
                    sidebySideListReturn.add(intsInList.get(i));
                }
            }
        }
        return sidebySideListReturn;
    }
}