package me.chasebrown;

// Chase Brown

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);

        int userInputInt;

        // get number from user (make sure its a number)
        while (true) {
            System.out.print("Please enter the score: ");
            String userInput = scanner.nextLine();
            try {
                userInputInt = Integer.parseInt(userInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("That is not a number! Please try again!");
                continue;
            }


        }
        // check for letter grade
        char letterGrade = 'F';

        if (userInputInt >= 90) {
            letterGrade = 'A';
        } else if (userInputInt >= 80) {
            letterGrade = 'B';
        } else if (userInputInt >= 70) {
            letterGrade = 'C';
        } else if (userInputInt >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // print result
        System.out.println("The letter grade for a score of " + userInputInt + " is " + letterGrade);
    }


}

