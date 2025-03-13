/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cs123.sequencereader;

/*
Write a program that reads in a sequence of integer inputs and prints
a. The smallest and the largest of the inputs.
b. The number of even and odd inputs.
c. Cumulative totals. For example, if the input is 1 7 2 9, the program should prints 1 8 10 19.
d. All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6.
 */
import java.util.Arrays;
import javax.swing.*;

public class SequenceReader {

    public static void main(String[] args) {

        String response = JOptionPane.showInputDialog("How many numbers are you comparing?");
        int numberOfIntegers = Integer.parseInt(response);
        int values[] = new int[numberOfIntegers];
        int row;
        String inputNumbers="";
        for (row = 0; row < values.length; row++) {

            response = JOptionPane.showInputDialog("Enter number " + (row + 1));
            values[row] = Integer.parseInt(response);
            inputNumbers+= values[row] + "  ";
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int even = 0;
        int odd = 0;
        int duplicates;
        String duplicateNumbers="";


        for (row = 0; row < values.length; row++) {
            if (values[row] > largest) {
                largest = values[row];
            }
            if (values[row] < smallest) {
                smallest = values[row];
            }
            if (values[row] % 2 == 0) {
                even++;
            }
            if (values[row] % 2 != 0) {
                odd++;
            }
            for(duplicates = row + 1; duplicates < values.length; duplicates++) {  
                if(values[row] == values[duplicates])
                    duplicateNumbers+= values[duplicates] + "  ";
            }

        }
 
        int sum[] = cumulativeTotal(values);

        //output
        JOptionPane.showMessageDialog(null,
                inputNumbers
                + "\nLargest Value: " + largest
                + "\nSmallest Value: " + smallest
                + "\nAmount of Even Values: " + even
                + "\nAmount of Odd Values: " + odd
                + "\nCumulative Totals: " + Arrays.toString(sum)
                + "\nDuplicate Numbers: " + duplicateNumbers

        );
    }
// method to find cumulative sum of array

    public static int[] cumulativeTotal(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            numbers[i] = sum;
        }

        return numbers;
    }
}
