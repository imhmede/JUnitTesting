/*
Author: Vince Gnodle
Class: CS123
Date: 10/19/22
Description: Lab 4 (Determine Characteristics of input integers)
*/

import java.util.Scanner;	//import scanner to read input

public class CharacteristicsOfIntegers
{
  public static void main (String[]args)
  {

    Scanner in = new Scanner (System.in);	//Declare scanner "in"

    //declare variables
    int smallest;
    int largest;
    int evens = 0;
    int odds = 0;
    int cumulativeTotal = 0;
    int adjacentDuplicates;
    int number;

    System.out.print("Enter a sequence of integers: ");	//prompt user to enter Int
    number = in.nextInt();
    String numbersInString = Integer.toString(number); //convert integer to string
    int[] listOfNumbers = new int [numbersInString.length()]; //create an array with the string
    
    //for loop to extract each digit from integer for comparisons
    for (int i = 0; i < numbersInString.length(); i++){
        listOfNumbers[i] = Integer.parseInt(Character.toString(numbersInString.charAt(i)));
    }
    
    //set initial value of largest and smallest for comparison
    smallest = listOfNumbers[0];
    largest = listOfNumbers[0];
    
    //for loop to find max and min of sequence
    for (int j = 1; j < numbersInString.length(); j++){
        if (listOfNumbers[j] > largest){
            largest = listOfNumbers[j];
        }
        else if (listOfNumbers[j] < smallest){
            smallest = listOfNumbers[j];
        }
    }
    
    System.out.printf ("Largest integer is: %d%n", largest);
    System.out.printf ("Smallest integer is: %d%n", smallest);
    
    //for loop to determine number of odd and even inputs
    for (int l = 0; l < numbersInString.length(); l++){
        if (listOfNumbers[l] % 2 == 0){
            evens += 1;
        }
        else{
            odds += 1;
        }
    }
    
    System.out.printf ("The number of even inputs is: %d%n", evens);
    System.out.printf ("The number of odd inputs is: %d%n", odds);

    //for loop to print cumulative totals
    System.out.print("The cumulative totals are: ");
    for (int n = 0; n < numbersInString.length(); n++){
        cumulativeTotal = cumulativeTotal + listOfNumbers[n];
        System.out.print(cumulativeTotal + " ");
    }
    
    //for loop to locate adjacent duplicates
    System.out.print("\nThe Adjacent duplicates are: ");
    for (int o = 1; o < numbersInString.length(); o++){
        if (listOfNumbers[o] == listOfNumbers[o - 1]){
            System.out.print(listOfNumbers[o] + " ");
        }
    }
  }
}
