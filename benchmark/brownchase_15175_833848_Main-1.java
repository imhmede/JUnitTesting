package me.chasebrown;

// Chase Brown
// 9/1/2022
// Lab 1

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Open a loop to make sure that we get a number
        while (true) {
            // Get the number
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            // Check that it is a number
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("That is not a number!");
                // restart the loop, it wasn't a number
                continue;
            }

            // Convert string to array
            char arr[] = input.toCharArray();

            // display with a ' '
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            // if we got here we can exit the program
            break;

        }


    }

}
