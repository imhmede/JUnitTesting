/**
 * This program generates a array with random numbers. Then 4 other methods use 
 * those same generated numbers for: elements at even index, even elements, elements in 
 * reverse order, and the first and last element.
 * @author Daniel Sanchez
 * @version 1
 * Assignment PA11 randomMethod
 */
import java.util.Random;// random class imported

public class randomMethod {
    /**The main method generates an array of random numbers, displays output, and calls multiple methods
     * @param array delcared and intialized for array
     * @param rand declared and initialized; Random 
     */
    public static void main(String[] args) { //main method
        int[] array = new int[10]; // array declared and intiialized with values
        Random rand = new Random(); //rand variable declared and initialized with Random class
        for (int i = 0; i < array.length; i++) { 
            array[i] = rand.nextInt(100);
        }
        System.out.println("Array with random numbers:"); //Display for random number
        randomNumberArray(array); //method call randomNumberArray
        System.out.println("Elements at an even index:"); //Dispaly for even index
        evenIndex(array); //method call evenIndex
        System.out.println("Even elements:"); //Display for even elements
        evenElements(array); //method call evenElements
        System.out.println("All elements in reverse order:"); //Display elements reverse order
        elementsReverse(array); //method call elementsReverse
        System.out.println("[First Element, Last Element]"); //Display first, last elements
        elementsFirstLast(array); //method call elementsFirstLast
    }
    /** This method takes an array as a parameter, and it displays random numbers; displays when called by main method*/
    public static void randomNumberArray(int[] array) { //Method: random array numbers
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    /** This method takes array as a parameter, and it displays elements at even indices; displays when called by main method*/
    public static void evenIndex(int[] array) { //Method: elements at even index
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    /** This method takes an array, and prints all the even elements in the array; displays when called by main method*/
    public static void evenElements(int[] array) { //Method: even elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
    /** This method takes an array, and prints the elements in the array in reverse order; displays when called by main method*/
    public static void elementsReverse(int[] array) { //Method: array reversed
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    /** This method takes an array, and prints the first and last elements; displays when called by main method */
    public static void elementsFirstLast(int[] array) { //Method: Fist and last in array
        System.out.println("["+ array[0] + ", " + array[array.length - 1] +"]");
    }
}