package me.chasebrown;

// Chase Brown

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[3];

        // Get input
        System.out.print("Please enter the first number: ");
        arr[0] = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        arr[1] = scanner.nextInt();
        System.out.print("Please enter the third number: ");
        arr[2] = scanner.nextInt();

        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

