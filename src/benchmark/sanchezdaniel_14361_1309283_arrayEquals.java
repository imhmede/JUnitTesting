/** This program generates random numbers for an array, and then checks to see if those arrays are the same or not.
 * @author Daniel Sanchez
 * @version 1
 * Assignment: PA12 arrayEquals
 */

import java.util.Random;

public class arrayEquals {
    /** This is the main method it calls a method to generate random arrays and then displays multiple outputs;
     * one display is determined by an if statement that states whether the arrays are the same or not.
     *@param firstArray declare and intialize first random array length 10
     *@param secondArray declare and intialize second random array length 10
     */
    public static void main(String[] args) {
        int[] firstArray = generateRandomArray(10);  // declare and initialize array of length 10
        int[] secondArray = generateRandomArray(10);  // declare and initialize array of length 10
        System.out.println("First Array:");  // Display for the first array
        System.out.println(arrayToString(firstArray));  // Display values of firstArray as a string
        System.out.println("Second Array:");  //Display for the second array
        System.out.println(arrayToString(secondArray));  // Display values of secondArray as a string
        if (equals(firstArray, secondArray)) {  //if statment checks if a and b have the same parameters
            System.out.println("The two arrays have the same elements in the same order.");  // If equals, display
        } else {
            System.out.println("The two arrays do not have the same elements in the same order.");  // else , display
        }
    }
    /** This method takes two array and returns a boolean indicating if they are equal or not via a if statment and a for loop.
     * This method was requested by the professor to be added to the program.
     * @return the fist return checks if the arrays are not the same length; returns false
     * @return the second return checks if the elements at each position of each array is not equal; returns false
     * @return the final return returns true if the arrays made it through the loop without returning false
     */
    public static boolean equals(int[] firstArray, int[] secondArray) { // This is the method the Professor requested be in the program
        if (firstArray.length != secondArray.length) {  // if statment checks if the arrays are not equal length
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {  // for loop goes through each element of the arrays in its iterations
            if (firstArray[i] != secondArray[i]) {  // if statment checks if the arrays are not equal at element
                return false;
            }
        }
        return true;
    }
    /** This method generates a random array of a given length and then returns the completed array
     * @param random object via Random()
     * @param array new array declared
     * @return returns completed array
    */
    public static int[] generateRandomArray(int length) {
        Random random = new Random();  // rand variable declared and initialized with Random class
        int[] array = new int[length];  // array declared
        for (int i = 0; i < length; i++) {  // for loop goes through each position in the array
            array[i] = random.nextInt(10);
        }
        return array;
    }
    /** This method uses a StringBuilder object to build a string representation, by appending each element via iteration, and adding a " " to seperate elements after 1st element
     * @param teachersExample string object representation created for appending " " beyond index 0
     * @return return teachersExample; converts StringBuilder object to string using toString() method
     */
    public static String arrayToString(int[] array) {
        StringBuilder teachersExample = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                teachersExample.append(" ");
            }
            teachersExample.append(array[i]);
        }
        return teachersExample.toString();
    }
}