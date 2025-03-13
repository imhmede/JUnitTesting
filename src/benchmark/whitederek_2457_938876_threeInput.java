import java.util.Scanner;
/*
 * Author: Derek White
 * Date: 25 October 2022
 *
 * Purpose: This program will recieve three inputs from the user, and then
 * those inputs will be sent to various functions to accomplish requirements
 * by ths lab.
 *
 * The first will be checking if all inputs are the same
 *
 * The second will calculate the average
 *
 * The third will check the smallest number
 *
 * The last will sort from smallest to largest
 */
public class threeInput {
   public static void bar(){
      /**
       * Function for separating outputs from other functions, blame my ADHD
       */
      char bar = '\u2015';
      for(int position = 0; position < 50; position++){
	 System.out.print(colors('g') + bar + colors('r'));
      }
   }
   public static String colors(char input){
      /**
       * This function is to set colors on the string
       * output to make it easier to read, despite the
       * string source code looking ugly
       *
       * Again, blame my ADHD.
       *
       * @param input | Character input to decide on color
       *
       * @return color | Returns string to be inserted in another string
       * in order to colorfy it.
       */
      final String ANSI_RESET = "\033[0;0m";
      final String ANSI_CYAN = "\033[0;36m";
      final String ANSI_PURPLE = "\033[1;38m";
      final String ANSI_GREEN = "\033[0;32m";
      String color = ANSI_RESET;
      if(input == 'r'){
	 color = ANSI_RESET;
      }
      else if(input == 'c'){
	 color = ANSI_CYAN;
      }
      else if(input == 'p'){
	 color = ANSI_PURPLE;
      }
      else if(input == 'g'){
	 color = ANSI_GREEN;
      }
      return color;
   }
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      System.out.println(colors('p') + "Enter three numbers: " + colors('r'));
      int[] intArray;
      intArray = new int[3];
      for(int i = 0; i < 3; i++){
	 intArray[i] = userInput.nextInt();
      }

      // Method to check and see if all inputs are the same
      if(allTheSame(intArray)){
	 System.out.println(colors('c') + "All numbers are the same." + colors('r'));
      }
      else{
	 System.out.println(colors('c') + "Numbers are not the same." + colors('r'));
      }
      
      bar();
      // Method to recieve the Average of the three numbers
      System.out.printf(colors('p') + "\nThe average is: " + colors('c') + "%f\n" + colors('r'), average(intArray));
      bar();
      // Method to check for smallest number
      System.out.printf(colors('p') + "\nThe smallest number is: " + colors('c') + "%f\n" + colors('r'), theSmallest(intArray));
      bar();
      // Method to sort numbers
      sorted(intArray);
      System.out.printf(colors('p') + "\nThe sorted numbers are: " + colors('c') + "%d" + colors('g') + " | "+ colors('c') + "%d" + colors('g') + " | "+colors('c') + "%d\n" + colors('r'), intArray[0], intArray[1], intArray[2]);
      
   }
   public static boolean allTheSame(int[] intArray){
      /**
       * This function just checks whether or not the numbers
       * supplied by the array in the main function from user
       * input are all the same or not.
       *
       * @param intArray | Array of integers from user
       *
       * @return | Depending on if all numbers are the same, it will return true.
       * If not, will return false.
       */
      int x = intArray[0];
      int y = intArray[1];
      int z = intArray[2];
      if(x == y && x == z){
	 return true;
      }
      else{
	 return false;
      }
   }
   public static double average(int[] intArray){
      /**
       * This function finds the average of the numbers
       * supplied by user input and returns the average
       * number.
       *
       * @param intArray | Array of integers from user
       *
       * @return average | Returns the average number from the array.
       */
      double x = intArray[0];
      double y = intArray[1];
      double z = intArray[2];
      double average = (x + y + z) / 3;
      return average;
   }
   public static double theSmallest(int[] intArray){
      /**
       * This function finds the smallest number from
       * the array created in the main function.
       *
       * @param intArray | Array of integers from user.
       * 
       * @return smallest | This will return the smallest number
       */
      int x = intArray[0];
      int y = intArray[1];
      int z = intArray[2];
      int smallest = x;
      if(x > y){
	 if(y > z){
	    smallest = z;
	 }
	 else{
	    smallest = y;
	 }
      }
      return smallest;
   }
   public static boolean sorted(int[] intArray){
      /**
       * This function sorts the numbers from the array
       * created in the main function, and places them
       * in order from smallest to largest.
       *
       * @param intArray | Array of Integers from user
       * @return | Is a boolean that will return true once over.
       */
      int x = intArray[0];
      int y = intArray[1];
      int z = intArray[2];
      int smallest = x;
      int middle = x;
      int largest = x;
      if(x > y){
	 if(y > z){
	    smallest = z;
	    middle = y;
	    largest = x;
	 }
	 else{
	    smallest = y;
	    middle = z;
	    largest = x;
	 }
      }
      else if(y > z){
	 smallest = x;
	 middle = z;
	 largest = y;
      }
      else{
	 smallest = x;
	 middle = y;
	 largest = z;
      }
      intArray[0] = smallest;
      intArray[1] = middle;
      intArray[2] = largest;
      return true;
   }
}
