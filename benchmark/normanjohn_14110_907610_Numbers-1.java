package Lab4;

/*John Norman
 * Oct 19 2022
 * CS 123
 * Quiz 4
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //Variables
        int small = 0, big = 0, total = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> adjacent = new ArrayList<Integer>();
        ArrayList<Integer> totalList = new ArrayList<Integer>();

        //Scan input
        System.out.println("Give me a sequence of integers: ");
        Scanner newNum = new Scanner(System.in);
        String numberString = newNum.nextLine();
        newNum.close();

        //Splitting input
        String numSplit[] = numberString.split(" ");
        
        //add integers to list
        for (String numString : numSplit) {
            //Converting string to int
            int number = Integer.parseInt(numString);

            //Adding int to list
            numbers.add(number);
        }

        //Initial values
        small = numbers.get(0);
        big = numbers.get(0);
        total = numbers.get(0);
        totalList.add(numbers.get(0));

        //find if even or odd
        if (numbers.get(0) % 2 == 0) {
            even.add(numbers.get(0));
        }else odd.add(numbers.get(0));



        //iterate remaining entries
        for (int i = 1; i < numbers.size(); i++) {
            
            //find smallest and biggest
            if (numbers.get(i) < small) {
                small = numbers.get(i);
            }
            if (numbers.get(i) > big) {
                big = numbers.get(i);
            }

            //Find even or odd
            if (numbers.get(i) % 2 == 0) {
                even.add(numbers.get(i));
            }
            else { 
                odd.add(numbers.get(i));
            } 

            //find totals
            total += numbers.get(i);
            totalList.add(total);

            //find matching adjacents
            if (numbers.get(i) == numbers.get(i - 1)){
                if (adjacent.size() == 0) {
                    adjacent.add(numbers.get(i));
                }
                else if (numbers.get(i) != adjacent.get(adjacent.size()-1)) {
                    adjacent.add(numbers.get(i));
                }
            } 
        }

        //Output
        System.out.println("Smallest: " + small);
        System.out.println("Largest: " + big);
        System.out.println("Number of evens: " + even.size());
        System.out.println("Number of odds: " + odd.size());
        System.out.println("Totals: " + totalList);
        System.out.println("Adjacent Duplicates: " + adjacent);
    }
}
